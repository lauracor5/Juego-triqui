package intefaz;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAURA C
 */
public class MostrarResultados extends javax.swing.JDialog {

    private String nombreUsuario1;
    private String nombreUsuario2;
    private int contJuegosGanadosJug1;
    private int contJuegosGanadosJug2;
    private int contEmpate;

    private DefaultTableModel tableModel = new DefaultTableModel();

    public MostrarResultados(java.awt.Frame parent, boolean modal, String nombreJugador1, String nombreJugador2, int juegosGnadosUs1,
            int juegosGanadosJug2, int contEmpate) {
        super(parent, modal);
        this.nombreUsuario1 = nombreJugador1;
        this.nombreUsuario2 = nombreJugador2;
        this.contJuegosGanadosJug1 = juegosGnadosUs1;
        this.contJuegosGanadosJug2 = juegosGanadosJug2;
        this.contEmpate = contEmpate;
        initComponents();
        agregarElementosModelo();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void agregarElementosModelo() {
        tableModel.addColumn("N° victoria " + nombreUsuario1);
        tableModel.addColumn("N° victorias " + nombreUsuario2);
        tableModel.addColumn("Empate");
        String[] datosJuego = {String.valueOf(contJuegosGanadosJug1), String.valueOf(contJuegosGanadosJug2),
            String.valueOf(contEmpate)};
        tableModel.addRow(datosJuego);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        labelTablaResultados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableResultados = new javax.swing.JTable();
        buttonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        labelTablaResultados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTablaResultados.setText("Tabla de resultados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(labelTablaResultados, gridBagConstraints);

        tableResultados.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        tableResultados.setModel(tableModel);
        tableResultados.setMaximumSize(new java.awt.Dimension(200, 100));
        tableResultados.setMinimumSize(new java.awt.Dimension(200, 100));
        jScrollPane2.setViewportView(tableResultados);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 380;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        buttonRegresar.setText("Regresar");
        buttonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel1.add(buttonRegresar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(MostrarResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MostrarResultados dialog = new MostrarResultados(new javax.swing.JFrame(), true, null, null, 0, 0, 0);
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
    private javax.swing.JButton buttonRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTablaResultados;
    private javax.swing.JTable tableResultados;
    // End of variables declaration//GEN-END:variables
}
