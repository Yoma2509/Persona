/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author josel
 */
public class Persona1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        Persona p1, p2, p3, p4;

        p1= new Persona();
        p2 = new Persona(12345678);
        p3 = new Persona(910111213, "Altuve");
        p4 = new Persona(14151617, "Helena", "Villazana");

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        p4.mostrar();
        
    }
    
}
    

