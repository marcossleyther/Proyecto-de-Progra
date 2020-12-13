//************************* Clase Fugura ************************************************
package ejercicio03_08;

public class Figura {
    private int id;
    private String tipo;
    private String nombre;
    
    
    Rectangulo rect;
    Circulo circ;
    
    public Figura(Rectangulo r){
        this.rect = r;
    }
    public Figura(Circulo c){
        this.circ = c;
    }
  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
