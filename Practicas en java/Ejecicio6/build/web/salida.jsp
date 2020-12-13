<%-- 
    Document   : salida
    Created on : 6/09/2020, 19:13:16
    Author     : Sleyther
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuestas</title>
    </head>
    <body>
        <h1>Gracias por la respuesta Amigo</h1>
        <hr>

        <%
            String nombre = request.getParameter("nombre");
            out.println("Que gusto que nos hayas visitado " + nombre);
        %>

        
        <ul>
            <%        
                String[] SeleccionCheck = request.getParameterValues("opCurso");
                if (SeleccionCheck != null) {
                    out.print("Ahora sabremos que te gustan las frutas:");
                    for (int i = 0; i < SeleccionCheck.length; i++) {
            %><li>                   
                <%        
                    out.print(SeleccionCheck[i]);
                %>

            </li>
            <%        
                    }
                } else {
                    out.print("No te gusta ninguna Fruta, !Debes comer sano¡");
                }
            %>

        </ul>
    </body>
</html>
