<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin Page: Add Details</title>
    <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
    </head>
  <body style="background=#aabbcc;">
    <div class="container">
        <section>
            <div class="page-header">
                <h1 class="text-info">Cars</h1>
            </div>
        <div class="row">
			  <div class="col-md-4">
                    
                    <img src="resources/img/car2.jpg" alt="Image" width=100%>   
            </div>
			  <div class="col-md-8" >
				<div class="panel panel-default">
					<div class="panel-body">
								<div class="page-header">
                                    <h2 class="text-primary"><strong>Add specifications</strong></h2>
								</div>
								<form:form cssClass="well" action="addDetails" modelAttribute="addDetails" method="POST" onsubmit="return validate();">
										  <div class="form-group">
											<label for="car_id" class="text-warning">car_id</label>
											<form:input path="car_id" cssClass="form-control" placeholder="matching car_id" />
										  </div>
										  <div class="form-group">
											<label for="description" class="text-warning">Description</label>
											<form:textarea path="description" cssClass="form-control" placeholder="description" />
										  </div>
										  <div class="form-group">
											<label for="launch" class="text-warning">Launch date</label>
											<form:input path="launchdate" type ="date" cssClass="form-control" placeholder="launch date(MM/dd/yyyy)"/>
										  </div>
                                        <div class="form-group">
											<label for="engine" class="text-warning">Engine</label>
											<form:input path="engine" cssClass="form-control" placeholder="engine"/>
										  </div>
										   </div>
										  <div class="form-group">
											<label for="power" class="text-warning">Power</label>
											<form:input path="power" cssClass="form-control" placeholder="power"/>
										  </div>
										  <div class="form-group">
											<label for="doors" class="text-warning">Doors</label>
											<form:input path="doors" cssClass="form-control" placeholder="no. of doors" />
                                        <div class="form-group">
											<label for="seats" class="text-warning">Seats</label>
											<form:input path="seats" cssClass="form-control" placeholder="no. of seats"/>
										  </div>
						  <a href="/carreview/admin/addcar" class="btn btn-success"><span class="glyphicon glyphicon-arrow-left"></span>Back </a>
                        <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-upload"></span>Add</button>
						</form:form>
					</div>
				</div>
			  </div>
		  </div>
        </section>
	</div>
	

   <script src="resources/js/jquery-2.2.0.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script> 
	<script src="resources/js/star-rating.js"></script>
  </body>
</html>