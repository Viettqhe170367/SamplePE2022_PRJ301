<%-- 
    Document   : discuss
    Created on : Oct 27, 2023, 11:02:16 PM
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
	<c:forEach items="${requestScope.map}" var="thread">
	    <form action="addCmt" method="POST" style="margin-bottom: 20px">
		<input style="display: none" type="number" name="threadId" value="${thread.key.tid}">
		Thread: ${thread.key.tcontent}<br>
		<c:forEach items="${thread.value}" var="cmt">
		    ${cmt.user}: ${cmt.ctitle}<br>
		</c:forEach>
		<input type="text" name="content"><input type="submit" value="Save" />
	    </form>
	</c:forEach>
    </body>
</html>
