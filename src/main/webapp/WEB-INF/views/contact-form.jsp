<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>This is the homepage!</p>

        <form:form modelAttribute="contactmodel" action="view-contacts" method="post">

            <form:errors path="*">
                <div class="msg error">
                    <h4>ATTENTION!</h4>
                    <p>Please make the following correction(s) before proceeding.</p>
                </div>
            </form:errors>



            <fieldset><legend>Contact Information</legend>
                <div class="help icon astrisk">required</div>
                <div class="field">
                    <div class="label required"><form:label path="lastName" cssErrorClass="invalid">Last Name</form:label></div>
                    <div class="input"><form:input path="lastName" cssErrorClass="invalid " /><form:label path="lastName" cssErrorClass="icon invalid" />
                        <form:errors path="lastName" cssClass="invalid" /></div>
                </div>

                <div class="field">
                    <div class="label required"><form:label path="firstName" cssErrorClass="invalid">First Name</form:label></div>
                    <div class="input"><form:input path="firstName" cssErrorClass="invalid " /><form:label path="firstName" cssErrorClass="icon invalid" />
                        <form:errors path="firstName" cssClass="invalid" /></div>
                </div>

                <div class="field">
                    <div class="label required"><form:label path="studentId" cssErrorClass="invalid">Student Id</form:label></div>
                    <div class="input"><form:input path="studentId" cssErrorClass="invalid " /><form:label path="studentId" cssErrorClass="icon invalid" />
                        <form:errors path="studentId" cssClass="invalid" /></div>
                </div>

                <div class="field">
                    <div class="label required"><form:label path="email" cssErrorClass="invalid">Email</form:label></div>
                    <div class="input"><form:input path="email" cssErrorClass="invalid " /><form:label path="email" cssErrorClass="icon invalid" />
                        <form:errors path="email" cssClass="invalid" /></div>
                </div>

                <div class="field">
                    <div class="label required"><form:label path="birthDate" cssErrorClass="invalid">Birth Date</form:label></div>
                    <div class="input"><form:input path="birthDate" cssErrorClass="invalid " /><form:label path="birthDate" cssErrorClass="icon invalid" /><div class="help">(mm/dd/yyyy)</div>
                        <form:errors path="birthDate" cssClass="invalid" /></div>
                </div>

                <div class="field">
                    <div class="label"><form:label path="college">College</form:label></div>
            <%--       <div class="input"><form:select path="college" items="${collegeList}" itemLabel="name" itemValue="id" /></div>--%>
                    <div class="input"><form:select path="college" items="${collegeList}"   /></div>

                </div>

                <div class="field">
                    <div class="label"><form:label path="comment">Comment</form:label></div>
                    <div class="input"><form:textarea path="comment" /><span
                            class="help">Please supply any special instructions when contacting you.</span></div>
                </div>

                <div class="field">
                    <div class="input"><input type="submit" class="button primary" value="Save" /></div>
                </div>

            </fieldset>

        </form:form>
    </body>
</html>
