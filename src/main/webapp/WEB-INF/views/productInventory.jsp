<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
xmlns:spring="http://www.springframework.org/tags
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container marketing">


    <h1>Product Inventory Page</h1>

    <p>This is product inventory page</p>


    <table class="table table-striped table-hover">
        <thead>
        <tr class="bg-success">
            <th></th>

            <th>Product Name</th>
            <th>Level</th>
            <th>Price</th>
            <th></th>
            <th></th>
            <th></th>

        </tr>
        </thead>
        <c:forEach items="${products}" var="product">
            <tr>
                <td></td>
                <td>
                    <a class="btn btn-default btn-xs">${product.productName}</a>
                </td>
                <td>
                    <a class="btn btn-default btn-xs">${product.productCategory}</a>
                </td>
                <td>
                    <a class="btn btn-default btn-xs">${product.productPrice} PLN</a>
                </td>
                <td>
                    <a class="btn btn-default btn-xs"
                            href="<spring:url value="/productList/viewProduct/${product.productID}"/>">
                        Details
                    </a>
                </td>

                <td>
                    <a href="<spring:url value="/admin/productInventory/deleteProduct/${product.productID}"/>"
                       class="btn btn-primary">Delete</a>

                </td>


                <td>
                    <a href="<spring:url value="/admin/productInventory/editProduct/${product.productID}"/>"
                       class="btn btn-primary">Edit</a>

                </td>
            </tr>

        </c:forEach>
    </table>

    <a href="<spring:url value="/admin/productInventory/addProduct"/>" class="btn btn-primary">Add Product</a>


    <%@include file="/WEB-INF/views/template/footer.jsp" %>
