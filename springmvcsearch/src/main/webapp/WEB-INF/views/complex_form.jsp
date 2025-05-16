
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Insert title here</title>


</head>
<body class="" style="background: #e2e2e2;">
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-8 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3 class="text-center">Complex form</h3>
						<div class="alert alert-danger" role="alert">
			<!-- here we have to use form tag of spring form taglib as it has some feature to indicate occurring error -->
							<form:errors path="student.*" />
<!-- here we have to pass student mention in StudentEntity from @ModelAttribute ("student"), if there is another data/field like
  person,employee then we have to pass that here -->

						</div>
						<form action="handle" method="post">
							<div class="form-group">
								<label for="exampleInputEmail">Your Name</label> <input
									type="text" name="name" class="form-control"
									id="exampleInputEmail" aria-describedby="emailHelp"
									placeholder="Enter Name">

							</div>

							<div class="form-group">
								<label for="exampleInputEmail">Your Id</label> <input
									type="text" name="id" class="form-control"
									id="exampleInputEmail" aria-describedby="emailHelp"
									placeholder="Enter ID">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail">Your DOB</label> <input
									type="text" name="dob" class="form-control"
									id="exampleInputEmail" aria-describedby="emailHelp"
									placeholder="dd/mm/yyyy">
							</div>

							<div class="form-group">
								<label for="exampleFormControlSelect1">select Course</label> <select
									name="courses" class="form-control"
									id="exampleFormControlSelect1" multiple>
									<option>Java</option>
									<option>python</option>
									<option>C</option>
									<option>Cpp</option>
									<option>DS</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>

							<div class="form-group">
								<label for="">Student Type</label> <select class="form-control"
									name="type">
									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>
							</div>

							<div class="card">
								<div class="card-body">
									<p>Your Address</p>
									<div class="form-group">
										<input type="text" name="address.Street"
											placeholder="Enter Street" class="form-control">
									</div>

									<div class="form-group">
										<input type="text" name="address.city"
											placeholder="Enter City" class="form-control">
									</div>

									<div class="form-group">
										<input type="text" name="address.zip"
											placeholder="Enter ZipCode" class="form-control">
									</div>
								</div>
							</div>


							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>