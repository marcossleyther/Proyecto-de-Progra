<%-- 
    Document   : Historial
    Created on : 19/10/2020, 08:10:54 PM
    Author     : Adrian
--%>

<%@page import="Modelo.venta"%>
<%@page import="Modelo.VentaDAO"%>
<%@page import="Modelo.reserva"%>
<%@page import="Modelo.reservadao"%>
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
        <title>Historial</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="d-flex">
                <div class="d-flex">
                    <div class="card col-sm-12 d-flex" style="border:none">
                        <label>Historial Reservaciones</label>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Id.</th>
                                    <th>IncioR</th>
                                    <th>FinR</th>
                                    <th>IdHuesped</th>
                                    <th>IdHabitacion</th>
                                </tr>
                            </thead>
                            <%
                                reservadao reserv = new reservadao();
                                List<reserva> list = reserv.listar();
                                Iterator<reserva> iter = list.iterator();
                                reserva res = null;
                                while (iter.hasNext()) {
                                    res = iter.next();

                            %>
                            <tbody>
                                <tr>
                                    <td> <%=res.getIdreserva()%></td>
                                    <td><%=res.getInicior()%> </td>
                                    <td><%=res.getFinr()%></td>
                                    <td><%=res.getIdHuesped()%></td>
                                    <td><%=res.getIdHabitacion()%></td>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>
                    </div>
                </div>      
            </div>

            <div class="d-flex">
                <div class="d-flex">
                    <div class="card col-sm-12 d-flex" style="border:none">
                        <label>Historial Facturacion</label>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>IdVenta</th>
                                    <th>IdHuesped</th>
                                    <th>Numero Fac</th>
                                    <th>Fecha</th>
                                    <th>Monto</th>
                                </tr>
                            </thead>
                            <%
                                VentaDAO vent = new VentaDAO();
                                List<venta> list1 = vent.listar();
                                Iterator<venta> iter1 = list1.iterator();
                                venta v = null;
                                while (iter1.hasNext()) {
                                    v = iter1.next();

                            %>
                            <tbody>
                                <tr>
                                    <td> <%=v.getId()%></td>
                                    <td><%=v.getIdhuesped()%> </td>
                                    <td><%=v.getNumserie()%></td>
                                    <td><%=v.getFecha()%></td>
                                    <td><%=v.getMonto()%></td>
                                </tr>
                                <%}%>
                            </tbody>
                        </table>
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