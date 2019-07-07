<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>

<head>
    <meta charset="UTF-8">
    <title>구글 리캡챠 테스트</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
    <script src="https://www.google.com/recaptcha/api.js?render=6Le-q6kUAAAAAFPDTU6lct7ZRRN7vK55hVF4Icp3"></script>
</head>

<body>
    <form action="/robot" method="get">
        <input type="text" name="name" />
        <input type="text" name="g-recaptcha-response" id="g-recaptcha-response" />
        <input type="submit" value="submit" />
    </form>

<script>
$(document).ready(function(){
    grecaptcha.ready(function() {
      grecaptcha.execute('reCAPTCHA_site_key', {action: 'login'}).then(function(token) {
         console.log(token)
         $.ajax({
			url: '${pageContext.servletContext.contextPath}/robot/token',
			type : 'POST',
			dataType: 'json',
			data : {'token': token},
			success : function(result){
				console.log(result);
			},
			fail: function(e){
			    console.log("fail")
			}
		  });// end ajax
      });
    });
});
</script>
</body>

</html>