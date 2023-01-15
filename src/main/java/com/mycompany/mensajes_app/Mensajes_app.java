/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mensajes_app;
import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class Mensajes_app {

    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     
     int opcion = 0;
     
     do{
         System.out.println("------------------------------");
         System.out.println("Aplicacion de Mensajes");
         System.out.println("1. Crear Mensajes");
         System.out.println("2. Listar Mensajes");
         System.out.println("3. Eliminar Mensajes");
         System.out.println("4. Editar Mensajes");
         System.out.println("5. Salir");
         
         //leemos la opcion del usuario
         opcion = sc.nextInt();
         
         switch(opcion){
             case 1:
                 MensajesService.crearMensaje();
                 break;
             case 2:
                 MensajesService.listarMensajes();
                 break;
             case 3:
                 MensajesService.borrarMensajes();
                 break;
             case 4:
                 MensajesService.editarMensajes();
                 break;
             default:
                 break;
         }
     }while(opcion!=5);
    }
    
}
