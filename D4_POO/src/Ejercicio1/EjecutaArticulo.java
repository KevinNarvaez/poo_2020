/*
Clase para la creacion de objetos y la ejecucion de la clase Articulo.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaArticulo {
    public static void main(String[] args) {
        //Creacion de objetos.
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese las unidades producidas:");
        Articulo obj1=new Articulo(teclado.nextInt());
        System.out.println("Ingrese el nombre del articulo: ");
        Articulo obj2=new Articulo("computadora", 12343,"Electrodomestico");
        //Imprimir los datos.
        System.out.println("DATOS DEL ARTICULO:");
        System.out.println("==========================");
        System.out.println("\nNombre:  "+obj2.getNombre_articulo());
        System.out.println("Codigo: "+obj2.getCodigo_articulo());
        System.out.println("Tipo:  "+obj2.getTipo_articulo());
        System.out.println("Unidades producidas: "+obj1.getUnidad_p());
        System.out.println("Costo de produccion: "+obj1.getCosto_produccion());
    }
}
