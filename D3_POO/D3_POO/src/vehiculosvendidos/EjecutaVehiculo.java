/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculosvendidos;

import cuentabanco.Banco;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaVehiculo {
   public static void main(String[] args) {

        Vehiculo obvehiculo1 = new Vehiculo();
        Scanner teclado = new Scanner(System.in);
        System.out.println("REGISTROS DE LA VENTA DEL VEHICULO 1");
       System.out.println("Ingrese el nombre del vendedor:");
       obvehiculo1.setnombre_v(teclado.nextLine());
       System.out.println("Ingrese el nombre del comprador:");
       obvehiculo1.setnombre_c(teclado.nextLine());
       System.out.println("Ingrese la marca del vehiculo:");
       obvehiculo1.setmarca(teclado.nextLine());
       System.out.println("Ingrese el precio del vehiculo:");
       obvehiculo1.setprecio(teclado.nextDouble());
       System.out.println("Ingrece la paga del comprador:");
       obvehiculo1.setpaga(teclado.nextDouble());
       teclado.nextLine();
       System.out.println("Ingrese la cedula del comprador:");
       obvehiculo1.setcedula_c(teclado.nextLine());
       System.out.println("Ingrese el email del comprador:");
       obvehiculo1.setemail_c(teclado.nextLine());
       System.out.println("Ingrese el numero de celular del comprador:");
       obvehiculo1.setcelular_c(teclado.nextInt());
       
       System.out.println("REGUISTROS DE LA VENTA DEL VEHICULO 2");
       Vehiculo obvehiculo2 = new Vehiculo();
       teclado.nextLine();
        System.out.println("Ingrese el nombre del vendedor:");
       obvehiculo2.setnombre_v(teclado.nextLine());
       System.out.println("Ingrese el nombre del comprador:");
       obvehiculo2.setnombre_c(teclado.nextLine());
       System.out.println("Ingrese la marca del vehiculo:");
       obvehiculo2.setmarca(teclado.nextLine());
       System.out.println("Ingrese el precio del vehiculo:");
       obvehiculo2.setprecio(teclado.nextDouble());
       System.out.println("Ingrece la paga del comprador:");
       obvehiculo2.setpaga(teclado.nextDouble());
       teclado.nextLine();
       System.out.println("Ingrese la cedula del comprador:");
       obvehiculo2.setcedula_c(teclado.nextLine());
       System.out.println("Ingrese el email del comprador:");
       obvehiculo2.setemail_c(teclado.nextLine());
       System.out.println("Ingrese el numero de celular del comprador:");
       obvehiculo2.setcelular_c(teclado.nextInt());
       System.out.println("===============================================================");
       System.out.println("\n\nINFORMACION DE LA VENTA DEL VEHICULO 1");
       System.out.println("\nNombre del vendedor:  "+obvehiculo1.getnombre_v());
       System.out.println("Nombre del comprador:  "+obvehiculo1.getnombre_c());
       System.out.println("Marca del vehiculo:  "+obvehiculo1.getmarca());
       System.out.println("Precio del vehiculo:  "+obvehiculo1.getprecio());
       System.out.println("Paga del comprador:  "+obvehiculo1.getpaga());
       System.out.println("Cedula del comprador:  "+obvehiculo1.getcedula_c());
       System.out.println("Email del comprador:  "+obvehiculo1.getemail_c());
       System.out.println("Numero del celular del comprador:  "+obvehiculo1.getcelular_c());
       System.out.println("\n\n--------------------------------------------------------------------");
        System.out.println("\n\nINFORMACION DE LA VENTA DEL VEHICULO 2");
       System.out.println("\nNombre del vendedor:  "+obvehiculo2.getnombre_v());
       System.out.println("Nombre del comprador:  "+obvehiculo2.getnombre_c());
       System.out.println("Marca del vehiculo:  "+obvehiculo2.getmarca());
       System.out.println("Precio del vehiculo:  "+obvehiculo2.getprecio());
       System.out.println("Paga del comprador:  "+obvehiculo2.getpaga());
       System.out.println("Cedula del comprador:  "+obvehiculo2.getcedula_c());
       System.out.println("Email del comprador:  "+obvehiculo2.getemail_c());
       System.out.println("Numero del celular del comprador:  "+obvehiculo2.getcelular_c());
       System.out.println("DRACIAS POR USAR EL PROGRAMA.");
   }
}
