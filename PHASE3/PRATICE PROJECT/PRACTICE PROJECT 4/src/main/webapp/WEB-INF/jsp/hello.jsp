<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <title>Hello</title>
    </head>
    <body>
        <h1>Hello ${pageContext.request.remoteUser}!</h1>
        <form action="logout" method="post">
            <div><input type="submit" value="Sign Out"/></div>
        </form>
    </body>
</html>