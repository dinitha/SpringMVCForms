<%--
  Created by IntelliJ IDEA.
  User: D
  Date: 4/9/2017
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset><legend>Contact Information</legend>
    <div class="field">
        <div class="label">Last Name</div>
        <div class="output"><c:out value="${contactCmd.lastName}" /></div>
    </div>

    <div class="field">
        <div class="label">First Name</div>
        <div class="output"><c:out value="${contactCmd.firstName}" /></div>
    </div>

    <div class="field">
        <div class="label">Student Id</div>
        <div class="output"><c:out value="${contactCmd.studentId}" /></div>
    </div>

    <div class="field">
        <div class="label">Email</div>
        <div class="output"><c:out value="${contactCmd.email}" /></div>
    </div>

    <div class="field">
        <div class="label">Birth Date</div>
        <div class="output"><fmt:formatDate value="${contactCmd.birthDate}" pattern="MM/dd/yyyy"/></div>
    </div>

    <div class="field">
        <div class="label">College</div>
        <div class="output"><c:out value="${contactCmd.college.name}" /></div>
    </div>

    <div class="field">
        <div class="label">Comment</div>
        <div class="output"><c:out value="${contactCmd.comment}" /></div>
    </div>

</fieldset>
</body>
</html>
