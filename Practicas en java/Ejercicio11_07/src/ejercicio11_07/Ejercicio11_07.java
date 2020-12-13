/*
//Uso del DO While
//Pregunta al usuario nombre y edad hasta que sea >= de 18
package ejercicio11_07;
import java.util.Scanner;
public class Ejercicio11_07 {
    public static void main(String[] args) {
        
      Scanner a = new Scanner(System.in);
      
      int num;
        System.out.println("Ingrese su nombre: ");
        String nombre = a.nextLine();
      
        do{
            System.out.println("Ingrese su Edad en numeros: ");
            num = a.nextInt();
          }
        while(num < 18);
        
        System.out.println("Bienvenido(a) "+nombre+" tienes "+num+" años !Ya eres mayor de Edad¡");
    }   
}
*/

/*
//USO DEL WHILE
//Muestra la tabla de multiplicar hasta 10 que pida el usuario
package ejercicio11_07;
import java.util.Scanner;
public class Ejercicio11_07 {
    public static void main(String[] args) {
        
      Scanner a = new Scanner(System.in);
 
      int num, i=1, ax;
      System.out.println("Que tabla de multiplicar desea ver: ");
        num = a.nextInt();
        
        System.out.println("La tabla del "+num+" hasta el 10 es:");
      while(i<=10){
      ax = num* i;
          System.out.println(num+" * " +i+ " = "+ax);
          i++;
     }
    }
}
*/