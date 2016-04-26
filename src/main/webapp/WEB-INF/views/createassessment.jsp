<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/style.css" />" rel="stylesheet" type="text/css" />
<title>Create Assessment</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script>
  $(function() {
    $( "#tabs" ).tabs();
  });
  </script>
  <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  </script>
   <script>
  $(function() {
    $( "#datepicker1" ).datepicker();
  });
  </script>
<!-- <script type="text/javascript">
function tab(tab) {
document.getElementById('tab1').style.display = 'none';
document.getElementById('tab2').style.display = 'none';
document.getElementById('tab3').style.display = 'none';
document.getElementById('tab4').style.display = 'none';
document.getElementById('li_tab1').setAttribute("class", "");
document.getElementById('li_tab2').setAttribute("class", "");
document.getElementById('li_tab3').setAttribute("class", "");
document.getElementById('li_tab4').setAttribute("class", "");
document.getElementById(tab).style.display = 'block';
document.getElementById('li_'+tab).setAttribute("class", "active");
}
</script> -->
<!-- <script>
  jQuery(document).ready(function() {
    jQuery('.tabs .tab-links a').on('click', function(e)  {
        var currentAttrValue = jQuery(this).attr('href');
 
        // Show/Hide Tabs
        jQuery('.tabs ' + currentAttrValue).show().siblings().hide();
 
        // Change/remove current tab to active
        jQuery(this).parent('li').addClass('active').siblings().removeClass('active');
        e.preventDefault();
    });
});
 </script> --> 
</head>
<body>
 
<div align="center">
   <form:form action="createassessment.html" method="post" enctype="multipart/form-data">

	<h2 align="center">Create Assessment</h2>
	  	<div class="left"><form:label path="survey_number">Survey Number </form:label></div>
		
		<div class="right"><form:select path="survey_number" items="${survey_numbers}"/></div>  <br><br>
			
		<div class="left"><form:label path="cultivator_id">Cultivator Name</form:label></div> 
		<div class="right"><form:select path="cultivator_id" items="${cultivators}"/></div><br><br>
		<div class="left"><form:label path="start_date">Start Date(mm/dd/yyyy) </form:label></div>
		<div class="right"><form:input path="start_date" id="datepicker"/></div><br /><br />
		<div class="left"><form:label path="end_date">End Date(mm/dd/yyyy)  </form:label></div>
		<div class="right"><form:input path="end_date" id="datepicker1"/> </div><br /><br />
		<div class="left"><form:label path="area">Area (Acre)      </form:label></div>
		<div class="right"><form:input path="area"/></div><br /><br />
		<div class="left"><form:label path="crop">Crop       </form:label></div>
		<div class="right"><form:input path="crop"/></div><br /><br /><br>

		<div class="right"><input type="file" name="file"/></div><br>
<div id="tabs">
  <ul>
    <li><a href="#tabs-1">Fertilizer</a></li>
    <li><a href="#tabs-2">Pesticide</a></li>
    <li><a href="#tabs-3">Seed</a></li>
    <li><a href="#tab-4">Insurance</a></li>
  </ul>
  <div id="tabs-1">
        <div class="left"> <form:label path="fertilizername">name</form:label></div>
   				<div class="right"><form:input path="fertilizername"/></div><br><br>
  	 	<div class="left"> <form:label path="fertquantity">quantity(Kilo)</form:label></div>
   				<div class="right"><form:input path="fertquantity"/></div><br><br>
   		<div class="left"> <form:label path="fertcost">cost</form:label></div>
   				<div class="right"><form:input path="fertcost"/></div><br><br> 
  </div>
  <div id="tabs-2">
		<div class="left"><form:label path="pesticidename">name</form:label></div>
    	 	<div class="right"><form:input path="pesticidename"/></div><br><br>
    	 <div class="left"><form:label path="pestquantity">quantity(litre)</form:label></div>
    	 	<div class="right"><form:input path="pestquantity"/></div><br><br>
    	 <div class="left"><form:label path="pestcost">cost</form:label></div>
    	 	<div class="right"><form:input path="pestcost"/></div><br><br>  
  </div>
  <div id="tabs-3">
     		 <div class="left"><form:label path="seedbreed">breed</form:label></div>
    		 `	<div class="right"><form:input path="seedbreed"/></div> <br><br>
    		 <div class="left"><form:label path="seedsupplier">supplier</form:label></div>
    		 	<div class="right"><form:input path="seedsupplier"/> </div><br><br>
    		 <div class="left"><form:label path="seedquantity">quantity(Kg)</form:label></div>
    		 	<div class="right"><form:input path="seedquantity"/></div> <br><br>
    		 <div class="left"><form:label path="seedcost">cost</form:label></div>
    		 	<div class="right"><form:input path="seedcost"/></div> <br><br>  
  </div>
  <div id="tab-4">
   			 <div class="left"><form:label path="policy_no">Policy Number</form:label></div>
  			 	<div class="right"><form:input path="policy_no"/></div><br><br>
  			 <div class="left"><form:label path="premium_cost">Premium Cost</form:label> </div>
  			 	<div class="right"><form:input path="premium_cost"/></div><br><br>
  			 <div class="left"><form:label path="duration">Duration(Months)</form:label></div>
  			 	<div class="right"><form:input path="duration"/></div><br><br>
  </div>
</div>		
	<%-- <div class="tabs">
    <ul class="tab-links">
        <li class="active"><a href="#tab1">Fertilizer</a></li>
        <li><a href="#tab2">Pesticide</a></li>
        <li><a href="#tab3">Seed</a></li>
        <li><a href="#tab4">Insurance</a></li>
    </ul>

    <div class="tab-content">
        <div id="tab1" class="tab active">
            <div class="left"> <form:label path="fertilizername">name</form:label></div>
   				<div class="right"><form:input path="fertilizername"/></div><br><br>
  	 	<div class="left"> <form:label path="fertquantity">quantity</form:label></div>
   				<div class="right"><form:input path="fertquantity"/></div><br><br>
   		<div class="left"> <form:label path="fertcost">cost</form:label></div>
   				<div class="right"><form:input path="fertcost"/></div><br><br>
        </div>

      <div id="tab2" class="tab">
		<div class="left"><form:label path="pesticidename">name</form:label></div>
    	 	<div class="right"><form:input path="pesticidename"/></div><br><br>
    	 <div class="left"><form:label path="pestquantity">quantity</form:label></div>
    	 	<div class="right"><form:input path="pestquantity"/></div><br><br>
    	 <div class="left"><form:label path="pestcost">cost</form:label></div>
    	 	<div class="right"><form:input path="pestcost"/></div><br><br>          
      </div>

        <div id="tab3" class="tab">
    		 <div class="left"><form:label path="seedbreed">breed</form:label></div>
    		 `	<div class="right"><form:input path="seedbreed"/></div> <br><br>
    		 <div class="left"><form:label path="seedsupplier">supplier</form:label></div>
    		 	<div class="right"><form:input path="seedsupplier"/> </div><br><br>
    		 <div class="left"><form:label path="seedquantity">quantity</form:label></div>
    		 	<div class="right"><form:input path="seedquantity"/></div> <br><br>
    		 <div class="left"><form:label path="seedcost">cost</form:label></div>
    		 	<div class="right"><form:input path="seedcost"/></div> <br><br>           
        </div>

        <div id="tab4" class="tab">
  			 <div class="left"><form:label path="policy_no">Policy Number </form:label></div>
  			 	<div class="right"><form:input path="policy_no"/></div><br><br>
  			 <div class="left"><form:label path="premium_cost">Premium Cost </form:label> </div>
  			 	<div class="right"><form:input path="premium_cost"/></div><br><br>
  			 <div class="left"><form:label path="duration">Duration</form:label></div>
  			 	<div class="right"><form:input path="duration"/></div><br><br>            
        </div>
    </div>
</div> 
 --%>
<%-- <div id="Tabs">
<ul>
<li id="li_tab1" onclick="tab('tab1')"><a>Fertilizer</a></li>
<li id="li_tab2" onclick="tab('tab2')"><a>Pesticide</a></li>
<li id="li_tab3" onclick="tab('tab3')"><a>Seed</a></li>
<li id="li_tab4" onclick="tab('tab4')"><a>Insurance</a></li>
</ul>

<div id="Content_Area">
<div id="tab1">
        <div class="left"> <form:label path="fertilizername">Fertilizer Name</form:label></div>
   			<div class="right"><form:input path="fertilizername"/></div><br><br>
  	 	<div class="left"> <form:label path="fertquantity">quantity</form:label></div>
   			<div class="right"><form:input path="fertquantity"/></div><br><br>
   		<div class="left"> <form:label path="fertcost">cost</form:label></div>
   			<div class="right"><form:input path="fertcost"/></div><br><br>
</div>

<div id="tab2" style="display: none;"> 
		<div class="left"><form:label path="pesticidename">Pesticide name</form:label></div>
    	 	<div class="right"><form:input path="pesticidename"/></div><br><br>
    	 <div class="left"><form:label path="pestquantity">quantity</form:label></div>
    	 	<div class="right"><form:input path="pestquantity"/></div><br><br>
    	 <div class="left"><form:label path="pestcost">cost</form:label></div>
    	 	<div class="right"><form:input path="pestcost"/></div><br><br> 
</div>

<div id="tab3" style="display: none;"> 
    		 <div class="left"><form:label path="seedbreed">breed</form:label></div>
    		 `	<div class="right"><form:input path="seedbreed"/></div> <br><br>
    		 <div class="left"><form:label path="seedsupplier">supplier</form:label></div>
    		 	<div class="right"><form:input path="seedsupplier"/> </div><br><br>
    		 <div class="left"><form:label path="seedquantity">quantity</form:label></div>
    		 	<div class="right"><form:input path="seedquantity"/></div> <br><br>
    		 <div class="left"><form:label path="seedcost">cost</form:label></div>
    		 	<div class="right"><form:input path="seedcost"/></div> <br><br>
</div>

<div id="tab4" style="display: none;"> 
  			 <div class="left"><form:label path="policy_no">Policy Number </form:label></div>
  			 	<div class="right"><form:input path="policy_no"/></div><br><br>
  			 <div class="left"><form:label path="premium_cost">Premium Cost </form:label> </div>
  			 	<div class="right"><form:input path="premium_cost"/></div><br><br>
  			 <div class="left"><form:label path="duration">Duration</form:label></div>
  			 	<div class="right"><form:input path="duration"/></div><br><br>
</div>

</div>
</div> --%>

		
	<div align="center"><input type="submit" value="create" /></div>
	</form:form>
</div>
</body>
</html>