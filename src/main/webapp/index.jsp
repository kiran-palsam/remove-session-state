<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Remove Session State Lab</title>
</head>

<body>
<h1>Welcome to the PAL session lab</h1>
<h2>Please login below:</h2>

<form action="login" method="post">
    <label for="username">
        Username:
        <input type="text" id="username" name="username">
    </label>

    <label for="password">
        Password:
        <input type="password" id="password" name="password">
    </label>

    <input type="submit" value="Login">
</form>
Instance number: <%= System.getProperty("instanceNumber") %>
</body>
</html>