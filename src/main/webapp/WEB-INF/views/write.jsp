<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Send a Review</title>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="resources/css/style.css"/>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>

<!--write review-->
		<div class="container">
			<section>
				<div class="page-header" id="write">
					<h2 class="text-danger">Write a review<small class="text-primary">have something to say?</small></h2>
				</div><!--end page header-->
				
				<div class="row">
					<div class="col-sm-4">
						<p> <strong><i>Send us your reviews</i></strong></p>
						<img src="resources/img/qstn.jpg" alt="Think and write" width ="80%" height="60%">
						<!--add something later-->
					</div>
					
					<div class="col-sm-8">
						<form:form action="userreview" cssClass="form-horizontal" modelAttribute="reviews" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <label for="user-name" class="col-sm-2 control-label">Name</label> 
                                    <div class="col-sm-10">
                                        <form:input path="username" cssClass="form-control" placeholder="Enter your username"/>
                                    </div>
                                </div><!--End form group-->
                                <div class="form-group">
                                    <label for="user-email" class="col-sm-2 control-label">Email</label> 
                                    <div class="col-sm-10">
                                       <form:input path="email" cssClass="form-control" placeholder="Enter your email"/>
                                    </div>
                                </div><!--End form group-->

                                <div class="form-group">
                                    <label for="user-title" class="col-sm-2 control-label">Title</label> 
                                    <div class="col-sm-10">
                                        <form:input path="title" cssClass="form-control" placeholder="Enter a title."/>
                                    </div>
                                </div><!--End form group-->

                                <div class="form-group">
                                    <label for="user-review" class="col-sm-2 control-label">Review</label> 
                                    <div class="col-sm-10">
                                    <form:textarea path="userreview" cssClass="form-control" placeholder="Write a review" cols="20" rows="10"/>
                                                                               
                                    </div>
                                </div><!--End form group-->


                                <div class="form-group">
                                    <label for="user-rating" class="col-sm-2 control-label">Rating</label> 
                                    <div class="col-sm-10">
                                        
                                        <form:input path="rating" cssClass="rating" type="number" min="1" max="5" step="1"/>
                                    </div>
                                </div><!--End form group-->


                                <div class="form-group"> 
                                    <div class="col-sm-10 col-sm-offset-2">
                                        <button type="submit" class="btn btn-success">Submit</button>
                                    </div>
                                </div>
                            </fieldset>
						</form:form>
					</div>
				</div><!--end row-->
			</section>
		</div>
		
	
<jsp:include page="footer.jsp"></jsp:include>
<script src="resources/js/jquery-2.2.0.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script> 
	<script src="resources/js/star-rating.js"></script>
</body>
</html>