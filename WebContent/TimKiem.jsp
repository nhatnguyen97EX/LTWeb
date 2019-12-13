<%@page import="Data.DsSanPham"%>
<%@page import="Data.DsKhachHang"%>
<%@page import="Data.SanPham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Ring Store</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="SHORTCUT ICON" href="logo.png  ">
<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
</style>
<body class="w3-light-grey w3-content" style="max-width:1600px">

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
  <div class="w3-container">
    <a href="#" onclick="w3_close()" class="w3-hide-large w3-right w3-jumbo w3-padding w3-hover-grey" title="close menu">
      <i class="fa fa-remove"></i>
    </a>
    <img src="nhan/2.png" style="width:45%;" class="w3-round"><br><br>
    <h4><b>Ring Store</b></h4>
    <p class="w3-text-grey">Sang Trọng và Đẳng Cấp</p>
  </div>
  <div class="w3-bar-block">
    <a href="RingStore.html" onclick="w3_close()" class="w3-bar-item w3-button w3-padding  w3-text-teal"><i class="fa fa-th-large fa-fw w3-margin-right"></i>Sản Phẩm</a> 
    <a href="about.html" onclick="w3_close()" class="w3-bar-item w3-button w3-padding"><i class="fa fa-user fa-fw w3-margin-right"></i>Về Chúng Tôi</a> 
    <a href="contact.html" onclick="w3_close()" class="w3-bar-item w3-button w3-padding"><i class="fa fa-envelope fa-fw w3-margin-right"></i>Liên Hệ</a>
  </div>
  <div class="w3-panel w3-large">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
    <i class="fa fa-instagram w3-hover-opacity"></i>
    <i class="fa fa-snapchat w3-hover-opacity"></i>
    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
    <i class="fa fa-twitter w3-hover-opacity"></i>
    <i class="fa fa-linkedin w3-hover-opacity"></i>
  </div>
</nav>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px">

  <!-- Header -->
  <header id="portfolio">
    <a href="#"><img src="/w3images/avatar_g2.jpg" style="width:65px;" class="w3-circle w3-right w3-margin w3-hide-large w3-hover-opacity"></a>
    <span class="w3-button w3-hide-large w3-xxlarge w3-hover-text-grey" onclick="w3_open()"><i class="fa fa-bars"></i></span>
    <div class="w3-container">
    <h1><b>Liên Hệ</b></h1>
    <ul class="alignRight">
        <button class="buttonlogin"><span>Cart [0]</span></button>
        <a href="login.html"><button class="buttonlogin"><span>Login</span></button></a>
        <form action="">
            <input type="text">
           <input class="buttonlogin"type="submit" value="Tìm kiếm">
          </form>
        </ul>
            <h3>Danh Sách Sản Phẩm </h3>
            <% DsSanPham ds=new DsSanPham();
            ArrayList<SanPham> list=ds.getDsSanPham();
            for (int i=0; i<=list.size(); i++)
            %>
            ${list.get(i).name()};
    </br>
    

    
  
 
  <!-- Footer -->
  <footer class="w3-container w3-padding-32 w3-dark-grey">
  <div class="w3-row-padding">
    <div class="w3-third">
      <p>Powered by <a href="#" target="_blank">My Team</a></p>
    </div>
  
    <div class="w3-third">
      <h3>BLOG POSTS</h3>
      <ul class="w3-ul w3-hoverable">
        <li class="w3-padding-16">
          <img src="nhan/7.jpg" class="w3-left w3-margin-right" style="width:50px">
          <span class="w3-large">Lorem</span><br>
          <span>Sed mattis nunc</span>
        </li>
        <li class="w3-padding-16">
          <img src="nhan/8.jpg" class="w3-left w3-margin-right" style="width:100px">
          <span class="w3-large">Ipsum</span><br>
          <span>Praes tinci sed</span>
        </li> 
      </ul>
    </div>

    <div class="w3-third">
      <h3>Các Quốc gia có trụ sở</h3>
      <p>
        <span class="w3-tag w3-black w3-margin-bottom">VietNam</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Spain</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Portugal</span>
        <span class="w3-tag w3-grey w3-small w3-margin-bottom">Korea</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Russia</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Brazil</span>
        <span class="w3-tag w3-grey w3-small w3-margin-bottom">Indian</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">ThaiLand</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">England</span>
        <span class="w3-tag w3-grey w3-small w3-margin-bottom">China</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Lao</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Campuchia</span>
        <span class="w3-tag w3-grey w3-small w3-margin-bottom">Japan</span> <span class="w3-tag w3-grey w3-small w3-margin-bottom">Singapore</span>
      </p>
    </div>

  </div>
  </footer>
  
  <div class="w3-black w3-center w3-padding-24">Powered by <a href="https://www.w3schools.com/w3css/default.asp" title="W3.CSS" target="_blank" class="w3-hover-opacity">w3 school</a></div>

<!-- End page content -->
</div>

<script>
// Script to open and close sidebar
function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
    document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
    document.getElementById("myOverlay").style.display = "none";
}
</script>

</body>
</html>