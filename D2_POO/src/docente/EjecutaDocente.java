/*
 * Clase que permite la creacion de objetos a partir de la clase Docente.
 */
package docente;

/**
 *
 * @author USUARIO
 */
public class EjecutaDocente {
 public static void main(String[] args) {
        //Creamos los objetos 
        Docente docente=new Docente();
        docente.establecer_titulo("Ing. Ciencias Computacion");
        docente.establecer_nombre("Kevin Stalin Narvaez castillo");
        docente.establecer_sexo("Maculino");
        docente.establecer_tamaño(1.62);
        docente.establecer_email("kevin0304.knc@gamil.com");
        //obtener el valor de la variable nombre 
      String n=  docente.obtener_nombre();
      String s= docente.obtener_sexo();
      String ti= docente.obtener_titulo();
      double t= docente.obtener_tamaño();
      String e= docente.obtener_email();
      //Obtener los datos generales.
   docente.obtener_datos_general();
   
        
    }
 
}
