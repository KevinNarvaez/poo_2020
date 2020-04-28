/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author USUARIO
 */
public class EjecutaUniversidad {
    public static void main(String[] args) {
   //Creamos los objetos 
        Universidad universidad=new Universidad();
        universidad.establecer_nombre("UTPL");
        universidad.establecer_direccion("DANIEL");
        universidad.establecer_ciudad("LOJA");
        universidad.establecer_tamaño(1000);
        universidad.establecer_capacidad(1500);
        
        //obtener el valor de la variable nombre 
      String n=  universidad.obtener_nombre();
      String d= universidad.obtener_direccion();
      String c= universidad.obtener_ciudad();
      double t= universidad.obtener_tamaño();
      int cap = universidad.obtener_capacidad();
      
      //Obtener los datos generales.
   universidad.obtener_datos_general();
   
        
    }
 
}