/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdelogica;

/**
 *
 * @author Natalia
 */
import java.util.Scanner; 
public class EjercicioDieciocho {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in); 
        
        double notas[]=new double[3];
        String res;
        double cont=0; 
        double prom;
        do{
            
            System.out.println("Ingrese su nota 1: ");
            notas[0]=sc.nextDouble();
            cont++;
            
             System.out.println("Ingrese su nota 2: ");
            notas[1]=sc.nextDouble();
          cont++;
          
             System.out.println("Ingrese su nota 3: ");
            notas[2]=sc.nextDouble();
            cont++;
           
         prom=(notas[0]+notas[1]+notas[2])/cont; 
            System.out.println("Su promedio es: " + prom);
            System.out.println("Desea ingresar mas notas? ");
            res=sc.next();
 
        }while(res.equalsIgnoreCase("Si")); 
       
        
        
        
        
    }
    
}
