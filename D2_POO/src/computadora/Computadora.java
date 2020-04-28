/*
 * Clase Computadora para obtener sus datos 
 */
package computadora;

/**
 *
 * @author USUARIO
 */
public class Computadora {
 //Atrivutos, carecteristicas o propiedades de la calse Computadora.
    private String lugar_producto;
    private String marca;   
    private String color;
    private double tamaño;
    private int capacidad;
    //Encanpsular los atrivutos en metodos.
    
    /**
     * Este metodo devuelve el lugar del producto contenido en la variable lugar_producto.
     * @return 
     */
    public String obtener_lugar_producto(){
        return lugar_producto;
    }
    
     /**
     * Este metodo devuelve la marca contenido en la variable marca.
     * @return 
     */
    public String obtener_marca(){
        return marca;
    }
    
     /**
     * Este metodo devuelve el color contenido en la variable color.
     * @return 
     */
    public String obtener_color(){
        return color;
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
     * Metodo para establecer el valor en la variable lugar_producto.
     * @param valor_lugar 
     */
     public void establecer_lugar_producto(String valor_lugar){
        lugar_producto= valor_lugar;
    }
     
     
    /**
     * Metodo para establecer el valor en la variable marca.
     * @param valor_marca
     */
     public void establecer_marca(String valor_marca){
        marca= valor_marca;
        
    }
     /**
      * Metodo para establecer el valor en la variable color
      * @param valor_color 
      */
       public void establecer_color(String valor_color){
        color= valor_color;
        
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
       String datos_general="Lugar del producto: "+lugar_producto+"\nMarca: "+marca+"\nColor: "+color+"\nTamaño: "+tamaño+" cm"+"\nCapacidad de memoria Ram: "+capacidad+" GB.";
        System.out.println("Los datos obtenidos en general  de la clase Computadora  son: "+"\n"+datos_general);
              
               
    }
}
