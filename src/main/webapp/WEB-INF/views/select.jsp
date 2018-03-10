<%--
  Created by IntelliJ IDEA.
  User: 10626
  Date: 2017/12/10
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <h2>雨量监测</h2>

    <a href="add" >注册</a>
    <tr align="center">
        <td>序号</td>
        <td>区域名称</td>
        <td>监测时间</td>
        <td>雨量值</td>
        <td>监测站</td>
        <td>站点地址</td>
        <td>操作</td>
    </tr>
    <c:forEach var="r" items="${rainList}">
        <tr>
            <td>${r.id}</td>
            <td>${r.districtName}</td>
            <td>${r.monitorTime}</td>
            <td>${r.rain}</td>
            <td>${r.monitoringStation}</td>
            <td>${r.monitoringAddress}</td>
            <td><input type="button" value="删除"/> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
