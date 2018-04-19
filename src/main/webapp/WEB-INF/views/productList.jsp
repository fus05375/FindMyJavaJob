<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
xmlns:spring="http://www.springframework.org/tags
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container marketing">


    <h1>All Products</h1>

    <p>Chceckout all products aviable now!</p>


    <table class="table table-striped table-hover">
        <thead>
        <tr class="bg-success">
            <th></th>
            <th>Product Name</th>
            <th>Level</th>
            <th>Price</th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${products}" var="product">
            <tr>
                <td></td>
                <td>${product.productName}</td>
                <td>${product.productCategory}</td>
                <td>${product.productPrice} PLN</td>
                <td><a href="<spring:url value="/productList/viewProduct/${product.productID}"/>"
                >Details </a></td>
            </tr>
        </c:forEach>
    </table>


    <%@include file="/WEB-INF/views/template/footer.jsp" %>
