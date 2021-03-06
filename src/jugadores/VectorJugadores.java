package jugadores;

import javax.swing.JComboBox;

/**
 * 
 * @author Estuardo Ramos
 */
public class VectorJugadores {
    private Jugador[] jugadores= new Jugador[10];
    private int cont=1;

    public VectorJugadores() {
    }
    
      

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    
    public void ingresarJugadores(String nombre, String apellido){
        jugadores[(cont-1)] = new Jugador( cont, nombre,apellido);
        cont++;
    }
    
    
    public String mostrarDatos(){
        String datos="";
        for (int i = 0; i < cont-1; i++) {
            datos= ("Id: "+jugadores[i].getId()+"   Nombre: "+jugadores[i].getNombre()+"  Apellido: "+jugadores[i].getApellido()+ " Partidas Jugadas: "+jugadores[i].getPartidasJug()+ " Partidas ganadas: "+jugadores[i].getPartidasGanadas())+ " Partidas perdidas: "+jugadores[i].getPartidasPer();
        }
        return datos;
    
    }
    
    public String getJugadoresInf(int i){
        String nombre="";
            nombre=jugadores[i].getId()+" "+jugadores[i].getNombre();
        return nombre;
    }
    
    
    
    public Jugador seleccionarJugadores(Jugador jugador){
        Jugador jugSelec = null;
        for (int i = 0; i < cont-1; i++) {
            if (jugador.equals(jugadores[i])) {
                jugSelec=jugador;
            }
        }
        return jugSelec;
    }
    
    public int tirarDado(){
        int numAl=0;
        numAl= (int) (Math.random()*6+1);
        return numAl;
    }

}
