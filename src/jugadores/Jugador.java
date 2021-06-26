
package jugadores;

public class Jugador {
    private int id;
    private String nombre;
    private String apellido;
    private int partidasJug;
    private int partidasGanadas;
    private int partidasPer;

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
    
    

}