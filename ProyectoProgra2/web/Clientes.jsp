<%-- 
    Document   : Clientes
    Created on : 15/10/2020, 07:25:19 PM
    Author     : Adrian
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-3" >

                <div class="card-body" style="border:none">
                    <form action="controlador?menu=Clientes" method="POST">
                        <div class="form-group">
                            <label>Codigo ${hues.getId()}</label>
                        </div>
                        <div class="form-group">
                            <label>Nombre</label>
                            <input  type="text" value="${hues.getNombre()}" name="txtnom" class="form-control"> 
                        </div>
                        <div class="form-group">
                            <label>Apellido</label>
                            <input   type="text" value="${hues.getApellido()}" name="txtapellido" class="form-control"> 
                        </div>
                        <div class="form-group">
                            <label>Direccion</label>
                            <input  type="text" value="${hues.getDireccion()}" name="txtDireccion" class="form-control"> 
                        </div>
                        <input  type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input  type="submit" name="accion" value="Editar" class="btn btn-success">
                    </form>
                </div>
            </div>
            <div  class="d-flex" >
            <div class="card col-sm-25 d-flex">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Direccion</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="hues" items="${huespedes}">
                            <tr>
                                <td>${hues.getId()}</td>
                                <td>${hues.getNombre()}</td>
                                <td>${hues.getApellido()}</td>
                                <td>${hues.getDireccion()}</td>
                                <td>
                                    <a class="btn btn-success" style="height: 45px;width: 52px; border:none" href="controlador?menu=Clientes&accion=Actualizar&id=${hues.getId()}">Edit</a>
                                    <a class="btn btn-info" href="controlador?menu=Clientes&accion=Borrar&id=${hues.getId()}">Eliminar</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>

        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.3/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
