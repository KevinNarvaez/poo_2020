/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculosvendidos;

/**
 *
 * @author USUARIO
 */
public class Vehiculo {

    private String marca;
    private double precio;
    private double paga;
    private String nombre_c;
    private String nombre_v;
    private String cedula_c;
    private String email_c;
    private int celular_c;

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public double getprecio() {
        return precio;
    }

    public void setprecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.err.println("Error dato invalido");
        }
    }

    public double getpaga() {
        return paga;
    }

    public void setpaga(double paga) {
        if (paga >= 0) {
            this.paga = paga;
        } else {
            System.err.println("Error dato invalido");
        }
    }

    public String getnombre_c() {
        return nombre_c;
    }

    public void setnombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getnombre_v() {
        return nombre_v;
    }

    public void setnombre_v(String nombre_v) {
        this.nombre_v = nombre_v;
    }

    public String getcedula_c() {
        return cedula_c;
    }

    public void setcedula_c(String cedula_c) {
        this.cedula_c = cedula_c;
    }

    public String getemail_c() {
        return email_c;
    }

    public void setemail_c(String email_c) {
        this.email_c = email_c;
    }

    public int getcelular_c() {
        return celular_c;
    }

    public void setcelular_c(int celular_c) {
        if(celular_c>=50000){
        this.celular_c = celular_c;
        }else{
            System.err.println("Numero incorrecto");
        }
    }

}
