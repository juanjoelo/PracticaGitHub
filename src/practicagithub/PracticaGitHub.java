/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author juan_
 */
public class PracticaGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Presentacion lista = new Presentacion();
        
        //Agregá tu nombre y hacé un push en github Desktop!
        Nombre nombre2 = new Nombre("Laurencio");
        Nombre nombre = new Nombre("Juan");

        Nombre nombre4 = new Nombre("Maxi");
       

       Nombre nombre3 = new Nombre("Ivo");
        lista.agregarNombre(nombre2);

        lista.agregarNombre(nombre);
        lista.agregarNombre(nombre3);
        lista.listarNombres();   
    }
}
