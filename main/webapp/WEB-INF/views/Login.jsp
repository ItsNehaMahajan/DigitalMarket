<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <title>Login Page</title>
    <style>
        body, html {
            height: 100%;
            margin: 0;
            font-family: 'Poppins', sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            background-color: #f5f5f5;
        }

        .container {
            display: flex;
            flex-direction: row;
            align-items: center;
            justify-content: center;
            background: #fff;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            overflow: hidden;
            max-width: 900px;
            width: 100%;
            height: 80vh;
            margin: 20px;
        }

        .image {
            flex: 1;
            display: none;
        }

        .image img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }

        .form-container {
            flex: 1;
            padding: 30px;
            display: flex;
            flex-direction: column;
            justify-content: center;
        }

        .form-container h2 {
            margin-bottom: 20px;
            font-weight: 600;
            color: #333;
        }

        .form-container .social-buttons {
            display: flex;
            justify-content: space-around;
            margin-bottom: 20px;
        }

        .form-container .social-buttons button {
            border: none;
            background-color: #4267B2;
            color: #fff;
            padding: 10px;
            border-radius: 50%;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .form-container .social-buttons button:hover {
            background-color: #365899;
        }

        .divider {
            display: flex;
            align-items: center;
            margin-bottom: 20px;
        }

        .divider::before,
        .divider::after {
            content: "";
            flex: 1;
            height: 1px;
            background: #ddd;
        }

        .divider::before {
            margin-right: 10px;
        }

        .divider::after {
            margin-left: 10px;
        }

        .form-container form {
            display: flex;
            flex-direction: column;
        }

        .form-container form .form-outline {
            margin-bottom: 15px;
            position: relative;
        }

        .form-container form .form-outline label {
            position: absolute;
            top: 10px;
            left: 10px;
            font-size: 12px;
            color: #aaa;
            transition: all 0.2s ease;
        }

        .form-container form .form-outline input {
            width: 100%;
            padding: 15px 10px 15px 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            outline: none;
            font-size: 14px;
            transition: border-color 0.2s ease;
        }

        .form-container form .form-outline input:focus {
            border-color: #007bff;
        }

        .form-container form .form-outline input:focus + label {
            top: -10px;
            font-size: 10px;
            color: #007bff;
        }

        .form-container form button {
            padding: 10px 20px;
            background-color: #007bff;
            border: none;
            border-radius: 4px;
            color: #fff;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s ease;
            width: 150px;
            align-self: center;
        }

        .form-container form button:hover {
            background-color: #0056b3;
        }

        @media (min-width: 768px) {
            .image {
                display: block;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="image">
            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp" alt="Sample image">
        </div>
        <div class="form-container">
            <h2><center>Sign In</ceneter></h2>
           
            
            <form action="afterLoginSubmit" method="POST">
                <div class="form-outline">
                    <input type="username" id="username" name="username" required>
                    <label for="username">Username</label>
                </div>
                <div class="form-outline">
                    <input type="password" id="password" name="password" required>
                    <label for="password">Password</label>
                </div>
                <button type="submit">Login</button>
            </form>
        </div>
    </div>
</body>
</html>
