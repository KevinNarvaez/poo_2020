/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta4;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaArticulo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int can;
        double pre;
        System.out.println("Ingrese la cantidad pedida:");
        can=sc.nextInt();
        System.out.println("Ingrese el precio unitario:");
        pre=sc.nextDouble();
        Articulo obj=new Articulo(can, pre);
        obj.calcularCosto();System.out.println("El costo del pedido del articulo es:  "+obj.getCosto());
    }
 
}
