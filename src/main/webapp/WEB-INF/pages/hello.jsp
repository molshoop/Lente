<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@ include file="../jsp/include.jsp"%>
<html>
<body>
<h1>${message}</h1>
<h2>${question}</h2>
<c:forTokens items="Zara,nuha,roshy" delims="," var="name">
    <c:out value="${name}"/><p>
</c:forTokens>
</body>
</html>