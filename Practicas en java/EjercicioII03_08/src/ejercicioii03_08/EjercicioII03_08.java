//************************* Clase Principal ************************************************
package ejercicioii03_08;


public class EjercicioII03_08 {

  
    public static void main(String[] args) {
        Cafe coffe = new Cafe(125,"Mañanero");
        Biblioteca library = new Biblioteca(145,"Happy Book");
        Escuela escuelaCof = new Escuela(coffe);
        Escuela escuelaLib = new Escuela(library);
        
        System.out.println("Cafeteria: "+escuelaCof.cafe.getNombre());
        System.out.println("Biblioteca: "+escuelaLib.biblioteca.getNombre());
        
    }
    
}
