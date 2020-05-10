/*
 * Algoritmo que lee un tiempo en segundos e imprime la distancia que recorre la luz en dicho tiempo.
tomando en cuenta que la velocidad de la luz es de 300 000 kilómetros por segundo.
 */
package Ejercicio5;

/**
 *
 * @author USUARIO
 */
public class Luz {

    private double segundo;
    private double distancia;

    public Luz(double segundo) {
        this.segundo = segundo;
    }

    public double getSegundo() {
        return segundo;
    }

    public void setSegundo(double segundo) {
        this.segundo = segundo;
    }

    public double getDistancia() {
        distancia =this.segundo*300000;
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

}
