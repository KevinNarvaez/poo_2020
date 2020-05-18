/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta7;

/**
 *
 * @author USUARIO
 */
public class Estudiante {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private String calificacion_final;

    public Estudiante(String nombre, double calificacion1, double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion1(double calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public void setCalificacion2(double calificacion2) {
        this.calificacion2 = calificacion2;
    }

    public void setCalificacion3(double calificacion3) {
        this.calificacion3 = calificacion3;
    }

    public void calcularCalificacion_final() {
        if (calificacion1 >= 70 && calificacion2 >= 70 && calificacion3 >= 70) {
            double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
            calificacion_final = promedio+"";
        } else {
            calificacion_final = "NA (No Acreditado)";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCalificacion_final() {
        return calificacion_final;
    }
    

}
