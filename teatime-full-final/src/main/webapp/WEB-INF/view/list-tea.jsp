<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Tea</title>
	
	

	<link type="text/css"
		  rel="stylesheet"
		   href="${pageContext.request.contextPath}/resources/css/style.css" />



</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2> Tea Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
		 	<input type="button" value="Add Tea" 
		 			onclick="window.location.href='showFormForAdd'; return false;"
		 			class="add-button"
		 	/>
		 	
		
			
		
			<table>
				<tr>
					<th>Tea name</th>
					<th>brand</th>
					<th>Type</th>
					<th>Quantity</th>|
					<th>Action</th>
				</tr>
				
				
				<c:forEach var="tempTea" items="${teas}">
					
					<c:url var="updateLink" value="/tea/showFormForUpdate">
						<c:param name="teaId" value="${tempTea.id}"></c:param>
					</c:url>
					
					<c:url var="deleteLink" value="/tea/delete">
						<c:param name="teaId" value="${tempTea.id}"></c:param>
					</c:url>
					<tr>
						<td> ${tempTea.teaName} </td>
						<td> ${tempTea.brandID} </td>
						<td> ${tempTea.type} </td>
						<td> ${tempTea.teaBags} </td>
						
					  	<td> 
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							onclick="if(!(confirm('Do you want to delete?')))return false"> Delete</a>
					 	</td>
					
					</tr>
					
					
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









