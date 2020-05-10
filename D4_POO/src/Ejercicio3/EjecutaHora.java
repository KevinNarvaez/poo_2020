/*
 * Clase para la creacion de objetos y la ejecucion de la clase Hora.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaHora {
    public static void main(String[] args) {
         Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese la hora que desea procesar:"); 
        Hora obj = new Hora(teclado.nextInt());
        System.out.println("\n==============================================");
        System.out.println("\nLa hora: "+ obj.getHora()+"  equevale a: ");
        System.out.println("~  "+obj.getMinuto()+"     minutos "+"\n~  "+obj.getSegundo()+
                "    segundos"+"\n~  "+obj.getDia()+"   dia");
        
    }
}
