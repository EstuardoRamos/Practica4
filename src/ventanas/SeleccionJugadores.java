
package ventanas;

import java.util.ArrayList;
import javax.swing.JComboBox;
import juego.Tablero;
import jugadores.Jugador;
import jugadores.VectorJugadores;

/**
 *
 * @author Estuardo Ramos
 */
public class SeleccionJugadores extends javax.swing.JFrame {
    
    private Jugador[] jugador;
    private Jugador jugadorr1;
    private Jugador jugadorr2;
    private int cont;
    public SeleccionJugadores() {
        initComponents();
    }

    public SeleccionJugadores(Jugador[] jugador, int cont) {
        this.jugador=jugador;
        this.cont=cont;
        initComponents();
        setLocationRelativeTo(null);
        agregarListaJ();
        //seleccionarJ();
        
    }
    
    public void agregarListaJ(){
        for (int i = 0; i < cont-1; i++) {
           listJug1.addItem(jugador[i].getNombre());
           listJug2.addItem(jugador[i].getNombre());
            
        }
        
    }
    
    public void empezarPartida(){
        for (int i = 0; i < cont-1; i++) {
            if (jugador1.getText().equals(jugador[i].getNombre())) {
                jugadorr1=jugador[i];  
            }  
        }
        for (int i = 0; i < cont-1; i++) {
            if (jugador2.getText().equals(jugador[i].getNombre())) {
                jugadorr2=jugador[i];  
            }  
        }
        Tablero tablero = new Tablero(8, 6, jugadorr1, jugadorr2);
        tablero.setVisible(true);
        tablero.retrocede(0, 1, 4);
        tablero.tiradados(0, 3);
        tablero.subida(0, 4, 2, 6);
        tablero.retrocede(0, 6, 6);
        tablero.avanza(0, 7, 1);
        tablero.avanza(1, 0, 4);
        tablero.avanza(1, 1, 7);
        tablero.pierdeturno(1, 3);
        tablero.retrocede(1, 4, 9);
        tablero.pierdeturno(1, 5);
        tablero.retrocede(1, 6, 3);
        tablero.pierdeturno(2, 0);
        tablero.tiradados(2, 1);
        tablero.pierdeturno(2, 2);
        tablero.bajada(2, 4, 0, 4);
        tablero.tiradados(2, 6);
        tablero.avanza(2, 7, 4);
        tablero.tiradados(3, 0);
        tablero.avanza(3, 2, 6);
        tablero.tiradados(3, 3);
        tablero.avanza(3, 5, 2);
        tablero.retrocede(3, 6, 4);
        tablero.subida(4, 0, 5, 5);
        tablero.retrocede(4, 1, 4);
        tablero.pierdeturno(4, 3);
        tablero.avanza(4, 4, 5);
        tablero.tiradados(4, 5);
        tablero.bajada(4, 6, 2, 4);
        tablero.pierdeturno(5, 0);
        tablero.tiradados(5, 1);
        tablero.retrocede(5, 3, 3);
        tablero.subida(5, 5, 5, 7);
        tablero.retrocede(5, 6, 3);
        
        /*tablero.subida(5, 3, 3, 5);
        tablero.subida(3, 1, 2, 2);
        tablero.subida(2, 6, 1, 5);
        tablero.subida(1, 6, 0, 7);
        tablero.bajada(3, 2, 4, 1);
        tablero.bajada(4,5,5,6);
        tablero.bajada(1,1,2,0);
        tablero.bajada(0,6,1,4);*/
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        listJug1 = new javax.swing.JComboBox<>();
        listJug2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listJug1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listJug1ActionPerformed(evt);
            }
        });

        listJug2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listJug2ActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jugador2.setText("j2");

        jLabel1.setText("Jugador 1");

        jLabel2.setText("Jugador 2");

        jLabel3.setText("Seleccione a los jugadores:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(listJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listJug2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jugador2))
                                .addGap(47, 47, 47)))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listJug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listJug2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jugador1)
                    .addComponent(jugador2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listJug1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listJug1ActionPerformed
        jugador1.setText((String) listJug1.getSelectedItem());
        
        
    }//GEN-LAST:event_listJug1ActionPerformed

    private void listJug2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listJug2ActionPerformed
        jugador2.setText((String) listJug2.getSelectedItem());
        
    }//GEN-LAST:event_listJug2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        empezarPartida();
        //setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JComboBox<String> listJug1;
    private javax.swing.JComboBox<String> listJug2;
    // End of variables declaration//GEN-END:variables
}
