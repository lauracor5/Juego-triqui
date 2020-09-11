package intefaz;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author LAURA C
 */
public class VentanaPrincipal extends javax.swing.JFrame {


    public VentanaPrincipal() {
        initComponents();
        ocultarElementosVentanaP();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    public void ocultarElementosVentanaP() {
        buttonComenzarJuego.setVisible(false);
        labelJugadorPrimero.setVisible(false);
        labelJugadoDos.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        labelTituloPrincipal = new javax.swing.JLabel();
        labelNombreJugador1 = new javax.swing.JLabel();
        labelJugador2 = new javax.swing.JLabel();
        textFieldNombreJugador1 = new javax.swing.JTextField();
        textFieldNombreJugador2 = new javax.swing.JTextField();
        buttonGuardar = new javax.swing.JButton();
        labelGifVentanaP = new javax.swing.JLabel();
        labelJugadorPrimero = new javax.swing.JLabel();
        labelJugadoDos = new javax.swing.JLabel();
        buttonComenzarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(520, 450));

        panel.setLayout(new java.awt.GridBagLayout());

        labelTituloPrincipal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloPrincipal.setText("Tres en Raya");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(labelTituloPrincipal, gridBagConstraints);

        labelNombreJugador1.setText("Digite el nombre del jugador 1:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(labelNombreJugador1, gridBagConstraints);

        labelJugador2.setText("Digite el nombre del jugador 2:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(labelJugador2, gridBagConstraints);

        textFieldNombreJugador1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldNombreJugador1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textFieldNombreJugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreJugador1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(textFieldNombreJugador1, gridBagConstraints);

        textFieldNombreJugador2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textFieldNombreJugador2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(textFieldNombreJugador2, gridBagConstraints);

        buttonGuardar.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(buttonGuardar, gridBagConstraints);

        labelGifVentanaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gifVentanaPrincipal.gif"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(labelGifVentanaP, gridBagConstraints);

        labelJugadorPrimero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelJugadorPrimero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(labelJugadorPrimero, gridBagConstraints);

        labelJugadoDos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelJugadoDos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(labelJugadoDos, gridBagConstraints);

        buttonComenzarJuego.setText("Comenzar Juego");
        buttonComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonComenzarJuegoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(buttonComenzarJuego, gridBagConstraints);

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

    private void textFieldNombreJugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreJugador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreJugador1ActionPerformed

    private void buttonComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonComenzarJuegoActionPerformed
        // TODO add your handling code here:
        VentanaJuego ventanaJuego = new VentanaJuego(textFieldNombreJugador1.getText(), textFieldNombreJugador2.getText());
        ventanaJuego.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonComenzarJuegoActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        // TODO add your handling code here:
        if (evaluarDatosIngrsados()) {
            buttonGuardar.setVisible(false);
            asignarDatosUsuarios();
        }
    }//GEN-LAST:event_buttonGuardarActionPerformed

    public boolean evaluarDatosIngrsados() {
        if (textFieldNombreJugador1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre para jugador 1");
            return false;
        }
        if (textFieldNombreJugador2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del jugador 2");
            return false;
        }
        if (!(textFieldNombreJugador1.getText().isEmpty() && textFieldNombreJugador2.getText().isEmpty())) {
            return true;
        }
        return false;
    }

    public void asignarDatosUsuarios() {       
        labelJugadorPrimero.setText(textFieldNombreJugador1.getText() + " jugará primero su ficha es X");
        labelJugadoDos.setText(textFieldNombreJugador2.getText() + " su ficha es O");
        labelJugadorPrimero.setVisible(true);
        labelJugadoDos.setVisible(true);
        buttonComenzarJuego.setVisible(true);
    }

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonComenzarJuego;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JLabel labelGifVentanaP;
    private javax.swing.JLabel labelJugadoDos;
    private javax.swing.JLabel labelJugador2;
    private javax.swing.JLabel labelJugadorPrimero;
    private javax.swing.JLabel labelNombreJugador1;
    private javax.swing.JLabel labelTituloPrincipal;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField textFieldNombreJugador1;
    private javax.swing.JTextField textFieldNombreJugador2;
    // End of variables declaration//GEN-END:variables
}
