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
public class Ejercicio7 {
     public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
            int nota;

            do {
                System.out.print("Ingresa una nota entre 0 y 10: ");
                nota = input.nextInt();
            } while (nota < 0 || nota > 10);
            System.out.println("La nota ingresada es: " + nota);
         
     }
     
}
