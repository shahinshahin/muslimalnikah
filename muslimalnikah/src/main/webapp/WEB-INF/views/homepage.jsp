<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
  "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Glossy Box Free Template</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="<c:url value ="resources/css/templatemo_style.css"/>" rel="stylesheet" type="text/css" />
<link href="<c:url value ="resources/css/jquery.ennui.contentslider.css"/>" rel="stylesheet" type="text/css" media="screen,projection" />
<!-- templatemo 321 glossy box -->
<!-- 
Glossy Box Template
http://www.templatemo.com/preview/templatemo_321_glossy_box
-->
</head>
<body>

<div id="templatemo_wrapper_outer">
	<div id="templatemo_wrapper">
    
    	<div id="templatemo_header">
			<div id="site_title">
                <h1><a href="#"><strong>GLOSSY</strong> BOX<span>YOUR TAGLINE GOES HERE</span></a></h1>
            </div> <!-- end of site_title -->
           
            <ul id="social_box">
                <li><a href="#"><img src="<c:url value="resources/images/facebook.png"/>" alt="facebook" /></a></li>
                <li><a href="#"><img src="<c:url value="resources/images/twitter.png"/>" alt="twitter" /></a></li>
                <li><a href="#"><img src="<c:url value="resources/images/linkedin.png"/>" alt="linkin" /></a></li>
                <li><a href="#"><img src="<c:url value="resources/images/technorati.png"/>" alt="technorati" /></a></li>
                <li><a href="#"><img src="<c:url value="resources/images/myspace.png"/>" alt="myspace" /></a></li>                
            </ul>
			
			<div class="cleaner"></div>
		</div>
        
        <div id="templatemo_menu">
            <ul>
                <li><a href="index.html" class="current">Home</a></li>
                <li><a href="services.html">Services</a></li>
                <li><a href="partners.html">Partners</a></li>
                <li><a href="about.html">About us</a></li>
                <li><a href="contact.html">Contact</a></li>
            </ul>    	
        </div> <!-- end of templatemo_menu -->
        
        <div id="templatemo_slider_wrapper">
        
        	<div id="templatemo_slider">
            
				<div id="one" class="contentslider">
                    <div class="cs_wrapper">
                        <div class="cs_slider">
                        
                            <div class="cs_article">
                            	<div class="slider_content_wrapper">
									
									<div class="slider_image">
										<img src="<c:url value="resources/images/slider/templatemo_slide01.jpg"/>" alt="Mauris quis eros arcu" />
									</div>
									
									<div class="slider_content">
                                        <h2>Lorem ipsum dolor sit amet consectetur adipiscing</h2>
                                        <p>Maecenas quis nibh dolor, pharetra tristique tellus. Nunc at posuere ligula. Suspendisse in tempus lectus. Nulla laoreet odio eu ligula rhoncus luctus.</p>
										<div class="btn_more"><a href="#">More...</a></div>
									</div>
                                
								</div>
                            </div><!-- End cs_article -->
                            
                            <div class="cs_article">
                            	<div class="slider_content_wrapper">
									
									<div class="slider_image">
										<img src="<c:url value="resources/images/slider/templatemo_slide02.jpg"/>" alt="Cras porta porta turpis" />
									</div>
                     			
									<div class="slider_content">
                                        <h2>Vestibulum vitae lectus a leo commodo egestas</h2>
                                        <p>Aliquam nec felis tellus. Sed a dolor lectus. Phasellus ac dolor id nunc pharetra interdum. Fusce magna nulla, elementum nec luctus sit amet, lacinia ut lorem.</p>
                                        <div class="btn_more"><a href="#">More...</a></div>
                                    </div>
                                
								</div>
                            </div><!-- End cs_article -->
                            
                            <div class="cs_article">
                            	<div class="slider_content_wrapper">
									
									<div class="slider_image">
										<img src="<c:url value="resources/images/slider/templatemo_slide03.jpg"/>" alt="Nullam ac mi id massa consectetur" />
									</div>
									
									<div class="slider_content">
                                        <h2>Praesent at nunc tellus sed sed auctor odio</h2>
                                        <p>Nullam fermentum risus vitae lectus posuere sagittis. Praesent faucibus, dui vitae condimentum semper, dolor augue ornare elit, quis congue ante lacus id dui.</p>
                                        <div class="btn_more"><a href="#">More...</a></div>
                                    </div>
                                
								</div>
                            </div><!-- End cs_article -->
                            
                            <div class="cs_article">
                            	<div class="slider_content_wrapper">
									
									<div class="slider_image">
										<img src="<c:url value="resources/images/slider/templatemo_slide04.jpg"/>" alt="Maecenas venenatis viverra nisi" />
									</div>
									
									<div class="slider_content">
                                        <h2>Maecenas ut mauris eu ligula placerat tempor vel</h2>
                                        <p>Suspendisse dolor dui, pretium quis sagittis convallis, placerat et diam. Fusce euismod mattis mauris, ac consequat leo pellentesque non. Nullam ut pharetra diam.</p>
                                        <div class="btn_more"><a href="#">More...</a></div>
                                    </div>
                                
								</div>
                            </div><!-- End cs_article -->
                      
                        </div><!-- End cs_slider -->
                    </div><!-- End cs_wrapper -->
                </div><!-- End contentslider -->
                
                <!-- Site JavaScript -->
                
                <script type="text/javascript" src="<c:url value ="resources/js/jquery-1.3.1.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="resources/js/jquery.easing.1.3.js"/>"></script>
    <script type="text/javascript" src="<c:url value="resources/js/jquery.ennui.contentslider.js"/>"></script>
   
                <script type="text/javascript">
                    $(function() {
                    $('#one').ContentSlider({
                    width : '940px',
                    height : '240px',
                    speed : 400,
                    easing : 'easeOutSine'
                    });
                    });
                </script>
                 <div class="cleaner"></div>
            	
            </div>
        
        </div>
        
        <div id="templatemo_content_wrapper">
			<div id="content">
            	
                <h2>Why You Should Choose Us</h2>
                
                <div class="reasons">
                	<h3>Reliable</h3>
                    <img src="<c:url value="resources/images/reason1.png"/>" alt="Reason1" />
                    <p>Nam nulla odio, egestas non rutrum eget, euismod vel odio. Aliquam erat volutpat.</p>
                </div>
                
                <div class="reasons">
                	<h3>Punctual</h3>
                    <img src="<c:url value="resources/images/reason2.png"/>" alt="Reason2" />
                    <p>Nulla ut nibh elit, ut fermentum mi. Aliquam adipiscing, nunc vel euismod viverra.</p>
                </div>
                
                <div class="reasons">
                	<h3>100% Satisfaction</h3>
                    <img src="<c:url value="resources/images/reason3.png"/>"alt="Reason3" />
                    <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vitae lacus dolor. </p>
                </div>
                
                <div class="hr_divider"></div>
                
                <div class="col_w560">
                	<h2>Who We Are</h2>
                    <div class="image_wrapper image_fl"><img src="<c:url value="resources/images/templatemo_image_01.jpg" />"alt="TemplatemoImage01" /></div>
                    <p><em>Etiam ut urna ante, ut pulvinar ante. Vivamus a metus quam. Aenean non eros nunc. </em></p>
           			<p>Glossy Box is free CSS template provided by templatemo. You may edit and use this template in your websites. Credit goes to <a rel="nofollow" href="http://www.photovaco.com" target="_blank">Free Photos</a> for photos . Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi eget  sollicitudin turpis. Praesent facilisis orci vitae ante dignissim  ultrices. Curabitur convallis molestie sem, et egestas enim ornare non.  </p>
            		<div class="btn_more"><a href="#">Read more</a></div>
                </div>
                
                <div class="col_w280">
                	<h2>Testimonial</h2>
                    <blockquote>
                        <p>Donec mattis condimentum enim eget molestie. Phasellus euismod quam in mi fringilla eleifend. Aliquam luctus posuere velit, sit amet vestibulum odio feugiat. Validate <a href="http://validator.w3.org/check?uri=referer" rel="nofollow"><strong>XHTML</strong></a> &amp; <a href="http://jigsaw.w3.org/css-validator/check/referer" rel="nofollow"><strong>CSS</strong></a>.</p>
                        <cite>Linda - <span>Web Designer</span></cite>
                    </blockquote>
                </div>
                
                <div class="cleaner"></div>
                
            </div>
			
            <div class="cleaner"></div>        
        
		</div>
		
		<div id="templatemo_content_wrapper_bottm"></div>
   
		<div id="templatemo_footer">
		
             Copyright © 2048 <a href="#">Your Company Name</a>
			 
       </div>
        
	</div> <!-- end of wrapper -->
</div> <!-- end of wrapper_outer -->

</body>
</html>