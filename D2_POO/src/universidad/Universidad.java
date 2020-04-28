/*
 * Clase universidad para obtener sus datos 
 */
package universidad;

/**
 *
 * @author USUARIO
 */
public class Universidad {
  //Atrivutos, carecteristicas o propiedades de la calse Universidad.
    private String nombre;
    private String direccion;
    private String ciudad;   
    private double tamaño;
    private int capacidad;
    //Encanpsular los atrivutos en metodos.
      /**
     * Este metodo devuelve el nombre contenido en la variable nombre.
     * @return 
     */
    public String obtener_nombre(){
        return nombre;
    }
    
    /**
     * Este metodo devuelve la direccion contenido en la variable direccion.
     * @return 
     */
    public String obtener_direccion(){
        return direccion;
    }
    
     /**
     * Este metodo devuelve la ciudad contenido en la variable cuidad.
     * @return 
     */
    public String obtener_ciudad(){
        return ciudad;
    }

    
     /**
     * Este metodo devuelve el tamaño contenido en la variable tamaño.
     * @return 
     */
    public double obtener_tamaño(){
        return tamaño;
    }
    /**
     * Este metodo devuelve la capacidad de memoria contenida en la variable capacidad.
     * @return 
     */
       public int obtener_capacidad(){
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
     * Metodo para establecer el valor en la variable ciudad.
     * @param valor_ciudad
     */
     public void establecer_ciudad(String valor_ciudad){
        ciudad= valor_ciudad;
        
    }
     /**
      * Metodo para establecer el valor en la variable direccion
      * @param valor_direccion 
      */
       public void establecer_direccion(String valor_direccion){
        direccion= valor_direccion;
        
    }
       /**
        * Metodo para establecer el valor en la variable tamaño
        * @param valor_tamaño 
        */
         public void establecer_tamaño(double valor_tamaño){
        tamaño= valor_tamaño;
        
    }
          /**
        * Metodo para establecer el valor en la variable capacidad.
        * @param valor_capacidad
        */
         public void establecer_capacidad(int valor_capacidad){
        capacidad= valor_capacidad;
        
    }

     /**
     * Este metodo obtiene los datos generales del Animal.
     * @return 
     */
    public void  obtener_datos_general (){
       String datos_general="Nombre: "+nombre+"\nDireccion: "+direccion+"\nCiudad: "+ciudad+"\nTamaño: "+tamaño+" km^2"+"\nCapacidad de estudiantes: "+capacidad+" personas ";
        System.out.println("Los datos obtenidos en general  de la clase universidad son: "+"\n"+datos_general);
              
               
    }

   
}
