/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta8;

import java.util.Scanner;
import pregunta7.Estudiante;

/**
 *
 * @author USUARIO
 */
public class EjecutaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom;
        double a1;
        double a2;
        double a3;

        System.out.println("Ingrese angulo 1:");
        a1 = sc.nextDouble();
        System.out.println("Ingrrese angulo 2:");
        a2 = sc.nextDouble();
        System.out.println("Ingrrese angulo 3:");
        a3 = sc.nextDouble();
        Triangulo obj = new Triangulo( a1, a2, a3);
        obj.calcularTriangulo();
        System.out.println("Segun los angulos ingresados es un : "+ obj.getTriangulo());
        
    }
}
