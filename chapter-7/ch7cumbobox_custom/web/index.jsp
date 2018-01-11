<%-- 
    Document   : index
    Created on : Jan 11, 2018, 11:57:34 AM
    Author     : J2EE-33
--%>

<%@page import="com.idb.domain.Countries"%>
    <%@taglib uri="/WEB-INF/tlds/cho7ct.tld" prefix="ch"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <%
            pageContext.setAttribute("countries", Countries.getInstance().getCountrys());
        %>
        <h1>Countries</h1>
        <ch:select name="country" label="name" value="id" items="${countries}"/>
    </body>
</html>
