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
public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int stockActual, cantidadVendida, cantidadRecibida, resultado;

        System.out.print("Ingresa el stock actual: ");
        stockActual = input.nextInt();

        System.out.print("Ingresa la cantidad vendida: ");
        cantidadVendida = input.nextInt();

        System.out.print("Ingresa la cantidad recibida: ");
        cantidadRecibida = input.nextInt();

        resultado = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El stock actualizado es: " + resultado);

    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
}
