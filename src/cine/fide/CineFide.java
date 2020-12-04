/*

 */
package cine.fide;

import javax.swing.JOptionPane;

public class CineFide 
{

    public static void main(String[] args) 
    {
        
        CineFide Cartelera = new CineFide();
        Boleteria boleteria = new Boleteria();
        
        Administracion administracion = new Administracion();
        boolean op = true;

        do {

            int acc = Integer.parseInt(JOptionPane.showInputDialog("1. Administrar cartelera" + "\n"
                    + "2. Reservar espacios" + "\n"
                    + "3. Salir"));
            switch (acc) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Esta opción es solo para la administración del Cine");

                    int con = 0;
                    int i = 3;
                    while (con < 3) 
                    {
                        int password = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el pin para ingresar"));

                        if (password != 7070) 
                        {

                            JOptionPane.showMessageDialog(null, "Contresañe incorrecta");
                            JOptionPane.showMessageDialog(null, "Intentos restantes: " + (--i));
                            con++;

                        } 
                        else 
                        {
                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de salas que desea registrar"));

                            administracion = new Administracion(cantidad);
                            for (int j = 0; j < cantidad; j++) 
                            {
                                JOptionPane.showMessageDialog(null, "Ingrese la informacion de la sala #" + (i++));
                                String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula que desea ingresar");
                            
                            String dia = JOptionPane.showInputDialog("Ingrese el dia que se transmitirá la pelicula");
                            String hora = JOptionPane.showInputDialog("Ingrese la hora de la transmisión");
                            int numeroDeSala = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de sala"));
                            int precioPelicula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de la pelicula"));
                            administracion.Ingresar(hora, dia, hora, numeroDeSala, precioPelicula);
                            }

                            con = 4;
                        }
                    }
                    op = true;
                    break;
                    
            
                case 2:
                 
                default:
                    
            }
        } while (op == true);

        }
        
    
   
        
    

}
