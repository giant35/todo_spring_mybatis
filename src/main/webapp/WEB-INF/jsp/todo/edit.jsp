<%-- 
    Document   : edit
    Created on : 2017-10-26, 11:12:09
    Author     : sihai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spform" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <spform:form modelAttribute="todo" method="POST">
            <spform:hidden path="id" />
            <spform:checkbox path="isFinish" />
            <spform:input path="title" />
            <spform:button >保存</spform:button>
        </spform:form>
    </body>
</html>
