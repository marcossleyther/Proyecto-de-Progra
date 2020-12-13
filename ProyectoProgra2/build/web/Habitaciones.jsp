<%-- 
    Document   : Habitaciones
    Created on : 15/10/2020, 07:24:59 PM
    Author     : Adrian
--%>

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
            <div class="d-flex">
                <div class="card col-sm-12 d-flex" style="border:none">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>No.</th>
                                <th>Tipo</th>
                                <th>Nivel</th>
                                <th>Descripcion</th>
                                <th>Precio/Dia</th>
                                <th>STATUS</th>
                            </tr>
                        </thead>
                        <%
                            HabitacionDao habdao = new HabitacionDao();
                            List<Habitacion> list = habdao.listar();
                            Iterator<Habitacion> iter = list.iterator();
                            Habitacion hab = null;
                            while (iter.hasNext()) {
                                hab = iter.next();

                        %>
                        <tbody>
                            <tr>
                                <td> <%=hab.getId()%></td>
                                <td><%=hab.getIdtipo()%> </td>
                                <td><%=hab.getNivel()%></td>
                                <td><%=hab.getComentario()%></td>
                                <td>Q<%=hab.getPrecio()%>.00</td>
                                <td><%=hab.getStatus()%></td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>      
            <div class="d-flex"> 
                <div class="col-sm-12 d-flex">
                    <div class="card"style="border:none">
                        <form action="controlador?menu=Reservacion" method="POST">
                            <div class="card-body">
                                <div class="form-group">
                                    <label>Datos del Huesped</label> 
                                </div>
                                <div class="form-group d-flex">
                                    <div class="col-sm-6 d-flex" >
                                        <input type="text" name="codigocliente" value="${c.getId()}"class="form-control" placeholder="Codigo">
                                        <input type="submit" name="accion" value="Buscar" class="btn btn-info"> 
                                    </div>
                                    <div class="col-sm-5">
                                        <input type="text" name="nombrescliente" value="${c.getNombre()} ${c.getApellido()}" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label>Habitacion</label>
                                </div>
                                <div class="form-group d-flex">
                                    <div class="col-sm-6 d-flex" >
                                        <input type="text" name="codigohabitacion" class="form-control" placeholder="Codigo" value="${habitacion.getId()}">
                                        <button type="submit" name="accion" value="BuscarHabitacion" class="btn btn-info">Buscar</button>
                                    </div>
                                    <div class="col-sm-12">
                                        <input type="text" name="nombreshabitacion" value="${habitacion.getComentario()}"  class="form-control">
                                    </div>
                                </div>
                                <div class="form-group d-flex">
                                    <div class="col-sm-5">
                                        <input type="text" name="Stock" class="form-control" placeholder="Status" value="${habitacion.getStatus()}">
                                    </div>
                                    <div class="col-sm-3">
                                        <button type="submit" name="accion" class="btn btn-info" value="reservar">Reservar</button>
                                        
                                        <button type="submit" name="accion" class="btn btn-info" value="liberar">Liberar</button>
                                    </div>
                                    <div>
                                      <label for="start">Inicio Reservacion</label>
                                        <input type="date" id="start" name="txtinicio"
                                               value=""
                                               min="2020-01-01" max="2020-12-31">
                                        </div>
                                        <div>
                                        <label for="start">Fin Reservacion</label>
                                        <br>
                                        <input type="date" id="start" name="txtfin"
                                               value=""
                                               min="2020-01-01" max="2020-12-31">  
                                    </div>
                                </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

    </div>                           
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.3/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
