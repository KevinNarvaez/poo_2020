/*
 *Clase docente para obtener sus datos
 */
package docente;
public class Docente {
    
 //Atrivutos, carecteristicas o propiedades de la calse Docente.
    private int edad;
    private String nombre;
    private String titulo;
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
     * Este metodo devuelve el titulo contenido en la variable titulo.
     * @return 
     */
    public String obtener_titulo(){
        return titulo;
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
     * Metodo para establecer el valor en la variable titulo.
     * @param valor_titulo 
     */
     public void establecer_titulo(String valor_titulo){
        titulo= valor_titulo;
        
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
     * Este metodo obtiene los datos generales del Docente.
     * @return 
     */
    public void  obtener_datos_general(){
       String datos_general="Nombre: "+nombre+"\nTitulo: "+titulo+"\nSexo: "+sexo+"\nTamaño: "+tamaño+"\nEmail: "+email;
        System.out.println("Los datos obtenidos en general  de la clase docente  son: "+"\n"+datos_general);
              
               
    }
}
