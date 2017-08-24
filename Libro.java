
public class Libro
{
    // variables de instancia 
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    

    //Constructor
    public Libro(String tituloLibro, String autorLibro, int paginasLibro)
    {
        // inicializar variables de instancia
        titulo = tituloLibro;
        autor= autorLibro;
        paginas=paginasLibro;
        numeroDeReferencia=" ";
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
        if(numeroDeReferencia.length()!=0)
        {
            detalles="Titulo:"+titulo+","+"Autor:"+autor+","+"Paginas:"+paginas+","+"Numero de refencia"+numeroDeReferencia;
        }
        else
            {
                detalles="Titulo:"+titulo+","+"Autor:"+autor+","+"Paginas:"+paginas+","+"ZZZ";
            }
        
        
        return detalles;
    }
    
    //Metodo de modificacion
    public void cambiaNumRef(String numRef)
    {
        if(numRef.length()>3)
        {
            numeroDeReferencia=numRef;
        }
    }
    
    //Metodo de Acceso
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }

}   