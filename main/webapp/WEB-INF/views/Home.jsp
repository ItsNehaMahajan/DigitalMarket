<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <!-- Google Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins&display=swap">
    <style>
        body {
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background: url('https://images.pexels.com/photos/461940/pexels-photo-461940.jpeg') no-repeat center center/cover;
            font-family: 'Poppins', sans-serif;
            color: #ffffff; /* Text color for the welcome message */
        }
        
        nav {
            background-color: rgba(255, 255, 255, 0.13);
            border-bottom: 2px solid rgba(255, 255, 255, 0.1);
        }

        .logo img {
            margin-right: 10px;
        }

        .logo h1 {
            font-size: 24px;
            font-weight: 700;
            color: #ffffff;
        }

        .navbar-nav .nav-item .nav-link {
            color: #ffffff !important;
            font-size: 18px;
            font-weight: 500;
        }

        .navbar-nav .nav-item .nav-link:hover {
            color: #f0f0f0 !important;
        }

        .container {
            margin-top: 20px;
        }

        .card {
            background-color: #272c4a;
            border: none;
            border-radius: 10px;
            color: white;
            margin-bottom: 20px;
        }

        .card .card-header {
            background-color: #1b203d;
            border-bottom: 1px solid rgba(255, 255, 255, 0.1);
        }

        .card .card-body {
            background-color: #272c4a;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top">
    <div class="container">
        <a class="navbar-brand logo" href="#">
            <h1>QuickStart</h1>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Login
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="Login">Admin</a>
                        <a class="dropdown-item" href="UserLogin">User</a>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Header -->
<header class="container text-center">
    <h1>Welcome to QuickStart</h1>
</header>



<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
