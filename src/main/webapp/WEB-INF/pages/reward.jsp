<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp">
	<jsp:param name="title" value="Reward" />
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

		<c:if test="${empty rewards}">
			<h3>There are no rewards</h3>
			<form action="payment" method="get">
				<font color=red><c:if test="${not empty message}">${message}</c:if></font >
				<br><label>I want to help the project.</label>
				<input type="text" name="amount" value="1">
				<input type="hidden" name="projectId" value="${project.projectId}" />
				<input type="hidden" name="rewardId" value="0" />
				<input type="submit" value="Continue" />
			</form>
		</c:if>

		<c:if test="${not empty rewards}">
			<h3>Let's choose your reward!</h3>

			<form action="payment" method="get">
				<h3>No thanks, I just want to help the project.</h3>
				<font color=red><c:if test="${not empty message}">${message}</c:if></font >
				<label>Pledge amount</label>
				<input type="text" name="amount" value="1">
				<input type="hidden" name="projectId" value="${project.projectId}" />
				<input type="hidden" name="rewardId" value="0" />
				<input type="submit" value="Continue" />
			</form>

			<ul>
				<c:forEach var="reward" items="${requestScope.rewards}">
					<li>
						<p>
							<a href="payment?rewardId=${reward.rewardId}">$${reward.amount}</a>
							<br>${reward.reward}
						</p>
					</li>
				</c:forEach>
			</ul>
		</c:if>
	</div>
</div>

<jsp:include page="footer.jsp" />