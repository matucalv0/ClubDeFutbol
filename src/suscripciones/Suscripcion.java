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
public abstract class Suscripcion {
    protected HashMap<String, String> suscripcion = new HashMap<String, String>();
    protected int id;
    
    public abstract void mostrarSuscripcion();
    public abstract int getId();
 
}
