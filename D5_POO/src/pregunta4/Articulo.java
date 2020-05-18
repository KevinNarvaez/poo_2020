/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta4;

/**
 *
 * @author USUARIO
 */
public class Articulo {
    private int cantidad;
    private double precio_u;
    private double costo;

    public Articulo(int cantidad, double precio_u) {
        this.cantidad = cantidad;
        this.precio_u = precio_u;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_u(double precio_u) {
        this.precio_u = precio_u;
    }
    public void calcularCosto(){
        if(cantidad<=50){
            costo=cantidad*precio_u;
        }else{
            double des=cantidad*precio_u*0.15;
            costo= cantidad*precio_u-des;
        }
    }

    public double getCosto() {
        return costo;
    }
    
    
}
