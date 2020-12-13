//************************* Clase Circulo ************************************************
package ejercicio03_08;


public class Circulo {
    private int id;
    private String nombre;

    public Circulo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    Estilo stylec;
    Circulo(Estilo e){
        this.stylec = e;
    }
    
   Punto point = new Punto();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    
}
