<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("username") == null) {
        response.sendRedirect("/");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Remove Session State Lab - Profile Page</title>
</head>
<body>

<h1>Your Profile</h1>
<div>Username:</div>
<div><%= session.getAttribute("username") %>
</div>
<div>Phone Number:</div>
<div><%= session.getAttribute("phoneNumber") %>
</div>

<form action="logout" method="post">
    <input type="submit" value="Logout">
</form>

Instance number: <%= System.getenv("CF_INSTANCE_INDEX") %>

</body>
</html>
