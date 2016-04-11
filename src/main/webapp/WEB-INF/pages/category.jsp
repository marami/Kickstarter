<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp">
	<jsp:param name="title" value="Category" />
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

<h1>${categoryName}</h1>

<ul>
	<c:forEach var="project" items="${requestScope.projects}">
		<li>
			<p>
				<a href="project?projectId=${project.projectId}">${project.name}</a>
				<br>Description: ${project.description} 
				<br>Goal: ${project.goal}			
				<br>Pedged: ${project.pledged}					
				<br>Days: ${project.daysToGo}
			</p>
		</li>
	</c:forEach>
</ul>

<jsp:include page="footer.jsp" />