package laboratorio1;

//Clase Cancion
public class Cancion {
    private String title;
    private String author;
    
//Constructor
    public Cancion(String title, String author){
    this.title = title;
    this.author = author;
    } 
    
    //Devuelve titulo
    public String getTitle() {
        return title;
    }
    //Devuelve autor
    public String getAuthor() {
        return author;
    }
    //Establece titulo
    public void setTitle(String title) {
        this.title = title;
    }
    //Establece autor
    public void setAuthor(String author) {
        this.author = author;
    }
    //Funcnion Principal
    public static void main(String[] args) {
        Cancion cancion = new Cancion("La llorona","Ernesto de la Cruz");
        
        System.out.println("Cancion: '"+cancion.getTitle()+"' fue escrita por: '"+cancion.getAuthor()+"'");
    }
}

