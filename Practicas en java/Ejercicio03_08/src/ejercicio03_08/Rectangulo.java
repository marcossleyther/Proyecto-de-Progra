//************************* Clase Rectangulo ************************************************
package ejercicio03_08;


public class Rectangulo {
    private int id;
    String nombre;

    public Rectangulo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    Estilo styler;
    Rectangulo(Estilo e){
        this.styler = e;
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
