
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Hotel</title>
<!-- Pagina Principal de la aplicacion contiene todos los menus tomando los datos y riderecionandolos al controlador -->
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <a style="margin-left: 10px;border: none" class="btn btn-outline-light" >Hotel</a>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ">
                    <!-- Menu que toma la eleccion de un Huesped y lo riderecciona a la vista de creacion -->
                    <li class="nav-item">
                       <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="controlador?menu=Clientes&accion=Listar" target="myFrame">Registrar Huesped</a>
                    </li>
                    <li class="nav-item active">
                        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="controlador?menu=Habitaciones&accion=Listar" target="myFrame">Reservaciones</a>
                    </li>
                    <li class="nav-item active">
                        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="controlador?menu=servicios&accion=nservicios" target="myFrame">Servicios</a>
                    </li>
                    <li class="nav-item active">
                        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="controlador?menu=Facturacion&accion=default" target="myFrame">Facturacion</a>
                    </li>
                    <li class="nav-item active">
                        <a style="margin-left: 10px;border: none" class="btn btn-outline-light" href="controlador?menu=Historial&accion=default" target="myFrame">Historial</a>
                    </li>
                </ul>
            </div>
            <div class="dropdown ">
                <button style="border:none"  class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    ${usuario.getNom()}
                </button>
                <div class="dropdown-menu text-center" >
                    <a class="dropdown-item" href="#">
                        <img src="img/png-transparent-user-profile-aurangabad-computer-icons-great-value-blue-service-logo.png" alt="60" width="60"/>
                    </a>
                    <a class="dropdown-item" href="#">${usuario.getUser()}</a>
                    <a class="dropdown-item" href="#"></a>
                    <div class="dropdown-divider"></div>
                    <form action="Validar" method="POST">
                        <button name="accion" value="Salir" class="dropdown-item" href="">Salir</button>
                    </form>

                </div>
            </div>
        </nav>
        <div  class="m-4" style="height: 550px">
            <iframe name="myFrame" style="height: 100%;width: 100%; border:none"></iframe>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.3/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
