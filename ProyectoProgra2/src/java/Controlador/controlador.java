/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Config.GenerarSerie;
import Modelo.Habitacion;
import Modelo.HabitacionDao;
import Modelo.VentaDAO;
import Modelo.huesped;
import Modelo.huespedDao;
import Modelo.reserva;
import Modelo.reservadao;
import Modelo.servicio;
import Modelo.servicioDao;
import Modelo.venta;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Adrian
 */
public class controlador extends HttpServlet {

    huesped hues = new huesped();
    huespedDao huesdao = new huespedDao();
    Habitacion hab = new Habitacion();
    HabitacionDao habdao = new HabitacionDao();
    servicio ser = new servicio();
    servicioDao serdao = new servicioDao();
    venta v = new venta();
    List<venta> lista = new ArrayList<>();
    huesped hues1 = new huesped();
    int item;
    int cod;
    int cod1;
    String descripcion;
    int precio;
    int cantidad;
    int subtotal;
    int idh;
    int idhab;
    int totalPagar;
    int idl;
    String numeroserie;
    VentaDAO vdao = new VentaDAO();
    VentaDAO vdao2 = new VentaDAO();
    reserva reser = new reserva();
    reservadao reserdao = new reservadao();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("Clientes")) {

            switch (accion) {
                case "Listar":
                    List lista = huesdao.listar();
                    request.setAttribute("huespedes", lista);
                    break;
                case "Agregar":
                    String nombre = request.getParameter("txtnom");
                    String apellido = request.getParameter("txtapellido");
                    String Direccion = request.getParameter("txtDireccion");
                    hues.setNombre(nombre);
                    hues.setApellido(apellido);
                    hues.setDireccion(Direccion);
                    huesdao.agregar(hues);
                    request.getRequestDispatcher("controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    idh = Integer.parseInt(request.getParameter("id"));
                    huesped hes = huesdao.list(idh);
                    request.setAttribute("hues", hes);
                    request.getRequestDispatcher("controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    String nombre1 = request.getParameter("txtnom");
                    String apellido1 = request.getParameter("txtapellido");
                    String Direccion1 = request.getParameter("txtDireccion");
                    hues.setNombre(nombre1);
                    hues.setApellido(apellido1);
                    hues.setDireccion(Direccion1);
                    hues.setId(idh);
                    huesdao.actualizar(hues);
                    request.getRequestDispatcher("controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;

                case "Borrar":
                    idh = Integer.parseInt(request.getParameter("id"));
                    huesdao.delete(idh);
                    request.getRequestDispatcher("controlador?menu=Clientes&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }
        if (menu.equals("Habitaciones")) {

            switch (accion) {
                case "Listar":
                    request.getRequestDispatcher("Habitaciones.jsp").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }

        }
        if (menu.equals("Facturacion")) {
            switch (accion) {
                case "BuscarCliente":
                    int idf = Integer.parseInt(request.getParameter("codigocliente"));
                    hues.setId(idf);
                    hues = huesdao.list(idf);
                    request.setAttribute("c", hues);
                    request.setAttribute("totalPagar", totalPagar);
                    request.setAttribute("nserie", numeroserie);
                    break;

                case "BuscarHabitacion":
                    int id = Integer.parseInt(request.getParameter("codigohabitacion"));
                    hab = habdao.list(id);
                    request.setAttribute("c", hues);
                    request.setAttribute("habitacion", hab);
                    request.setAttribute("lista", lista);
                    request.setAttribute("totalPagar", totalPagar);
                    request.setAttribute("nserie", numeroserie);
                    break;

                case "BuscarSerivicio":
                    int ids = Integer.parseInt(request.getParameter("codigoservicio"));
                    ser = serdao.list(ids);
                    request.setAttribute("c", hues);
                    request.setAttribute("servicio", ser);
                    request.setAttribute("lista", lista);
                    request.setAttribute("totalPagar", totalPagar);
                    request.setAttribute("nserie", numeroserie);
                    break;

                case "AgregarH":
                    request.setAttribute("c", hues);
                    totalPagar = 0;
                    item = item + 1;
                    cod = hab.getId();
                    descripcion = request.getParameter("nombreshabitacion");
                    precio = Integer.parseInt(request.getParameter("precio"));
                    cantidad = Integer.parseInt(request.getParameter("cantidadh"));
                    subtotal = precio * cantidad;
                    v = new venta();
                    v.setItem(item);
                    v.setIdhabitacion(cod);
                    v.setDescripcion(descripcion);
                    v.setCantidad(cantidad);
                    v.setSubtotal(subtotal);
                    lista.add(v);
                    for (int i = 0; i < lista.size(); i++) {
                        totalPagar = totalPagar + lista.get(i).getSubtotal();
                    }
                    request.setAttribute("servicio", ser);
                    request.setAttribute("nserie", numeroserie);
                    request.setAttribute("totalPagar", totalPagar);
                    request.setAttribute("lista", lista);

                    break;
                case "Agregars":
                    request.setAttribute("c", hues);
                    totalPagar = 0;
                    item = item + 1;
                    cod1 = ser.getId();
                    descripcion = request.getParameter("desservicio");
                    precio = Integer.parseInt(request.getParameter("precios"));
                    cantidad = Integer.parseInt(request.getParameter("cantidads"));
                    subtotal = precio * cantidad;
                    v = new venta();
                    v.setItem(item);
                    v.setIdservicio(cod1);
                    v.setDescripcion(descripcion);
                    v.setCantidad(cantidad);
                    v.setSubtotal(subtotal);
                    lista.add(v);
                    for (int i = 0; i < lista.size(); i++) {
                        totalPagar = totalPagar + lista.get(i).getSubtotal();
                    }
                    request.setAttribute("servicio", ser);
                    request.setAttribute("nserie", numeroserie);
                    request.setAttribute("totalPagar", totalPagar);
                    request.setAttribute("lista", lista);
                    
                    break;
                case "GenerarVenta":
                    //Guardar Venta
                    v.setIdhuesped(hues.getId());
                    v.setNumserie(numeroserie);
                    java.util.Date ahora=new java.util.Date();
                    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyy");
                    v.setFecha(formateador.format(ahora));
                    v.setMonto(totalPagar);
                    vdao.guardadrVenta(v);
                    lista = new ArrayList<>();
                    totalPagar = 0;
                    //Guardar Detalle de la ventas
                    int idv = Integer.parseInt(vdao.IdVentas());
                    for (int i = 0; i < lista.size(); i++) {
                        v = new venta();
                        v.setId(idv);
                        v.setIdhabitacion(lista.get(i).getIdhabitacion());
                        v.setIdservicio(lista.get(i).getIdservicio());
                        v.setCantidad(lista.get(i).getCantidad());
                        v.setPrecio(lista.get(i).getPrecio());
                        vdao.guardarDetalleventas(v);
                    }
                    break;

                default:
                    v = new venta();
                    lista = new ArrayList<>();
                    item = 0;
                    totalPagar = 0;
                    numeroserie = vdao.GenerarSerie();
                    if (numeroserie == null) {
                        numeroserie = "000000001";
                        request.setAttribute("nserie", numeroserie);
                    } else {
                        int incrementar = Integer.parseInt(numeroserie);
                        numeroserie = vdao2.NumeroSerie(incrementar);
                        request.setAttribute("nserie", numeroserie);
                    }

                    request.getRequestDispatcher("Facturacion.jsp").forward(request, response);
            }

            request.getRequestDispatcher("Facturacion.jsp").forward(request, response);
        }

        

        if (menu.equals("servicios")) {

            switch (accion) {
                case "nservicios":

                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("servicios.jsp").forward(request, response);
        }

        if (menu.equals("Historial")) {
            request.getRequestDispatcher("Historial.jsp").forward(request, response);
        }
        if (menu.equals("Reservacion")) {

            switch (accion) {
                case "Buscar":
                    int idf = Integer.parseInt(request.getParameter("codigocliente"));
                    hues.setId(idf);
                    hues = huesdao.list(idf);
                    request.setAttribute("habitacion", hab);
                    request.setAttribute("c", hues);
                    break;
                case "BuscarHabitacion":
                    int id = Integer.parseInt(request.getParameter("codigohabitacion"));
                    hab = habdao.list(id);
                    request.setAttribute("c", hues);
                    request.setAttribute("habitacion", hab);
                    break;

                case "reservar":
                    int idhues = Integer.parseInt(request.getParameter("codigocliente"));
                    int idr = Integer.parseInt(request.getParameter("codigohabitacion"));
                    String inicio = request.getParameter("txtinicio");
                    String fin = request.getParameter("txtfin");
                    Habitacion h = new Habitacion();
                    h.setId(idr);
                    habdao.reservar(h);
                    reser.setIdHuesped(idhues);
                    reser.setIdHabitacion(idr);
                    reser.setInicior(inicio);
                    reser.setFinr(fin);
                    reserdao.agregar(reser);
                    break;
                case "liberar":
                    int idl = Integer.parseInt(request.getParameter("codigohabitacion"));
                    Habitacion hl = new Habitacion();
                    hl.setId(idl);
                    habdao.liberar(hl);
            }
            request.getRequestDispatcher("Habitaciones.jsp").forward(request, response);
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
