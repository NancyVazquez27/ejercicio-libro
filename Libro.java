
public class Libro
{
    // variables de instancia 
    private String titulo;
    private String autor;
    private int paginas;
    

    //Constructor
    public Libro(String tituloLibro, String autorLibro, int paginasLibro)
    {
        // inicializar variables de instancia
        titulo = tituloLibro;
        autor= autorLibro;
        paginas=paginasLibro;
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
    
     // Metodo de Acceso
    public int dimePaginas()
    {
        return paginas;
    }
    
    //Metodo de Acceso
    public String dimeDetalles()
    {
        String detalles;
        
        detalles="Titulo:"+titulo+","+"Autor:"+autor+","+"Paginas:"+paginas;
        
        return detalles;
    }

}   