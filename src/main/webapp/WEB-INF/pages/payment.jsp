<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp">
	<jsp:param name="title" value="Payment" />
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

<div class="middle">
	<div class="module-main">
		<h1><a href="category?categoryId=${category.categoryId}">${category.name}</a></h1>
		<h1><a href="project?projectId=${project.projectId}">${project.name}</a></h1>

		<h3>Amount of your donation is $${amount}</h3>

		<form action="paymentCheck" method="post">

			<font color=red><c:if test="${not empty message}">${message}</c:if></font >
			<br><br>Enter your name: <input type="text" name="name" value="" size=20 maxlength=20><br>
			<br>Enter your card's number: <input type="text" name="card" value="" size=20 maxlength=16><br>
			<input type="hidden" name="projectId" value="${project.projectId}"/>
			<input type="hidden" name="amount" value="${amount}"/>
			<input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
			<br><input type="submit" value="Submit">
		</form>
	</div>
</div>

<jsp:include page="footer.jsp" />