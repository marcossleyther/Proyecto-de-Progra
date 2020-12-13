package ejercicio18_07;

import java.util.Scanner;

/**
 *
 * @author Sleyther
 */

public class Estudiante{
    private String carne;
    private String nombre;
    private String apellido;
    private String carrera;
    private String direccion;
    private String celular;
    private String email;
    
    public Estudiante(){}
    
    public Estudiante (String carne, String nombre, String apellido, String carrera, String direccion, String celular, String email){
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
    }
    
    //Copia
    public Estudiante(Estudiante estudiante){
        this.carne = estudiante.carne;
        this.nombre = estudiante.nombre;
        this.apellido = estudiante.apellido;
        this.carrera = estudiante.carrera;
        this.direccion = estudiante.direccion;
        this.celular = estudiante.celular;
        this.email = estudiante.email;
    }
    
    
    public String getCarne() {
        return carne;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    public static void main(String[] args) {
    String carne, nombre, apellido, carrera, direccion, celular, email;
   
        Scanner datos = new Scanner(System.in);
    
         System.out.println("Ingrese su Carne: ");
         carne = datos.nextLine();
         
         System.out.println("Ingrese su Nombre: ");
         nombre = datos.nextLine();
    
         System.out.println("Ingrese su Apellido: ");
         apellido = datos.nextLine();
    
         System.out.println("Ingrese su Carrera: ");
         carrera = datos.nextLine();
         
         System.out.println("Ingrese su Direccion: ");
         direccion = datos.nextLine();
    
         System.out.println("Ingrese su Celular: ");
         celular = datos.nextLine();
    
         System.out.println("Ingrese su E-mail: ");
         email = datos.nextLine();
         
         Estudiante objEstudiante = new Estudiante(carne,nombre,apellido,carrera,direccion,celular,email);
         
         Estudiante copiaEstudiante = new Estudiante(objEstudiante);
         
        System.out.println("Bienvenido: "+copiaEstudiante.getNombre()+" "+copiaEstudiante.getApellido());
        System.out.println("Su numero de carne es: "+copiaEstudiante.getCarne());
        System.out.println("Pertenece a la carrera: "+copiaEstudiante.getCarrera());
        System.out.println("Su direccion: "+copiaEstudiante.getDireccion()+" y correo electronico: "+copiaEstudiante.getEmail());
     }
}