<%-- 
    Document   : seacrh
    Created on : Oct 27, 2023, 10:01:04 PM
    Author     : tranq
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<form action="search" method="GET">
	    Name <input type="text" name="name" value="${requestScope.name}">
	    <input type="submit" value="Search" />
	</form>

	<c:if test="${param.name!=null}">
	    <table border="1" style="margin-top: 20px">
		<thead>
		    <tr>
			<th>sid</th>
			<th>name</th>
			<th>gender</th>
			<th>dob</th>
		    </tr>
		</thead>
		<tbody>
		    <c:forEach items="${requestScope.students}" var="student">
			<tr>
			    <td>${student.sid}</td>
			    <td>${student.name}</td>
			    <td>${student.gender}</td>
			    <td>${student.dob}</td>
			</tr>
		    </c:forEach>
		</tbody>
	    </table>
	</c:if>

    </body>
</html>
