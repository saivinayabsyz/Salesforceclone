$(document).on("click", "#cloneorg",function userReg(){
	var srcemail=$('#srcEmail').val();
	var srcpassword=$('#srcPwd').val();
	var destemail=$('#destEmail').val();
	var destpassword=$('#destPwd').val();
		$.ajax({
		url : '/Ecommerce?serviceId=cloneorg',
		type: 'POST',
		data : {
			sourceemail:srcemail,sourcepassword:srcpassword,destinationemail:destemail,destinationpassword:destpassword
		},
		success : function(responseText) {
			var obj = jQuery.parseJSON(responseText);
			console.log(obj);
			if(obj == "success"){alert("Product Added");}
			
				else{alert("Try Again");}
					
		}
	});
});
