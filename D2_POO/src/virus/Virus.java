/*
 * Clase Virus para obtener sus datos.
 */
package virus;

/**
 *
 * @author USUARIO
 */
public class Virus {
//Atrivutos, carecteristicas o propiedades de la calse Virus.
    private String nombre;
    private String tipo;
    private String consecuencia;   
    private String resistencia;
    private String capacidad;
    //Encanpsular los atrivutos en metodos.
      /**
     * Este metodo devuelve el nombre contenido en la variable nombre.
     * @return 
     */
    public String obtener_nombre(){
        return nombre;
    }
    
    /**
     * Este metodo devuelve el tipo contenido en la variable tipo.
     * @return 
     */
    public String obtener_tipo(){
        return tipo;
    }
    
     /**
     * Este metodo devuelve la concecuencia contenido en la variable concecuencia.
     * @return 
     */
    public String obtener_consecuencia(){
        return consecuencia;
    }

    
     /**
     * Este metodo devuelve la resistencia contenido en la variable resistencia.
     * @return 
     */
    public String obtener_resistencia (){
        return resistencia;
    }
    /**
     * Este metodo devuelve la capacidad de memoria contenida en la variable capacidad.
     * @return 
     */
       public String obtener_capacidad(){
        return capacidad;
    }


    /**
     * Metodo para establecer el valor en la variable nombre.
     * @param valor_nombre 
     */
     public void establecer_nombre(String valor_nombre){
        nombre= valor_nombre;
    }
     
     
    /**
     * Metodo para establecer el valor en la variable tipo.
     * @param valor_tipo
     */
     public void establecer_tipo(String valor_tipo){
        tipo= valor_tipo;
        
    }
     /**
      * Metodo para establecer el valor en la variable consecuencia
      * @param valor_concecuencia
      */
       public void establecer_consecuencia(String valor_consecuencia){
        consecuencia= valor_consecuencia;
        
    }
       /**
        * Metodo para establecer el valor en la variable resistencia
        * @param valor_resistencia 
        */
         public void establecer_resistencia(String valor_resistencia){
        resistencia= valor_resistencia;
        
    }
          /**
        * Metodo para establecer el valor en la variable capacidad.
        * @param valor_capacidad
        */
         public void establecer_capacidad(String valor_capacidad){
        capacidad= valor_capacidad;
        
    }

     /**
     * Este metodo obtiene los datos generales del Animal.
     * @return 
     */
    public void  obtener_datos_general (){
       String datos_general="Nombre: "+nombre+"\nTipo de virus: "+tipo+"\nConsecuencia: "+consecuencia+"\nResistencia: "+resistencia+"\nCapacidad : "+capacidad;
        System.out.println("Los datos obtenidos en general  de la clase universidad son: "+"\n"+datos_general);
              
               
    }

   
}
