/*

 */
package cine.fide;




public class Peliculas 
{
    private String nombre;
    private String dia;
    private String hora;
    private int numeroDeSala;
    private int precioPelicula;
    
    
   public Peliculas()
   {
       
   }
   public Peliculas(String nombre, String dia, String hora, int numeroDeSala, int precioPelicula )
   {
       this.nombre = nombre;
       this.dia = dia;
       this.hora = hora;
       this.numeroDeSala = numeroDeSala;
       this.precioPelicula = precioPelicula;
   }
   
   public String toString() 
   {
        
        return "Sala #" + numeroDeSala + "\n" +
                "Nombre de pelicula: " + nombre +"\n" +
                "dia " + dia +"\n" +
                "hora : " + hora +"\n" +"\n"  ;
                
    }

    public int getPrecioPelicula() {
        return precioPelicula;
    }

    public void setPrecioPelicula(int precioPelicula) {
        this.precioPelicula = precioPelicula;
    }
   
   
   

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDia() 
    {
        return dia;
    }

    public void setDia(String dia) 
    {
        this.dia = dia;
    }

    public String getHora() 
    {
        return hora;
    }

    public void setHora(String hora) 
    {
        this.hora = hora;
    }

    public int getNumeroDeSala() 
    {
        return numeroDeSala;
    }

    public void setNumeroDeSala(int numeroDeSala) 
    {
        this.numeroDeSala = numeroDeSala;
    }
    
            
    
}
