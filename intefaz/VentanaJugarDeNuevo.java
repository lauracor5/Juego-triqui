package intefaz;

/**
 *
 * @author LAURA C
 */
public class VentanaJugarDeNuevo extends javax.swing.JDialog {

    private String jugadorEmpieza1;
    private String jugadorEmpieza2;
    public String turno;

    public VentanaJugarDeNuevo(java.awt.Frame parent, boolean modal, String nombreJugador1, String nombreJugador2) {
        super(parent, modal);
        this.jugadorEmpieza1 = nombreJugador1;
        this.jugadorEmpieza2 = nombreJugador2;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public String getTurno() {
        return turno;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        labelJuegaPrimero = new javax.swing.JLabel();
        buttonJugador1 = new javax.swing.JButton();
        buttonJugador2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 250));

        panel.setLayout(new java.awt.GridBagLayout());

        labelJuegaPrimero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelJuegaPrimero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJuegaPrimero.setText("¿Quien juega Primero?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        panel.add(labelJuegaPrimero, gridBagConstraints);

        buttonJugador1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonJugador1.setText(jugadorEmpieza1);
        buttonJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugador1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        panel.add(buttonJugador1, gridBagConstraints);

        buttonJugador2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonJugador2.setText(jugadorEmpieza2        );
        buttonJugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJugador2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        panel.add(buttonJugador2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugador1ActionPerformed
        // TODO add your handling code here:
        this.turno = this.jugadorEmpieza1;
        dispose();
    }//GEN-LAST:event_buttonJugador1ActionPerformed

    private void buttonJugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJugador2ActionPerformed
        // TODO add your handling code here:
        this.turno = this.jugadorEmpieza2;
        dispose();
    }//GEN-LAST:event_buttonJugador2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaJugarDeNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJugarDeNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJugarDeNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJugarDeNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaJugarDeNuevo dialog = new VentanaJugarDeNuevo(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonJugador1;
    private javax.swing.JButton buttonJugador2;
    private javax.swing.JLabel labelJuegaPrimero;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
