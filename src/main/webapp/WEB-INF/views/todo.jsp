<%@ include file="../common/header.jspf"%>

<%@ include file="../common/naviagtion.jspf"%>

<div class="container">
    <H1>Welcome ${name}</H1>

    Your Todos are

    <table class="table table-striped">
        <thead>
        <th>Description</th>
        <th>Category</th>
        <th>Actions</th>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">

            <tr>
                <td>${todo.name}</td>
                <td>${todo.category}</td>
                <td><a class="btn btn-danger" href="/delete-todo.do?todo=${todo.name}">Delete</a></td>
            </tr>


<%--            <li> ${todo.name} ${todo.category}  <a href="/delete-todo.do?todo=${todo.name}">Delete</a> </li>--%>
        </c:forEach>
        </tbody>
    </table>

<%--    <ol>--%>
<%--        <c:forEach items="${todos}" var="todo">--%>
<%--            <li> ${todo.name} ${todo.category}  <a href="/delete-todo.do?todo=${todo.name}">Delete</a> </li>--%>
<%--        </c:forEach>--%>
<%--    </ol>--%>
    <a class="btn btn-success" href="/add-todo.do">Add new ToDo</a>
</div>

<%@ include file="../common/footer.jspf"%>

