/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suscripciones;

import java.util.HashMap;

/**
 *
 * @author matuc
 */
public class Destacada extends Suscripcion {
    
    
    public Destacada(){
        suscripcion.put("DESTACADA", "Acceso ilimitado a actividades");
        this.id = 3;
    }
    
    @Override
    public void mostrarSuscripcion() {
        System.out.println("Suscripcion activa: " + suscripcion);

    }

    @Override
    public int getId() {
        return id;
    }
    
}
