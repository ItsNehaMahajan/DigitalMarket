<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
    <!-- MDB UI Kit CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.css" rel="stylesheet" />
    <style>
        .h-custom {
            height: auto !important;
        }

        @media (min-width: 1025px) {
            .h-custom {
                height: auto !important;
            }
        }

        .card-img-top {
            border-top-left-radius: .3rem;
            border-top-right-radius: .3rem;
        }

        .form-outline {
            margin-bottom: 16px;
        }

        .form-outline.datepicker .form-label {
            top: -1.25rem;
            font-size: 0.875rem;
            color: #495057;
        }

        .form-outline.datepicker .form-control {
            padding-top: 1.25rem;
        }

        .card {
            width: 70%; /* Increase width */
            margin: auto;
        }
    </style>
</head>
<body>
<section class="h-100 h-custom" style="background-color: #8fc4b7;">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-lg-10 col-xl-8">
                <div class="card rounded-3">
                    <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/img3.webp"
                         class="w-100 card-img-top"
                         alt="Sample photo">
                    <div class="card-body p-4 p-md-5">
                        <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">New Jobs</h3>

                        <form class="px-md-2" action="AddAccountSubmit" method="POST" >

                            <div class="form-outline mb-4">
                                <label for="id">Job Id</label>
                                <input type="text" id="id" name="id" class="form-control" placeholder="Enter Job Id" required>
                            </div>
                            
                            <div class="form-outline mb-4">
                                <label for="jobRole">Job Role</label>
                                <input type="text" id="jobRole" name="jobRole" class="form-control" placeholder="Enter Job Role" required>
                            </div>
                            
                            <div class="form-outline mb-4">
                                <label for="jobDescription">Job Description</label>
                                <input type="text" id="jobDescription" name="jobDescription" class="form-control" placeholder="Enter Job Description" required>
                            </div>
                            
                            <div class="form-outline mb-4">
                                <label for="jobLocation">Job Location</label>
                                <input type="text" id="jobLocation" name="jobLocation" class="form-control" placeholder="Enter Job Location" required>
                            </div>
                            
                            <div class="form-outline mb-4">
                                <label for="salary">Job Salary</label>
                                <input type="text" id="salary" name="salary" class="form-control" placeholder="Enter Salary" required>
                            </div>
                            
                            <div class="form-outline mb-4">
                                <label for="experience">Experience Required</label>
                                <input type="text" id="experience" name="experience" class="form-control" placeholder="Enter Experience Required" required>
                            </div>

                            <div class="text-center">
                                <button type="submit" class="btn btn-success btn-lg mb-1"><a href="AdminHome" style="color: white; text-decoration: none;">Submit</a></button>
                            </div>
                            
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- MDB UI Kit JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.10.2/mdb.min.js"></script>
</body>
</html>
