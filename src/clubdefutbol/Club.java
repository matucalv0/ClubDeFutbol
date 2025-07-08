package clubdefutbol;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import suscripciones.Suscripcion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Club {
    private ArrayList<Socio> listaDeSocios = new ArrayList<>();
    
    
    
    public void agregarSocio(Socio socio){
        listaDeSocios.add(socio);
    }
    
    public void listadoNuevosSocios(){
        int contador = 0;
        for (Socio socio: listaDeSocios){
            int mes = socio.getFechaInscripcion().getMonthValue();
            if (mes == LocalDate.now().getMonthValue()){
                contador += 1;
                System.out.println(socio.getNombre());
            }
        
            System.out.println("Nuevos socios este mes: " + contador);    
            
        }
    }
    
    public void listadoSociosSuscripcion(){
        ArrayList<Socio> sociosSuscripcionBasica = new ArrayList<>();
        ArrayList<Socio> sociosSuscripcionIntermedia = new ArrayList<>();
        ArrayList<Socio> sociosSuscripcionDestacada = new ArrayList<>();
        
        for (Socio socio: listaDeSocios){
            Suscripcion suscripcion = socio.getSuscripcion();
            if (suscripcion.getId() == 1){
                sociosSuscripcionBasica.add(socio);
            } else if (suscripcion.getId() == 2){
                sociosSuscripcionIntermedia.add(socio);
            } else {
                sociosSuscripcionDestacada.add(socio);
            }
            
        }
        
        ArrayList<Socio> sociosOrdenados = new ArrayList<>();
        sociosOrdenados.addAll(sociosSuscripcionBasica);
        sociosOrdenados.addAll(sociosSuscripcionIntermedia);
        sociosOrdenados.addAll(sociosSuscripcionDestacada);
        
        System.out.println(sociosOrdenados);
    }
    
    
    
   
    
}
