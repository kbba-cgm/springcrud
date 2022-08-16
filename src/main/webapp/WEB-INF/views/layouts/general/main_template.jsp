<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.1/css/bootstrap.min.css" />
<link type="text/css" rel="stylesheet" href="<c:url value="/assets/custom.css" />" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Signika&family=Roboto&family=Signika:wght@500;700&display=swap" rel="stylesheet">
<!-- <link href="https://fonts.googleapis.com/css2?family=Roboto&family=Signika:wght@500;700&display=swap" rel="stylesheet">
 --><title><tiles:insertAttribute name="title" /></title>
</head>
<body>
    <div id="header">
       <tiles:insertAttribute name="header" />
    </div>
    <div class="container my-4" id="content">
       <tiles:insertAttribute name="body" />
    </div>
    <div id="footer">
       <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>