<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Books</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <!-- 기타 필요한 칼럼들 추가 -->
        </tr>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookName}</td>
                <td>${book.publisher}</td>
                <!-- 기타 필요한 칼럼들 추가 -->
            </tr>
        </c:forEach>
    </table>
</body>
</html>