
package ventanas;

import archivos.Archivo;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import juego.Tablero;
import jugadores.Jugador;
import jugadores.VectorJugadores;


/**
 *
 * @author Estuardo Ramos
 */
public class Principal extends javax.swing.JFrame {
    Jugador[] jugador = new Jugador[10];
    private int contador=1;
     private VectorJugadores jugadores= new VectorJugadores();
     static ArrayList<Jugador> jugadoress = new ArrayList();
     
     
    public Principal() {
        initComponents();
        fondo.setBackground(Color.GREEN);
        setLocationRelativeTo(null);
        
    }
    
    public String reportesJugadores(){
        String info = null;
        for (int i = 0; i < contador-1; i++) {
            info+=jugador[i].mostrarDatos()+"\n";
        }
        return info;
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iniciarPartida = new javax.swing.JButton();
        registroJug = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIENVENIDO ");

        jLabel3.setText("Juego Serpientes y Escaleras");

        iniciarPartida.setText("Iniciar Partida");
        iniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarPartidaActionPerformed(evt);
            }
        });

        registroJug.setText("Registrar Jugadores");
        registroJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroJugActionPerformed(evt);
            }
        });

        reportes.setText("Reporte de Jugadores");
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel2))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iniciarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(registroJug, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reportes)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jButton3))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(iniciarPartida)
                .addGap(41, 41, 41)
                .addComponent(registroJug)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addComponent(reportes)
                .addGap(68, 68, 68)
                .addComponent(jButton3)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarPartidaActionPerformed
       
        SeleccionJugadores sele = new SeleccionJugadores(jugador,contador);
        sele.setVisible(true);
      
    }//GEN-LAST:event_iniciarPartidaActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        System.out.println(contador);
        JTextArea repor = new JTextArea(reportesJugadores());
        JLabel jlb_repor = new JLabel(reportesJugadores());
        JOptionPane.showMessageDialog(null, repor, "Reportes", JOptionPane.INFORMATION_MESSAGE);
        for (int i = 0; i < contador-1; i++) {
            System.out.println(jugador[i].toString());
            
        }
        Archivo.escrituraArchivoTexto(reportesJugadores(), "/home/estuardo/NetBeansProjects/Practica4/reportes.txt");
    }//GEN-LAST:event_reportesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void registroJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroJugActionPerformed
        LoginUsuario login = new LoginUsuario(jugador,contador);
        contador++;
        login.setVisible(true);
    }//GEN-LAST:event_registroJugActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JButton iniciarPartida;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton registroJug;
    private javax.swing.JButton reportes;
    // End of variables declaration//GEN-END:variables
}
