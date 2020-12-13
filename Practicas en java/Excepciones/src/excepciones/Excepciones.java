package excepciones;

public class Excepciones {

    private static int Exc() {

        int valor = 0;

        try {
            valor = valor + 1;

            valor = valor + Integer.parseInt("42");
            valor = valor + 1;

            System.out.println("Valor al final del try : " + valor);
        } catch (NumberFormatException e) {

            valor = valor + Integer.parseInt("42");

            System.out.println("Valor al final del catch: " + valor);

        } finally {

            valor = valor + 1;

            System.out.println("Valor al final de finally: " + valor);
        }
            valor = valor + 1;
            System.out.println(" Valor antes del return: " + valor);
            return valor;
        }
    
       
    public static void main(String[] arg) {
        try {

            System.out.println(Exc());

        } catch (Exception e) {
            System.err.println("Excepcion en metodo ()");
            e.printStackTrace();

        }
    }

  

}
