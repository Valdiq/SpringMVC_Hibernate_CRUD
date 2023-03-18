<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>


<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"></form:hidden>

    Name <form:input path="name"></form:input>
    <br>
    Surname <form:input path="surname"></form:input>
    <br>
    Department <form:input path="department"></form:input>
    <br>
    Salary <form:input path="salary"></form:input>
    <br>
    <input type="submit" value="OK">
</form:form>


</body>
</html>
