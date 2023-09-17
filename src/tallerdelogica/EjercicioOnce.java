/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdelogica;

/**
 *
 * @author Natalia
 */
public class EjercicioOnce {
    public static void main(String[] args) {
       int nume = 0;
        int filas=5;
        int x=1; 
                for (int i = 1; i <= filas; i++) {
                    nume +=2;
            for (int j = 1; j <= filas-i; j++) {
                System.out.print(" ");
            }
            for ( x = 1; x <= nume; x++) {
                System.out.print(x + " "); 
            }
             System.out.println(); 
            }
           
        }
    }
