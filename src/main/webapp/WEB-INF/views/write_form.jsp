<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<form action="write">
	<table border="1" cellspacing="0" cellpadding="0" width="500">
		<tr>
			<th>이 름</th>
			<td><input type="text" name="bname" size="60"></td>		
		</tr>
	
		<tr>
			<th>제 목</th>
			<td><input type="text" name="btitle" size="60"></td>		
		</tr>
		
		<tr>
			<th>글내용</th>
			<td><textarea rows="10" cols="45" name="bcontent"></textarea></td>		
		</tr>
		
		<tr>
			<td><input type="submit" value="저장">
				<input type="button" value="목록보기" onclick="javascript:window.loacation.href='list'">			
			</td>	
		</tr>
	</table>
		
	</form>
</body>
</html>