   <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
   <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
   
   <html>

       <f:view>
        <head>               
         <title>Freedom Airlines Online Flight Reservation System</title>
         <link rel="stylesheet" href="projsp.css">
      </head>
      <body>
            <h3>You entered these search parameters</h3>
            <p>Origination: <h:outputText value="#{studentController.student.studentId}"/>
            <p>Depart date: <h:outputText value="#{studentController.student.studentName}"/>
          
      </body>      
   
       </f:view>
      
</html>