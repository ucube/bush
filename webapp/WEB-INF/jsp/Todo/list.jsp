<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page import="vo.TodoVO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ss</title>
</head>
<%
/* 	List list = (List) request.getAttribute("listMap");	
	Iterator it = list.iterator();
	while(it.hasNext()){
		TodoVO tv = (TodoVO) it.next();
		out.println("NUM=>"+tv.getNum()+" / TITLE=>"+tv.getTitle()+" / CONTENT=>"+tv.getContent()+"<br />");
	}
	out.println("<br />=============================================================<br /><br />");
	ArrayList<TodoVO> arrayList = (ArrayList<TodoVO>) request.getAttribute("listMap");
	for(TodoVO tv : arrayList){
		out.println("NUM=>"+tv.getNum()+" / TITLE=>"+tv.getTitle()+" / CONTENT=>"+tv.getContent()+"<br />");
	} */
	//String data = (String) request.getAttribute("data");
	//out.println(data);*/
%>
<body>
${data}
</body>
</html>