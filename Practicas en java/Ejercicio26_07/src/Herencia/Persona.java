//Super Clase Persona
package Herencia;

public class Persona {
    private String nombre;
    private String apellido;
    private String tipo;
    private int documento;

    public Persona(String nombre, String apellido, String tipo, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDocumento() {
        return documento;
    }  
}
