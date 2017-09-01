/**
 * La clase Libro fue creada para simular un libro.
 * El constructor recibe como parametros el titulo,autor y paginas del libro.
 * @param tituloLibro,autorLibro,paginasLibro.
 * 
 * 
 * @author Nancy Vazquez
 * @version 8.24.17
 */
public class Libro
{
    // variables de instancia 
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    private int prestamos;
   
    //Constructor
    public Libro(String tituloLibro, String autorLibro, int paginasLibro)
    {
        // inicializar variables de instancia
        titulo = tituloLibro;
        autor= autorLibro;
        paginas=paginasLibro;
        numeroDeReferencia="";
        prestamos=0;
    }
    /**
     * El metodo de acceso dimeAutor permite dar a conocer el nombre del autor del libro
     * No recibe parametros
     * @return la variable autor.
     */
    // Metodo de Acceso
    public String dimeAutor()
    {
        return autor;
    }
    /**
     * El metodo de acceso dimeTitulo permite conocer el nombre del titulo del libro.
     * No recibe parametros
     * @return la variable titulo.
     */
    // Metodo de Acceso
    public String dimeTitulo()
    {
        return titulo;
    }
    
    /**
     * El metodo de acceso dimePaginas permite conocer el numero de paginas que contiene el libro.
     * No recibe parametros
     * @return la variable paginas
     */
     // Metodo de Acceso
    public int dimePaginas()
    {
        return paginas;
    }
    
    /**
     * El metodo de acceso dimeDetalles permite conocer la informacion del libro ( titulo,autor, numero de paginas, numero de referencia).
     * En caso de que la varible de numReferencia se encuentre vacia mostara en dicho campo "ZZZ", 
     * No recibe parametros.
     * @return la variable detalles
     */
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
    /**
     * El metodo de modificacion permite cambiar el numero de referencia, ya que fue iniciado vacio,
     * @param numRef que es la varible en la que se guardara el nuevo numero de referencia del libro.
     * No retorna nada.
     */
    //Metodo de modificacion
    public void cambiaNumRef(String numRef)
    {
        if(numRef.length()>3)
        {
            numeroDeReferencia=numRef;
        }
    }
    /**
     * El metodo de acceso dimeNumRef permite conocer el numero de referencia del libro.
     * No recibe parametros.
     * @return la variable numeroDeReferencia
     */
    //Metodo de Acceso
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    /**
     * El metodo de modificacion permite aumentar el numero de prestamos del libro.
     * No recibe parametros
     * No retorna
     */
    //Metodo de Modificacion
    public void prestar()
    {
        prestamos++;
    }
    /**
     * El metodo de acceso permite informar del numero de veces que fue prestado el libro,
     * No recibe parametros
     * @return la variable prestamos
     */
    //Metodo de Acceso
    public int dimePrestamos()
    {
        return prestamos;
    }
}   