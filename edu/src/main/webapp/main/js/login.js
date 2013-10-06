// 获取上下文
contextPath = typeof (contextPath) == "undefined" ? "" : contextPath;

$(function(){
	if($("#captchaImg")){
		$("#captchaImg").click(function(){
			$(this).attr("src", contextPath + "/captcha/"+ new Date());
		});
	}
});


