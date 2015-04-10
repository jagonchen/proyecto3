//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Proyecto3
//  @ File Name : Receta.java
//  @ Date : 4/10/2015
//  @ Author : Eduardo Pineda, Javier Gonzalez
//
//

package capaLogica;

import java.sql.Date;


public class Receta {
    private String dosis;
    private int numeroDias;
    private Date fechaDeInicio;
    private Date fechaFinalizacion;
    private String nombreMedicina;
    private Medicina medicina;
    
    public Receta(Object pdosis, Object pnumDias, Object pfechaInicio, Object pfechaFinalizacion) {
    }

    /**
     * @return the dosis
     */
    public String getDosis() {
        return dosis;
    }

    /**
     * @return the numeroDias
     */
    public int getNumeroDias() {
        return numeroDias;
    }

    /**
     * @return the fechaDeInicio
     */
    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    /**
     * @return the fechaFinalizacion
     */
    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    /**
     * @return the nombreMedicina
     */
    public String getNombreMedicina() {
        return nombreMedicina;
    }

    /**
     * @return the medicina
     */
    public Medicina getMedicina() {
        return medicina;
    }

    /**
     * @param dosis the dosis to set
     */
    private void setDosis(String dosis) {
        this.dosis = dosis;
    }

    /**
     * @param numeroDias the numeroDias to set
     */
    private void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    /**
     * @param fechaDeInicio the fechaDeInicio to set
     */
    private void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    /**
     * @param fechaFinalizacion the fechaFinalizacion to set
     */
    private void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    /**
     * @param nombreMedicina the nombreMedicina to set
     */
    private void setNombreMedicina(String nombreMedicina) {
        this.nombreMedicina = nombreMedicina;
    }

    /**
     * @param medicina the medicina to set
     */
    private void setMedicina(Medicina medicina) {
        this.medicina = medicina;
    }
}