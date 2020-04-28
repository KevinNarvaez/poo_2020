/*
 *Clase que permite la creacion de objetos a partir de la clase Celular.
 */
package celular;

/**
 *
 * @author USUARIO
 */
public class EjecutaCelular {
 public static void main(String[] args) {
   //Creamos los objetos 
        Celular celular=new Celular();
        celular.establecer_lugar_producto("Ecuador");
        celular.establecer_marca("Samsumg");
        celular.establecer_color("Blanco");
        celular.establecer_tamaño(13.5);
        celular.establecer_capacidad(2);
        
        //obtener el valor de la variable nombre 
      String lp=  celular.obtener_lugar_producto();
      String m= celular.obtener_marca();
      String c= celular.obtener_color();
      double t= celular.obtener_tamaño();
      int cap = celular.obtener_capacidad();
      
      //Obtener los datos generales.
   celular.obtener_datos_general();
   
        
    }
 
}