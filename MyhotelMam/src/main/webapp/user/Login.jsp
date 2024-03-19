<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hotel</title>
    <style>
      body{
        margin: 0;
        padding: 0;
        background-image: url("http://localhost:8080/MyhotelMam/img/Owall-Hotel-Seoul-Exterior.jpeg");
        background-repeat:no-repeat;
        background-position: inherit;
        /* background-size: cover; */
        background-attachment: fixed;
        background-size: 100% 100%;
        /* height: 300px; */
        /* position: absolute; */
      }
      a {
        color: white;
      }
      .navbar {
        background-color: rgba(0, 0, 0, 0.5); /* Use RGBA with alpha value less than 1 for transparency */
      }
      .navbar-nav .nav-item a.nav-link {
        color: white; /* Set the text color to white */
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
	
	
	<!-- <script >
	window.onpageshow=function(event){
		if(event.persisted){
			window.location.reload();
			window.location.replace('/MyhotelMam/user/Home.jsp');
		}
	};

</script> -->


</head>
<body>
		
		<nav class="navbar navbar-expand-lg navbar-light navbar-expand-md">
            <a href="" class="navbar-brand" style="color: white;"> <img src="https://w7.pngwing.com/pngs/927/770/png-transparent-hotel-logo-resort-suite-investment-banking-letter-b-angle-company-text.png" width="50px" style="border-radius: 10px;" alt="No img"> Hotel Booking System</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav">
                <li class="nav-item active">
                  <a class="nav-link " href="http://localhost:8080/MyhotelMam/index.jsp">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link " href="http://localhost:8080/MyhotelMam/user/SignUp.jsp">SignUp</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link " href="http://localhost:8080/MyhotelMam/user/Login.jsp">Login</a>
                </li>
              </ul>
            </div>
           
        </nav>
<!-- Login Page -->
        <div class="container  w-50 p-3 m-5">
            <div class="row justify-content-left">
              <div class="col-md-8">
                  <h2 class="mb-4 " >Customer Login Form</h2>
                  <form action="donate"  method="post">
                      <div class="row mb-3">
                          <div class="col">
                              <label for="email" class="form-label">Email :</label>
                              <input type="email" class="form-control"  placeholder="Email"  required >
                          </div>
                          <div class="col">
                            <label for="password" class="form-label">Password :</label>
                            <input type="text" class="form-control"  required placeholder="Password" >
                        </div>
                      </div>
                      <!-- <button type="submit" class="btn btn-outline-dark">Create Account</button> -->
                      <a href="HotelPage.html" id="btn" class="button btn btn-outline-dark">Sign In</a>
                  </form>
              </div>        
            </div>
        </div>
</body>
</html>