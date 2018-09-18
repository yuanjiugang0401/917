<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>首页</title>
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
		<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/normalize.css">
		<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/icon.css">
		<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/index.css">
		<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/footer.css">
		<script type="text/javascript" src="${ctxStatic}/js/autosize.js"></script>
	</head>
	<body>
		<ul class="list">
		 <c:forEach items="${goodsList}" var="zlGoods">
			<li class="item">
				<img src="${fn:split(zlGoods.goodsPic,"|")[0]}">
				<div class="item-text">
					<p>${zlGoods.goodsName}</p>
					<span>¥${zlGoods.goodsPrice}</span>
					<div class="cart">
						<i class="iconfont icon-gouwuche"></i>
					</div>
				</div>
			</li>
			</c:forEach>
		</ul>
		<jsp:include page="footer.jsp"></jsp:include>
	</body>
</html>