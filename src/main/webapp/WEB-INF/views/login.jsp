<%--
  Created by IntelliJ IDEA.
  User: Roman Tymochko
  Date: 14.08.2017
  Time: 21:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log in with your account</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/bootstrap.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/style.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/font-awesome.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/fl-outicons.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/login.css" rel="stylesheet">

    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>

</head>

<body>
<div class="container">

<form method="POST" action="${contextPath}/login" class="form-signin">
    <h3>Please Log In, or <a href="${contextPath}/registration">Sign Up</a></h3>
        <div class="row">
            <div class="col-xs-6 col-sm-6 col-md-6">
                <a href="#" class="btn btn-lg btn-primary btn-block">Facebook</a>
            </div>
            <div class="col-xs-6 col-sm-6 col-md-6">
                <a href="#" class="btn btn-lg btn-info btn-block">Google</a>
            </div>
        </div>
        <div class="login-or">
            <hr class="hr-or">
            <span class="span-or">or</span>
        </div>
        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span>${message}</span>
                <input name="username" type="text" class="form-control" placeholder="Username"
autofocus="true"/>
                <input name="password" type="password" class="form-control" placeholder="Password"/>
            <span>${error}</span>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
</div>

</form>

</div>
<!-- /container -->


<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${contextPath}/resources/js/login.js.js"></script>
<script src="${contextPath}/resources/js/bootstrap.js"></script>

</body>
</html>