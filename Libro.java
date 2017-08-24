
public class Libro
{
    // variables de instancia 
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    int prestamos;
   
    //Constructor
    public Libro(String tituloLibro, String autorLibro, int paginasLibro)
    {
        // inicializar variables de instancia
        titulo = tituloLibro;
        autor= autorLibro;
        paginas=paginasLibro;
        numeroDeReferencia=" ";
        prestamos=0;
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
            detalles="Titulo:"+titulo+","+"Autor:"+autor+","+"Paginas:"+paginas+","+"Numero de refencia"+numeroDeReferencia+","+"Prestamos:"+prestamos;
        }
        else
            {
                detalles="Titulo:"+titulo+","+"Autor:"+autor+","+"Paginas:"+paginas+","+"ZZZ"+","+"Prestamos:"+prestamos;
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
    
    //Metodo de Modificacion
    public void prestar()
    {
        prestamos++;
    }
    
    //Metodo de Acceso
    public int dimePrestamos()
    {
        return prestamos;
    }
}   