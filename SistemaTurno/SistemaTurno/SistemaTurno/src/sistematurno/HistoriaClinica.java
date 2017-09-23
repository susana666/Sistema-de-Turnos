/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematurno;

import java.util.GregorianCalendar;

/**
 *
 * @author Lisa
 */
class HistoriaClinica {
    private int num;
    private String descripcion;
    private GregorianCalendar fecha;
    private Medico medico;
    private Paciente paciente;

    public HistoriaClinica(int num, String descripcion, GregorianCalendar fecha, Medico medico, Paciente paciente) {
        this.num = num;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente= paciente;
    }
  
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
   
    
    public String mostrar(){
        return "Fecha: "+this.getFecha()
                + "Médico: "+this.getMedico()
                + "Descripción: "+this.getDescripcion();
    }
}
