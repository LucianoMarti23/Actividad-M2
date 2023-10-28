/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class Usuario extends Persona implements MenuTarea { // Clase que hereda de Persona y que implementar la Intefaz Menu
    
    private int idUsuario;
    
   private final List<Tarea> listaTareas;

    public Usuario(int idUsuario, String nombre, String apellido, char sexo, int edad) {
        super(nombre, apellido, sexo, edad);
        this.idUsuario = idUsuario;
        this.listaTareas = new ArrayList<>(); 
    }

       public int getIdUsuario() {
        return idUsuario;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }
    
       public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
@Override
 public  void agregarTarea(){
     
     // Metodo que realiza la tarea de Agregar Una nueva tarea
        
         String nombreTareas = JOptionPane.showInputDialog("Ingrese el nombre de la tarea : ");
         
         String descripcionTare = JOptionPane.showInputDialog("Ingrese la descripcion de la tarea : ");
        
         
         
        listaTareas.add(new Tarea (nombreTareas , descripcionTare));
        JOptionPane.showMessageDialog(null, "Tarea agregada correctamente");
        
    }
    
@Override
public void listarTarea() {
    
    // Metodo que lista las tareas que tiene el Usuario ya agregadas
    
    if(!listaTareas.isEmpty()){ // Si la lista de tareas contiene alguna tarea la listamos
    
    System.out.println("-------LISTA DE TAREAS-------");    
        
    for (Tarea tarea : listaTareas) {
        System.out.println("Nombre: " + tarea.getNombreTarea());
        System.out.println("Descripción: " + tarea.getDescripcion());
        System.out.println("------------------");    
    }
    
    System.out.println("---------------------------------------------");
    }
    else { // en caso de no contener ni una tarea Devolvemos el mensaje correspondiente que No hay tareas que listar
        JOptionPane.showMessageDialog(null, "No hay tareas que listar");
    }
    
}

@Override
public void eliminarTarea(){
    String nombreTareas = JOptionPane.showInputDialog("Ingrese el nombre de la tarea que quiera buscar/filtrar : ").toLowerCase();
    
    
    
    
   int seleccion = buscador(nombreTareas); // Llama a la funcion Buscador que se encarga de buscar el indice  de la tarea dentro de la lista de tareas 
   
   if(seleccion>=0){ // Si devuelve un numero mayor a 0
     listaTareas.remove(seleccion); // Removemos con el indice de la lista de tareas
     JOptionPane.showMessageDialog(null, "Tarea removida correctamente");
   }
   else{ JOptionPane.showMessageDialog(null, "La tarea que ingreso no existe , vuelva a intentarlo");} 
    
}

// Funcion privada que solo se puede acceder dentro de la clase usuarios.
private int buscador(String nombreTareas){
    
    
    
    
    

    int contador = 0;
    for (Tarea tarea : listaTareas) { // Filtramos por nombreDeTarea en este caso
            if(tarea.getNombreTarea().equals(nombreTareas)){ // Si coinciden los nombres , retornamos su indice
                return contador; // Retornamos el numero de indice donde se encuentra la tarea que estamos buscando
            }
            
      contador++;  // Incrementamos el indice    
}

return -1;    // En caso de no encontrar nada retornamos -1
}

@Override
public boolean actualizarTarea(){
    
     String nombreTareas = JOptionPane.showInputDialog("Ingrese el nombre de la tarea que quiera buscar : ").toLowerCase();
    
     
     for (Tarea tarea : listaTareas) { // Buscamos dentro de la lista de tareas la tarea que queremos actualizar
            if(tarea.getNombreTarea().equals(nombreTareas)){ // Si el nombre ingresado coincide con alguno guardado
                String nombreTarea = JOptionPane.showInputDialog("Ingrese el nombre de la tarea : ").toLowerCase(); // Pedimos el nuevo nombre
                String descripcionTare = JOptionPane.showInputDialog("Ingrese la descripcion de la tarea : ").toLowerCase(); // Pedimos la nueva descripcion
                
                tarea.setNombreTarea(nombreTarea); // Lo seteamos
                tarea.setDescripcion(descripcionTare); // Lo seteamos
                return true; // Retornamos el estado de la funcionn si salio todo correcto retorna True
            }      
}
 return false;  // Retornamos false en caso de no haber dado con la tarea solicitada
}




}

            
    
    
 



    
    
    
    
  
            

  
  
  
      

 
       

