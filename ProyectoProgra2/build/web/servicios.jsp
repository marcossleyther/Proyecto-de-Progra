<%-- 
    Document   : servicios
    Created on : 29/10/2020, 08:59:20 PM
    Author     : Adrian
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.servicio"%>
<%@page import="Modelo.Habitacion"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.servicioDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Servicios</title>
    </head>
    <body>
        <div class="d-flex">
                <div class="card col-sm-12 d-flex" style="border:none">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Cod</th>
                                <th>Descripcion</th>
                                <th>Monto</th>
                            </tr>
                        </thead>
                        <%
                            servicioDao serd = new servicioDao();
                            List<servicio> list = serd.listar();
                            Iterator<servicio> iter = list.iterator();
                            servicio ser = null;
                            while (iter.hasNext()) {
                                ser = iter.next();

                        %>
                        <tbody>
                            <tr>
                                <td> <%=ser.getId()%></td>
                                <td><%=ser.getDescipcion()%> </td>
                                <td>Q<%=ser.getPrecio()%>.00</td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.3/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  
    </body>
    
</html>
