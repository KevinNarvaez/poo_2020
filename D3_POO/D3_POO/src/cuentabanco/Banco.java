/*
 *Este programa permita trabajar con una cuenta bancaria, en la cual se tienen los siguientes atributos: 
 el número de cuenta, el valor del saldo y el nombre del socio.
 */
package cuentabanco;

/**
 *
 * @author USUARIO
 */
public class Banco {

    //Atrivutos, carecteristicas o propiedades de la calse banco.
    private int n_cuenta;
    private double saldo;
    private String socio;

    /**
     * Este metodo devuelve el numero de cuenta contenido en la variable
     * n_cuenta.
     *
     * @return
     */
    public int getn_cuenta() {
        return n_cuenta;
    }

    /**
     * Metodo para establecer el valor en la variable cuenta
     * @param n_cuenta
     */
    public void setn_cuenta(int n_cuenta) {
      if(n_cuenta>=0){
        this.n_cuenta = n_cuenta;
        }else{
            System.err.println("Error valor invalido.");
        }
    }

    /**
     * Este metodo devuelve el saldo contenido en la variable saldo.
     *
     * @return
     */
    public double getsaldo() {
        return saldo;
    }

    /**
     * Metodo para establecer el valor en la variable saldo
     *
     * @param saldo
     */
    public void setsaldo(double saldo) {
        if(saldo>=0){
        this.saldo = saldo;
        }else{
            System.err.println("Error valor invalido.");
        }
    }

    /**
     * Este metodo devuelve el nombre del socio contenido en la variable socio.
     *
     * @return
     */
    public String getsocio() {
        return socio;
    }

    /**
     * Metodo para establecer el valor en la variable socio
     *
     * @param socio
     */
    public void setsocio(String socio) {
        this.socio = socio;
    }


}
