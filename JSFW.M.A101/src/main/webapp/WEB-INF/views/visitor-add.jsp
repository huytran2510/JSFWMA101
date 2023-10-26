<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/11/2023
  Time: 4:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <meta charset="ISO-8859-1">
    <title>Title</title>
    <link href="<c:url value="/resources/css/add.css" />"
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
        <b><p>Visitor Information</p></b>
    </div>

    <div class="form-action">
        <table>
            <form:form action="add" method="post" modelAttribute="person">
                <tr>
                    <td>Firstname</td>
                    <td><form:input id="firstname" type="text" path="firstName"/></td>
                </tr>
                <tr>
                    <td>Lastname</td>
                    <td><form:input type="text " path="lastName"/></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <form:select name="gender" path="gender">
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>Telephone</td>
                    <td><form:input type="text" path="mobile"/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><form:input type="email" path="email"/></td>
                </tr>
                <tr>
                    <td>You are in</td>
                    <td>
                        <div>
                            <form:radiobutton path="address" value="Europe"/> Europe
                            <form:radiobutton path="address" value="Africa"/> Africa
                        </div>
                        <div>
                            <form:radiobutton path="address" value="Australia"/> Australia
                            <form:radiobutton path="address" value="Asia"/> Asia
                            <form:radiobutton path="address" value="America"/> America
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>What are your hobbies</td>
                    <td>
                        <div>
                            <form:checkbox path="hobbies" value="Swimming"/> Swimming
                            <form:checkbox path="hobbies" value="Cooking"/> Cooking
                            <form:checkbox path="hobbies" value="Shopping"/> Shopping
                        </div>
                        <div>
                            <form:checkbox path="hobbies" value="Sport"/> Sport
                            <form:checkbox path="hobbies" value="Dance"/> Dance
                            <form:checkbox path="hobbies" value="Sing"/> Sing
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td>
                        <form:textarea name="" id="" cols="30" rows="10" path="description"></form:textarea>
                    </td>
                </tr>
                <tr >
                    <td></td>
                    <td>
                        <form:button class="button" type="submit" value="Register"/>
                    </td>
                </tr>
            </form:form>
        </table>
    </div>
</div>
</body>
</html>
