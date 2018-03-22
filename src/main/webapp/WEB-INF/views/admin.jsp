<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
xmlns:spring="http://www.springframework.org/tags
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container marketing">


    <h1>Administrator page</h1>

    <p>You are currently in the administrator page!</p>

    <h3>
        <a href="<c:url value="/admin/productInventory" />">  Job Inventory </a>
    </h3>


    <p>Here you can view, check and modify all all aviable services</p>




    <%@include file="/WEB-INF/views/template/footer.jsp" %>
