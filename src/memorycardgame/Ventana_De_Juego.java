package memorycardgame;

import Test_Nueva_Logica.Logica_Para_Memoria;
import javax.swing.ImageIcon; 

public class Ventana_De_Juego extends javax.swing.JFrame {
   
    private Logica_Para_Memoria log = new Logica_Para_Memoria(); 
    
    public Ventana_De_Juego() {
        initComponents();
        DesordenarCartas(); 
    }

    private void DesordenarCartas() {
        
        int[] NumeroCarta = log.ObtenerNCarta();  
        
        BT1.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[0]+ ".png"))); 
        BT2.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[1]+ ".png"))); 
        BT3.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[2]+ ".png"))); 
        BT4.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[3]+ ".png"))); 
        BT5.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[4]+ ".png"))); 
        BT6.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[5]+ ".png"))); 
        BT7.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[6]+ ".png"))); 
        BT8.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[7]+ ".png"))); 
        BT9.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[8]+ ".png"))); 
        BT10.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[9]+ ".png"))); 
        BT11.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[10]+ ".png"))); 
        BT12.setDisabledIcon(new ImageIcon(getClass().getResource("/Imagenes/Cartas"+ NumeroCarta[11]+ ".png")));  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BT11 = new javax.swing.JButton();
        BT12 = new javax.swing.JButton();
        BT9 = new javax.swing.JButton();
        BT10 = new javax.swing.JButton();
        BT1 = new javax.swing.JButton();
        BT2 = new javax.swing.JButton();
        BT3 = new javax.swing.JButton();
        BT4 = new javax.swing.JButton();
        BT7 = new javax.swing.JButton();
        BT8 = new javax.swing.JButton();
        BT5 = new javax.swing.JButton();
        BT6 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO DE CARTAS better.jpg"))); // NOI18N
        jButton3.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Memoria Pokemon");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BT11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT11.setBorder(null);
        BT11.setBorderPainted(false);
        BT11.setContentAreaFilled(false);
        BT11.setFocusable(false);
        BT11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT12.setBorder(null);
        BT12.setBorderPainted(false);
        BT12.setContentAreaFilled(false);
        BT12.setFocusable(false);
        BT12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT9.setBorder(null);
        BT9.setBorderPainted(false);
        BT9.setContentAreaFilled(false);
        BT9.setFocusable(false);
        BT9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT10.setBorder(null);
        BT10.setBorderPainted(false);
        BT10.setContentAreaFilled(false);
        BT10.setFocusable(false);
        BT10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT1.setBorder(null);
        BT1.setBorderPainted(false);
        BT1.setContentAreaFilled(false);
        BT1.setFocusable(false);
        BT1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });

        BT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT2.setBorder(null);
        BT2.setBorderPainted(false);
        BT2.setContentAreaFilled(false);
        BT2.setFocusable(false);
        BT2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT3.setBorder(null);
        BT3.setBorderPainted(false);
        BT3.setContentAreaFilled(false);
        BT3.setFocusable(false);
        BT3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT4.setBorder(null);
        BT4.setBorderPainted(false);
        BT4.setContentAreaFilled(false);
        BT4.setFocusable(false);
        BT4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT7.setBorder(null);
        BT7.setBorderPainted(false);
        BT7.setContentAreaFilled(false);
        BT7.setFocusable(false);
        BT7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT8.setBorder(null);
        BT8.setBorderPainted(false);
        BT8.setContentAreaFilled(false);
        BT8.setFocusable(false);
        BT8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT5.setBorder(null);
        BT5.setBorderPainted(false);
        BT5.setContentAreaFilled(false);
        BT5.setFocusable(false);
        BT5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        BT6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartas0.jpg"))); // NOI18N
        BT6.setBorder(null);
        BT6.setBorderPainted(false);
        BT6.setContentAreaFilled(false);
        BT6.setFocusable(false);
        BT6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CartasR.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BT1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BT5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BT9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BT12)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BT3)
                    .addComponent(BT1)
                    .addComponent(BT4)
                    .addComponent(BT2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BT7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BT5)
                                    .addComponent(BT8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BT9)
                            .addComponent(BT12)
                            .addComponent(BT11)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BT6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT10)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT1ActionPerformed
 
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
            java.util.logging.Logger.getLogger(Ventana_De_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_De_Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT1;
    private javax.swing.JButton BT10;
    private javax.swing.JButton BT11;
    private javax.swing.JButton BT12;
    private javax.swing.JButton BT2;
    private javax.swing.JButton BT3;
    private javax.swing.JButton BT4;
    private javax.swing.JButton BT5;
    private javax.swing.JButton BT6;
    private javax.swing.JButton BT7;
    private javax.swing.JButton BT8;
    private javax.swing.JButton BT9;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
} 
