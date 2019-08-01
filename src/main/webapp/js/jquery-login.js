var w,h,className;
function getSrceenWH(){
	w = $(window).width();
	h = $(window).height();
	$('#dialogBg').width(w).height(h);
}

window.onresize = function(){  
	getSrceenWH();
}  
$(window).resize();  

$(function(){
	getSrceenWH();
	
	//显示弹框
	$('#login').click(function(){
		className = $(this).attr('class');
		$('#dialogBg').fadeIn(300);
		$('#dialog').removeAttr('class').addClass('animated '+className+'').fadeIn();
	});
	$('#register').click(function(){
		className = $(this).attr('class');
		$('#dialogBg').fadeIn(300);
		$('#dialog1').removeAttr('class').addClass('animated1 '+className+'').fadeIn();
	});
	//关闭弹窗
	$('.claseDialogBtn').click(function(){
		$('#dialogBg').fadeOut(300,function(){
			$('#dialog').addClass('bounceOutUp').fadeOut();
		});
	});
	$('.claseDialogBtn1').click(function(){
		$('#dialogBg').fadeOut(300,function(){
			$('#dialog1').addClass('bounceOutUp').fadeOut();
		});
	});
});
