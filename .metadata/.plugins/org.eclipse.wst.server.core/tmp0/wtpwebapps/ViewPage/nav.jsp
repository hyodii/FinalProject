<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>B:CLE</title>
<!-- <link rel="stylesheet" href="css/main.css"> -->
<link rel="stylesheet" href="css/font-awesome.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<style>
@import url('https://fonts.googleapis.com/css?family=Exo+2|Noto+Sans+KR&display=swap');

/*reset*/
* {margin: 0;padding: 0;}
body {margin: 0;}
h1, h2, h3, h4, h5, h6, p, ul, ol, li, dl, dt, dd {margin: 0; padding: 0;}
h1, h2, h3, h4, h5, h6 {font-weight: 700; font-size: inherit;}
a {color: inherit; text-decoration: inherit;}
img {vertical-align: middle;}
a img {border: none;}
li {list-style: none;}
address, em, i, ul {font-style: normal;}


.mo {display: none;}
body {font-family: 'Noto Sans KR', sans-serif; font-size: 14px;}

header {
	font-family: 'Noto Sans KR', sans-serif;
	letter-spacing: -0.5px;
	background: rgb(255, 192, 0);
	color: white;
	height: 10vh;
	width : 100%;
	position: fixed;
}

.mainHeader{width: 100%; margin-top: 20px; box-sizing: border-box; vertical-align: center;}
.mainHeader .gnbMo {display: none; }
.mainHeader .gnb {float: left; margin-left: 80px; }
.mainHeader .gnb li {float: left; margin-right: 80px;}
.mainHeader .gnb li a{display: block; width: 100%; height: 100%; text-align: center; color: #fff; font-size: 16px; text-decoration-line : none;}
.mainHeader .gnb li a:hover,.mainHeader .gnb li a:focus {color:#ff8342;}
.mainHeader .tnb {float: right; }
.mainHeader .tnb li {float: left; margin-right: 25px;}
.mainHeader .tnb li a{display:block; width: 100%; height: 100%; text-align: center; font-size: 16px; color: #fff; text-decoration-line : none;}
.mainHeader .tnb li:nth-child(1) a i,.mainHeader .tnb li:nth-child(2) a i {font-size: 20px; margin-right: 8px;}
.mainHeader .tnb li:last-child a {display: block; width: 105px; line-height: 2; border: 1px solid #fff; border-radius: 30px; margin-top: 35px; }
.mainHeader .tnb li:last-child a i {margin-left: 5px;}
.mainHeader .tnb li:last-child a:hover {background: #fff; color:#ff8342; transition: all 0.3s; }


</style>


</head>
<body>
		<!--header-->
		<header>
			<div class="mainHeader">
				<nav class="gnb">
					<ul>
						<li><a href="#">B:CLE</a></li>
						<li><a href="#">공지사항</a></li>
						<li><a href="#">대표게시판</a></li>
						<li><a href="#">결산</a></li>
					</ul>
				</nav>
				<nav class="tnb">
					<ul>

						<li><a href="#">동아리개설</a></li>
						<li><a href="#">검색 <i class="fa fa-search"
								aria-hidden="true"></i></a></li>
						<li><a href="#"><i class="fa fa-handshake-o"
								aria-hidden="true"></i>로그인/회원가입</a></li>
						<li><button type="button"
								class="btn btn-primary position-relative">
								알림 <span
									class="position-absolute top-0 start-100 translate-middle p-2 bg-danger border border-light rounded-circle">
									<span class="visually-hidden">New alerts</span>
								</span>
							</button></li>
					</ul>
				</nav>
				<!-- 검색아이콘 -->
				<nav class="gnbMo">
					<a href="#"><i class="fa fa-bars" aria-hidden="true"></i></a>
				</nav>
			</div>
		</header>
</body>
</html>