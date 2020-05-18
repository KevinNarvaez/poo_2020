/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta16;

/**
 *
 * @author USUARIO
 */
public class Temperatura {

    private int tipo;
    private double grado;
    private double fahrenheit;
    private double celsius;
    private double kelvin;
    private double rankine;

    public Temperatura(int tipo, double grado) {
        this.tipo = tipo;
        this.grado = grado;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }

    public void convertidor() {
        if (tipo == 1) {//cuando grado es igual a Fahrenheit
            celsius =( grado - 32) * 5 / 9;
            kelvin = celsius + 273;
            rankine = grado + 460;
        }
        if (tipo == 2) {//cuando grado es igual a Celsius
            fahrenheit = (grado + 32 * 9)/5;
            kelvin = grado + 273;
            rankine = fahrenheit + 460;

        }
        if (tipo == 3) {//cuando grado es igual a Kelvin
            celsius = grado - 273;
            fahrenheit =( celsius+ 32) * 9 / 5;
            rankine = fahrenheit + 460;

        }
        if (tipo == 4) {//cuando grado es igual a Rankine
            fahrenheit = grado - 460;
            celsius = (fahrenheit - 32 )* 5 / 9;
            kelvin = celsius + 273;

        }
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public double getRankine() {
        return rankine;
    }
    

}
