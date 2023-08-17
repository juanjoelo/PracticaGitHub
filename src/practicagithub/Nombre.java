/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.util.Scanner;

/**
 *
 * @author juan_
 */
public class Nombre {
    protected String nombre;

    public Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
      public void nombre(){
    Scanner leer = new Scanner(System.in);
    
    nombre = leer.nextLine();
        System.out.println("Hola!" + nombre);
    
    }
      @Override
      public String toString(){
      return "Nombre: "+this.nombre;
      }
}
