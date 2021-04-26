<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Customer</title>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-tea-style.css">
</head>

<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>  Tea Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Tea</h3>
	
		<form:form action="saveTea" modelAttribute="tea" method="POST">
		
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>Tea name:</label></td>
						<td><form:input path="teaName" /></td>
					</tr>
				
					<tr>
						<td><label>Brand:</label></td>
						<td><form:select path="brandID">
							<form:option value="1" label="Basilur"></form:option>
							<form:option value="2" label="Lipton"></form:option>
							<form:option value="3" label="Dilmah"></form:option>
							<form:option value="4" label="Other"></form:option>
							</form:select></td>
					</tr>

					<tr>
						<td><label>Type:</label></td>
						<td><form:select path="type">
							<form:option value="Black" label="Black"></form:option>
							<form:option value="Green" label="Green"></form:option>
							<form:option value="White" label="White"></form:option>
							<form:option value="Othe" label="Other"></form:option>
							</form:select></td>
					</tr>

<tr>
						<td><label>Stock:</label></td>
						<td><form:input path="teaBags" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>

				
				</tbody>
			</table>
		
		
		</form:form>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/tea/list">Back to List</a>
		</p>
	
	</div>

</body>

</html>










