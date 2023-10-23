package juego_de_memoria;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JPanel; 


public class Ventana_Juego extends javax.swing.JFrame {
    
    public Ventana_Juego() {
        FondoPanel fondoPanel = new FondoPanel(); 
        setContentPane(fondoPanel);        
        MusicPlayer player = new MusicPlayer(); 
        initComponents(); 
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pointRed = new javax.swing.JLabel();
        pointBlue = new javax.swing.JLabel();
        turnoA = new javax.swing.JLabel();
        turnoB = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        intentoRed = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        intentoBlue = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carta0.jpg"))); // NOI18N
        jButton10.setBorder(null);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carta0.jpg"))); // NOI18N
        jButton11.setBorder(null);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carta0.jpg"))); // NOI18N
        jButton12.setBorder(null);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carta0.jpg"))); // NOI18N
        jButton13.setBorder(null);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carta0.jpg"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartaR.jpg"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(1);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));

        PanelPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        PanelPrincipal.setForeground(new java.awt.Color(102, 102, 102));
        PanelPrincipal.setAlignmentX(0.0F);
        PanelPrincipal.setAlignmentY(0.0F);
        PanelPrincipal.setOpaque(false);
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Red");
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(300, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Blue");
        jLabel2.setMaximumSize(new java.awt.Dimension(300, 100));
        jLabel2.setMinimumSize(new java.awt.Dimension(300, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 100));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Puntaje:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Puntaje:");

        pointRed.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        pointRed.setForeground(new java.awt.Color(255, 255, 255));
        pointRed.setText("0");

        pointBlue.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        pointBlue.setForeground(new java.awt.Color(255, 255, 255));
        pointBlue.setText("0");

        turnoA.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        turnoA.setForeground(new java.awt.Color(0, 0, 0));
        turnoA.setText("Turno:");

        turnoB.setFont(new java.awt.Font("Dialog", 1, 64)); // NOI18N
        turnoB.setForeground(new java.awt.Color(0, 0, 0));
        turnoB.setText("Red");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton para Regresar.jpg"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton para Regresar seleccionado.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton para Salir.jpg"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton para Salir Seleccionado.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Intentos:");

        intentoRed.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        intentoRed.setForeground(new java.awt.Color(255, 255, 255));
        intentoRed.setText("0");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Intentos:");

        intentoBlue.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        intentoBlue.setForeground(new java.awt.Color(255, 255, 255));
        intentoBlue.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intentoRed)
                                    .addComponent(pointRed))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(turnoA)
                        .addGap(30, 30, 30)
                        .addComponent(turnoB)
                        .addGap(472, 472, 472)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pointBlue)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(intentoBlue)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pointBlue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(intentoBlue)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pointRed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(intentoRed))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnoA, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turnoB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        this.dispose();
        Ventana_MenuPrincipal.MostrarVentana();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        this.dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    class MusicPlayer {
        public Clip clip;
            public void play(String path) {
                try {
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile());
                    clip = AudioSystem.getClip();
                    clip.open(audioInputStream);
                    clip.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            public void stop() {
                if (clip != null && clip.isRunning()) {
                    clip.stop();
                }
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelPrincipal;
    public static javax.swing.JLabel intentoBlue;
    public static javax.swing.JLabel intentoRed;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel pointBlue;
    public static javax.swing.JLabel pointRed;
    private javax.swing.JLabel turnoA;
    public static javax.swing.JLabel turnoB;
    // End of variables declaration//GEN-END:variables

    public JPanel getjPanel1() {
        return PanelPrincipal;
    }
    
    class FondoPanel extends JPanel 
    {
        private Image imagen;  
        
        @Override
        public void paint(Graphics g)   
        {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg")).getImage();  
            g.drawImage(imagen, 0, 0, getWidth() , getHeight(), this); 
            
            setOpaque(false); 
            super.paint(g); 
            }
        }
    
}
