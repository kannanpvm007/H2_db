<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1 align="center">List Cars</h1>
    <center>
		<table border="1">
			<tr>
				<th>id</th>
                <th>brand</th>
            </tr>
            <c:forEach items="${Cars}" var="s">
		     <c:param name="studentId" value="${s.id}" />

		       <tr>
					<td>${s.id}</td>
					<td>${s.brand}</td>
					</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>