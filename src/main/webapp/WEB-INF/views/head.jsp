<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">" 
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a href="/carreview/" class="navbar-brand"><span class="glyphicon glyphicon-home"></span> Car Reviews</a>
					<a href="/carreview/login" class="btn btn-warning navbar-btn navbar-right" id="login"><span class="glyphicon glyphicon-user"></span> Login </a> 
                
				
<!--                Search button -->
<%-- 					<form:form cssClass="navbar-form navbar-right" role="search"> --%>
<!-- 						<div class="form-group"> -->
<%-- 							<form:input path="search" cssClass="form-control" placeholder="Search here"/> --%>
<!-- 						</div> -->
<!-- 						<button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-search"></span></button> -->
<%-- 					</form:form><!--end of search--> --%>
					<ul class="nav navbar-nav">
						<li><a href="news"> News</a>
						<li><a href="gallery"> Gallery</a>
						<li><a href="topbrands">Top Brands</a>
						<li><a href="reviews"> Reviews</a>
						<li><a href="write"> Write a Review</a>
					</ul>
				</div>
			
		</nav>