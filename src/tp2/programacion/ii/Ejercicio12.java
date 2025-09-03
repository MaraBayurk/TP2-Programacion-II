/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.programacion.ii;

/**
 *
 * @author marabayurk
 */
public class Ejercicio12 {
    
        public static void main(String[] args) {
            
        double[] precios = {100.0, 200.0, 300.0, 400.0};

        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }

        precios[1] = 250.0;

        System.out.println("Precios modificados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }
    }
    
}
