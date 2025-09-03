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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el precio base del producto: ");
        double precioBase = input.nextDouble();

        System.out.print("Ingresa el porcentaje de impuesto (%): ");
        double impuesto = input.nextDouble() / 100;

        System.out.print("Ingresa el porcentaje de descuento (%): ");
        double descuento = input.nextDouble() / 100;

        double resultado = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final es: " + resultado);

   }
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    

}
