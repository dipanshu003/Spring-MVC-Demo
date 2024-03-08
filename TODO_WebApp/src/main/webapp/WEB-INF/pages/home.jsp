<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TODO App</title>

<%@include file="include_file.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<h1 class="text-center">Welcome to TODO App</h1>
		<div class="row mt-5">
			<div class="col-md-3 text-center">

				<div class="list-group">
					<a href="#" class="list-group-item list-group-item-action active">
						Menu </a> <a href="add" class="list-group-item list-group-item-action">Add
						TODO</a> <a href="home" class="list-group-item list-group-item-action">View
						TODO</a>
				</div>
			</div>
			<div class="col-md-9 text-center">
				<h4>Content</h4>
				<h5>
					<c:if test="${page == 'home'}">

						<h1 class="text-center">This is Home Page</h1>

					</c:if>

					<c:if test="${page == 'add'}">

						<h1 class="text-center">This is Add TODO page</h1>
						<form:form action="saveTodo" method="post" modelAttribute="todo">
							<div class="form-group">
								<form:input path="todoTitle" cssClass="form-control"
									placeholder="Enter you todo Title..." />
							</div>

							<div class="form-group">
								<form:textarea path="todoContent" cssClass="form-control"
									placeholder="Enter your todo content..."
									cssStyle="height:300px;" />
							</div>

							<div class="container">
								<button type="submit" class = "btn btn-outline-success">Submit</button>
							</div>
						</form:form>

					</c:if>


				</h5>


			</div>
		</div>
	</div>
</body>
</html>