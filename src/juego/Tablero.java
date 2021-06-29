package juego;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.Border;
import jugadores.Jugador;
import jugadores.VectorJugadores;

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
    
    Scanner scanner = new Scanner(System.in);

    public Tablero() {
        initComponents();
        //jugadores1.addItem(jugadores.getJugadoresInf());
        JLabel label2 = new JLabel("Probando labe");
        //mostrarTablero();
        crearTabla(x, y);

        //tabla.add(label2);
        //mostrarTablero();
    }

    public Tablero(int x, int y, Jugador jugador1, Jugador jugador2) {
        this.x=x;
        this.y=y;
        this.jugador1=jugador1;
        this.jugador2=jugador2;
        initComponents();
        crearTabla(x, y);
        jugador1.setFicha(fichaRoja);
        jugador2.setFicha(fichaNegra);
        btn_tiroJ2.setEnabled(false);
        
    }
    
    public void retrocede(int fila, int columna, int cantDePos){
        casillas[fila][columna].setText("Retrocede  "+cantDePos+" hacia atras");
        casillas[fila][columna].setBackground(Color.DARK_GRAY);
    }
    
    public void avanza(int fila, int columna, int cantDePos){
        casillas[fila][columna].setText("Avanza  "+cantDePos+" hacia atras");
        casillas[fila][columna].setBackground(Color.GREEN);
    }
    
    public void subida(int fI, int cI, int fF, int cF){
        casillas[fI][cI].setBackground(Color.BLUE);
        casillas[fF][cF].setBackground(Color.BLUE);
    }
    
    public void bajada(int fI, int cI, int fF, int cF){
        casillas[fI][cI].setBackground(Color.PINK);
        casillas[fF][cF].setBackground(Color.PINK);
    }
    
    public void pierdeturno(int fila,int columna){
        casillas[fila][columna].setBackground(Color.CYAN);
        casillas[fila][columna].setText(noCas[fila][columna]+" Pierde turno");
    }
    
    public void tiradados(int fila, int columna){
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
        jugadores1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        inicioPrueba = new javax.swing.JButton();
        btn_tiroJ2 = new javax.swing.JButton();
        resDadoJ1 = new javax.swing.JLabel();
        resDadoJ2 = new javax.swing.JLabel();
        ganador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameJ1.setText("Juador 1");

        nameJ2.setText("Jugador2");

        btn_tiroJ1.setText("Tirar dado");
        btn_tiroJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tiroJ1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(810, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(fondoLayout.createSequentialGroup()
                            .addComponent(jugadores1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(25, 25, 25))
                        .addGroup(fondoLayout.createSequentialGroup()
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameJ1)
                                .addComponent(btn_tiroJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resDadoJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(fondoLayout.createSequentialGroup()
                                    .addGap(95, 95, 95)
                                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_tiroJ2)
                                        .addComponent(nameJ2))
                                    .addGap(52, 52, 52))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(resDadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(inicioPrueba)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(ganador))
                        .addGap(157, 157, 157))))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugadores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJ1)
                    .addComponent(nameJ2))
                .addGap(44, 44, 44)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tiroJ1)
                    .addComponent(btn_tiroJ2))
                .addGap(18, 18, 18)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resDadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resDadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inicioPrueba)
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(ganador)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }
    
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
                casillas[i][j] = new JLabel("" + celda + "•");
                casillas[4][2] = new JLabel("" + celda + "   EI1");
                casillas[i][j].setOpaque(true);
                casillas[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                casillas[i][j].setForeground(Color.red);
                casillas[i][j].setBackground(Color.YELLOW);
                tablita.add(casillas[i][j]);
            }
        }
        
        /*casillas[3][1].setText("EF1");
        casillas[4][2].setBackground(Color.DARK_GRAY);
        casillas[3][1].setBackground(Color.DARK_GRAY);*/
        fondo.add(tablita);
        tablita.setVisible(true);
    }

    /*public void turnoMover(VectorJugadores jugador1, VectorJugadores jugador2 ){
        int tiro1=jugador1.tirarDado();
        casillas[0][y].setIcon(fichaRoja);
        moverFicha(tiro1, 0,y, fichaRoja);
        int tiro2=jugador1.tirarDado();
        casillas[0][y].setIcon(fichaNegra);
        moverFicha(tiro2, 0,y, fichaNegra); 
        
    }*/
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

        /*if (jugador1.getJx()==0 && jugador1.getJy()==0){
            jugador1.setJx(y-1);
            jugador1.setJy(0);
        }
        System.out.println("jugador "+jugador1.getJx()+" y "+jugador1.getJy() );
        
        casillas[jugador1.getJx()][jugador1.getJy()].setIcon(fichaVacia);*/
        //buscarCasilla(1);
        //System.out.println(buscarCasilla(1));
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
        //escalera i=4 y j=2 para i3, j1
        if (i == 4 && j == 2) {
            i = 3;
            j = 1;
            
        }
        buscarGanador();
        if (i < 0 && j!=(x-1)) {
            System.out.println("Felicidades gano " + jugador.getNombre());
        } else{
            System.out.println(i + " y " + j + "posision que se pinta con imgen despues del dado");
        jugador.setJx(i);
        jugador.setJy(j);
        
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
    
    public void buscarGanador(){
        if (jugador1.getJx()<0) {
            ganador.setText(jugador1.getNombre());
            // Establecer datos jug1
            jugador1.setPartidasJug(jugador1.getPartidasJug()+1);
            jugador1.setPartidasGanadas(jugador1.getPartidasGanadas()+1);
            jugador1.setJx(-50);
            jugador1.setJy(-50);
            // Establecer datos jug2
            jugador2.setPartidasPer(jugador2.getPartidasPer()+1);
            jugador2.setPartidasJug(jugador2.getPartidasJug()+1);
            jugador2.setJx(-50);
            jugador2.setJy(-50);
            System.out.println("ganador color rojo");
        }else if (jugador2.getJx()<0) {
            ganador.setText(jugador2.getNombre());
            jugador2.setPartidasJug(jugador2.getPartidasJug()+1);
            jugador1.setJx(-50);
            jugador1.setJy(-50);
            jugador2.setJx(-50);
            jugador2.setJy(-50);
            
            jugador1.setPartidasJug(jugador1.getPartidasJug()+1);
            jugador1.setPartidasGanadas(jugador2.getPartidasGanadas()+1);
            jugador2.setPartidasPer(jugador1.getPartidasPer()+1);
            crearTabla(x, y);
            System.out.println("ganador color negro");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_tiroJ1;
    private javax.swing.JButton btn_tiroJ2;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel ganador;
    private javax.swing.JButton inicioPrueba;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jugadores1;
    private javax.swing.JLabel nameJ1;
    private javax.swing.JLabel nameJ2;
    private javax.swing.JLabel resDadoJ1;
    private javax.swing.JLabel resDadoJ2;
    // End of variables declaration//GEN-END:variables
}
