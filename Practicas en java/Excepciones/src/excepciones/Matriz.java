/*El programa cuenta con un arreglo definido de 4 posiciones del 0 al 3
solicita al usuario que ingrese la posicion del arreglo, para imprimir en 
pantalla el valor que tiene dicha posicion, pero cuando el valor sea mayor que 3, 
este mostrara una Excepcion de tipo ArrayIndexOutOfBoundsException, ya que la
posicion 4 no existe en el arreglo, y saldra del programa*/
package excepciones;

import java.util.Scanner;

public class Matriz {
//Metodo Vector

    private void Vector() {
        int matriz[] = {18, 41, 20, 33};
        int pos;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese la posicion del vector que desea ver: ");
            pos = entrada.nextInt();

            try {
                System.out.println("Valor de la Posicion " + pos + " es: " + matriz[pos]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No existe la posicion " +pos+ ". El Array tiene 4 Posiciones (0,3)");
                System.out.println("Tipo de Error: " + e);
            }

        } while (pos >= 0 && pos<4);
    }

    //Principal
    public static void main(String[] args) {
        Matriz m = new Matriz();
        m.Vector();
    }
}
