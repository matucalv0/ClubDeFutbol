package clubdefutbol;


import java.time.LocalTime;
import java.util.List;
import clubdefutbol.Suscripciones;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matuc
 */
class Socio {
    private String nombre;
    private LocalTime fechaNacimiento;
    private String email;
    private String direccion;
    private Enum suscripcion;
    private List<String> credencial;
    
    
    public Socio(String nombre, LocalTime fechaNacimiento, String email, String direccion){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.direccion = direccion;
        setCredencial();
    }
    
    public setSuscripcion(int numero){
        this.suscripcion = Suscripciones.
    }
    
    
    public void setCredencial(){
        credencial.add(nombre);
        credencial.add(fechaNacimiento.toString());
        credencial.add(email);
        credencial.add(direccion);
    }
    
    
    
    
    
    
    
}
