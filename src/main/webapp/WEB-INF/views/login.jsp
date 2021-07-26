<%@ include file="../common/header.jspf"%>

<%@ include file="../common/naviagtion.jspf"%>

<div class="container">
    <form action="/login.do" method="post">
        <label> Name:
            <input type="text" name="name">
        </label> <label> Password:
        <input type="password" name="password">
    </label> <input type="submit" value="Login">
    </form>

</div>

<%@ include file="../common/footer.jspf"%>

