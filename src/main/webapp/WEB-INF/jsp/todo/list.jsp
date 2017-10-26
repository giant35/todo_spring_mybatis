<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<%@taglib  prefix="spform" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <c:out value="${msg}" />
        <sp:url value="/todo/edit" var="editUrl" />
        <a href="${editUrl}" >新建</a>
        <table>            
            <c:forEach items="${todoList}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.title}</td>
                    <td>${todo.isFinish}</td>
                    <td><a href="${editUrl}?id=${todo.id}">编辑</a></td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
