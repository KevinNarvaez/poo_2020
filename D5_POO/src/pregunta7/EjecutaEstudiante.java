/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta7;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaEstudiante {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom;
        double c1;
        double c2;
        double c3;
        System.out.println("Ingrese el nombre:");
        nom = sc.nextLine();
        System.out.println("Ingrrese calificacion 1:");
        c1 = sc.nextDouble();
        System.out.println("Ingrrese calificacion 2:");
        c2 = sc.nextDouble();
        System.out.println("Ingrrese calificacion 3:");
        c3 = sc.nextDouble();
        Estudiante obj = new Estudiante(nom, c1, c2, c3);
        obj.calcularCalificacion_final();
        System.out.println("El estudaiante:  " + obj.getNombre() + " tiene como resultado final: "
                + "" + obj.getCalificacion_final());
    }

}
