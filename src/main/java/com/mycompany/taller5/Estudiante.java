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
public class Estudiante extends PersonalAcademico{
    private List<Curso> cursos = new ArrayList();

    public Estudiante(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }
    
    public void solicitarInscripcionCurso(Curso curso){
    }
    
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    }
    
    public void addCurso(Curso curso) {}
    
    public void removeCurso(Curso curso) {}
}
