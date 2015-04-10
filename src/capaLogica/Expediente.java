//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Proyecto3
//  @ File Name : Expediente.java
//  @ Date : 4/10/2015
//  @ Author : Eduardo Pineda, Javier Gonzalez
//
//

package capaLogica;

import java.sql.Date;
import java.util.ArrayList;


public class Expediente {
    private String numeroExpediente;
    private String cedulaPaciente;
    private Date fechaApertura;
    private Paciente paciente;
    private ArrayList<Consulta> listaConsultas;
    
    public Expediente(Object numeroExpediente, Object cedulaPaciente, Object fechaApertura) {
    }

    public void registrarConsulta(Object pnombreDoctor, Object pfehcaRealizacion, Object pdescripcionProm, Object pcodigoReceta, Object pnombreExamen) {
    }

    /**
     * @return the numeroExpediente
     */
    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    /**
     * @return the cedulaPaciente
     */
    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    /**
     * @return the fechaApertura
     */
    public Date getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @return the listaConsultas
     */
    public ArrayList<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    /**
     * @param numeroExpediente the numeroExpediente to set
     */
    private void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    /**
     * @param cedulaPaciente the cedulaPaciente to set
     */
    private void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    private void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * @param paciente the paciente to set
     */
    private void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @param listaConsultas the listaConsultas to set
     */
    private void setListaConsultas(ArrayList<Consulta> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }
}
