<%-- 
    Document   : index
    Created on : 17-mag-2016, 14.31.59
    Author     : dario
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link rel="stylesheet" href="<c:url value="/resources/css/main.css"/>"/>
        <title>My pokedex version</title>
    </head>
    <body>
        <div class="container">
            <div class="myHeader" id="">
                <div class="up-left">
                    <a id="a_container" href="${pageContext.request.contextPath}/">
                        <img id="logoimg" src="<c:url value="/resources/images/Pokemon_Logo.png"/>"/>
                    </a>
                </div>
                <div class="up-center">
                    <h2 id="text">This is my version of Pokédex!!</h2>
                </div>
            </div>
            <div class="left-column">
                <ul id="">
                    <li>
                        <a class="goto" href="${pageContext.request.contextPath}/Type">
                            Look at the Types
                        </a>
                    </li>
                    <li>
                        <a class="goto" href="${pageContext.request.contextPath}/Category">
                            Look at the Categories
                        </a>
                    </li>
                    <li>
                        <a class="goto" href="${pageContext.request.contextPath}/Region">
                            Look at the Regions
                        </a>
                    </li>
                    <li>
                        <a class="goto" href="${pageContext.request.contextPath}/Pokemon">
                            Look at the Pokemons
                        </a>
                    </li>
                </ul>
            </div>
            <div class="myMain">
                <c:choose>
                    <c:when test="${sendMe==0}">
                        <h2>Something will happens here. Work in progress</h2>
                    </c:when>
                    <c:when test="${sendMe==1}">
                        <%@include file="type/type.jsp" %>
                    </c:when>
                    <c:when test="${sendMe==2}">
                        <%@include file="category/category.jsp" %>
                    </c:when>
                    <c:when test="${sendMe==3}">
                        <%@include file="region/region.jsp" %>
                    </c:when>
                    <c:when test="${sendMe==4}">
                        <%@include file="pokemon/pokemon.jsp" %>
                    </c:when>
                    <c:when test="${sendMe==5}">
                        <%@include file="regionalPokedex/regionalPokedex.jsp" %>
                    </c:when>
                </c:choose>
            </div>
        </div>
    </body>
</html>
