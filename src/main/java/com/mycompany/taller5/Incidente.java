/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5;

import java.util.Date;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    protected PersonalAcademico beneficiario;
    
    private Usuario responsable;

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }

    public Incidente(int id, Date fecha_reportado, String estado, String titulo, String descripcion, List log_actualizaciones, Date fecha_cerrado, String tipo) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
    }
    
    public void notificarASoporte(int id, Date fecha_reportado, String titulo, String descripcion, String tipo){
    }
    
    public void notificarEstado(int id, Date fecha_reportado, String estado, List log_actualizaciones){
    }
}
