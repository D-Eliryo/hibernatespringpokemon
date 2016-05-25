<%-- 
    Document   : type
    Created on : 20-mag-2016, 16.58.32
    Author     : dario
--%>

<h1>Hello World!</h1>
    
    <h2>You successfully reached Type page!</h2>

    <br>
    <hr>
    <br>
    <a href="${pageContext.request.contextPath}/Type/register">Insert a new Type</a>
    
    
    <c:choose>
        <c:when test="${register==1}">
            <%@include file="registerType.jsp" %>
        </c:when>
        <c:otherwise>
            <h3>Do something</h3>
        </c:otherwise>
    </c:choose>    
    <br>
    <hr>
    <br>
    <c:choose>
        <c:when test="${types.isEmpty()}">
            <h3><font color="green">No Type in DB, sorry ):</font></h3>
        </c:when>
        <c:otherwise>
        <table>
            <tr>
                <th><h2><font color="blue">
                    Type Name
                </font></h2></th>
            </tr>
            <c:forEach items="${types}" var="type">
                <tr>
                    <td>${type.nomeT}</td>
                    <td>
                        <form action="${pageContext.request.contextPath}/Type/delete" method="Post">
                            <input type="hidden" value="${type.nomeT}" name="nomeT" />
                            <input type="submit" value="Delete"/>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        </c:otherwise>
    </c:choose>