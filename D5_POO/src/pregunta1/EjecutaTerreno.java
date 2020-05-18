/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaTerreno {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double largo;
        double ancho;
        double pm;
        System.out.println("Ingrese el largo de terreno:");
        largo=teclado.nextDouble();
        System.out.println("Ingrese el ancho del terreno");
        ancho=teclado.nextDouble();
        System.out.println("Ingrese el precio por metro cuadrado");
        pm=teclado.nextDouble();
        Terreno obj=new Terreno(ancho, largo, pm);
        obj.calcularPrecio();
        System.out.println("EL precio del terreno es:"+obj.getPrecio()+"$");
        
        
    }
}
