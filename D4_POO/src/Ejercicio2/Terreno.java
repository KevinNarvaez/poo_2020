/*
 * Algoritmo que calcula e imprima el costo de un terreno cuadrado o rectangular, 
teniendo como datos la anchura y la longitud en metros y el costo del metro cuadrado.
 */
package Ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Terreno {

    private double anchura;
    private double longitud;
    private double costo_m;
    private double precio;

    public Terreno(double anchura, double longitud, double costo_m) {
        this.anchura = anchura;
        this.longitud = longitud;
        this.costo_m = costo_m;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getCosto_m() {
        return costo_m;
    }

    public void setCosto_m(double costo_m) {
        this.costo_m = costo_m;
    }

    public double getPrecio() {
        precio=this.anchura*this.longitud*this.costo_m;
        return precio;
    }

    public void setPrecio(double precio) {
        
        this.precio = precio;
    }
    
    

}
