<%-- 
    Document   : adminpanel
    Created on : Dec 2, 2018, 8:18:50 PM
    Author     : Sukhman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width-device-width, initial-scale-1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <title>ChitkaraBS</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body background="images/eng1.jpg" style="background-size: auto;">

        <div class="background">
        <div class="nav">
            <a class="a" href="dashboard.jsp">HOME</a>
            <a class="b" href="showdriver.jsp" >DRIVER-BUS LIST</a>
            <a class="b" href="driver.jsp" >ADD NEW</a>
            <a class="a" href="showfeedback.jsp" >FEEDBACK LIST</a>
			
			
            
        </div>
        
            
            <div class="ABOUT" id = "about">
                
                <p>
                       <center><h1>About Us<h1></center>
  <center><h4>The prime purpose of this
“Bus Management System"
 is to create a fully fledged web application which would communicate with the remote server to send and retrieve data as per requirement. This application works when there is internet connectivity. This web application generates exhaustive reports related to the Bus management i.e. bus route, bus number, number of students!faculty allotted for the particular bus, department and no of students, departure time of the bus, fees paid and dues. These reports highlight various bus services and features of the bus, which can be subjected to improvement especially for the college administration to improve bus transport system. This interface is user friendly and effective. It is very helpful by providing a simpler method to store and access information related to  buses and students. This system is accessible either by an administrator or student where in the administrator has the permission to create!update the record into the database. This web application reduces paper work and makes all related information accessible easily. </h4><center>
                        
                </p>
                <footer>
                        <p>Posted by: Sukhmandeep Singh</p>
                        
                </footer>
            </div>

            <div class="gallery" id = "gallery">
                <div class="flex-container">
                    <div class="column">
                      <img src="images/2.jpg" alt="rocket" style="width:100%">
                    </div>
                    <div class="column">
                        <img src="images/3.jpg" alt="satellite" style="width:100%">
                    </div>
                    <div class="column">
                        <img src="images/4.jpg" alt="observatory" style="width:100%">
                    </div>
                    <div class="column">
                        <img src="images/5.jpeg" alt="mountains" style="width:100%">
                      </div>
                      <div class="column">
                        <img src="images/6.jpg" alt="telescope" style="width:100%">
                      </div>
                      <div class="column">
                        <img src="images/7.jpg" alt="Europe observatory" style="width:100%">
                      </div>
                      <div class="column">
                        <img src="images/8.jpg" alt="successful" style="width:100%">
                      </div>
                      <div class="column">
                        <img src="images/9.jpg" alt="rocketpod" style="width:100%">
                      </div>
                      <div class="column">
                        <img src="images/10.jpg" alt="ignition" style="width:100%">
                      </div>
                      <div class="column">
                        <img src="images/11.jpg" alt="moon" style="width:100%">
                      </div>
                </div>
            </div>

        </div>

    </div>
    
    <script>
    document.getElementById("about").style.visibility = "hidden";
    document.getElementById("gallery").style.visibility = "hidden";
    document.getElementById("home").style.visibility = "visible";

    function home()
    {
        document.getElementById("home").style.visibility = "visible";
        document.getElementById("about").style.visibility = "hidden";
        document.getElementById("gallery").style.visibility = "hidden";
        document.getElementById("contact").style.visibility = "hidden";
    }

    function about()
    {
        document.getElementById("about").style.visibility = "visible";
        document.getElementById("home").style.visibility = "hidden";
        document.getElementById("gallery").style.visibility = "hidden";
        document.getElementById("contact").style.visibility = "hidden";
    }

    function gallery()
    {
        document.getElementById("about").style.visibility = "hidden";
        document.getElementById("home").style.visibility = "hidden";
        document.getElementById("gallery").style.visibility = "visible";
        document.getElementById("contact").style.visibility = "hidden";
    }

    function contact()
    {
        document.getElementById("about").style.visibility = "hidden";
        document.getElementById("home").style.visibility = "hidden";
        document.getElementById("gallery").style.visibility = "hidden";
        document.getElementById("contact").style.visibility = "visible";
    }
       
    </script>

    </body>
</html>