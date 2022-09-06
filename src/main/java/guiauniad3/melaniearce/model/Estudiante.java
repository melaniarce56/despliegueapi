/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiauniad3.melaniearce.model;

import org.springframework.data.annotation.Id;

/**
 *
 * @author Usuario
 */
public class Estudiante {
     @Id
    private Long id;
    private String nombre;
    private String número_de_estudiante;
    private String correo_electrónico;
    private String   cursoLista; 
    private String    gpa;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String número_de_estudiante, String correo_electrónico, String cursoLista, String gpa) {
        this.id = id;
        this.nombre = nombre;
        this.número_de_estudiante = número_de_estudiante;
        this.correo_electrónico = correo_electrónico;
        this.cursoLista = cursoLista;
        this.gpa = gpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNúmero_de_estudiante() {
        return número_de_estudiante;
    }

    public void setNúmero_de_estudiante(String número_de_estudiante) {
        this.número_de_estudiante = número_de_estudiante;
    }

    public String getCorreo_electrónico() {
        return correo_electrónico;
    }

    public void setCorreo_electrónico(String correo_electrónico) {
        this.correo_electrónico = correo_electrónico;
    }

    public String getCursoLista() {
        return cursoLista;
    }

    public void setCursoLista(String cursoLista) {
        this.cursoLista = cursoLista;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
    
}
