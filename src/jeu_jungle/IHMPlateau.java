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
 * @author lucas
 */
public class IHMPlateau extends javax.swing.JFrame {
    
    private File fichierPlateau = new File("src/Image/plateau.jpg");
    private File fichierElephantRouge = new File("src/Image/EléphantRouge.png");
    private File fichierElephantBleu = new File("src/Image/EléphantBleu.png");
    private File fichierTigreRouge = new File("src/Image/TigreRouge.png");
    private File fichierTigreBleu = new File("src/Image/TigreBleu.png");
    private File fichierLionRouge = new File("src/Image/LionRouge.png");
    private File fichierLionBleu = new File("src/Image/LionBleu.png");
    private File fichierLeopardRouge = new File("src/Image/LéopardRouge.png");
    private File fichierLeopardBleu = new File("src/Image/LéopardBleu.png");
    private File fichierLoupRouge = new File("src/Image/LoupRouge.png");
    private File fichierLoupBleu = new File("src/Image/LoupBleu.png");
    private File fichierChienRouge = new File("src/Image/ChienRouge.png");
    private File fichierChienBleu = new File("src/Image/ChienBleu.png");
    private File fichierChatRouge = new File("src/Image/ChatRouge.png");
    private File fichierChatBleu = new File("src/Image/ChatBleu.png");
    private File fichierRatRouge = new File("src/Image/RatRouge.png");
    private File fichierRatBleu = new File("src/Image/RatBleu.png");

    private BufferedImage imagePlateau;
    private BufferedImage imageElephantRouge;
    private BufferedImage imageElephantBleu;
    private BufferedImage imageTigreRouge;
    private BufferedImage imageTigreBleu;
    private BufferedImage imageLionRouge;
    private BufferedImage imageLionBleu;
    private BufferedImage imageLeopardRouge;
    private BufferedImage imageLeopardBleu;
    private BufferedImage imageLoupRouge;
    private BufferedImage imageLoupBleu;
    private BufferedImage imageChienRouge;
    private BufferedImage imageChienBleu;
    private BufferedImage imageChatRouge;
    private BufferedImage imageChatBleu;
    private BufferedImage imageRatRouge;
    private BufferedImage imageRatBleu;

    /**
     * Creates new form IHMPlateau
     */
    public IHMPlateau() {
        initComponents();
        setBounds(0, 0, 1000, 943);
        jPanel1.setFocusable(true);
        try {
            imagePlateau = ImageIO.read(fichierPlateau);
            imageElephantRouge = ImageIO.read(fichierElephantRouge);
            imageElephantBleu = ImageIO.read(fichierElephantBleu);
            imageTigreRouge = ImageIO.read(fichierTigreRouge);
            imageTigreBleu = ImageIO.read(fichierTigreBleu);
            imageLionRouge = ImageIO.read(fichierLionRouge);
            imageLionBleu = ImageIO.read(fichierLionBleu);
            imageLeopardRouge = ImageIO.read(fichierLeopardRouge);
            imageLeopardBleu = ImageIO.read(fichierLeopardBleu);
            imageLoupRouge = ImageIO.read(fichierLoupRouge);
            imageLoupBleu = ImageIO.read(fichierLoupBleu);
            imageChienRouge = ImageIO.read(fichierChienRouge);
            imageChienBleu = ImageIO.read(fichierChienBleu);
            imageChatRouge = ImageIO.read(fichierChatRouge);
            imageChatBleu = ImageIO.read(fichierChatBleu);
            imageRatRouge = ImageIO.read(fichierRatRouge);
            imageRatBleu = ImageIO.read(fichierRatBleu);


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

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                g.drawImage(imagePlateau, 0,0, null);
                g.drawImage(imageElephantRouge, 610, 210, 80, 80, null);
                g.drawImage(imageElephantBleu, 10, 610, 80, 80, null);
                g.drawImage(imageTigreRouge, 610, 10, 80, 80, null);
                g.drawImage(imageTigreBleu, 10, 810, 80, 80, null);
                g.drawImage(imageLionRouge, 10, 10, 80, 80, null);
                g.drawImage(imageLionBleu, 610, 810, 80, 80, null);
                g.drawImage(imageLeopardRouge, 210, 210, 80, 80, null);
                g.drawImage(imageLeopardBleu, 410, 610, 80, 80, null);
                g.drawImage(imageLoupRouge, 410, 210, 80, 80, null);
                g.drawImage(imageLoupBleu, 210, 610, 80, 80, null);
                g.drawImage(imageChienRouge, 110, 110, 80, 80, null);
                g.drawImage(imageChienBleu, 510, 710, 80, 80, null);
                g.drawImage(imageChatRouge, 510, 110, 80, 80, null);
                g.drawImage(imageChatBleu, 110, 710, 80, 80, null);
                g.drawImage(imageRatRouge, 10, 210, 80, 80, null);
                g.drawImage(imageRatBleu, 610, 610, 80, 80, null);

            }
        };
        jButtonRejouer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRejouer.setText("Rejouer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jButtonRejouer)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jButtonRejouer)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(IHMPlateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHMPlateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHMPlateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHMPlateau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHMPlateau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRejouer;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
