/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clubdefutbol;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author matuc
 */
public class ClubDeFutbol {
    public static void main(String[] args) {
        boolean condicion = true;
        Club nuevoClub = new Club();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        
        while (condicion){
            System.out.println("--------- MENU ---------");
            System.out.println("1. Agregar socio");
            System.out.println("2. Mostrar listado de socios");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            
            switch (opcion){
                case 1:
                    Socio nuevoSocio = crearSocio(scanner);
                    nuevoClub.agregarSocio(nuevoSocio);  
                    break;
                case 2:
                    nuevoClub.listadoNuevosSocios();
                    break;
                case 3:
                    condicion = false;
                    break;
            }
            
        }
        
        
        
    
        
    }
    
    public static Socio crearSocio(Scanner scanner){
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento [yy-mm-dd]");
        String nacimientoString = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(nacimientoString);
        System.out.println("Ingrese dni: ");
        int dni = scanner.nextInt();
        scanner.nextLine();
        
        return new Socio(nombre, fechaNacimiento, dni, LocalDate.now());
        
        
    }
    
   
    
}
