/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdelogica;

/**
 *
 * @author Natalia
 */
public class EjercicioCatorce {
    public static void main(String[] args) {
        
        int num;
        for (int i = 1; i <= 10; i++) {
            num = 1;
            for (int j = 1; j <= i; j++) {
                num = num * j;
            }
            System.out.println("Factorial de " + i + " es: " + num);
        }
    }
          
        
        
    }
    

