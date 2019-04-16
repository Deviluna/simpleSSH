<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">欢迎，${username}</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/user/main">今日</a></li>
                <li><a href="${pageContext.request.contextPath}/user/week">本周</a></li>
                <li><a href="#">本月</a></li>
                <li><a href="${pageContext.request.contextPath}/user/image">图片日记</a></li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${pageContext.request.contextPath}/noip/main">NOIP</a></li>
                <li><a href="${pageContext.request.contextPath}/sixManager/main">六学管理</a></li>
                <li><a href="${pageContext.request.contextPath}/image/upload">上传图片</a></li>
                <li><a href="${pageContext.request.contextPath}/user/wechatMission">微信任务页面</a></li>
                <li><a href="${pageContext.request.contextPath}/user/wechatChat">聊天管理</a></li>
                <li><a href="${pageContext.request.contextPath}/user/manageHabit">管理习惯</a></li>
                <li><a href="${pageContext.request.contextPath}/user/manage">账户设置</a></li>
                <li><a href="${pageContext.request.contextPath}/user/logout">登出</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div><!--/.container-fluid -->
</nav>