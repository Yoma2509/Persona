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
public class Persona {
    String Nombre;
    String Apellido;
    int DNI;

     public Persona (){
        this.DNI=0;
        this.Nombre="";
        this.Apellido="";
        
     }
    
    public Persona (int DNI){
     this();
     this.DNI= DNI;
    }
    
    public Persona (int DNI, String Nombre){
     this(DNI);
     this.Nombre=Nombre;
     }
    public Persona (int DNI, String Nombre, String Apellido){
     this(DNI,Nombre);
     this.Apellido=Apellido;
    }    
    public void mostrar(){
       System.out.println("Datos del cliente: " +DNI + " " + Nombre + " " + Apellido);
    }

}