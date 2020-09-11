package intefaz;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.xml.transform.Source;
import logica.LogicaJuego;

/**
 *
 * @author LAURA C
 */
public class VentanaJuego extends javax.swing.JFrame {

    private LogicaJuego logicaJuego = new LogicaJuego();
    private int positionX = 0;
    private int positionY = 0;
    private String fichaJugador = " ";
    private int contadorMovimientos = 0;
    private boolean indicadorJugarDeNuevo = false;
    private boolean turnoJugador1 = false;
    private boolean turnoJugador2 = false;
    private String nombreJugadorUno = " ";
    private String nombreJugadorDos = " ";
    private String nombreIniUsuario1 = " ";
    private String nombreIniUsuario2 = " ";
    private String nombreGanador = " ";
    private int juegosGandosJugador1 = 0;
    private int juegosGandosJugador2 = 0;
    private int contadorEmpate = 0;
    private String fichaJug1 = " ";
    private String fichaJug2 = " ";
    private String urlImagen1 = " ";
    private String urlImagen2 = " ";

    public VentanaJuego(String usuario1, String usuario2) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        logicaJuego.reiniciarMatriz();
        AsignaFichaIniJuego();
        this.nombreJugadorUno = usuario1;
        this.nombreJugadorDos = usuario2;
        this.nombreIniUsuario1 = usuario1;
        this.nombreIniUsuario2 = usuario2;
    }

    public void AsignaFichaIniJuego() {
        this.fichaJug1 = "X";
        this.fichaJug2 = "O";
        urlImagen1 = "/imagenes/imagenX.png";
        urlImagen2 = "/imagenes/imagenO.png";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        button1.setAlignmentY(0.0F);
        button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button1.setMaximumSize(new java.awt.Dimension(200, 200));
        button1.setMinimumSize(new java.awt.Dimension(200, 200));
        button1.setPreferredSize(new java.awt.Dimension(200, 2000));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(button1, gridBagConstraints);

        button2.setMaximumSize(new java.awt.Dimension(200, 200));
        button2.setMinimumSize(new java.awt.Dimension(200, 200));
        button2.setPreferredSize(new java.awt.Dimension(200, 200));
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(button2, gridBagConstraints);

        button3.setMaximumSize(new java.awt.Dimension(200, 200));
        button3.setMinimumSize(new java.awt.Dimension(200, 200));
        button3.setPreferredSize(new java.awt.Dimension(200, 200));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(button3, gridBagConstraints);

        button4.setMaximumSize(new java.awt.Dimension(200, 200));
        button4.setMinimumSize(new java.awt.Dimension(200, 200));
        button4.setPreferredSize(new java.awt.Dimension(200, 200));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(button4, gridBagConstraints);

        button5.setMaximumSize(new java.awt.Dimension(200, 200));
        button5.setMinimumSize(new java.awt.Dimension(200, 200));
        button5.setPreferredSize(new java.awt.Dimension(200, 200));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(button5, gridBagConstraints);

        button6.setMaximumSize(new java.awt.Dimension(200, 200));
        button6.setMinimumSize(new java.awt.Dimension(200, 200));
        button6.setPreferredSize(new java.awt.Dimension(200, 200));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(button6, gridBagConstraints);

        button7.setMaximumSize(new java.awt.Dimension(200, 200));
        button7.setMinimumSize(new java.awt.Dimension(200, 200));
        button7.setPreferredSize(new java.awt.Dimension(200, 200));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(button7, gridBagConstraints);

        button8.setMaximumSize(new java.awt.Dimension(200, 200));
        button8.setMinimumSize(new java.awt.Dimension(200, 200));
        button8.setPreferredSize(new java.awt.Dimension(200, 200));
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(button8, gridBagConstraints);

        button9.setMaximumSize(new java.awt.Dimension(200, 200));
        button9.setMinimumSize(new java.awt.Dimension(200, 200));
        button9.setPreferredSize(new java.awt.Dimension(200, 200));
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(button9, gridBagConstraints);

        jMenu1.setText("Juego");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comenzarDeNuevo.jpg"))); // NOI18N
        jMenuItem1.setText("Comenzar de nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrarResultados.png"))); // NOI18N
        jMenuItem2.setText("Mostrar Resultados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MostrarResultados mostrarResultados = new MostrarResultados(this, true, nombreIniUsuario1, nombreIniUsuario2, juegosGandosJugador1, juegosGandosJugador2, contadorEmpate);
        mostrarResultados.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here: 
        System.out.println("disponible " + logicaJuego.consultarPosicionDisponible(0, 0));
        positionX = 0;
        positionY = 0;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button1);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        positionX = 1;
        positionY = 0;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button2);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        positionX = 2;
        positionY = 0;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button3);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        positionX = 0;
        positionY = 1;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button4);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        positionX = 1;
        positionY = 1;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button5);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
        positionX = 2;
        positionY = 1;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button6);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        positionX = 0;
        positionY = 2;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button7);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        positionX = 1;
        positionY = 2;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button8);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        positionX = 2;
        positionY = 2;
        if (logicaJuego.consultarPosicionDisponible(positionX, positionY)) {
            contadorMovimientos++;
            identificaturno(button9);
            jugarPartida(positionX, positionY, fichaJugador, contadorMovimientos);
        }
    }//GEN-LAST:event_button9ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        contadorEmpate = 0;
        juegosGandosJugador1 = 0;
        juegosGandosJugador2 = 0;
        reiniciarJuego();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        try {
            try {
                // TODO add your handling code here:
                Desktop.getDesktop().browse(new URI("https://www.guiainfantil.com/articulos/ocio/juegos/juego-de-tres-en-raya-como-jugar-con-los-ninos-con-papel-y-lapiz/#:~:text=C%C3%B3mo%20se%20juega%3A%20En%20un,l%C3%ADnea%20vertical%2C%20horizontal%20o%20diagonal."));
            } catch (IOException ex) {
                // Logger.getLogger(VentanaJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(VentanaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenu2MouseClicked

    public void identificaturno(JButton button) {
        if (!(contadorMovimientos % 2 == 0)) {
            fichaJugador = fichaJug1;
            turnoJugador1 = true;
            turnoJugador2 = false;
            button.setIcon(new ImageIcon(getClass().getResource(urlImagen1)));
        } else {
            fichaJugador = fichaJug2;
            turnoJugador1 = false;
            turnoJugador2 = true;
            button.setIcon(new ImageIcon(getClass().getResource(urlImagen2)));
        }
    }

    public void jugarPartida(int posX, int posY, String fichaJugador, int cont) {
        //llenamos matriz del juego 
        logicaJuego.llenarMatriz(posX, posY, fichaJugador);

        //evaluar jugada si se gana el juego        
        if (logicaJuego.evaluarPartda(fichaJugador) == true) {
            if (turnoJugador1 == true) {
                nombreGanador = nombreJugadorUno;
                if (nombreJugadorUno.equals(nombreIniUsuario1)) {
                    juegosGandosJugador1++;
                } else {
                    juegosGandosJugador2++;
                }
                mostrarPantallaGanar();
                reiniciarJuego();
            } else {
                nombreGanador = nombreJugadorDos;
                if (nombreJugadorDos.equals(nombreIniUsuario2)) {
                    juegosGandosJugador2++;
                } else {
                    juegosGandosJugador1++;
                }

                mostrarPantallaGanar();
                reiniciarJuego();
            }

        } else {
            if (logicaJuego.evaluarEmpate(cont, fichaJugador)) {
                contadorEmpate++;
                mostrarVentanaEmpate();
                reiniciarJuego();
            }
        }
    }

    public void mostrarPantallaGanar() {
        VentanaGanar ventanaGanar = new VentanaGanar(this, true, nombreGanador);
        ventanaGanar.setVisible(true);
    }

    public void mostrarPantallaJugarDeNuevo() {
        VentanaJugarDeNuevo ventanaJugarDeNuevo = new VentanaJugarDeNuevo(this, true, nombreJugadorUno, nombreJugadorDos);
        ventanaJugarDeNuevo.setVisible(true);
        System.out.println("turno asignado" + ventanaJugarDeNuevo.getTurno());
        asignarTurnoJuegoDeNuevo(ventanaJugarDeNuevo.getTurno());
    }

    public void mostrarVentanaEmpate() {
        VentanaEmpate ventanaEmpate = new VentanaEmpate(this, true);
        ventanaEmpate.setVisible(true);
    }

    public void reiniciarJuego() {
        contadorMovimientos = 0;
        logicaJuego.reiniciarMatriz();
        button1.setIcon(null);
        button2.setIcon(null);
        button3.setIcon(null);
        button4.setIcon(null);
        button5.setIcon(null);
        button6.setIcon(null);
        button7.setIcon(null);
        button8.setIcon(null);
        button9.setIcon(null);

        mostrarPantallaJugarDeNuevo();

    }

    public void asignarTurnoJuegoDeNuevo(String turno) {
        if (nombreJugadorUno.equals(turno)) {
            fichaJug1 = "X";
            fichaJug2 = "O";
        } else {
            String nombreAuxiliar = nombreJugadorUno;
            nombreJugadorUno = nombreJugadorDos;
            nombreJugadorDos = nombreAuxiliar;
            String fichaAux = fichaJug1;
            fichaJug1 = fichaJug2;
            fichaJug2 = fichaAux;
            String urlsAux = urlImagen1;
            urlImagen1 = urlImagen2;
            urlImagen2 = urlsAux;
        }

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
