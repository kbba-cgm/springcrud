<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="card">
	<div class="card-body">
	
		<h2>Create Post</h2>
		<form:form action="store-post" modelAttribute="postDto" method="post">
			<div class="form-input">
				<form:label path="title" >Title</form:label>
				<form:input path="title" class="form-control" /> 
				<form:errors path="title" />
			</div>
			
			<div class="form-input">
				<form:label path="body">Body</form:label>
				<form:textarea path="body"  class="form-control" /> 
				<form:errors path="body" />
			</div>
			
			<div class="form-input">
				<input class="btn btn-success" type="submit" value="Submit" />
			</div>
		</form:form>
	</div>
</div>
