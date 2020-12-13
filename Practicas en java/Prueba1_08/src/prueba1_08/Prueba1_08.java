package prueba1_08;

import java.util.Scanner;


public class Prueba1_08 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero;

        do{
            System.out.println("Ingrese en numero: ");
        numero = leer.nextInt();
            double raiz = Math.sqrt(numero);
        System.out.println("El cuadrado del numero es:"+raiz);
   
        }
        while(numero>0);
        System.out.println("Salida");
    }
    
}
