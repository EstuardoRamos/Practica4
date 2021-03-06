package juego;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
import jugadores.Jugador;
import ventanas.Principal;

/**
 *
 * @author Estuardo Ramos
 */
public class Tablero extends javax.swing.JFrame {

    //private VectorJugadores jugadores;
    private JLabel[][] casillas;
    private JPanel tablita = new JPanel();
    private ImageIcon fichaRoja = new ImageIcon("src/imagenes/fichaRn.jpg", "src/imagenes/fichaNs.jpg");
    private ImageIcon fichaNegra = new ImageIcon("src/imagenes/fichaNs.jpg");
    private ImageIcon fichaVacia = new ImageIcon("");
    private int[][] noCas;
    private char fichaSS;
    private Jugador jugador1 = new Jugador(1, "Estua", "Ram");
    private Jugador jugador2 = new Jugador(2, "mart", "Lops");
    Jugador[] jugador;
    private int x = 8;
    private int y = 6;


    public Tablero() {
        initComponents();
    }

    public Tablero(int x, int y, Jugador jugador1, Jugador jugador2) {
        this.x = x;
        this.y = y;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        initComponents();
        setLocationRelativeTo(null);
        crearTabla(x, y);
        casillas[0][7].setBackground(Color.magenta);
        casillas[0][7].setText("Fin");
        jugador1.setFicha(fichaRoja);
        lbl_fichaJ1.setIcon(fichaRoja);
        jugador2.setFicha(fichaNegra);
        lbl_fichaJ2.setIcon(fichaNegra);
        //casillas[5][7].setIcon(fichaRoja);
        nameJ1.setText("" + jugador1.getNombre());
        nameJ2.setText("" + jugador2.getNombre());
        btn_tiroJ2.setEnabled(false);
        
    }
    
    public void retrocede(int fila, int columna, int cantDePos){ //retroceder color griss
        casillas[fila][columna].setText("Retro  "+cantDePos+"");
        casillas[fila][columna].setBackground(Color.DARK_GRAY);
    }
    
    public void avanza(int fila, int columna, int cantDePos){ //avanzar casilla color verde
        casillas[fila][columna].setText(noCas[fila][columna]+"Avanza  "+cantDePos+" hacia atras");
        casillas[fila][columna].setBackground(Color.GREEN);
    }
    
    public void subida(int fI, int cI, int fF, int cF){ //subida o escalera color azul
        casillas[fI][cI].setText(noCas[fI][cI]+" SubeIni");
        casillas[fF][cF].setText(noCas[fF][cF]+" SubeFin");
        casillas[fI][cI].setBackground(Color.BLUE);
        casillas[fF][cF].setBackground(Color.BLUE);
    }
    
    public void bajada(int fI, int cI, int fF, int cF){ //Bajada o serpiente color rosa
        casillas[fI][cI].setText(noCas[fI][cI]+" BajIni");
        casillas[fF][cF].setText(noCas[fF][cF]+" BajFin");
        casillas[fI][cI].setBackground(Color.PINK);
        casillas[fF][cF].setBackground(Color.PINK);
    }
    
    public void pierdeturno(int fila,int columna){ //pierde turno color cyan
        casillas[fila][columna].setBackground(Color.CYAN);
        casillas[fila][columna].setText(noCas[fila][columna]+" Pierde turno");
    }
    
    public void tiradados(int fila, int columna){  //tirar dados casilla color blanco
        casillas[fila][columna].setText(noCas[fila][columna]+" Tirar dado");
        casillas[fila][columna].setBackground(Color.WHITE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        nameJ1 = new javax.swing.JLabel();
        nameJ2 = new javax.swing.JLabel();
        btn_tiroJ1 = new javax.swing.JButton();
        inicioPrueba = new javax.swing.JButton();
        btn_tiroJ2 = new javax.swing.JButton();
        resDadoJ1 = new javax.swing.JLabel();
        resDadoJ2 = new javax.swing.JLabel();
        ganador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_fichaJ1 = new javax.swing.JLabel();
        lbl_fichaJ2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameJ1.setText("Juador 1");

        nameJ2.setText("Jugador2");

        btn_tiroJ1.setText("Tirar dado");
        btn_tiroJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tiroJ1ActionPerformed(evt);
            }
        });

        inicioPrueba.setText("inicioPruba");
        inicioPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioPruebaActionPerformed(evt);
            }
        });

        btn_tiroJ2.setText("Tirar dado");
        btn_tiroJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tiroJ2ActionPerformed(evt);
            }
        });

        ganador.setText("Aun no hay ganador");

        jLabel1.setText("Ganador!");

        jLabel2.setText("Jugador 1");

        jLabel3.setText("Jugador 2");

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(854, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(ganador))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(inicioPrueba)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_fichaJ1)
                        .addGroup(fondoLayout.createSequentialGroup()
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_tiroJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resDadoJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(nameJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_tiroJ2)
                                        .addComponent(resDadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(60, 60, 60))
                                .addGroup(fondoLayout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(nameJ2)
                                        .addComponent(lbl_fichaJ2))
                                    .addGap(86, 86, 86)))))))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJ1)
                    .addComponent(nameJ2))
                .addGap(38, 38, 38)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fichaJ1)
                    .addComponent(lbl_fichaJ2))
                .addGap(59, 59, 59)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tiroJ1)
                    .addComponent(btn_tiroJ2))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resDadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resDadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(inicioPrueba)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(ganador)
                .addContainerGap(341, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tiroJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tiroJ1ActionPerformed
        int dadoJ1=jugador1.tirarDado();
        resDadoJ1.setText(" "+dadoJ1);
        turnoMover(jugador1, dadoJ1);
        btn_tiroJ2.setEnabled(true);
        btn_tiroJ1.setEnabled(false);    
    }//GEN-LAST:event_btn_tiroJ1ActionPerformed

    private void inicioPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioPruebaActionPerformed
        int xx = 0;
        int yy = y - 1;
        
    }//GEN-LAST:event_inicioPruebaActionPerformed

    private void btn_tiroJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tiroJ2ActionPerformed
        int dadoJ2=jugador2.tirarDado();
        resDadoJ2.setText(" "+dadoJ2);
        turnoMover(jugador2,dadoJ2);
        btn_tiroJ1.setEnabled(true);
        btn_tiroJ2.setEnabled(false);
        
    }//GEN-LAST:event_btn_tiroJ2ActionPerformed
    
    
    
    public void crearTabla(int x, int y) {
        
        noCas = new int[y][x];
        casillas = new JLabel[y][x];
        tablita = new JPanel();
        JPanel[][] cuadros = new JPanel[x][y];
        tablita.setBounds(20, 55, 750, 750);
        tablita.setLayout(new GridLayout(y, x));
        int no = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i % 2 == 0) {
                    no = j;
                    no++;
                } else {
                    no = x - j;
                }
                
                int celda = (y - i - 1) * (x) + (no);
                //         6 -4*5+
                noCas[i][j] = celda;
                casillas[i][j] = new JLabel("" + celda + "???");
                //casillas[4][2] = new JLabel("" + celda + "   EI1");
                casillas[i][j].setOpaque(true);
                casillas[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                casillas[i][j].setForeground(Color.red);
                casillas[i][j].setBackground(Color.YELLOW);
                tablita.add(casillas[i][j]);
                
            }
        }
        fondo.add(tablita);
        tablita.setVisible(true);
    }

    
    public void turnoMover() {
        System.out.println("jugador " + jugador1.getJx() + " y " + jugador1.getJy() + "posision x y y ficha");
        int tiro1 = jugador1.tirarDado();
        resDadoJ1.setText("" + tiro1);
        System.out.println("Resultado dado " + tiro1);
        //casillas[jugador1.getJx()][jugador1.getJy()].setIcon(fichaRoja);
        moverFicha(tiro1,jugador1, jugador1.getJx(), jugador1.getJy(), fichaRoja);
        
    }
    
    //metodo con parametro jugador
    public void turnoMover(Jugador jugador, int dadoTiro) {
        System.out.println("jugador " + jugador.getJx() + " y " + jugador.getJy() + "posision x y y ficha");
        int tiro1 = dadoTiro;
        System.out.println("Resultado dado " + tiro1);
        //casillas[jugador1.getJx()][jugador1.getJy()].setIcon(fichaRoja);
        moverFicha(dadoTiro, jugador, jugador.getJx(), jugador.getJy(), jugador.getFicha());
        
    }
    
    public void moverFicha(int dado1,Jugador jugador, int i, int j, ImageIcon ficha) {
        if (y % 2 == 0) {
            if (i == -50 && j == -50) {
                jugador.setJx(y - 1);
                jugador.setJy(x - 1);
            }
        } else {
            if (i == -50 && j == -50) {
                jugador.setJx(y - 1);
                jugador.setJy(0);
            }
        }
        
        i = jugador.getJx();
        j = jugador.getJy();
        casillas[jugador.getJx()][jugador.getJy()].setIcon(ficha);
        System.out.println("jugador " + jugador.getJx() + " y " + jugador.getJy() + "cambio si fuera 0");
        casillas[jugador.getJx()][jugador.getJy()].setIcon(fichaVacia);
        
        if (i % 2 == 0) {
            int nR = x - (j + 1);
            if (dado1 <= nR) {
                j = j + dado1;
            } else {
                int s = dado1 - nR;
                i = i - 1;
                j = x - s;
            }
        } else {
            if (dado1 <= j) {
                j = j - dado1;
                //i=i;
            } else {
                int nR = dado1 - j;
                i = i - 1;
                j = nR - 1;
            }
        }
        casillas[i][j].setIcon(ficha);
        //escaleras subidas
        if (i == 5 && j == 3) {
            casillas[i][j].setIcon(fichaVacia);
            i = 3;
            j = 5;
        }
        if (i == 3 && j == 1) {
            casillas[i][j].setIcon(fichaVacia);
            i = 2;
            j = 2;
        }
        if (i == 2 && j == 6) {
            casillas[i][j].setIcon(fichaVacia);
            i = 1;
            j = 5;
        }
        if (i == 1 && j == 6) {
            casillas[i][j].setIcon(fichaVacia);
            i = 0;
            j = 7;
        }
        //bajadas
        if (i == 3 && j == 2) {
            casillas[i][j].setIcon(fichaVacia);
            i = 4;
            j = 1;
        }
        if (i == 4 && j == 5) {
            casillas[i][j].setIcon(fichaVacia);
            i = 5;
            j = 6;
        }
        if (i == 1 && j == 1) {
            casillas[i][j].setIcon(fichaVacia);
            i = 2;
            j = 0;
        }
        if (i == 0 && j == 6) {
            casillas[i][j].setIcon(fichaVacia);
            i = 1;
            j = 4;
        }
        jugador.setJx(i);
        jugador.setJy(j);
        if (i == 0 && j == (x - 1) || i < 0) {
            System.out.println("Felicidades gano " + jugador.getNombre());
            buscarGanador();

        } else {
            System.out.println(i + " y " + j + "posision que se pinta con imgen despues del dado");
            casillas[i][j].setIcon(ficha);
            System.out.println("jugador " + jugador.getJx() + " y " + jugador.getJy() + "posicion jugador despues del dado");
            System.out.println("");

        }

    }

    /*public JLabel buscarCasilla(int noC){
        JLabel casilla[][] = null;
        int i, j = 0;
        for ( i = 0; i < noCas.length && null == casilla; i++) {
            for ( j = 0; j < noCas[i].length && null == casilla; j++) {
 
                int e = noCas[i][j];
 
                if (e == noC) {
                    JLabel names = casilla[i][j];
 
                }
 
            }
        }
        return casilla[i][j];

        }*/
    
    public void buscarGanador() {

        if (jugador1.getJx() == 0 && jugador1.getJy() == (x - 1) || jugador1.getJx() < 0) {
            ganador.setText(jugador1.getNombre());
            // Establecer datos jug1
            jugador1.setPartidasJug(jugador1.getPartidasJug() + 1);
            jugador1.setPartidasGanadas(jugador1.getPartidasGanadas() + 1);
            jugador1.setJx(-50);
            jugador1.setJy(-50);
            // Establecer datos jug2
            jugador2.setPartidasPer(jugador2.getPartidasPer() + 1);
            jugador2.setPartidasJug(jugador2.getPartidasJug() + 1);
            jugador2.setJx(-50);
            jugador2.setJy(-50);
            
            System.out.println("ganador color rojo");
            JOptionPane.showMessageDialog(null, "Felicidades Gano "+jugador1.getNombre());
            setVisible(false);
        } else if ((jugador2.getJx() == 0 && jugador2.getJy() == (x - 1)) || jugador2.getJx() < 0) {
            ganador.setText(jugador2.getNombre());
            jugador2.setPartidasJug(jugador2.getPartidasJug() + 1);
            jugador2.setPartidasGanadas(jugador2.getPartidasGanadas() + 1);
            jugador1.setJx(-50);
            jugador1.setJy(-50);
            jugador2.setJx(-50);
            jugador2.setJy(-50);

            jugador1.setPartidasJug(jugador1.getPartidasJug() + 1);
            //jugador1.setPartidasGanadas(jugador2.getPartidasGanadas()+1);
            jugador1.setPartidasPer(jugador1.getPartidasPer() + 1);
            //crearTabla(x, y);
            
            System.out.println("ganador color negro");
            JOptionPane.showMessageDialog(null, "Felicidades Gano "+jugador2.getNombre());
            setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tiroJ1;
    private javax.swing.JButton btn_tiroJ2;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel ganador;
    private javax.swing.JButton inicioPrueba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_fichaJ1;
    private javax.swing.JLabel lbl_fichaJ2;
    private javax.swing.JLabel nameJ1;
    private javax.swing.JLabel nameJ2;
    private javax.swing.JLabel resDadoJ1;
    private javax.swing.JLabel resDadoJ2;
    // End of variables declaration//GEN-END:variables
}
