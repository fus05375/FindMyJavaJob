<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container marketing">


    <h1>Edit Product</h1>
    <p class="lead">Fill the below information to edit a product:</p>


    <form:form action="${pageContext.request.contextPath}/admin/productInventory/editProduct" method="post"
               commandName="product" enctype="multipart/form-data">

        <form:hidden path="productID" value="${product.productID}"/>

        <div class="form-group">
            <label for="name"><b>Name</b></label>
            <form:input path="productName" id="name" class="form-Control" value="${product.productName}"/>
        </div>


        <div class="form-group">
            <label for="category"><b>Category </b></label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="beginner"/>
                Beginner</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="intermediate"/>
                Intermediate</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="advanced"/>
                Advanced</label>
        </div>

        <div class="form-group">
            <label for="description"><b>Description</b></label>
            <form:textarea path="productDescription" id="description" class="form-Control"
                           value="${product.productDescription}"/>
        </div>

        <div class="form-group">
            <label for="price"><b>Price</b></label>
            <form:errors path="productPrice" cssStyle="color: #ff0000"/>
            <form:input path="productPrice" id="price" class="form-Control" value="${product.productPrice}"/>
        </div>


        <div class="form-group">
            <label for="status"><b>Status </b></label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="active"/>
                Active</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="inactive"/>
                Inactive</label>
        </div>


        <div class="form-group">
            <label for="manufacturer"><b>Manufacturer</b></label>
            <form:input path="productManufacturer" id="manufacturer" class="form-Control"
                        value="${product.productManufacturer}"/>
        </div>

        <div class="form-group">
            <label class="custom-control-label" for="productImage"><b>Upload Course Image</b></label>
            <form:input path="productImage" id="productImage" type="file" class="form:input-large"/>

        </div>


        <br><br>
        <input type="submit" value="submit" class="btn btn-default">
        <a href="<c:url value="/admin/productInventory" />" class="btn btn-default">cancel</a>
    </form:form>


</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
