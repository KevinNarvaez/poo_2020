/*
 *Clase que permite realizar la creacion  de objetos a partir de la clase Estudiante.
 */
package estudiante;

/**
 *
 * @author USUARIO
 */
public class EjecutaEstudiante {
    public static void main(String[] args) {
        //Creamos los objetos 
        Estudiante estudiante=new Estudiante();
        estudiante.establecer_carrera("Computacion");
        estudiante.establecer_nombre("Kevin Narvaez");
        estudiante.establecer_sexo("Maculino");
        estudiante.establecer_tamaño(1.62);
        estudiante.establecer_email("kevin0304.knc@gamil.com");
        //obtener el valor de la variable nombre 
      String n=  estudiante.obtener_nombre();
      String s= estudiante.obtener_sexo();
      String c= estudiante.obtener_carrera();
      double t= estudiante.obtener_tamaño();
      String e= estudiante.obtener_email();
      //Obtener los datos generales.
      estudiante.obtener_datos_general();
        
    }
 
}
