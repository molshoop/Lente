<%--
  Created by IntelliJ IDEA.
  User: bens
  Date: 3/14/15
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Personen</title>
</head>
<body>
<h1>Personen</h1>
<h3>Persons List</h3>
<c:if test="${!empty listPersons}">
    <table class="tg">
        <tr>
            <th width="80">Person ID</th>
            <th width="120">Person Name</th>
            <th width="120">Person Country</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${listPersons}" var="person">
            <tr>
                <td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.country}</td>
                <td><a href="<c:url value='/edit/${person.id}' />" >Edit</a></td>
                <td><a href="<c:url value='/remove/${person.id}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
