/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdelogica;

/**
 *
 * @author Natalia
 */
public class EjercicioSeis {
    
    public static void main(String[] args) {
        String[] datos=new String[5]; 
      String [] informacion= new String [5]; 
        datos[0]="id ";
        datos[1]="Nombre";
        datos[2]="Apellido";
        datos[3]="Email"; 
        datos[4]="Contraseña"; 
        informacion[0]="123";
        informacion[1]="Pepito";
        informacion[2]="Perez";
        informacion[3]="pepito@gmail";
          for(int i= 0; i<datos.length; i++){
            System.out.println( "Los datos registrados son: " + datos[i] + ":"+ informacion[i]);
    }
          
          
          
    }
}
