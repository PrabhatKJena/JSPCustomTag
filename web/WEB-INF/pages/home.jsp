<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tags" uri="http://tutorial.pk.edu/custom/tags"%>
<html>
<head>
    <title>Home Page</title>
    <script type="text/javascript">
        alert('${countryList}');
    </script>
</head>
<body>
Your Email : <tags:txtBox caption="Enter Your Email" fontColor="red" fontSize="18" value="${loginUser.email}"></tags:txtBox>
<br>
Country : <tags:dropDown default="Select Country" items="${countryList}"></tags:dropDown>

</body>
</html>
