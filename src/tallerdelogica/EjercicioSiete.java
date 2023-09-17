/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdelogica;

/**
 *
 * @author Natalia
 */
public class EjercicioSiete {
    public static void main(String[] args) {
         int asterisco = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= asterisco; x++) {
                System.out.print("*");
            }
            asterisco = asterisco + 2;
            System.out.println();
        }
        
        
        
    }
    
}
