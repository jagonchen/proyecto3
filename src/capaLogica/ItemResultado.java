//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Proyecto3
//  @ File Name : ItemResultado.java
//  @ Date : 4/10/2015
//  @ Author : Eduardo Pineda, Javier Gonzalez
//
//

package capaLogica;


public class ItemResultado {
    private String nombre;
    private Double valor;
    private Double limiteInferior;
    private Double limiteSuperior;
    private String unidadMedicion;

    public ItemResultado(String pnombre, String pvalor, String plimiteInf, String plimiteSup, String punMed) {
    }
        
        
	
    public boolean excedeValorNormal() {
        return false;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @return the limiteInferior
     */
    public Double getLimiteInferior() {
        return limiteInferior;
    }

    /**
     * @return the limiteSuperior
     */
    public Double getLimiteSuperior() {
        return limiteSuperior;
    }

    /**
     * @return the unidadMedicion
     */
    public String getUnidadMedicion() {
        return unidadMedicion;
    }

    /**
     * @param nombre the nombre to set
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param valor the valor to set
     */
    private void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @param limiteInferior the limiteInferior to set
     */
    private void setLimiteInferior(Double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    /**
     * @param limiteSuperior the limiteSuperior to set
     */
    private void setLimiteSuperior(Double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    /**
     * @param unidadMedicion the unidadMedicion to set
     */
    private void setUnidadMedicion(String unidadMedicion) {
        this.unidadMedicion = unidadMedicion;
    }
}