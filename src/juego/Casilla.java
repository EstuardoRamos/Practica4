

package juego;

import javax.swing.JLabel;

public class Casilla {
    private int noCasilla;
    private String color;
    private char fichaA='•';
    private char fichaB='•';
    private char fichaC='•';
    private char fichaD='•';
    private JLabel casilla;

    public Casilla(int noCasilla, char fichaA, char fichaB, char fichaC, char fichaD, JLabel casilla) {
        this.noCasilla = noCasilla;
        this.fichaA = fichaA;
        this.fichaB = fichaB;
        this.fichaC = fichaC;
        this.fichaD = fichaD;
        this.casilla = casilla;
    }

    public Casilla(JLabel casilla) {
        this.casilla = casilla;
    }

    public int getNoCasilla() {
        return noCasilla;
    }

    public void setNoCasilla(int noCasilla) {
        this.noCasilla = noCasilla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getFichaA() {
        return fichaA;
    }

    public void setFichaA(char fichaA) {
        this.fichaA = fichaA;
    }

    public char getFichaB() {
        return fichaB;
    }

    public void setFichaB(char fichaB) {
        this.fichaB = fichaB;
    }

    public char getFichaC() {
        return fichaC;
    }

    public void setFichaC(char fichaC) {
        this.fichaC = fichaC;
    }

    public char getFichaD() {
        return fichaD;
    }

    public void setFichaD(char fichaD) {
        this.fichaD = fichaD;
    }

    public JLabel getCasilla() {
        return casilla;
    }

    public void setCasilla(JLabel casilla) {
        this.casilla = casilla;
    }

    public JLabel[][] getLabel() {
        return label;
    }

    public void setLabel(JLabel[][] label) {
        this.label = label;
    }
   
    
    JLabel[][] label = new JLabel[5][5];
    
    
    

}
