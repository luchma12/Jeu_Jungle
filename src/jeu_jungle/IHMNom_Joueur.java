/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_jungle;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author albou
 */
public class IHMNom_Joueur extends javax.swing.JFrame {
    
    private File fichierfond2 = new File ("src/Image/fond2.png");
    
    private BufferedImage imagefond2;
    
    public IHMNom_Joueur() {
        
        initComponents();
        setTitle("Nom des joueurs");
        
        setBounds(650, 250, 600, 500);
        jPanelFond.setFocusable(true);
        try {
            imagefond2 = ImageIO.read(fichierfond2);
                      
        } catch (IOException ex) {
            System.out.println("fichier introuvable");
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanelFond = new javax.swing.JPanel(){
            public void paintComponent (Graphics g){
                g.drawImage(imagefond2,0,0,600,500,null);

            }}
            ;
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jTextFieldJoueur2 = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            jButtonValider = new javax.swing.JButton();
            jTextFieldJoueur1 = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 204));
            jLabel1.setText("Veuillez insérer le nom des joueurs ");

            jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 204));
            jLabel2.setText("Nom du joueur 2");

            jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 204));
            jLabel3.setText("Nom du joueur 1");

            jButtonValider.setBackground(new java.awt.Color(132, 201, 132));
            jButtonValider.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButtonValider.setForeground(new java.awt.Color(0, 102, 51));
            jButtonValider.setText("Valider");
            jButtonValider.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonValiderActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanelFondLayout = new javax.swing.GroupLayout(jPanelFond);
            jPanelFond.setLayout(jPanelFondLayout);
            jPanelFondLayout.setHorizontalGroup(
                jPanelFondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFondLayout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(jLabel1)
                    .addContainerGap(91, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelFondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondLayout.createSequentialGroup()
                                    .addComponent(jButtonValider)
                                    .addGap(27, 27, 27))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondLayout.createSequentialGroup()
                                    .addComponent(jTextFieldJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(169, 169, 169))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(229, 229, 229))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(230, 230, 230))))
            );
            jPanelFondLayout.setVerticalGroup(
                jPanelFondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFondLayout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jLabel1)
                    .addGap(64, 64, 64)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextFieldJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextFieldJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                    .addComponent(jButtonValider)
                    .addGap(20, 20, 20))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelFond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelFond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        IHMPlateau ihmPlateau = new IHMPlateau();
        ihmPlateau.setVisible(true); // afficher le plateau
        this.setVisible(false);
    }//GEN-LAST:event_jButtonValiderActionPerformed

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
            java.util.logging.Logger.getLogger(IHMNom_Joueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHMNom_Joueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHMNom_Joueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHMNom_Joueur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHMNom_Joueur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelFond;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldJoueur1;
    private javax.swing.JTextField jTextFieldJoueur2;
    // End of variables declaration//GEN-END:variables
}