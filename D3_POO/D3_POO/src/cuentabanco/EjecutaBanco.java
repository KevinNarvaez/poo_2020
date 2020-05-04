/*
 *Clase que permite la creacion de objetos a partir de la clase banco.
 */
package cuentabanco;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaBanco {

    public static void main(String[] args) {

        Banco obbanco1 = new Banco();
        Scanner teclado = new Scanner(System.in);
        System.out.println("REGISTROS DE DATOS DE CUENTA 1: ");
        System.out.println("Ingrese el nombre del socio:");
        obbanco1.setsocio(teclado.nextLine());
        System.out.println("Ingre el numero de cueta:");
        obbanco1.setn_cuenta(teclado.nextInt());
        System.out.println("Ingrese el saldo de la cuenta:");
        obbanco1.setsaldo(teclado.nextDouble());

        System.out.println("REGISTROS DE DATOS DE CUENTA 2: ");
        Banco obbanco2 = new Banco();
        teclado.nextLine();
        System.out.println("Ingrese el nombre del socio:");
        obbanco2.setsocio(teclado.nextLine());
        System.out.println("Ingre el numero de cueta:");
        obbanco2.setn_cuenta(teclado.nextInt());
        System.out.println("Ingrese el saldo de la cuenta:");
        obbanco2.setsaldo(teclado.nextDouble());

        System.out.println("=====================================================");
        System.out.println("\n\nDATOS DE CUENTA 1:");
        System.out.println("Nombre del socio: " + obbanco1.getsocio());
        System.out.println("Numero de cuenta:" + obbanco1.getn_cuenta());
        System.out.println("Saldo de la ceunta: " + obbanco1.getsaldo());
        System.out.println("\n\n-------------------------------------------------");

        System.out.println("\n\nDATOS DE CUENTA 2:");
        System.out.println("Nombre del socio: " + obbanco2.getsocio());
        System.out.println("Numero de cuenta:" + obbanco2.getn_cuenta());
        System.out.println("Saldo de la ceunta: " + obbanco2.getsaldo());
        System.out.println("GRACIAS POR USAR EL PROGRAMA.");

    }

}
