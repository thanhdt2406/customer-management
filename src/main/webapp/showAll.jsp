<%--
  Created by IntelliJ IDEA.
  User: PShynn
  Date: 11/1/2020
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Display Customer</title>
</head>
<body>
    <div style="width: 800px;margin: 0 auto">
        <a href="add.jsp">Add new customer</a>
        <table cellpadding="10">
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone number</th>
                <th>Address</th>
            </tr>
            <c:forEach items="${showAll}" var="customer">
            <tr>
                <td>${customer.ID}</td>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.phoneNumber}</td>
                <td>${customer.address}</td>
                <td>
                    <a href="edit?id=${customer.ID}">Edit</a>
                    <a href="delete?id=${customer.ID}">Delete</a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
