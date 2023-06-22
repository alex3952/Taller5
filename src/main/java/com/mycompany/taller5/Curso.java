/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    
    private List<Estudiante> estudiantesInscritos = new ArrayList();
    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList();
    private Profesor responsable;
    private List<Foro> foros = new ArrayList();
    private List<ActividadSumativa> actividadesSumativas = new ArrayList();

    public Curso(String id, String nombre, boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }
    
    public void subirActividadSumativa(ActividadSumativa actividadSumativa) {}
    
    public void mostrarMensajeDeError() {}
    
    public ActividadSumativa obtenerActividadSumativa() { return null; }
    
    public void mostrarVentanaCargaExitosa() {}
}
