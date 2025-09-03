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
public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el peso del paquete (kg): ");
        double peso = input.nextDouble();
        input.nextLine(); // limpiar buffer

        System.out.print("Ingresa la zona de envío (Nacional / Internacional): ");
        String zona = input.nextLine();

        System.out.print("Ingresa el precio del producto: ");
        double precioProducto = input.nextDouble();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("Total a pagar: $" + total);

    }
    
    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;

        switch (zona.toLowerCase()) {
            case "nacional":
                costo = peso * 5;
                break;
            case "internacional":
                costo = peso * 10;
                break;
            default:
                System.out.println("Zona no válida, se tomará costo 0.");
                break;
        }

        return costo;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    
}
