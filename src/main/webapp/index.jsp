<%@ page language="java" contentType="text/html;charset=utf-8" %>
<html>
<head>
    <title>日程管理</title>
    <script src="${pageContext.request.contextPath}/static/jquery.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/signin.css" />
</head>
<body>
</body>
<div class="container">
    <h2 class="form-signin-heading">登录</h2>
    <form action="${pageContext.request.contextPath}/user/doLogin" method="post">
    <input class="form-control" type="text" id="username" name="username" placeholder="用户名"/>
    <input class="form-control" type="password" id="password" name="password" placeholder="密码"/>
        ${info}
        <input type="submit" class="btn btn-info"/>
</form>
</div>

</html>
