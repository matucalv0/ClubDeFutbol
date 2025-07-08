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
public class Intermedia extends Suscripcion {
    
    
    
    public Intermedia(){
        suscripcion.put("INTERMEDIA", "Acceso medianamente limitado por suscripcion INTERMEDIA");
        this.id = 2;
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
