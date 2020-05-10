/*
 * Clase para la creacion de objetos y la ejecucion de la clase luz.
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaLuz {

    public static void main(String[] args) {
        System.out.println("Ingrese los segundos a procesar: ");
        Scanner teclado = new Scanner(System.in);
        Luz obj = new Luz(teclado.nextDouble());
        System.out.println("\n=========================================");
        System.out.println("\nEn el segundo  " + obj.getSegundo() + " la luz recorrio:  " + obj.getDistancia() + "   km");
    }
}
