<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>

        <c:if test="${not empty param.title}">${param.title}</c:if>
        <c:if test="${empty param.title}">Kickstarter</c:if>

    </title>
    <link href="<c:url value="/pages/css/StyleSheet.css" />" rel="stylesheet">
</head>
<body>