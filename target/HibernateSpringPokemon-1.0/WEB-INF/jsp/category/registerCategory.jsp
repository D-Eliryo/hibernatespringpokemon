<%-- 
    Document   : registerCategory
    Created on : 25-mag-2016, 12.51.01
    Author     : dario
--%>
<br><hr><br>
<form action="${pageContext.request.contextPath}/Category/save" method="post">
    <label for="analogy">Category name / Analogy</label>
    <input type="text" name="analogy"/>
    <input type="submit" value="Save"/>
</form>
<br><hr>
<a href="${pageContext.request.contextPath}">Home</a><br>