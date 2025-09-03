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
public class Ejercicio4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int precio;
            char categoria;
            double descuento = 0;

            System.out.print("Ingresar el precio: ");
            precio = input.nextInt(); 
            
            System.out.print("Ingresar la categoria (A,B,C) ");
            categoria = input.next().toUpperCase().charAt(0);
            

            switch (categoria) {
                case 'A':
                    descuento = 0.10;
                    break;
                case 'B':
                    descuento = 0.15;
                    break;
                case 'C':
                    descuento = 0.20;
                    break;
                default:
                    System.out.println("Categoria no valida.");
                    input.close();
                    return;
            }

            double montoDescuento = precio * descuento;
            double precioFinal = precio - montoDescuento;

            System.out.println("Precio original: $" + precio);
            System.out.println("Descuento aplicado: $" + montoDescuento);
            System.out.println("Precio final: $" + precioFinal);
            
        }
}
