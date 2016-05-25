<%-- 
    Document   : region
    Created on : 20-mag-2016, 17.22.12
    Author     : dario
--%>


    <h1>Hello World!</h1>
    
    <h2>You successfully reached Region page!</h2>
    <br><hr><br>
    
    <a href="${pageContext.request.contextPath}/Region/register">Insert a new Region</a>
    
    
    <c:choose>
        <c:when test="${register==1}">
            <%@include file="registerRegion.jsp" %>
        </c:when>
        <c:otherwise>
            <h3>Do something</h3>
        </c:otherwise>
    </c:choose>    
    <br>
    <hr>
    <br>
    <c:choose>
        <c:when test="${regions.isEmpty()}">
            <h3><font color="green">No Region in DB, sorry ):</font></h3>
        </c:when>
        <c:otherwise>
        <table>
            <tr>
                <th><h2><font color="blue">
                    Region Name
                </font></h2></th>
                <th><h2><font color="blue">
                    Looks Like
                </font></h2></th>
            </tr>
            <c:forEach items="${regions}" var="region">
                <tr>
                    <td>${region.nameR}</td>
                    <td>${region.looksLike}</td>
                    <td>
                        <form action="${pageContext.request.contextPath}/Region/delete" method="Post">
                            <input type="hidden" value="${region.nameR}" name="regionName" />
                            <input type="submit" id="submit" value="Delete"/>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        </c:otherwise>
    </c:choose>