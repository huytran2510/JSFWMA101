<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/11/2023
  Time: 4:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <meta charset="ISO-8859-1">
    <title>Title</title>
    <link href="<c:url value="/resources/css/seach.css" />"
          rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="picture">
        <img src="https://kyluc.vn/Userfiles/Upload/images/Download/2017/11/30/fdea1d6d5bd04f8ea35d50d67b1de9e6.jpg"
             alt="">
    </div>
    <div class="header">
        <b>
            <p>Search Visitor</p>
        </b>
    </div>

    <div class="form-seach">
        Firstname: <input type="text">
        <input type="submit" value="Search"> (Type Firstname Visitor and Click Search Button)
    </div>

    <hr>

    <div class="form-list">
        <table>
            <form action="">
                <tr class="form-header">
                    <td>Fist name</td>
                    <td>Last name</td>
                    <td>Gender</td>
                    <td>Telephone</td>
                    <td>You're in</td>
                    <td>Hobbies</td>
                    <td>Description</td>
                </tr>
                <c: forEach var="person" items="${person}">
                    <tr>
                        <td>${person.firstname}</td>
                        <td>${person.lastname}</td>
                        <td>${person.gender}</td>
                        <td>${person.firstname}</td>
                        <td>${person.lastname}</td>
                        <td>${person.gender}</td>
                        <td>${person.description}</td>
                    </tr>
                </c:>
            </form>
        </table>
    </div>
</div>
</body>
</html>
