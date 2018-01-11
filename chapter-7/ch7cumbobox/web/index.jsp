<%-- 
    Document   : ndex
    Created on : Jan 11, 2018, 11:03:46 AM
    Author     : J2EE-33
--%>

<%@page import="com.idb.combubox.Countries"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
        <%
            pageContext.setAttribute("countries", Countries.getInstance().getCountrys());
        %>
        <h1>Countries List</h1>
        <select name="country">
            <c:forEach var="country" items="${countries}">
                <option value="${country.id}">${country.name}</option>
            </c:forEach>
        </select>
    </body>
</html>
