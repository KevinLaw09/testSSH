<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>listStudent</title>
</head>
<body>
    <h1>This is listStudent  page</h1>
    <!-- 测试取值 -->
    <table border="1">
        <tr>
            <th>序号</th>
            <th>学生id</th>
            <th>学生姓名</th>
        </tr>
        <s:iterator value="listStu" var="t" status="i">
            <tr>
                <td><s:property value="#i.count"/></td>
                <td><s:property value="#t.StuId"/></td>
                <td><s:property value="#t.StuName"/></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
