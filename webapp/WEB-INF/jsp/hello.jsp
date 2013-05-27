<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>springstudy</title>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" ></script>
<script>
	$(document).ready(function(){
		//$("#bush").text("haha");
		$(document).on("click","#ajaxadd",function(){
			var temp = "<ul><input type='text' name='ajaxname' /><input type='button' class='ajaxminus' value='-' /></ul>";
			$("#ajaxtable").append(temp);
		});
		
		$(document).on("click",".ajaxminus",function(){
			$(this).prev().remove();
		});
	});
</script>
</head>
<body>
	${message}
	<div id="bush">
		<ul>
			<input type="button" id="ajaxadd" value="추가" />
		</ul>
	</div>
	<div id="ajaxtable"></div>
</body>
</html>