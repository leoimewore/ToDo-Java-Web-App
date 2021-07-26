<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Servlet</title>
</head>
<body>

<p>Hello ${name}</p>

<ol>
    <c:forEach items="${todos}" var="todo">
        <li> ${todo.name}  <a href="/delete-todo.do?todo=${todo.name}">Delete</a> </li>
    </c:forEach>
</ol>

<form action="/todo.do" method="post">
    <input name="todo" type="text"><input type="submit" value="Add">
</form>

</body>
</html>
