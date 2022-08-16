<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="card">
	<div class="card-body">
	
		<h2>Edit Post</h2>
		<form:form action="${pageContext.request.contextPath}/update-post" modelAttribute="postDto" method="post">
			<form:hidden path="id" /> 
			
			<div class="form-input">
				<form:label path="title">Title</form:label>
				<form:input path="title" class="form-control" /> 
				<form:errors path="title" />
			</div>
			
			<div class="form-input">
				<form:label path="body">Body</form:label>
				<form:textarea path="body"  class="form-control" /> 
				<form:errors path="body" />
			</div>
			
			<div class="form-input">
				<input class="btn btn-warning" type="submit" value="Submit" />
			</div>
		</form:form>
	</div>
</div>
