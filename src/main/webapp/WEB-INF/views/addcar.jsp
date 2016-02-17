<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin Page: Add cars</title>
    <link rel="stylesheet" type="text/css" href="../resources/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="../resources/css/style.css"/>
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
                                    <h2 class="text-primary"><strong>Add cars</strong></h2>
								</div>
								<form:form class="well" action="admin/addcar" modelAttribute="addcar" method="POST" onsubmit="return validate();">
										  <div class="form-group">
											<label for="brand" class="text-warning">Brand</label>
											<form:input path="brand" cssClass="form-control" placeholder="Car Brand" />
										  </div>
										  <div class="form-group">
											<label for="model" class="text-warning">Model</label>
											<form:input path="model" cssClass="form-control" placeholder="Car Model"/>
										  </div>
                                        <div class="form-group">
											<label for="price" class="text-warning">Price</label>
											<form:input path="price" cssClass="form-control" placeholder="Price"/>
										  </div>
						  <a href="/carreview/admin/" class="btn btn-success"><span class="glyphicon glyphicon-arrow-left"></span>Back </a>
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