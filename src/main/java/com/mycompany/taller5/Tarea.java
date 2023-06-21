/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5;

import java.util.Date;

/**
 *
 * @author CltControl
 */
public class Tarea extends ActividadSumativa{
    private Date fechaDePublicacion;

    public Tarea(String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, Date fechaDePublicacion) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
    
    
}
