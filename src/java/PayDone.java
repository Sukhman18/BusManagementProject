/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sukhman
 */
public class PayDone extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
        try
        {
            PrintWriter out;
            out = response.getWriter();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus?useSSL=false","root","sukhman@#123");
            String query1="insert into payment values(?,?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(query1);
            String u=request.getParameter("Name");
            String p=request.getParameter("Pnum");
             String q=request.getParameter("NameOnCard");
              String l=request.getParameter("Cnum");
            pstmt.setString(1,u);
            pstmt.setString(2,p);
             pstmt.setString(3,q);
              pstmt.setString(4,l);
            int rs=pstmt.executeUpdate();
            if(rs>=1)
            {
                //System.out.print(rs);
                HttpSession session=request.getSession();
                session.setAttribute("Name",u);
            // Set expiry time of the session to 30mins
                session.setMaxInactiveInterval(30*60);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Payment Successful');");
                out.println("</script>");
                String url=response.encodeRedirectURL("portfolio.html");
                response.sendRedirect(url);
                
            
            }
            else
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Payment Unsuccessful');");
                out.println("</script>");
                request.getSession().invalidate();
            response.sendRedirect("index.html");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
