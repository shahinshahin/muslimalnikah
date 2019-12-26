<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title><tiles:getAsString name="title" /></title>
	<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
          
    <div class="containerreg">             

<form:form action="register"  class="frm" onsubmit="return GEEKFORGEEKS()" method="post" modelAttribute="reguser">
   
 <header class="heading"> Registration-Form</header><hr></hr>
	<!---Form starting----> 
	<div class="row ">
	 <!--- For Name---->
         <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <section class="panel panel-default preview-sec padding-0">
                <div class="panel-body noradius padding-5">

                 <figure align="center" class="margin-bottom-10">
                  <img class="img-responsive" src="#" alt=""> </figure>
		         </div>
		         </section>
		         <div class="col-xs-8">
		         
               

 <form:input path="uploadImage" type="file" name="uploadImageFile" style="width: 195px;" accept=".png, .jpg, .jpeg" />
      
</div>
</div>
</div>
    <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">First Name :</label> </div>
		         <div class="col-xs-8">   
<form:input  path="name" placeholder="Name"  name="Name" type="text" class="radius"/></div>
</div>
</div>
   <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">First Name :</label> </div>
		         <div class="col-xs-8"><form:input path="email" placeholder="Email"  name="EMail" type="text" class="radius"/></div>
</div>
</div>
</div>
<div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">First Name :</label> </div>
		         <div class="col-xs-8">
<form:input path="telephone"  placeholder="Phone" type="text"  name="phone" class="radius"/></div>
</div>
</div>
<div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">First Name :</label> </div>
		         <div class="col-xs-8">
<form:input path="address" placeholder="address" type="text" class="radius"/></div>
</div>
</div>
<div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">First Name :</label> </div>
		         <div class="col-xs-8">
<input type="submit" value="Register Here" class="button round"/></div>
</div>
</div>
</form:form>
</div>


