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
public class Turno {
    GregorianCalendar fecha;
    String estado;
    String especialidad;
    boolean urgencia;
    Paciente paciente;

    public Turno(GregorianCalendar fecha, String estado, String especialidad, boolean urgencia, Paciente paciente) {
        this.fecha = fecha;
        this.estado = estado;
        this.especialidad = especialidad;
        this.urgencia = urgencia;
        this.paciente = paciente;
    }

    public Turno() {
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isUrgencia() {
        return urgencia;
    }

    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }
    public boolean cambiarEstado(String estado){
        String estadoAnterior = this.getEstado();
        this.setEstado(estado);
        return (estadoAnterior.equals(this.getEstado())&& this.getEstado().equals(estado));
    }
    public boolean cambiarFecha(GregorianCalendar fecha){
         GregorianCalendar fechaAnterior = this.getFecha();
         this.setFecha(fecha);
         return (fechaAnterior.equals(this.getFecha())&& this.getFecha().equals(fecha));
    }
}
    

