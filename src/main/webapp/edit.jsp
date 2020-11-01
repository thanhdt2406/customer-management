<%--
  Created by IntelliJ IDEA.
  User: PShynn
  Date: 11/1/2020
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>controller.Edit model.Customer</title>
</head>
<body>
<h1>controller.Edit student</h1>
<div style="width: 800px; margin: 0 auto;">
    <c:forEach items="${list}" var="customer">
        <form name="editForm" method="post" action="/edit">
            <input type="hidden" name="id" value="${customer.ID}" style="width: 150px"><br>
            First Name<br>
            <input type="text" name="firstName" value="${customer.firstName}" style="width: 150px"><br>
            Last Name<br>
            <input type="text" name="lastName" value="${customer.lastName}" style="width: 150px"><br>
            Phone Number<br>
            <input type="text" name="phoneNumber" value="${customer.phoneNumber}" style="width: 150px"><br>
            Address<br>
            <input type="text" name="address" value="${customer.address}" style="width: 150px"><br>
            <input type="submit" value="Save">
        </form>
    </c:forEach>
</div>
</body>
</html>
