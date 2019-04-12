<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<c:if test="${not empty error }"><div>${error}</div></c:if>
<c:if test="${not empty message }"><div>${message}</div></c:if>
<form name='login' action='<c:url value="/loginpage"/>' method="post">
User Name<input  type="text" name="userName"><br><br>
Password<input  type="password" name="password"><br><br>
<input type="submit" value="submit" name ="submit">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

</form>
</body>
</html>