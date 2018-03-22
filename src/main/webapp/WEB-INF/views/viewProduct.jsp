<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container marketing">


    <h1>Job Detail</h1>


</div>
<div class="container">
    <div class="row">
        <div class="col-md-5">
        </div>

        <div class="col-md-5">
            <h3>${product.jobName}</h3>
            <p>${product.jobDescription}</p>

            <p>
                <strong>Company name</strong>: ${product.jobEmployer}
            </p>
            <p>
                <strong>Category</strong>: ${product.jobCategory}
            </p>

            <h4>${product.jobSalary} PLN</h4>
        </div>
    </div>
</div>


    <%@include file="/WEB-INF/views/template/footer.jsp" %>
