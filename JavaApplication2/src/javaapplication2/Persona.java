/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author lucia
 */
public abstract class Persona  { // Clase abstracta para heredar los atributos
    private String nombre;
    
    private String apellido;
    
    private char sexo;
    
   private int edad;

    public Persona(String nombre, String apellido, char sexo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
    }
}


