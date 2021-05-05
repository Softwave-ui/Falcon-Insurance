
<?php
// Initialize the session
session_start();
 
// Check if the user is already logged in, if yes then redirect him to welcome page
if(isset($_SESSION["loggedin"]) && $_SESSION["loggedin"] === true){
    header("location: Form.php");
    exit;
}
 
// Include config file
require_once "config.php";
 
// Define variables and initialize with empty values
$client_email = $client_password = "";
$client_email_err = $client_password_err = $login_err = "";
 
// Processing form data when form is submitted
if($_SERVER["REQUEST_METHOD"] == "POST"){
 
    // Check if username is empty
    if(empty(trim($_POST["client_email"]))){
        $client_email_err = "Please enter username.";
    } else{
        $client_email = trim($_POST["client_email"]);
    }
    
    // Check if password is empty
    if(empty(trim($_POST["client_password"]))){
        $client_password_err = "Please enter your password.";
    } else{
        $client_password = trim($_POST["client_password"]);
    }
    
    // Validate credentials
    if(empty($client_email_err) && empty($client_password_err)){
        // Prepare a select statement
        $sql = "SELECT client_id, client_email, client_password FROM Client_ WHERE client_email = ?";
        
        if($stmt = mysqli_prepare($link, $sql)){
            // Bind variables to the prepared statement as parameters
            mysqli_stmt_bind_param($stmt, "s", $param_client_email);
            
            // Set parameters
            $param_client_email = $client_email;
            
            // Attempt to execute the prepared statement
            if(mysqli_stmt_execute($stmt)){
                // Store result
                mysqli_stmt_store_result($stmt);
                
                // Check if username exists, if yes then verify password
                if(mysqli_stmt_num_rows($stmt) == 1){                    
                    // Bind result variables
                    mysqli_stmt_bind_result($stmt, $client_id, $client_emaill, $hashed_client_password);
                    if(mysqli_stmt_fetch($stmt)){
                        if(password_verify($client_password, $hashed_client_password)){
                            // Password is correct, so start a new session
                            session_start();
                            
                            // Store data in session variables
                            $_SESSION["loggedin"] = true;
                            $_SESSION["client_id"] = $client_id;
                            $_SESSION["client_email"] = $client_email;                            
                            
                            // Redirect user to welcome page
                            header("location: http://localhost/Falcon%20Insurance/PolicyQuote.html");
                        } else{
                            // Password is not valid, display a generic error message
                            $login_err = "Invalid password.";
                        }
                    }
                } else{
                    // Username doesn't exist, display a generic error message
                    $login_err = "Invalid username.";
                }
            } else{
                echo "Oops! Something went wrong. Please try again later.";
            }

            // Close statement
            mysqli_stmt_close($stmt);
        }
    }
    
    // Close connection
    mysqli_close($link);
}
?>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body{ font: 14px sans-serif; }
        .wrapper{ width: 350px; padding: 20px; }
    </style>
</head>
<body>
    <div class="wrapper">
        <h2>Login</h2>
        <p>Please fill in your credentials to login.</p>

        <?php 
        if(!empty($login_err)){
            echo '<div class="alert alert-danger">' . $login_err . '</div>';
        }        
        ?>

        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
            <div class="form-group">
                <label>Username</label>
                <input type="text" name="client_email" class="form-control <?php echo (!empty($client_email_err)) ? 'is-invalid' : ''; ?>" value="<?php echo $client_email; ?>">
                <span class="invalid-feedback"><?php echo $client_email_err; ?></span>
            </div>    
            <div class="form-group">
                <label>Password</label>
                <input type="password" name="client_password" class="form-control <?php echo (!empty($client_password_err)) ? 'is-invalid' : ''; ?>">
                <span class="invalid-feedback"><?php echo $client_password_err; ?></span>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Login">
            </div>
            <p>Don't have an account? <a href="register.php">Sign up now</a>.</p>
        </form>
    </div>
</body>
</html>
