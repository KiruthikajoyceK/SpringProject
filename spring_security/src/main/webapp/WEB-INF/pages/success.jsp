<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><h1>welcome</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>welcome</h3><c:out value="${ pagecontext.request.userPrincipal.name}"></c:out>
<ul>
<li>java 8</li>
<li>spring</li>
<li>gradle</li>
<li>Big data</li>
</ul>

<c:url value="/logout" var="logoutUrl"/>
<form id="logout" action="${logoutUrl}" method="post">
<input type="hidden" name="${_csrf.parametername}" value="${_csrf.token}"/>
</form>
<c:if test="${pagecontext.request.userPrincipal.name!=null}">
<a  href="javascript:document.getElementById('logout).submit()">Logout</a>
</c:if>
</body>
</html>