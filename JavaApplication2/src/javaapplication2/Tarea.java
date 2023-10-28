/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author lucia
 */
public class Tarea {


    
    private String nombreTarea;
    
    private String descripcion;
    
    
    
    public Tarea(String nombreTarea,  String descripcion) {
        this.nombreTarea = nombreTarea;
 
        this.descripcion = descripcion;
    }
  
    
     public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
