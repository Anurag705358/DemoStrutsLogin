
<html>
<body>
<a href="login">Login</a>
<a href="logout">Logout</a>

<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="register">
<s:textfield name="name" label="UserName"></s:textfield>
<s:password name="password" label="Password"></s:password>
<s:textfield name="email" label="Email"></s:textfield>
<s:radio list="{'male','female'}" name="gender"></s:radio>
<s:submit value="Regiser"></s:submit>
</s:form>

</body>
</html>
