<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container marketing">


    <h1>Product Detail</h1>


</div>
<div class="container">
    <div class="row">
        <div class="col-md-5">
            <img src="<c:url value="/resources/images/${product.productID}.png" />" alt="image" style="width: 100%"/>
        </div>

        <div class="col-md-5">
            <h3>${product.productName}</h3>
            <p>${product.productDescription}</p>

            <p>
                <strong>CManufacturer</strong>: ${product.productManufacturer}
            </p>
            <p>
                <strong>Category</strong>: ${product.productCategory}
            </p>

            <h4>${product.productPrice} PLN</h4>
        </div>
    </div>
</div>


    <%@include file="/WEB-INF/views/template/footer.jsp" %>
