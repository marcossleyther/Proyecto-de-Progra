//Clase Hija Empleado-------------------------------------------------------
package Herencia;

public class Empleado extends Persona {
    private String tipocontrato;
    private int sueldo;

    public Empleado(String tipocontrato, int sueldo, String nombre, String apellido, String tipo, int documento) {
        super(nombre, apellido, tipo, documento);
        this.tipocontrato = tipocontrato;
        this.sueldo = sueldo;
    }
    
    public void calcularSueldo(){
        System.out.println("Nombre: "+getNombre()+ "\nApellido: "+getApellido()+ "\nSalario Mensual Q." +sueldo);
        System.out.println("Tipo de Contrato"+tipocontrato+"\nTipo de Identificacion: "+getTipo()+"\nNo. Identificacion: "+getDocumento());
    } 
}
    

