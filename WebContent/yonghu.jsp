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
          <div class="container-fluid">
            <h2 class="h5 no-margin-bottom">用户信息查询</h2>
          </div>
            <form action="../user/getUserInfo.do?username">
                 <input type="text" name="username">
                 <input type="submit" value="Submit">
            </form>
    

    
    
    </div>
    </div>
    </div>
    
</body>
</html>
