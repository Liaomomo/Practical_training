<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head> 
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" type="text/css" href="../static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../static/css/style.default.css" id="theme-stylesheet">
    <link rel="stylesheet" type="text/css" href="../static/css/index.css"/>
    <link rel="stylesheet" type="text/css" href="../static/css/yonghu.css"/>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
    <script type="text/javascript" src="../static/js/echarts3.2.3.js"></script>
    <script type="text/javascript" src="../static/js/worldcloud3.2.3.js"></script>
    <!-- <script type="text/javascript" src="../static/js/echarts-wordcloud.js"></script>
    <script type="text/javascript" src="../static/js/echarts-wordcloud.min.js"></script> -->
    
  </head>
  <body>
    <header class="header">   
      <nav class="navbar navbar-expand-lg">
        <div class="container-fluid d-flex align-items-center justify-content-between">
          <div class="navbar-header">
               <a href="index.html" class="navbar-brand">
              <div class="brand-text brand-big visible text-uppercase"><strong class="text-primary">大数据</strong><strong>分析平台</strong></div>
              </a>

          </div>
          
          <div class="header">
               <a href="../page/chart_0.do" class="navbar-brand">
              <div class="brand-text brand-big visible text-uppercase"><strong class="text-primary">数据分析</strong></div>
              </a>

          </div>
          
          
          <div class="header">
               <a href="../page/yonghu.do" class="navbar-brand">
              <div class="brand-text brand-big visible text-uppercase"><strong class="text-primary">用户查询</strong></div>
              </a>

          </div>
          
          
          
          
          <div class="right-menu list-inline no-margin-bottom">    
           
            <div ><a><img src="../static/img/flags/16/CN.png" alt="English"><span class="d-none d-sm-inline-block">中文</span></a>
            </div>

          </div>
        </div>
      </nav>
    </header>
    
    
    <div class="d-flex align-items-stretch">
<!-- 侧边栏导航-->
      <nav id="sidebar">

        
        <span class="heading">用户信息</span>
        <ul class="list-unstyled">
          <li class="active"><a href="../page/chart_0.do" > <i class="icon-home"></i >用户登陆 </a></li>
          </ul>

      </nav>
<!-- Sidebar Navigation end-侧边栏导航结束-->
      <div class="page-contents" >
        <div class="page-header">

       <article  class="1">
	    <div class="resume-wrapper-inner mx-auto text-left bg-white shadow-lg">
		    <header class="resume-header pt-4 pt-md-0">
			    <div class="media flex-column flex-md-row">
			    <c:forEach  items="${list}" var="s">
				    <img  text-align="center" src=${ s.avatar_url} alt="" width="200" height="200">
				    <div class="media-body p-4 d-flex flex-column flex-md-row mx-auto mx-lg-0">
					    <div class="center">
					       <div class="title mb-3">用户名：${s.username}</div>
						    <div class="title mb-3">所处地：${s.locaton}</div>
						    <ul class="list-unstyled">
						    	<li><a href="#">职业：${s.employment}</a></li>
							    <li><a href="#">所处行业：${s.business}</a></li>
							    <li><a href="#">婚姻状况：${s.sex}</a></li>
				                <li><a href="#">毕业大学：${s.education}</a></li>
						    </ul>
						 </div><!--//primary-info-->
					</div>
				</c:forEach>
			    </div><!--//media-->
		    </header>
		    <div class="resume-body p-5">
			    <section class="resume-section summary-section mb-5">
				    <h2 class="resume-section-title text-uppercase font-weight-bold pb-3 mb-3">Career Summary</h2>
				    <div class="resume-section-content">
					    <p class="mb-0">Summarise your career here. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. You can download this free resume/CV template here. Aenean commodo ligula eget dolor aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget.</p>
				    </div>
			    </section><!--//summary-section-->
			    
			   
		    </div><!--//resume-body-->
		    
		    
	    </div>
    </article>  
    
    
    </div>
    </div>
    </div>
    
</body>
</html>
