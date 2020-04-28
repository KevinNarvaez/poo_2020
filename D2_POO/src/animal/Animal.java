/*
 * Clase animal para obtener sus datos 
 */
package animal;

/**
 *
 * @author USUARIO
 */
public class Animal {
 //Atrivutos, carecteristicas o propiedades de la calse Animal.
    private int edad;
    private String nombre;   
    private String sexo;
    private String tamaño;
    private String especie;
    //Encanpsular los atrivutos en metodos.
    
    /**
     * Este metodo devuelve el nombre contenido en la variable nombre.
     * @return 
     */
    public String obtener_nombre(){
        return nombre;
    }
    
     /**
     * Este metodo devuelve la especie contenido en la variable especie.
     * @return 
     */
    public String obtener_especie(){
        return especie;
    }
    
     /**
     * Este metodo devuelve el sexo contenido en la variable sexo.
     * @return 
     */
    public String obtener_sexo(){
        return sexo;
    }
    
     /**
     * Este metodo devuelve el tamaño contenido en la variable tamaño.
     * @return 
     */
    public String obtener_tamaño(){
        return tamaño;
    }
    /**
     * Este metodo devuelve la edad contenida en la variable edad.
     * @return 
     */
       public int obtener_edad(){
        return edad;
    }


    /**
     * Metodo para establecer el valor en la variable nombre.
     * @param valor_nombre 
     */
     public void establecer_nombre(String valor_nombre){
        nombre= valor_nombre;
    }
     
     
    /**
     * Metodo para establecer el valor en la variable especie.
     * @param valor_especie 
     */
     public void establecer_especie(String valor_especie){
        especie= valor_especie;
        
    }
     /**
      * Metodo para establecer el valor en la variable sexo
      * @param valor_sexo 
      */
       public void establecer_sexo(String valor_sexo){
        sexo= valor_sexo;
        
    }
       /**
        * Metodo para establecer el valor en la variable tamaño
        * @param valor_tamaño 
        */
         public void establecer_tamaño(String valor_tamaño){
        tamaño= valor_tamaño;
        
    }
          /**
        * Metodo para establecer el valor en la variable edad
        * @param valor_edad
        */
         public void establecer_edad(int valor_edad){
        edad= valor_edad;
        
    }

     /**
     * Este metodo obtiene los datos generales del Animal.
     * @return 
     */
    public void  obtener_datos_general (){
       String datos_general="Nombre: "+nombre+"\nEspecie: "+especie+"\nSexo: "+sexo+"\nTamaño: "+tamaño+"\nEdad: "+edad+" años.";
        System.out.println("Los datos obtenidos en general  de la clase Animal  son: "+"\n"+datos_general);
              
               
    }
}
