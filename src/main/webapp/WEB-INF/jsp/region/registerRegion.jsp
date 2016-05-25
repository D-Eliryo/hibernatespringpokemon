<%-- 
    Document   : registerRegion
    Created on : 24-mag-2016, 15.11.22
    Author     : dario
--%>

<form action="${pageContext.request.contextPath}/Region/save" method="post">
    <ul>
        <li>
            <label for="nameR">Region Name</label>
            <input type="text" name="nameR"/>
        </li>
        <li>
            <label for="looksLike">Looks Like</label>
            <input type="text" name="looksLike"/>
        </li>
    </ul>
    <input type="submit" value="Register"/>
</form>