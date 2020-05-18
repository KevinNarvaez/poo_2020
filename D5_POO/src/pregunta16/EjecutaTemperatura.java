/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta16;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjecutaTemperatura {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int ti ;
         double g;
         System.out.println("Escoja el tipo de temperatura que va ingresar:");
         System.out.println("1= Fahrenheit"+"\n2= Celsius"+"\n3= Kelvin"+"\n4= Rankine");
         ti=sc.nextInt();
         System.out.println("Ingrese el valor numerico de temperatura a calcular:");
         g=sc.nextDouble();
         Temperatura obj=new Temperatura(ti, g);
         obj.convertidor();
         System.out.println("==================================================================================");
         System.out.println("los resultados son:");
         if(ti==1){
             System.out.println("Celsius=  "+obj.getCelsius()+"\nKelvin=  "+obj.getKelvin()+"\nRankine=  "+obj.getRankine());  
         }
         if(ti==2){
             System.out.println("Fahrenheit=  "+obj.getFahrenheit()+"\nKelvin=  "+obj.getKelvin()+"\nRankine=  "+obj.getRankine());
         }
         if(ti==3){
             System.out.println("Fahrenheit=  "+obj.getFahrenheit()+"\nCelsius=  "+obj.getCelsius()+"\nRankine=  "+obj.getRankine()); 
         }
         if(ti==4){
             System.out.println("Fahrenheit=  "+obj.getFahrenheit()+"\nKelvin=  "+obj.getKelvin()+"\nCelsius=  "+obj.getCelsius()); 
         }
         
    }
}
