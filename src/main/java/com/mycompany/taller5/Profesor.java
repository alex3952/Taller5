/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Profesor extends PersonalAcademico {
    private List<Curso> cursosACargo = new ArrayList();
    
    public Profesor(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }
    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    }
    
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
    }
    
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
    }
    
    public void crearNuevoForo(Foro foro){
    }
    
    public Curso seleccionarCurso(String id) {
        return null;
    };
    
    public void seleccionarArchivo() {}
    
    public void subirMaterialEducativo(List<File> archivos, String titulo, String descripcion) {}
    
    public void mostrarMaterialEducativo() {}
}
