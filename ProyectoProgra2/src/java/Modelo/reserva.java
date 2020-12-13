/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Adrian
 */
public class reserva {
    int idRegistro;
    int idreserva;
    String inicior;
    String finr;

   
    public reserva(int idreserva,int idRegistro, String inicior, String finr, int idHuesped, int idHabitacion) {
        this.idreserva=idreserva;
        this.idRegistro = idRegistro;
        this.inicior = inicior;
        this.finr = finr;
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getInicior() {
        return inicior;
    }

    public void setInicior(String inicior) {
        this.inicior = inicior;
    }

    public String getFinr() {
        return finr;
    }

    public void setFinr(String finr) {
        this.finr = finr;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    
     public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }
    int idHuesped;
    int idHabitacion;

    public reserva() {
    }

    
}
