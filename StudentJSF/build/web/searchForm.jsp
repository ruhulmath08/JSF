<%-- 
    Document   : searchForm
    Created on : Dec 22, 2017, 9:51:04 PM
    Author     : Rajail Islam
--%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <f:view>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <h:form>
                <h2>Search Flights</h2>
                <table>
                    <tr><td colspan="4">Where and when do you want to travel?</td></tr>
                    <tr>
                        <td colspan="2">ID : </td>
                        <td colspan="2">Name : </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <h:inputText value="#{studentController.student.studentId}" size="35"/>
                        </td>
                        <td colspan="2">
                            <h:inputText value="#{studentController.student.studentName}" size="35"/>
                        </td>
                    </tr>
                   
                </table>
                <p>
                    <h:commandButton value="Search" action="submit"/>
                </p>
            </h:form>
        </body>
    </body>
</f:view>

</html>
