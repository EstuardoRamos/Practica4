
package juego;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Estuardo Ramos
 */
public class Tablero extends javax.swing.JFrame {
    private JLabel[][] casillas;
    private JPanel tablita = new JPanel();
    private ImageIcon image = new ImageIcon("src/imagenes/fichaRn.jpg","src/imagenes/fichaNs.jpg");
    private ImageIcon image2 = new ImageIcon("src/imagenes/fichaNs.jpg");
    private int[][] noCas;
    private char ficha;

    
    Scanner scanner = new Scanner(System.in);
    public Tablero() {
        initComponents();
        //ficha=
        JLabel label2= new JLabel("Probando labe");
        //mostrarTablero();
        crearTabla(5,5);
        //tabla.add(label2);
        //mostrarTablero();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cambioP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Juador 1");

        jLabel2.setText("Jugador2");

        cambioP.setText("cambio");
        cambioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(852, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cambioP)
                    .addComponent(jLabel1))
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addGap(70, 70, 70))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(62, 62, 62)
                .addComponent(cambioP)
                .addContainerGap(522, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioPActionPerformed
        
            //casillas[4][0].setIcon(null);
        //casillas[1][4].setIcon(image);
        moverFicha(6, 3, 4, casillas);
        
    }//GEN-LAST:event_cambioPActionPerformed

   
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
   
    
    public void crearTabla(int x, int y){
        
        noCas= new int[y][x];
        casillas = new JLabel[y][x];
        tablita = new JPanel();
        JPanel[][] cuadros = new JPanel[x][y];
        tablita.setBounds(20, 25, 750, 750);
        tablita.setLayout(new GridLayout(y, x));
        int no=0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i%2==0) {
                    no=j;
                    no++;
                } else {
                    no=x-j;
                    //no--;
                }
                
                int celda=(y-i-1)*(x)+(no);
                //         6 -4*5+
                
                noCas[i][j]=celda;
                
                casillas[i][j]= new JLabel("casila "+celda);
                
                casillas[i][j].setOpaque(true);
                casillas[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                casillas[i][j].setForeground(Color.red);
                casillas[i][j].setBackground(Color.YELLOW);
                
                //cuadros[i][j]=new JPanel();
                //cuadros[i][j].setBackground(Color.BLUE);
                //cuadros[i][j].setToolTipText("casila "+celda);
                //tablita.add(cuadros[i][j]);
                
                tablita.add(casillas[i][j]);
            }
        }
        casillas[4][0].setIcon(image);
        casillas[4][0].setIcon(image2);
        fondo.add(tablita);
        tablita.setVisible(true);
        
        
    }
    public void moverFicha(int dado1,int i, int j, Object ficha[][] ){
        //int suma= dado1;
        if (i%2==0) {
            int nR=5-(j+1);
            if (dado1<=nR) {
                j=j+dado1;
            }
            else{
                int s=dado1-nR;
                i=i-1;
                j=5-s;
            }
        }else{
            if (dado1<=j) {
                j=j-dado1;
                i=i;
            } else{
                int nR=dado1-j;
                i=i-1;
                j=nR-1;
            }
        }
        System.out.println(i+" y "+j);
        casillas[i][j].setIcon(image);
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambioP;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
