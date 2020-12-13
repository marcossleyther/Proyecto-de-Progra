<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Modelo.huesped"%>
<%@page import="Modelo.huespedDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Habitacion"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.HabitacionDao"%>

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
            <div class="col-sm-12 d-flex">
                <div class="card">
                    <form action="controlador?menu=Facturacion" method="POST">
                        <div class="card-body">
                            <div class="form-group">
                                <label>Datos del Huesped</label> 
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-4 d-flex" >
                                    <input type="text" name="codigocliente" value=""class="form-control" placeholder="Codigo">
                                    <button type="submit" name="accion" value="BuscarCliente" class="btn btn-info">Buscar</button>
                                </div>
                                <div class="col-sm-5">
                                    <input type="text" name="nombrescliente" value="${c.getNombre()} ${c.getApellido()}" class="form-control">
                                </div>
                            </div>
                            <div class="form-group">

                                <label>Habitacion</label>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-4 d-flex" >
                                    <input type="text" name="codigohabitacion" class="form-control" placeholder="Codigo">
                                    <button type="submit" name="accion" value="BuscarHabitacion" class="btn btn-info">Buscar</button>
                                </div>
                                <div class="col-sm-8">
                                    <input type="text" name="nombreshabitacion" value="${habitacion.getComentario()}" class="form-control" placeholder="Habitacion">
                                </div>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-4">
                                    <input type="text" name="precio" value="${habitacion.getPrecio()}" class="form-control" placeholder="Q/.00">
                                </div>
                                <div class="col-sm-2">
                                    <input type="number" name="cantidadh" value="1" class="form-control">
                                </div>

                                <div class="col-sm-4">
                                    <input type="text" name="Stock" value="${habitacion.getStatus()}"class="form-control" placeholder="Status">
                                </div>
                                <button type="submit" name="accion" value="AgregarH" class="btn btn-success">Agregar Habitacion</button>   
                            </div>
                            <div class="form-group">
                                <label>Servicios</label>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-4 d-flex" >
                                    <input type="text" name="codigoservicio" class="form-control" placeholder="Codigo">
                                    <button type="submit" name="accion" value="BuscarSerivicio" class="btn btn-info">Buscar</button>
                                </div>
                                <div class="col-sm-4">
                                    <input type="text" name="desservicio" value="${servicio.getDescipcion()}"class="form-control" placeholder="Servicio">
                                </div>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-2">
                                    <input type="text" name="precios" value="${servicio.getPrecio()}" class="form-control" placeholder="Q/.00">
                                </div>
                                <div class="col-sm-2">
                                    <input type="number" value="1" name="cantidads" class="form-control">
                                </div>     
                                <!--Boton de Agregar producto -->
                                <div class="form-group">
                                    <button type="submit" name="accion" value="Agregars" class="btn btn-success">Agregar Servicio</button>
                                </div>
                            </div>
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card">
                    <div class="card-body">
                        <div class="d-flex col-sm-5 ml-auto"> 
                            <label>No.Serie_</label>
                            <input type="text" name="No.Serie" value="${nserie}" class="form-control"></input>
                        </div>
                        <br>
                        <table class="table table-hover">
                            <thead>

                                <tr>
                                    <th>Nro.</th>
                                    <th>Codigo</th>
                                    <th>Descripcion</th>
                                    <th>Precio</th>
                                    <th>Cantidad</th>
                                    <th>Subtotal</th>
                                    <th>Acciones</th>
                                </tr>

                            </thead>
                            <tbody>
                                <c:forEach var="list" items="${lista}">
                                    <tr>
                                        <td>${list.getItem()}</td>
                                        <td>${list.getIdhabitacion()} ${list.getIdservicio()}</td>
                                        <td>${list.getDescripcion()}</td>
                                        <td>${list.getPrecio()}</td>
                                        <td>${list.getCantidad()}</td>
                                        <td>${list.getSubtotal()}</td>
                                    </c:forEach>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                    <div class="card-footer d-flex" >
                        <div class="col-sm-6">
                            <a href="controlador?menu=Facturacion&accion=GenerarVenta" class="btn btn-info">Generar Venta</a>

                        </div>
                        <div class="col-sm-3 ml-auto">
                            <input type="text" name="txTotal" value="Q. ${totalPagar}.00" class="form-control">
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.3/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
