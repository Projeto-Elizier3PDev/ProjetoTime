<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Cartola D'Hora</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container">
  <h2>Dicas do Cartola 2021</h2>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="img/Bola.jpg" alt="Los Angeles" style="width:100%;">
        <div class="carousel-caption">
          <h3>Dicas da Rodada</h3>
          <p>4 dicas por posição</p>
        </div>
      </div>

      <div class="item">
        <img src="img/Campo.jpg" alt="Chicago" style="width:100%;">
        <div class="carousel-caption">
          <h3>Seleção do Canal</h3>
          <p>Confira os Times</p>
        </div>
      </div>
    
      <div class="item">
        <img src="img/Jogadores.jpg" alt="New York" style="width:100%;">
        <div class="carousel-caption">
          <h3>Ultimas Noticias</h3>
          <p>Fique por dentro das novidades</p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>
