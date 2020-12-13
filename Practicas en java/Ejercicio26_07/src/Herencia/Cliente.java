//Clase Hija Cliente---------------------------------------------------------------------
package Herencia;
public class Cliente extends Persona {
    private String categoria;
    private int codigo;

    public Cliente(String categoria, int codigo, String nombre, String apellido, String tipo, int documento) {
        super(nombre, apellido, tipo, documento);
        this.categoria = categoria;
        this.codigo = codigo;
    }
    
    public void generarcodigo(){
        System.out.println("Nombre: "+getNombre()+ "\nApellido: "+getApellido()+ "\nCodigo del cliente: " +codigo);
        System.out.println("Categoria del Cliente"+categoria+"\nTipo de Identificacion: "+getTipo()+"\nNo. Identificacion: "+getDocumento());
    }
}
