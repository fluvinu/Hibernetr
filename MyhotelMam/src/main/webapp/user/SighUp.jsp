<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><%= "Hotel Booking System" %></title> <!-- Dynamically setting title for demonstration -->
    <style>
      body{
        margin: 0;
        padding: 0;
        background-image: url("http://localhost:8080/MyhotelMam/img/Owall-Hotel-Seoul-Exterior.jpeg");
        background-repeat:no-repeat;
        background-position: inherit;
        background-attachment: fixed;
        background-size: 100% 100%;
      }
      a {
        color: white;
      }
      .navbar {
        background-color: rgba(0, 0, 0, 0.5);
      }
      .navbar-nav .nav-item a.nav-link {
        color: white;
      } 
      #btn{
        color: white;
      }
      label{
        color: white;
      }    
      h2{
        color: white;
      }
    </style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light navbar-expand-md">
    <!-- Dynamically display the brand name using a variable or data from server -->
    <a href="" class="navbar-brand" style="color: white;"> 
        <img src="https://w7.pngwing.com/pngs/927/770/png-transparent-hotel-logo-resort-suite-investment-banking-letter-b-angle-company-text.png" width="50px" style="border-radius: 10px;" alt="Hotel Logo"> 
        Hotel Booking System
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item active">
          <a class="nav-link " href="http://localhost:8080/MyhotelMam/user/Home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="http://localhost:8080/MyhotelMam/user/SignUp.jsp">SignUp</a>
        </li>
        <li class="nav-item">
          <a class="nav-link " href="http://localhost:8080/MyhotelMam/user/Login.jsp">Login</a>
        </li>
      </ul>
    </div>
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
        <a class="nav-link" href="LogOut.jsp">LogOut</a>
      </li>
    </ul>
</nav>
<div class="container  w-50 p-3 m-5">
    <div class="row justify-content-left">
      <div class="col-md-8">
          <h2 class="mb-4 " >Costomer Registration Form</h2>
          <!-- Example action URL changed for demonstration -->
          <form action="../Register" method="post">
              <div class="row mb-3">
                  <div class="col">
                      <label for="firstname" class="form-label">First Name :</label>
                      <input type="text" class="form-control" name="firstname" placeholder="First Name" required >
                  </div>
                  <div class="col">
                      <label for="lastname" class="form-label">Last Name:</label>
                      <input type="text" class="form-control" name="lastname" placeholder="Last Name" required >
                  </div>
              </div>
            <!--   <div class="row mb-3">
                  <div class="col">
                      <label for="dob" class="form-label">Date Of Birth :</label>
                      <input type="date" class="form-control" name="dob" placeholder="Date Of Birth" required >
                  </div> -->
                  <div class="row mb-3">
                <div class="col">
                    <label for="contact" class="form-label">Mobile Number :</label>
                    <input type="text" class="form-control" name="contact" placeholder="Mobile Number" required >
                </div>
              </div>
                  <div class="col">
                    <label for="gender" class="form-label">Gender :</label>
                    <input type="radio" class="form" required="required"  name="gender" value="Male"><spam style="color: white">Male</spam>
                    <input type="radio" class="form" required="required" name="gender" value="Female"><spam style="color: white">FeMale</spam>
                    <input type="radio" class="form" required="required" name="gender" value="Other"><spam style="color: white">Other</spam>
                   <!--  <select class="form-control" name="gender" required>
                        <option value="">Select...</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="other">Other</option>
                    </select> -->
                </div>	
              </div>
              <div class="row mb-3">
                  <div class="col">
                      <label for="email" class="form-label">Email :</label>
                      <input type="email" class="form-control" name="email" placeholder="Email" required >
                  </div>
                  <div class="col">
                    <label for="password" class="form-label">Password :</label>
                    <input type="password" class="form-control" name="password" required placeholder="Password" >
                </div>
              </div>
              
              <button type="submit" class="btn btn-outline-dark">Create Account</button>
          </form>
      </div>        
    </div>
  </div>
</body>
</html>
