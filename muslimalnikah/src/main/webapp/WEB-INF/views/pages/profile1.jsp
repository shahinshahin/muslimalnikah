<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="<c:url value='/static/css/style.css' />" rel="stylesheet"></link>
</head>


<h1 class="header-w3ls">
		Profile Booking Form</h1>
	<!--login form-->
	<div class="hotel-bothside">
		<form:form action="register"  class="frm" onsubmit="return GEEKFORGEEKS()" method="post" modelAttribute="memdetails">
	<div class="mid-cls">
			
				<div class="hotel-left-w3ls">
				<h2>Personal Details</h2>
<!-- 				<div class="main"> -->
<!-- 						<div class="form-left-to-w3l"> -->
<%-- 						 <img src="<c:url value ="static/img/img2.jpg"/>" class="w3-round-large" style="width:200%"> --%>
					
<!-- 						</div> -->
<!-- 						<div class="form-right-to-w3ls"> -->
<!--  							<label for="file_photo">Photo:</label> --> 
<!--              <input type="file" name="file_photo" id="file_photo"><br> -->
<!--            <div class="clear"></div> -->
<!-- 						</div> -->
<!-- 						</div> -->
					
<!-- 					<div class="main"> -->
<!-- 						<div class="form-left-to-w3l"> -->
<!-- 						<h3>Photo:</h3> -->
<!--             <input type="file" name="file_photo" id="file_photo"><br> -->
       
<%-- <%-- 						 <img src="<c:url value ="static/img/img2.jpg"/>" class="w3-round-large" style="width:100%"> --%> 
					
<!-- 						</div> -->
<!-- 						<div class="form-right-to-w3ls"> -->
<!-- 							    <div class="clear"></div> -->
<!-- 						</div> -->
<!-- 						</div> -->
					<div class="main">
						<div class="form-left-to-w3l">

							<form:input path="name" name="name" placeholder="Name" required=""></form:input>
							<div class="clear"></div>
						</div>
						<div class="form-right-to-w3ls">

							<form:input path="lastname" name="last name" placeholder="Last Name" required=""></form:input>
							<div class="clear"></div>
						</div>
						

					</div>
					<div class="main">
						<div class="form-left-to-w3l">

							<form:input type="date" path="dateofbirth"   placeholder="Arrival-Date" />
							<div class="clear"></div>
						</div>
						<div class="form-right-to-w3ls">

							<form:input path="mothername" name="mothername" placeholder="Mother Name" required=""></form:input>
							<div class="clear"></div>
						</div>
						

					</div>
					<div class="main">

						<div class="form-left-to-w3l">

							<form:input path="email" name="email" required="" placeholder="Email"></form:input>
						</div>
						<div class="form-right-to-w3ls ">


							<form:input path="mobilenumber" name="mobile number" placeholder="Mobile Number" required=""></form:input>
						</div>
					</div>
					<div class="form-add-to-w3ls add">

						<form:input path="address" name="address" placeholder="Street Address" required=""></form:input>
						<div class="clear"></div>
					</div>


					<div class="main">
						<div class="form-left-to-w3l">

					<form:select id="nation" path="nationality_name" class="form-control pointer padding-0" required="${id}">
                   <form:option value="" label="--Nationality--" />
                   <form:options items="${nationlist}" itemLabel="nationality_name" itemValue="nationality_id" />
                  </form:select> 
							<div class="clear"></div>
						</div>
						<div class="form-right-to-w3ls">
 							<form:select id="state" path="state_name" class="form-control pointer padding-0" required="${id}">
                   <form:option value="" label="--STATE--" />
                   <form:options items="${statelist}" itemLabel="state_name" itemValue="state_code" />
                  </form:select> 
							<div class="clear"></div>
						</div>
					</div>
					<div class="main">
						<div class="form-left-to-w3l">

<%-- 					<form:select id="occupation" path="occupation_name" class="form-control pointer padding-0" required="${gender_id}"> --%>
<%--                    <form:option value="" label="--OCCUPATION--" /> --%>
<%--                    <form:options items="${occlist}" itemLabel="occupation_name" itemValue="occupation_code" /> --%>
<%--                   </form:select>  --%>
<!-- 							<div class="clear"></div> -->
						</div>
						<div class="form-right-to-w3ls">

<%-- 							<form:select id="gender" path="gender_id" class="form-control pointer padding-0" required="${gender_id}"> --%>
<%--                    <form:option value="" label="--GENDER--" /> --%>
<%--                    <form:options items="${gender}" itemLabel="gender_name" itemValue="gender_id" /> --%>
<%--                   </form:select> --%>
<%--                   <form:hidden path="genderEN" /> --%>

						</div>
					</div>
					<div class="main">
						<div class="form-left-to-w3l">
<input class="pin-bottom" type="text" name="mothername" placeholder="Mother Name" required="">
				<div class="clear"></div>			
						</div>
						<div class="form-right-to-w3ls">
							<input type="text" name="fathername" placeholder="Father Name" required="">
							<div class="clear"></div>
						</div>	
						
<!-- 					</div> -->
<!-- 					<div class="main"> -->
<!-- 						<div class="form-left-to-w3l"> -->
<!-- 							<select class="form-control buttom"> -->
<!-- 												<option value=""> -->
<!-- 												Marital Status</option> -->
<!-- 													<option value="category2">2</option> -->
<!-- 													<option value="category1">3</option> -->
<!-- 													</select> -->
<!-- 													<div class="clear"></div> -->
<!-- 						</div> -->
<!-- 						<div class="form-right-to-w3ls"> -->

<!-- 							<select class="form-control buttom"> -->
<!-- 												<option value=""> -->
<!-- 												Qualification</option> -->
<!-- 													<option value="category2">0</option> -->
<!-- 													<option value="category1">1</option> -->
<!-- 													<option value="category3">2</option> -->
				
<!-- 												</select> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 					<div class="main"> -->
<!-- 						<div class="form-left-to-w3l"> -->

<!-- 							<select class="form-control buttom"> -->
<!-- 												<option value=""> -->
<!-- 												Gender</option> -->
<!-- 													<option value="category2">2 Nights</option> -->
<!-- 													<option value="category1">3 Nights</option> -->
<!-- 				                                    <option value="category1">And More</option> -->
<!-- 												</select> -->
<!-- 													<div class="clear"></div> -->
<!-- 						</div> -->
<!-- 						<div class="form-right-to-w3ls"> -->

<!-- 							<select class="form-control buttom"> -->
<!-- 												<option value=""> -->
<!-- 												Profession</option> -->
<!-- 													<option value="category2">single</option> -->
<!-- 													<option value="category1">Double</option> -->
<!-- 													<option value="category3">Suite</option> -->
				
<!-- 												</select> -->
<!-- 													<div class="clear"></div> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 					<div class="form-control-w3l"> -->

<!-- 						<textarea name="Message" placeholder="Any Special Request..." required=""></textarea> -->
<!-- 					</div> -->
					<div class="clear"></div>
					

				</div>
<!-- 				<div class="hotel-right-w3ls"> -->

<!-- 					<h2> Upload Profile Picture</h2> -->
					
<!-- 					<div class="main"> -->

						
<%--  <img src="<c:url value ="static/img/img2.jpg"/>" class="w3-round-large" style="width:600px;height:300px;">  --%>
					
						
<!-- 					</div> -->


<!--  					<div class="main">  -->
						

<!-- 							Upload Image <input type="file" name="file_photo" id="file_photo"> -->
						
<!-- 						<div class="form-right-to-w3ls"> -->

							
<!-- 						</div>  -->
<!-- 					</div>  -->
					<div class="btnn">
						<button type="submit">Submit</button><br>
					</div>
				</div>
			</div>
		</form:form>
	</div>

