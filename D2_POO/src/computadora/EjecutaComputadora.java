/*
 *Clase que permite la creacion de objetos a partir de la clase Computadora.
 */
package computadora;


/**
 *
 * @author USUARIO
 */
public class EjecutaComputadora {
 public static void main(String[] args) {
   //Creamos los objetos 
        Computadora computadora=new Computadora();
        computadora.establecer_lugar_producto("China");
        computadora.establecer_marca("Asus");
        computadora.establecer_color("Negra");
        computadora.establecer_tamaño(35.5);
        computadora.establecer_capacidad(2);
        
        //obtener el valor de la variable nombre 
      String lp=  computadora.obtener_lugar_producto();
      String m= computadora.obtener_marca();
      String c= computadora.obtener_color();
      double t= computadora.obtener_tamaño();
      int cap = computadora.obtener_capacidad();
      
      //Obtener los datos generales.
   computadora.obtener_datos_general();
   
        
    }
 
}