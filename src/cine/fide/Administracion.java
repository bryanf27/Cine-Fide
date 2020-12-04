/*

 */
package cine.fide;


public class Administracion 
{
    Peliculas cartelera[];
    int espacios[];
    
    
    
    public Administracion()
   {
   
   }
    public Administracion (int cantidad)
   {
    cartelera = new Peliculas[cantidad];  
    
   }
    
    
    public void Ingresar(String nombre, String dia, String hora, int numeroDeSala, int precioPelicula)
    {
    
    Peliculas peliculas = new Peliculas(nombre, dia, hora, numeroDeSala, precioPelicula);
        
    }
    

   
}
