/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author Borja
 */
public class MensajesService {
    public static void crearMensaje(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe tu mensaje");
    String mensaje = sc.nextLine();
    
    System.out.println("tu nombre");
    String nombre = sc.nextLine();
    
    Mensajes registro = new Mensajes();
    registro.setMensaje(mensaje);
    registro.setAutor_mensaje(nombre);
    MensajesDAO.crearMensajeDB(registro);
    }
    
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    
    public static void borrarMensajes(){
        Scanner sc = new Scanner (System.in);
        System.out.println("indica el ID del mensaje a Borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);
    
    }
    
    public static void editarMensajes(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    
    }
    
}
