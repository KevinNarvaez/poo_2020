/*
 * Clase que permite la creacion de objetos a partir de la clase Animal.
 */
package animal;

/**
 *
 * @author USUARIO
 */
public class EjecutaAnimal {
    public static void main(String[] args) {
   //Creamos los objetos 
        Animal animal=new Animal();
        animal.establecer_especie("Domestico");
        animal.establecer_nombre("Tobby");
        animal.establecer_sexo("Macho");
        animal.establecer_tamaño("Grande");
        animal.establecer_edad(2);
        
        //obtener el valor de la variable nombre 
      String n=  animal.obtener_nombre();
      String s= animal.obtener_sexo();
      String e= animal.obtener_especie();
      String t= animal.obtener_tamaño();
      int ed = animal.obtener_edad();
      
      //Obtener los datos generales.
   animal.obtener_datos_general();
   
        
    }
 
}