<%-- 
    Document   : category
    Created on : 20-mag-2016, 17.28.16
    Author     : dario
--%>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Hello World!</h1>
    
    <h2>You successfully reached Category page!</h2>
    <br><hr><br>
    
    <a href="${pageContext.request.contextPath}/Category/register">Register a new Category</a>
    
    <br><br>
    
    <c:if test="${register==1}">
        <%@include file="registerCategory.jsp" %>
    </c:if>
    
    
    <c:choose>
        <c:when test="${categories.isEmpty()}">
            <h2><font color="green">No Category in DB yet</font></h2>
        </c:when>
        <c:otherwise>
            <table>
                <tr>
                    <th><h2><font color="blue">Category Name</font></h2></th>
                </tr>
                <c:forEach items="${categories}" var="category">
                    <tr>
                        <td>${category.analogy}</td>
                        <td>
                            <form action="${pageContext.request.contextPath}/Category/delete" method="post">
                                <input type="hidden" value="${category.analogy}" name="analogy"/>
                                <input type="submit" value="Delete"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>