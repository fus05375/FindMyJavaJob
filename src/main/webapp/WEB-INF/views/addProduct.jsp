<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container marketing">


    <h1>Add Product</h1>
    <p class="lead">Fill the below information to add a product:</p>


    <form:form action="#" method="post" commandName="product">

        <div class="form-group">
            <label for="name">Name</label>
            <form:input path="jobName" id="name" class="form-Control"/>
        </div>
    </form:form>
</div>



<%@include file="/WEB-INF/views/template/footer.jsp" %>
