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
public class Ejercicio11 {
    
    static double DESCUENTO_ESPECIAL = 0.10;
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el precio del producto: ");
        double precio = input.nextDouble();

        calcularDescuentoEspecial(precio);

        input.close();
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Precio final con descuento: $" + precioFinal);
    }
    
}
