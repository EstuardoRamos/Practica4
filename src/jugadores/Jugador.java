
package jugadores;

import javax.swing.ImageIcon;

public class Jugador {
    private int id;
    private String nombre;
    private String apellido;
    private int partidasJug;
    private int partidasGanadas;
    private int partidasPer;
    private int jx=-50;
    private int jy=-50;
    private ImageIcon ficha;
    //private String ficha;
    private int cont=1;

    public int getJx() {
        return jx;
    }

    public void setJx(int jx) {
        this.jx = jx;
    }

    public int getJy() {
        return jy;
    }

    public void setJy(int jy) {
        this.jy = jy;
    }
    Jugador[] jugador = new Jugador[10];

    public Jugador() {
    }
    
    

    public Jugador(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Jugador(int id, String nombre, int partidasJug, int partidasGanadas, int partidasPer) {
        this.id = id;
        this.nombre = nombre;
        this.partidasJug = partidasJug;
        this.partidasGanadas = partidasGanadas;
        this.partidasPer = partidasPer;
    }

    public ImageIcon getFicha() {
        return ficha;
    }

    public void setFicha(ImageIcon ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", partidasJug=" + partidasJug + ", partidasGanadas=" + partidasGanadas + ", partidasPer=" + partidasPer + '}';
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public Jugador[] getJugador() {
        return jugador;
    }

    public void setJugador(Jugador[] jugador) {
        this.jugador = jugador;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPartidasJug() {
        return partidasJug;
    }

    public void setPartidasJug(int partidasJug) {
        this.partidasJug = partidasJug;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPer() {
        return partidasPer;
    }

    public void setPartidasPer(int partidasPer) {
        this.partidasPer = partidasPer;
    }
    public void ingresarJugadores(String nombre, String apellido){
        jugador[(cont-1)] = new Jugador( cont, nombre,apellido);
        cont++;
    }
    
    
    public String mostrarDatos(){
        String datos="";
        for (int i = 0; i < cont-1; i++) {
            datos= ("Id: "+jugador[i].getId()+"   Nombre: "+jugador[i].getNombre()+"  Apellido: "+jugador[i].getApellido()+ " Partidas Jugadas: "+jugador[i].getPartidasJug()+ " Partidas ganadas: "+jugador[i].getPartidasGanadas())+ " Partidas perdidas: "+jugador[i].getPartidasPer();
        }
        return datos;
    
    }
    
    public String getJugadoresInf(){
        String nombre="";
        for (int i = 0; i < cont-1; i++) {
            nombre=jugador[i].getId()+" "+jugador[i].getNombre();
            return nombre;
        }
        return nombre;
    }
    
    
    
    public void seleccionarJugadores(){
        
    }
    
    public int tirarDado(){
        int numAl=0;
        numAl= (int) (Math.random()*6+1);
        return numAl;
    }
    

}