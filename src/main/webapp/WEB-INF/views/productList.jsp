<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
xmlns:spring="http://www.springframework.org/tags
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container marketing">


    <h1>All Job Offers</h1>

    <p>Chceckout all jobs aviable now!</p>


    <table class="table table-striped table-hover">
        <thead>
        <tr class="bg-success">
            <th></th>
            <th>Job Name</th>
            <th>Category</th>
            <th>Condition</th>
            <th>Salary</th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${products}" var="product">
            <tr>
                <td></td>
                <td>${product.jobName}</td>
                <td>${product.jobCategory}</td>
                <td>${product.jobSalary} PLN</td>
                <td><a href="<spring:url value="/productList/viewProduct/${product.jobId}"/>"
                >Details </a></td>
            </tr>
        </c:forEach>
    </table>


    <%@include file="/WEB-INF/views/template/footer.jsp" %>
