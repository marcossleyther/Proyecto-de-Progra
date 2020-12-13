//************************* Clase Principal ************************************************
package ejercicio03_08;


public class Main {

   
    public static void main(String[] args) {
        Circulo miCir = new Circulo(123,"Circulo");
        Rectangulo miRec = new Rectangulo(1214,"Rectangulo");
        
        Figura FigCir = new Figura(miCir);
        Figura FigRec = new Figura(miRec);
      
  
        System.out.println(FigCir.circ.getNombre());
        
    
        System.out.println(FigRec.rect.getNombre());
       
        
    }
    
}
