package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width-device-width, initial-scale-1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>ChitkaraBS</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images/eng1.jpg\" style=\"background-size: auto;\">\n");
      out.write("\n");
      out.write("        <div class=\"background\">\n");
      out.write("        <div class=\"nav\">\n");
      out.write("            <a class=\"a\" href=\"dashboard.jsp\">HOME</a>\n");
      out.write("            <a class=\"b\" href=\"driverlist.jsp\" >DRIVER LIST</a>\n");
      out.write("            <a class=\"c\" href=\"adddriver.jsp\" >ADD DRIVER</a>\n");
      out.write("            <a class=\"c\" href=\"buslist.jsp\" >BUS LIST</a>\n");
      out.write("            <a class=\"b\" href=\"addbus.jsp\" >ADD BUS</a>\n");
      out.write("            <a class=\"a\" href=\"showfeedback.jsp\" >FEEDBACK LIST</a>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            <div class=\"ABOUT\" id = \"about\">\n");
      out.write("                \n");
      out.write("                <p>\n");
      out.write("                       <center><h1>About Us<h1></center>\n");
      out.write("  <center><h4>The prime purpose of this\n");
      out.write("“Bus Management System\"\n");
      out.write(" is to create a fully fledged web application which would communicate with the remote server to send and retrieve data as per requirement. This application works when there is internet connectivity. This web application generates exhaustive reports related to the Bus management i.e. bus route, bus number, number of students!faculty allotted for the particular bus, department and no of students, departure time of the bus, fees paid and dues. These reports highlight various bus services and features of the bus, which can be subjected to improvement especially for the college administration to improve bus transport system. This interface is user friendly and effective. It is very helpful by providing a simpler method to store and access information related to  buses and students. This system is accessible either by an administrator or student where in the administrator has the permission to create!update the record into the database. This web application reduces paper work and makes all related information accessible easily. </h4><center>\n");
      out.write("                        \n");
      out.write("                </p>\n");
      out.write("                <footer>\n");
      out.write("                        <p>Posted by: Sukhmandeep Singh</p>\n");
      out.write("                        \n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"gallery\" id = \"gallery\">\n");
      out.write("                <div class=\"flex-container\">\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                      <img src=\"images/2.jpg\" alt=\"rocket\" style=\"width:100%\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/3.jpg\" alt=\"satellite\" style=\"width:100%\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/4.jpg\" alt=\"observatory\" style=\"width:100%\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <img src=\"images/5.jpeg\" alt=\"mountains\" style=\"width:100%\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"column\">\n");
      out.write("                        <img src=\"images/6.jpg\" alt=\"telescope\" style=\"width:100%\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"column\">\n");
      out.write("                        <img src=\"images/7.jpg\" alt=\"Europe observatory\" style=\"width:100%\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"column\">\n");
      out.write("                        <img src=\"images/8.jpg\" alt=\"successful\" style=\"width:100%\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"column\">\n");
      out.write("                        <img src=\"images/9.jpg\" alt=\"rocketpod\" style=\"width:100%\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"column\">\n");
      out.write("                        <img src=\"images/10.jpg\" alt=\"ignition\" style=\"width:100%\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"column\">\n");
      out.write("                        <img src=\"images/11.jpg\" alt=\"moon\" style=\"width:100%\">\n");
      out.write("                      </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    document.getElementById(\"about\").style.visibility = \"hidden\";\n");
      out.write("    document.getElementById(\"gallery\").style.visibility = \"hidden\";\n");
      out.write("    document.getElementById(\"home\").style.visibility = \"visible\";\n");
      out.write("\n");
      out.write("    function home()\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"home\").style.visibility = \"visible\";\n");
      out.write("        document.getElementById(\"about\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"gallery\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"contact\").style.visibility = \"hidden\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function about()\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"about\").style.visibility = \"visible\";\n");
      out.write("        document.getElementById(\"home\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"gallery\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"contact\").style.visibility = \"hidden\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function gallery()\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"about\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"home\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"gallery\").style.visibility = \"visible\";\n");
      out.write("        document.getElementById(\"contact\").style.visibility = \"hidden\";\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function contact()\n");
      out.write("    {\n");
      out.write("        document.getElementById(\"about\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"home\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"gallery\").style.visibility = \"hidden\";\n");
      out.write("        document.getElementById(\"contact\").style.visibility = \"visible\";\n");
      out.write("    }\n");
      out.write("       \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
