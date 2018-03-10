<%--
  Created by IntelliJ IDEA.
  User: 10626
  Date: 2017/12/10
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sf:form modelAttribute="RainQuality" method="post" action="adda">
    Name<sf:input path="districtName"/><sf:errors path="districtName" cssClass="error"/><br>
    Gender<sf:input path="monitorTime"/><sf:errors path="monitorTime" cssClass="error"/><br>
    Age<sf:input path="rain"/><sf:errors path="rain" cssClass="error"/><br>
    Telephone<sf:input path="monitoringStation"/><sf:errors path="monitoringStation" cssClass="error"/><br>
    Email<sf:input path="monitoringAddress"/><sf:errors path="monitoringAddress" cssClass="error"/><br>

    <input type="submit" value="保存"/>
    <input type="button" value="返回"/>
</sf:form>

</body>
</html>
