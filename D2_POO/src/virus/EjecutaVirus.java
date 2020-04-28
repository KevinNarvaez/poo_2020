/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;

/**
 *
 * @author USUARIO
 */
public class EjecutaVirus {
     public static void main(String[] args) {
  //Creamos los objetos 
      Virus virus=new Virus();
      
        virus.establecer_nombre("a");
        virus.establecer_tipo("b");
        virus.establecer_consecuencia("c");
        virus.establecer_resistencia("d");
        virus.establecer_capacidad("e");
        
        //obtener el valor de la variable nombre 
      String n=  virus.obtener_nombre();
      String t= virus.obtener_tipo();
      String c= virus.obtener_consecuencia();
      String r= virus.obtener_resistencia();
      String cap = virus.obtener_capacidad();
      
      //Obtener los datos generales.
   virus.obtener_datos_general();
   
        
    }
 
}



