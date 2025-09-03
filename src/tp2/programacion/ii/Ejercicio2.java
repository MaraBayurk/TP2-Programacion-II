/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.programacion.ii;

import java.util.Scanner;

/**
 *
 * @author marabayurk
 */
public class Ejercicio2 {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num1, num2, num3;

            System.out.print("Ingresa el primer numero: ");
            num1 = input.nextInt();
            System.out.print("Ingresa el segundo numero: ");
            num2 = input.nextInt();        
             System.out.print("Ingresa el tercer numero: ");
            num3 = input.nextInt();  
            
            int numeroMayor;

            if (num1 >= num2 && num1 >= num3) {
                numeroMayor = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                numeroMayor = num2;
            } else {
                numeroMayor = num3;
            }
            
             System.out.println("El número mayor es: " + numeroMayor);
        }
    
}
