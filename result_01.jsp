<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    boolean boAtari = (Boolean)request.getAttribute("Atari");
    boolean boErr = (Boolean)request.getAttribute("Err");
    String kotae="";
    if(!boErr)
    {
    	if(boAtari==true)
    	{
    		kotae="女です";
    	}
    	else
    	{
    		kotae="男です";
    	}
    }
    else
    {
    	kotae="性別を選んでください";
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=kotae %></h1>
</body>
</html>