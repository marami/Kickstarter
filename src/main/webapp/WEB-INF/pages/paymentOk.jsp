<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp">
	<jsp:param name="title" value="PaymentOk" />
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
	<div class="module-main">
		<h1><a href="category?categoryId=${category.categoryId}">${category.name}</a></h1>
		<h1><a href="project?projectId=${project.projectId}">${project.name}</a></h1>

		<h3>Thanks for your donation!</h3>

		<br>$${amount} will be transferred to the project<br>
	</div>
</div>

<jsp:include page="footer.jsp" />