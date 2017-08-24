
public class Libro
{
    // variables de instancia 
    private String titulo;
    private String autor;
    

    //Constructor
    public Libro(String tituloLibro, String autorLibro)
    {
        // inicializar variables de instancia
        titulo = tituloLibro;
        autor= autorLibro;
    }
    
    // Metodo de Acceso
    public String dimeAutor()
    {
        return autor;
    }
    
    // Metodo de Acceso
    public String dimeTitulo()
    {
        return titulo;
    }

}   