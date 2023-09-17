/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdelogica;

/**
 *
 * @author Natalia
 */
public class EjercicioDieciseis {
    public static void main(String[] args) {
        
              int vidas=5; 
         java.util.Random random = new java.util.Random(); 
        int num = random.nextInt(2);
        do {
            System.out.println("El número generado es " + num); 
            if (num!=0){
            vidas++; 
                System.out.println("Ha sumado una vida");
                 System.out.println("Ahora tiene " + vidas + " vidas");
            } else if (num==0) { 
             vidas--;
            System.out.println("Ha disminuido una vida");
                System.out.println("Ahora tiene " + vidas + " vidas");
            }
            num = random.nextInt(2); 
        } while (vidas!=0 ); 
        
        
    }
   
    
}
        
        
        
        
        
        
        
        
 

