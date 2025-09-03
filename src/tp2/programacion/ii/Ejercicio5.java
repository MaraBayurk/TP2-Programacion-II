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
public class Ejercicio5 {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sumaPares = 0;
            int numero;

            System.out.println("Ingresa numeros, y para finalizar ingresa 0:");
            
            while (true) {
                System.out.print("Número: ");
                numero = input.nextInt();

                if (numero == 0) {
                    break;
                }
                if (numero % 2 == 0) { 
                    sumaPares += numero;
                }
            }
            System.out.println("La suma de los números pares ingresados es: " + sumaPares);
          }
}
