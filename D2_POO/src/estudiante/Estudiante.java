/*
* Clase Estudiante, para poder obterner sus datos.
 */
package estudiante;

public class Estudiante {

    //Atrivutos, carecteristicas o propiedades de la calse Estudiante.
    private int edad;
    private String nombre;
    private String carrera;
    private String sexo;
    private double tamaño;
    private String email;
    //Encanpsular los atrivutos en metodos.
    
    /**
     * Este metodo devuelve el nombre contenido en la variable nombre.
     * @return 
     */
    public String obtener_nombre(){
        return nombre;
    }
    
     /**
     * Este metodo devuelve la carrera contenido en la variable carrera.
     * @return 
     */
    public String obtener_carrera(){
        return carrera;
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
    public double obtener_tamaño(){
        return tamaño;
    }
    
     /**
     * Este metodo devuelve el email contenido en la variable email.
     * @return 
     */
    public String obtener_email(){
        return email;
    }

    /**
     * Metodo para establecer el valor en la variable nombre.
     * @param valor_nombre 
     */
     public void establecer_nombre(String valor_nombre){
        nombre= valor_nombre;
    }
     
     
    /**
     * Metodo para establecer el valor en la variable nombre.
     * @param valor_carrera 
     */
     public void establecer_carrera(String valor_carrera){
        carrera= valor_carrera;
        
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
         public void establecer_tamaño(double valor_tamaño){
        tamaño= valor_tamaño;
        
    }
         /**
          * Metodo para establecer el valor en la variable email
          * @param valor_email 
          */
           public void establecer_email(String valor_email){
        email= valor_email;
        
    }
     /**
     * Este metodo obtiene los datos generales del Estudiante.
     * @return 
     */
    public void  obtener_datos_general(){
       String datos_general="Nombre: "+nombre+"\nCarrera: "+carrera+"\nSexo: "+sexo+"\nTamaño: "+tamaño+"\nEmail: "+email;
        System.out.println("Los datos obtenidos en general son: "+"\n"+datos_general);
              
               
    }
}
