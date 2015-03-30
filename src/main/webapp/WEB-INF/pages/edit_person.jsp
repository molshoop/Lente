<%--
  Created by IntelliJ IDEA.
  User: bens
  Date: 3/23/15
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title><fmt:message key="title"/></title>
    <style>
        .error { color: red; }
    </style>
</head>
<body>
<div>
    <h2>Edit Person Form</h2>

    <sf:form method="POST" modelAttribute="person" action="/person/modify">
        <form:hidden path="id"/>
        <fieldset>
            <table cellspacing="0">
                <tr>
                    <th><label for="lastname">Achternaam:</label></th>
                    <td><sf:input path="lastname" id="lastname"/></td>
                    <td><sf:errors path="lastname"/></td>
                </tr>
                <tr>
                    <th><label for="firstname">Voornaam:</label></th>
                    <td><sf:input path="firstname" id="firstname"/></td>
                    <td><sf:errors path="firstname"/></td>
                </tr>
                <tr>
                    <th><label for="email">Email:</label></th>
                    <td><sf:input path="email" id="email"/></td>
                    <td><sf:errors path="email" /></td>
                </tr>
                <tr>
                    <th><label for="password">Wachtwoord:</label></th>
                    <td><sf:input path="password" id="password"/></td>
                    <td><sf:errors path="password" /></td>
                </tr>
                <tr>
                    <th><input type="Submit" value="Submit"/></th>
                    <td></td>
                </tr>
            </table>
        </fieldset>
    </sf:form>

</div>
</body>
</html>
