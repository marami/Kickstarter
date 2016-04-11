<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp">
	<jsp:param name="title" value="Kickstarter" />
</jsp:include>

<div class="top">
	<div class="top-left">
		<a href="index"><img src="/pages/pictures/kickstarter.png"></a>
	</div>

	<div class="top-right">
		<h3><a href=#>Sign in</a></h3>

		<c:if test="${pageContext.request.userPrincipal.name == null}">
			<h3><a href="login">Log in</a></h3>
		</c:if>

		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h3>Welcome : ${pageContext.request.userPrincipal.name} |
				<a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h3>
		</c:if>
	</div>
</div>

<div class="below-top">
	<div class="module-quote">
		<em>${quote.text}</em> <em>${quote.author}</em>
	</div>

	<div class="module-main">
		<h1>Categories:</h1>
		<ul>
			<c:forEach var="category" items="${requestScope.categories}">
				<li><a href="category?categoryId=${category.categoryId}">${category.name}</a></li>
			</c:forEach>
		</ul>
	</div>
</div>
	
<jsp:include page="footer.jsp" />