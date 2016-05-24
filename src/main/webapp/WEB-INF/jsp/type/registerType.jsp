<%-- 
    Document   : registerType
    Created on : 23-mag-2016, 12.52.29
    Author     : dario
--%>

        <form action="${pageContext.request.contextPath}/Type/save" method="POST">
            <label for="nomeT">Type Name</label>
            <input type="text" name="nomeT" id="nomeT"/>
            <input type="submit" value="Register"/>
        </form>
            <br><hr><br> 
        <a href="${pageContext.request.contextPath}">Home</a>

