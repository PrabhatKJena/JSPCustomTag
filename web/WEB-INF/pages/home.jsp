<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tags" uri="http://tutorial.pk.edu/custom/tags"%>
<html>
<head>
    <title>Home Page</title>
    <style type="text/css">
    	.b{
    		font-weight: bold;
    		font-size: 16px;
		 }
		 .err-msg{
		 	color: red;
		 }
		 
    </style>
    <script type="text/javascript">
    </script>
</head>
<body>
Your Email : <tags:txtBox caption="Enter Your Email" value="${loginUser.email}"></tags:txtBox>
<br>
Country : <tags:dropDown defaultVal="Select Country" items="India,China,Pakistan"></tags:dropDown>

</body>
</html>
