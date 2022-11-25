
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getScheme() + "://" +
        request.getServerName() + ":" +
        request.getServerPort() +
        request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=path%>">
    <title>测试</title>
    <script type="text/javascript" src="JQuery.min.js"></script>
    <script type="text/javascript">
        function getDatas() {
            $.ajax({
                type: "POST",
                url: "",
                dataType: "json",
                success: function (res) {
                    console.log(res);
                }
            });
        }
    </script>
</head>
<body>
<input type="button" value="查询" onclick="getDatas()">
</body>
</html>
