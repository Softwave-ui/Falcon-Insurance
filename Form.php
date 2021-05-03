
<!DOCTYPE HTML>  
<html>
<head>
<link rel="icon" href="Logo%20icon.jpg" type="image/gif" sizes="16x16">
<title>Falcon Insurance Login</title>
<style>
.error {color: #FF0000;}
 * {box-sizing: border-box;}
    
    h2{text-align: center;
        }
    
    input[type=text], select {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
    
    input[type=password], select {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
    .button {
  position: relative;
  background-color: darkred;
  border: none;
  font-size: 15px;
  color: #FFFFFF;
  padding: 10px;
  padding-left: 20px;
  padding-right: 20px;
  width: 50x;
  text-align: center;
  transition-duration: 0.4s;
  text-decoration: none;
  overflow: hidden;
  cursor: pointer;
  border-radius: 16px;     
}
  .button:hover {
  background-color: firebrick;
  color: white;
  border: 2px solid  #efad4d; /*gold*/  
}  
.button:after {
  content: "";
  background: #efad4d;
  display: block;
  position: absolute;
  padding-top: 300%;
  padding-left: 350%;
  margin-left: -20px !important;
  margin-top: -120%;
  opacity: 0;
  transition: all 0.8s
}

.button:active:after {
  padding: 0;
  margin: 0;
  opacity: 1;
  transition: 0s
}
    form { margin-left: 100px;}
body { 
  margin: 0;
  font-family: "Georgia", serif;
}

.header {
  overflow: hidden;
  background-color: darkred;
  padding: 5px 10px;
}

.header a {
  float: left;
  color: white;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #efad4d;
  color: black;
}

.header a.active {

  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>
</head>
<body>  

<?php
            $msg = '';
            
            if (isset($_POST['login']) && !empty($_POST['username']) 
               && !empty($_POST['password'])) {
				
               if ($_POST['username'] == 'tutorialspoint' && 
                  $_POST['password'] == '1234') {
                  $_SESSION['valid'] = true;
                  $_SESSION['timeout'] = time();
                  $_SESSION['username'] = 'tutorialspoint';
                  
                  
               }
                else {
                  $msg = 'Wrong username or password';
               }
            }
         ?>
<div class="header">
       <img src="Logo.png" width="50" height="50"> 
  <a href="Falcon Insurance Website Homepage.html" class="logo">Falcon Insurance</a>
  <div class="header-right">
    <a href="Falcon Insurance Website Homepage.html">Home</a>
  </div>
</div>

<h2>Get A Policy Qoute</h2>

<form role = "form" 
            action = "<?php echo htmlspecialchars($_SERVER['PHP_SELF']); 
            ?>" method = "post">
          Email<br>
    
            <input type = "text" 
               name = "username"  
               required autofocus><br>
           Password<br>
            <input type = "password" 
               name = "password"  required> <br><br>
            <button class="button" type = "submit" 
               name = "login">LOGIN</button>
         </form>
			



</body>
</html>