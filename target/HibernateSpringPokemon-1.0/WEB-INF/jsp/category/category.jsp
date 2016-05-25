<%-- 
    Document   : category
    Created on : 20-mag-2016, 17.28.16
    Author     : dario
--%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Hello World!</h1>
    
    <h2>You successfully reached Category page!</h2>
    <br><hr><br>
    
    <c:if test="${register==1}">
        <%@include file="registerCategory.jsp" %>
    </c:if>
    
    <table>
        <tr>
            <th>Category</th>
        </tr>
        <c:forEach items="${categories}" var="category">
            <tr>
                <td>${category.analogy}</td>
            </tr>
        </c:forEach>
    </table>
    