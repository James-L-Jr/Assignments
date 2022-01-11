<html>
<body>
<h1>JSP scripting page + declaration + action tag include</h1>
<%
String name=request.getParameter("uname");
out.print("Welcome " + name);
%>
<jsp:include page="printdate.jsp"/>
</body>
</html>