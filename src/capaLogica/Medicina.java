//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Proyecto3
//  @ File Name : Medicina.java
//  @ Date : 4/10/2015
//  @ Author : Eduardo Pineda, Javier Gonzalez
//
//

package capaLogica;


public class Medicina {
    private String nombre;
    private String precauciones;

    public Medicina(String pnombre, String pprecauciones) {
    }

    /**
     * @param nombre the nombre to set
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param precauciones the precauciones to set
     */
    private void setPrecauciones(String precauciones) {
        this.precauciones = precauciones;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the precauciones
     */
    public String getPrecauciones() {
        return precauciones;
    }
    
}
