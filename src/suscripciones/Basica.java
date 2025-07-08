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
public class Basica extends Suscripcion {
    
    
    
    public Basica(){
        suscripcion.put("BASICA", "Acceso limitado por suscripcion BASICA");
        this.id = 1;
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
