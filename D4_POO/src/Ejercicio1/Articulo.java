/*
 * Este algoritmo calcula e imprima el costo de producción de un artículo, teniendo como datos la descripción y el número de unidades producidas.
El costo se calcula multiplicando el número de unidades producidas por un factor de costo de materiales de 3.5 y sumándole al producto un costo fijo de 10 700. 
 */
package Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class Articulo {
//Atrivutos.
    private double costo_produccion;
    private int unidad_p;
    private String nombre_articulo;
    private int codigo_articulo;
    private String tipo_articulo;
    //Creacion de contrcctores.
    
    /**
     *  Metodo constructor que asigna un valor a la variable unidad_p.
     * @param unidad_p 
     */
    public Articulo(int unidad_p) {
        this.unidad_p = unidad_p;
    }
/**
 * Metodo contructor para aasugnar valores a las variables nombre_articulo,codigo_articulo,tipo_articulo.
 * @param nombre_articulo
 * @param codigo_articulo
 * @param tipo_articulo 
 */
    public Articulo(String nombre_articulo, int codigo_articulo, String tipo_articulo) {
        this.nombre_articulo = nombre_articulo;
        this.codigo_articulo = codigo_articulo;
        this.tipo_articulo = tipo_articulo;
    }
/**
 * Devuelve el costo de produccion contenida en la variable costo_produccion.
 * @return 
 */
    public double getCosto_produccion() {
        costo_produccion = (this.unidad_p * 3.5) + 10700;
        return costo_produccion;
    }
/**
 * Establece el valor en la variable Costo_produccion.
 * @param costo_produccion 
 */
    public void setCosto_produccion(double costo_produccion) {
        this.costo_produccion = costo_produccion;
    }
/**
 * Devuelve las unidades producidas contenida en la variable unidad_p
 * @return 
 */
    public int getUnidad_p() {
        return unidad_p;
    }
/**
 * Establece el valor en la variable unidad_p
 * @param unidad_p 
 */
    public void setUnidad_p(int unidad_p) {
        this.unidad_p = unidad_p;
    }
/**
 * Devuelve el nombre del articulo contido en la variable nombre_articulo.
 * @return 
 */
    public String getNombre_articulo() {
        return nombre_articulo;
    }
/**
 * Establece el valor en la variable nombre_articulo
 * @param nombre_articulo 
 */
    public void setNombre_articulo(String nombre_articulo) {
        this.nombre_articulo = nombre_articulo;
    }
/**
 * devuelve el codigo del articulo contenido en la variable codigo_articulo.
 * @return 
 */
    public int getCodigo_articulo() {
        return codigo_articulo;
    }
/**
 * Establece el valor en la variable Codigo_articulo'
 * @param codigo_articulo 
 */
    public void setCodigo_articulo(int codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }
/**
 * Devuelve el tipo de articulo contenido en la variable tipo_articulo.
 * @return 
 */
    public String getTipo_articulo() {
        return tipo_articulo;
    }
/**
 * Establece el valor en la variable tipo_articulo.
 * @param tipo_articulo 
 */
    public void setTipo_articulo(String tipo_articulo) {
        this.tipo_articulo = tipo_articulo;
    }

}
