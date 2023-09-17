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
public class EjercicioDiecisiete {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Bienvenido! Presione 1 para lanzar el dado");
        
        int iniciar=sc.nextInt(); 
        java.util.Random random=new java.util.Random(); 
        int num=random.nextInt(6);
        String resp; 
        if(iniciar==1){
            do{
            System.out.println("Numero de dado arrojado: " + num);
                System.out.println("Desea arrojar el dado de nuevo");
                resp=sc.next(); 
                num=random.nextInt(6);
            }while(resp.equalsIgnoreCase("Si"));
            System.out.println("Tenga un buen dia");
        
        }else {
            System.out.println("Debe presionar el numero 1");}
        
        
        
        
        
    }
    
}
