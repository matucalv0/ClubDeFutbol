package clubdefutbol;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import suscripciones.Basica;
import suscripciones.Destacada;
import suscripciones.Intermedia;
import suscripciones.Suscripcion;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matuc
 */
class Socio {
    private LocalDate fechaInscripcion;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String email;
    private String direccion;
    private Suscripcion suscripcion;
    private List<Object> credencial = new ArrayList<>();

   
    
    
    public Socio(String nombre, LocalDate fechaNacimiento, String email, String direccion, int opcionSuscripcion){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.direccion = direccion;
        this.fechaInscripcion = LocalDate.now();
        setSuscripcion(opcionSuscripcion);
        setCredencial();
    }
    
    
    public void setSuscripcion(int opcion){
        switch (opcion) {
            case 1:
                this.suscripcion = new Basica();
                break;
            case 2:
                this.suscripcion = new Intermedia();
                break;
            case 3:
                this.suscripcion = new Destacada();
        
        }
        
    }
    
    public void setCredencial(){
        credencial.add(nombre);
        credencial.add(fechaNacimiento);
        credencial.add(email);
        credencial.add(direccion);
        credencial.add(suscripcion);
    }
    
     public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public List<Object> getCredencial() {
        return credencial;
    }
    
    
    
    
    
    
    
    
    
}
