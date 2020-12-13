//************************* Clase Escuela ************************************************
package ejercicioii03_08;

public class Escuela {
    private int id;
    String nombre;
    
    Cafe cafe;
    public Escuela(Cafe c){
        cafe = c;
    }
    Biblioteca biblioteca;
    public Escuela(Biblioteca b){
        biblioteca = b;
    }
    
}
