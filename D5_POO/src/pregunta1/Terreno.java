/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta1;

public class Terreno {
    private double precio;
    private double ancho ;
    private double largo;
    private double precio_m;

    public Terreno(double ancho, double largo, double precio_m) {
        this.ancho = ancho;
        this.largo = largo;
        this.precio_m = precio_m;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setPrecio_m(double precio_m) {
        this.precio_m = precio_m;
    }
    public void calcularPrecio(){
        double tamaño=largo*ancho;
        double des;
        if(tamaño>400){
            des=(tamaño* precio_m)*0.10;
            precio=(tamaño *precio_m)-des;
            
        }if(tamaño<=400){
           precio=tamaño*precio_m;
        }
    }

    public double getPrecio() {
        return precio;
    }
    
}
