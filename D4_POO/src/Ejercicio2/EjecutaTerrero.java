/*
 * Clase para la creacion de objetos y la ejecucion de la clase Terreno.
 */
package Ejercicio2;

/**
 *
 * @author USUARIO
 */
public class EjecutaTerrero {
    public static void main(String[] args) {
        Terreno obj1= new Terreno(5, 5, 5);
        System.out.println("INFORMACION DEL TERRENO:");
        System.out.println("\n=================================================================");
        System.out.println("\nAnchura del terreno:          " +obj1.getAnchura()+"     m");
        System.out.println("Longitud del terreno:         "+obj1.getLongitud()+"     m");
        System.out.println("Tama;o del terreno:           "+obj1.getAnchura()*obj1.getLongitud()+"    m^2");
        System.out.println("Costo por metro cuadrado:     "+ obj1.getCosto_m()+"     $");
        System.out.println("El costo del terreno es:      "+obj1.getPrecio()+"   $");
    }
}
