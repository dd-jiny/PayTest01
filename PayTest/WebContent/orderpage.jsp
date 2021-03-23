<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%request.setCharacterEncoding("UTF-8"); %>
<%response.setContentType("text/html; charset=UTF-8"); %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>주문 페이지</h1>
	<form action="pay.jsp" method="post">
	
		<table border="1">
			<tr>
				<th>주문번호</th>
				
			</tr>
			<tr>
				<th>상품명</th>
				<td><textarea rows="2" cols="25" name="projectname"></textarea></td>
			</tr>
			<tr>
				<th>상품번호</th>
				
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="text" name="totalprice"></td>
			</tr>
			<tr>
				<th>받는사람 이름</th>
				<td><textarea rows="2" cols="25" name="username"></textarea></td>
			</tr>
			<tr>
				<th>받는사람 주소</th>
				<td><textarea rows="2" cols="25" name="address"></textarea></td>
			</tr>
			<tr>
				<th>핸드폰</th>
				<td><textarea rows="2" cols="25" name="phone"></textarea></td>
			</tr>
			<tr>
				<th>주문 날짜</th>
				
			</tr>
			
			<tr align="right">
				<td colspan="2">
					<input type="submit" value="결제">
					<input type="button" value="취소" onclick="">
				</td>
			</tr>

		</table>
	</form>

</body>
</html>