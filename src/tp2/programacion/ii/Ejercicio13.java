/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.programacion.ii;

/**
 *
 * @author marabayurk
 */
public class Ejercicio13 {
    
    public static void main(String[] args) {
        double[] precios = {100.0, 200.0, 300.0, 400.0};
        
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        precios[2] = 350.0;
        
        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivoModificado(precios, 0);
    
    }
    
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Producto " + (indice + 1) + ": $" + precios[indice]);
            mostrarPreciosRecursivo(precios, indice + 1);
        }
    }
    
    public static void mostrarPreciosRecursivoModificado(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Producto " + (indice + 1) + ": $" + precios[indice]);
            mostrarPreciosRecursivoModificado(precios, indice + 1);
        }
    }
}
