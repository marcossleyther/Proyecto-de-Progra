<%-- 
    Document   : index
    Created on : 6/09/2020, 19:10:51
    Author     : Sleyther
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 6</title>
    </head>
    <body>
        <h1>Hola Amigo Bienvenido a mi pagina</h1>
        <hr>

        <form name="Formulario" action="salida.jsp">
            <label>¿Como te llamas?:</label>
            <input type="text" name="nombre" required>

            <p>Nos gustaria saber mas de ti, que tipo de frutas de gustan?</p>
            <u> 
                <legend>Listado de elementos a seleccionar</legend>
                <li>
                    <input type="checkbox" name="opCurso" value="Pera">
                    <label>Pera</label>
                    
                </li><li>
                    <input type="checkbox" name="opCurso" value="Manzana">
                    <label>Manzana</label>
                    
                </li><li>
                    <input type="checkbox" name="opCurso" value="Naranja">
                    <label>Naranja</label>
                </li><li>
                    <input type="checkbox" name="opCurso" value="Uva">
                    <label>Uva</label>
                </li><li>
                    <input type="checkbox" name="opCurso" value="Mandarina">
                    <label>Mandarina</label>
                </li>
            </u>
            <p></p>
            <button>Responder</button>
        </form

    </body>
</html>
