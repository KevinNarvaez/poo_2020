/*
 *  Algoritmo que lee una cantidad de horas e imprima su equivalente en minutos, segundos y días. 
 */
package Ejercicio3;

/**
 *
 * @author USUARIO
 */
public class Hora {

    private int hora;
    private int minuto;
    private int segundo;
    private int dia;

    public Hora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    
    
    public int getMinuto() {
        minuto= this.hora*60;
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        segundo=this.hora*3600;
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getDia() {
        dia= hora/24;
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    

}
