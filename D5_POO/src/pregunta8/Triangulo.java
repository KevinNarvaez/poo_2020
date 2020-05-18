/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta8;

/**
 *
 * @author USUARIO
 */
public class Triangulo {

    private String triangulo;
    private double angulo1;
    private double angulo2;
    private double angulo3;

    public Triangulo(double angulo1, double angulo2, double angulo3) {
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
        this.angulo3 = angulo3;
    }

    public void setAngulo1(double angulo1) {
        this.angulo1 = angulo1;
    }

    public void setAngulo2(double angulo2) {
        this.angulo2 = angulo2;
    }

    public void setAngulo3(double angulo3) {
        this.angulo3 = angulo3;
    }

    public void calcularTriangulo() {
        if (angulo1 ==90 || angulo2 ==90 || angulo3 == 90) {
            triangulo = "Triangulo rectangulo";
        }
        if (angulo1 > 90 && angulo1 < 180 || angulo2 > 90 && angulo2 < 180 || angulo3 > 90 && angulo3 < 180) {
            triangulo = "Triangulo obtusangulo";
        }
        if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            triangulo = "Triangulo acutangulo";
        }
    }

    public String getTriangulo() {
        return triangulo;
    }
    
}
