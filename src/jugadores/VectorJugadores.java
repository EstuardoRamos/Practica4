/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jugadores;

/**
 * 
 * @author Estuardo Ramos
 */
public class VectorJugadores {
    Jugador[] jugadores= new Jugador[10];
    private int cont=1;
    
    
    
    public void ingresarJugadores(String nombre, String apellido){
        jugadores[(cont-1)] = new Jugador( cont, nombre,apellido);
        //jugadores[cont-1].setNombre(nombre);
        //jugadores[cont-1].setApellido(apellido);
        cont++;
    }
    
    
    public void mostrarDatos(){
        for (int i = 0; i < cont-1; i++) {
            System.out.println("Id: "+jugadores[i].getId()+"   Nombre: "+jugadores[i].getNombre()+"  Apellido: "+jugadores[i].getApellido());
        }
    
    }

}
