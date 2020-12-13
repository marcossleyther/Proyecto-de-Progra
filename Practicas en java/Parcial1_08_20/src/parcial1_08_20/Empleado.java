//Examen Parcia 1 de Programacion 2 Agosto2020
//Marcos Sleyther Castellanos Lemus 6990-19-9299
package parcial1_08_20;
import java.util.Scanner;

//Clase Empleado
public class Empleado{
    //Atributos de la clase
    private String nombre;
    private String cedula;
    private int edad;
    private String direccion;
    private double salario;

    //Constructor con Parametros
    public Empleado(String nombre, String cedula, int edad, String direccion, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.direccion = direccion;
        this.salario = salario;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Metodo para clasificar de acuerdo a la edad
    public void Clasificar(int edad){
        if(edad >=15 && edad<=20){
            System.out.println("Principiante");
        } else if(edad>20 && edad<=35){
            System.out.println("Intermedio");
        }else if(edad>35 && edad<=100){
            System.out.println("Senior");
        }
        else{
            System.out.println("Fuera de Rango!!!\nAplican edades entre 15 y 100");
        }
    }

    
    //Principal**************************************
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("COMPLETE LOS SIGUIENTES DATOS: \n");
        //Ingreso de datos para Empleado 1
        System.out.println("Para el Primer Empleado: ");
        System.out.println("------------------------------------");
        System.out.println("Nombre: ");
        String nombreEmp1 = dato.nextLine();
        System.out.println("Cedula: ");
        String cedulaEmp1 = dato.nextLine();
        System.out.println("Edad: ");
        int edadEmp1 = dato.nextInt();
        dato.nextLine();
        System.out.println("Direccion: ");
        String direccionEmp1 = dato.nextLine();
        System.out.println("Sueldo: ");
        double sueldoEmp1 = dato.nextDouble();
        Empleado Emp1 = new Empleado(nombreEmp1,cedulaEmp1,edadEmp1,direccionEmp1,sueldoEmp1);
        
        //Ingreso de datos para Empleado 2
        System.out.println("\nPara el Segundo Empleado: ");
        System.out.println("------------------------------------");
        dato.nextLine();
        System.out.println("Nombre: ");
        String nombreEmp2 = dato.nextLine();
        System.out.println("Cedula: ");
        String cedulaEmp2 = dato.nextLine();
        System.out.println("Edad: ");
        int edadEmp2 = dato.nextInt();
        dato.nextLine();
        System.out.println("Direccion: ");
        String direccionEmp2 = dato.nextLine();
        System.out.println("Sueldo: ");
        double sueldoEmp2 = dato.nextDouble();
        Empleado Emp2 = new Empleado(nombreEmp2,cedulaEmp2,edadEmp2,direccionEmp2,sueldoEmp2);
        
        //Ingreso de datos para Empleado 3
        System.out.println("\nPara el Tercer Empleado: ");
        System.out.println("------------------------------------");
        dato.nextLine();
        System.out.println("Nombre: ");
        String nombreEmp3 = dato.nextLine();
        System.out.println("Cedula: ");
        String cedulaEmp3 = dato.nextLine();
        System.out.println("Edad: ");
        int edadEmp3 = dato.nextInt();
        dato.nextLine();
        System.out.println("Direccion: ");
        String direccionEmp3 = dato.nextLine();
        System.out.println("Sueldo: ");
        double sueldoEmp3 = dato.nextDouble();
        Empleado Emp3 = new Empleado(nombreEmp3,cedulaEmp3,edadEmp3,direccionEmp3,sueldoEmp3);
        
        //Mostrando los datos de los 3 empleados en forma de tabla
        System.out.println("\nDATOS DE LOS EMPLEADOS");
        System.out.println("-----------------------");
        System.out.println("Nombre:         Cedula:     Edad:       Direccion:      Sueldo:        Clasificacion:");
        
        System.out.print("1. "+Emp1.getNombre()+"             "+Emp1.getCedula()+"          "+Emp1.getEdad()+"        "+
        Emp1.getDireccion()+"          "+Emp1.getSalario()+"       "); Emp1.Clasificar(edadEmp1);
        
        System.out.print("\n2. "+Emp2.getNombre()+"             "+Emp2.getCedula()+"          "+Emp2.getEdad()+"        "+
        Emp2.getDireccion()+"         "+Emp2.getSalario()+"       "); Emp2.Clasificar(edadEmp2);
        
        System.out.print("\n3. "+Emp3.getNombre()+"             "+Emp3.getCedula()+"          "+Emp3.getEdad()+"        "+
        Emp3.getDireccion()+"          "+Emp3.getSalario()+"       "); Emp2.Clasificar(edadEmp3);
    }
}