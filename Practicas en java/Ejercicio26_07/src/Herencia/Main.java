//Principal ---------------------------------------------------------------------
package Herencia;
public class Main {
    public static void main(String[] args){
        
        System.out.println("Datos del Cliente");
        Cliente cliente = new Cliente("Pro",245612,"Sleyther","Lemus","Dpi",2306120);
        cliente.generarcodigo();
        
        System.out.println("\nDatos del Empleado");
        Empleado empleado = new Empleado("Temporal",4500 , "Marcos", "Castellanos", "DPI", 2356230);
        empleado.calcularSueldo();
    }     
    }
    

