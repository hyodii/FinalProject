<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
   request.setCharacterEncoding("UTF-8");
   String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>beeHelloCreated.jsp</title>
<style type="text/css">
/*reset*/
* {margin: 0;padding: 0;}
body {margin: 0;}
h1, h2, h3, h4, h5, h6, p, ul, ol, li, dl, dt, dd {margin: 0; padding: 0;}
h1, h2, h3, h4, h5, h6 {font-weight: 700; }
a {color: inherit; text-decoration: inherit;}
img {vertical-align: middle;}
a img {border: none;}
li {list-style: none;}
address, em, i, ul {font-style: normal;}

/*layout*/
.mo {display: none;}
.en {font-family: 'Exo 2', sans-serif;}
body {font-family: 'Noto Sans KR', sans-serif; font-size: 14px;}
.wrap {margin: 0 auto; }

/* create css */
#bbs 
{
	width:600px;
	margin:30px auto;
	text-align:left;
}

#bbs_title s
{
	width:574px;
	padding-left:20px;
	height:40px;
	border:3px solid #D6D4A6;
	text-align:left;
	font-weight: bold;
	line-height:40px;
	font-size:10pt;
	margin-bottom:30px;
}

#bbsCreated 
{
	width:600px;
	overflow: visible;
	border-top:3px solid #DBDBDB;
	border-bottom:3px solid #DBDBDB;
	text-align:left;
}

.bbsCreated_bottomLine 
{
	height:35px;
	line-height:35px;
	border-bottom:1px solid #DBDBDB;
	clear:both;
	text-align:left;
}

.bbsCreated_noLine 
{
	height:35px;
	line-height:35px;
	clear:both;
	text-align:left;
}

#bbsCreated_content 
{
	height:170px;
	line-height:170px;
	border-bottom:1px solid #DBDBDB;
	clear:both;
	text-align:left;
}

#bbsCreated dt 
{
	float:left;
	height:35px;
	width:80px;
	line-height:35px;
	text-align:left;
	padding-left:20px;
	background-color:#EEEEEE;
}

#bbsCreated dd 
{
	float:left;
	height:35px;
	width:440px;
	line-height:35px;
	text-align:left;
	padding-left:10px;
}

#bbsCreated_content dt 
{
	float:left;
	height:170px;
	width:80px;
	text-align:left;
	padding-left:20px;
	background-color:#EEEEEE;
}

#bbsCreated_content dd 
{
	float:left;
	height:170px;
	width:440px;
	line-height:170px;
	text-align:left;
	padding-left:10px;
}

#bbsCreated_footer 
{
	width:600px;
	overflow: visible;
	clear:both;
	height:50px;
	line-height:50px;
	margin-bottom:20px;
	text-align:center;
}

</style>
<script type="text/javascript" src="<%=cp%>/js/util.js"></script>
<script type="text/javascript">
   function sendIt()
   {
      f = document.myForm;
      
      // ?????? ?????? ?????? --------------------------------------
      str = f.subject.value;
      str = str.trim();
      
      // ??? javascript ?????? trim() ??? ???????????? ??????.
      //    ???????????? ????????? util.js ??? ??????????????????.
      
      // ?????????
      //alert("|" + str + "|"); 
      
      if(!str)
      {
         alert("\n????????? ???????????????~!!!");
         f.subject.focus();
         return;
      }
      // -------------------------------------- ?????? ?????? ??????
      
      // ?????? ?????? ?????? --------------------------------------
      str = f.name.value;
      str = str.trim();
      
      if(!str)
      {
         alert("\n????????? ????????? ???????????????~!!!");
         f.name.focus();
         return;
      }
      
      //  --------------------------------------?????? ?????? ??????
      
      
    
      
      f.action = "<%=cp%>/beenoticeCreated_ok.jsp";
      f.submit();
      
      
   }
</script>
</head>
<body>
<!--  
	beeVoteCreated.jsp
	- ????????? ??? ????????? > ?????? > ?????????
-->

<div id="bbs">

   <div id="bbs_title">
      ??????
   </div>
   
   <form action="" method="post" name="myForm">
      <div id="bbsCreated">
         <div class="bbsCreated_bottomLine">
            <dl>
               <dt>???&nbsp;&nbsp;&nbsp;&nbsp;???</dt>
               <dd>
                  <input type="text" name="subject" size="60"
                  maxlength="100" class="boxTF" />
               </dd>
            </dl>
         </div><!-- close .bbsCreated_bottomLine -->
         
         <div class="bbsCreated_bottomLine">
            <dl>
               <dt>??? ??? ???</dt>
               <dd>
                  <input type="text" name="name" size="35"
                  maxlength="20" class="boxTF"/>
               </dd>
            </dl>
         </div><!-- close .bbsCreated_bottomLine -->
         
         
         <div id="bbsCreated_content">
            <dl>
               <dt>???&nbsp;&nbsp;&nbsp;&nbsp;???</dt>
               <dd>
                  <textarea rows="10" cols="63" name="content"
                        class="boxTA"></textarea>
               </dd>
            </dl>
         </div><!-- close .bbsCreated_content -->
         
         
         <div id="bbsCreated_footer">
            <input type="button" value="????????????" class="btn2"
            onclick="sendIt()"/>
            <input type="button" value="??????" class="btn2" 
            onclick="javascript:location.href='<%=cp%>/beeDiscussionList.jsp'"/>
         </div><!-- close .bbsCreated_footer -->
         
      </div><!-- close .bbsCreated -->
      
   </form>
   
</div><!-- close #bbs -->



</body>
