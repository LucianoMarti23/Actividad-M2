/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class Main  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Usuario usuarioUno = new Usuario(1,"Luciano","Marti",'c',23); // Creo el objeto usuarioUno
     Scanner scanner = new Scanner(System.in); // Creo el objeto scanner para el menu de opciones
        int eleccion = 0;
     
        
       
        do {  // Utilizo un bucle Do While para mostrar al usuario las distintas opciones que puede elegir
        
                System.out.println("---------------------------------------------");
                System.out.println("To-Do List Menu:");
                System.out.println("1. Agregar tarea");
                System.out.println("2. Listar tareas");
                System.out.println("3. Eliminar tarea");
                System.out.println("4  Actualizar Tarea");
                System.out.println("5  Salir");
                System.out.print("Seleccione una opción: ");
                
                 try {
                if (scanner.hasNextInt()) {
                    eleccion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea y pasa a evaluar la instruccion Switch
                } else {
                    System.out.println("Opción no válida. Debe ingresar un número entero. vuelve a intentarlo   ");
                    scanner.nextLine(); // Consumir el valor no válido , vuelve a pedir el dato
                    continue; // vuelve a ejecutarse el menu 
                }
            } catch (Exception e) {
                System.out.println("Opción no válida. Debe ingresar un número.");
                scanner.nextLine(); // Consumir el valor no válido en caso que nos ingrese un 
                continue;
            }
 

                // Uso la estructura Switch para atrapar la eleccion del usuario de lo que desea realizar
                // y en cada opcion llama al metodo correspondiente que resuelve la tarea solicitada
              switch (eleccion){

                  case 1 -> usuarioUno.agregarTarea();

                 case  2 -> usuarioUno.listarTarea();

                 case 3 -> usuarioUno.eliminarTarea();

                 case 4 -> {
                  
                    if (usuarioUno.actualizarTarea()){
                          JOptionPane.showMessageDialog(null, "La tarea se actualizo correctamente");
                    }
                    else{JOptionPane.showMessageDialog(null, "La tarea no se encontro ");
                    }

               }

                case 5 -> System.out.println("Saliendo del programa");

                default -> System.out.print("Opcion no encontrada  vuelva a intentarlo"); // en caso de ingresar unn entero pero que no pertenezca al menu
             }
     
     
     
       
      
       
        }while ( eleccion != 5); // Condicion para salir del menu.
     }
    }

    
    
      
    
    
    
    
    
    
