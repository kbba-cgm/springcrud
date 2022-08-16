<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<main class="container">
	<div class="d-flex">
		<h2 class="mt-3">Post Lists</h2>
	</div>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>No.</th>
				<th>Title</th>
				<th>Body</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${posts}" var="post">
				<tr>
					<td>${ post.id }</td>
					<td><a class="view-post" href="${pageContext.request.contextPath}/view-post/${ post.id }">${ post.title }</a></td>
					<td>${ post.body }</td>
					<td><a class="btn btn-sm btn-warning"
						href="${pageContext.request.contextPath}/edit-post/${ post.id }">Edit</a>
						<a class="btn btn-sm btn-danger"
						href="${pageContext.request.contextPath}/delete-post/${ post.id }">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</main>
