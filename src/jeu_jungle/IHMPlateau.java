/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_jungle;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author lucas
 */
public class IHMPlateau extends javax.swing.JFrame {

    private File fichierfond2 = new File("src/Image/fond2.png");
    private File fichierPlateau = new File("src/Image/Plateau.PNG");
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

    private BufferedImage imagefond2;
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

    int[] ligne = {65, 165, 265, 365, 465, 565, 665, 765, 865};
    int[] colonne = {600, 700, 800, 900, 1000, 1100, 1200};

    Boolean ElementSelectionne = FALSE;
    // Le joueur Bleu commence la partie
    Boolean JoueurBleu = TRUE;
    Boolean JoueurRouge = FALSE;

    TableauDesPieces tableauDesPieces;
    String[][] pieces;

    int coordonnee_c1 = 0;
    int coordonnee_l1 = 0;
    int coordonnee_c2 = 0;
    int coordonnee_l2 = 0;

    String imageCible;
    String NomJoueurBleu = null;
    String NomJoueurRouge = null;

    int c1 = 0;
    int l1 = 0;
    int c2 = 0;
    int l2 = 0;

    int PositionPriseXB = 50;
    int PositionPriseYB = 100;
    int PositionPriseXR = 50;
    int PositionPriseYR = 800;

    int NbrePiecesBleu = 0;
    int NbrePiecesRouge = 0;

    IHMMessageVictoire ihmMessageVictoire = new IHMMessageVictoire();

    /**
     * Creates new form IHMPlateau
     */
    public IHMPlateau() {
        this.tableauDesPieces = new TableauDesPieces();
        initComponents();
        setTitle("Plateau de jeu");
        setBounds(200, 50, 1500, 970);
        String joueur1 = null;
        String joueur2 = null;

        jLabelCommentaire.setFont(new Font("Segoe Script", 1, 24));
        jLabelCommentaire.setSize(500, 100);
        jLabelCommentaire.setForeground(Color.white);
        jLabelCommentaire.setText("<HTML> Le joueur Bleu commence </HTML>");

        jPanel1.setFocusable(true);
        pieces = tableauDesPieces.InitialisationTableauDesPieces();

        try {
            imagefond2 = ImageIO.read(fichierfond2);
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
                g.drawImage(imagefond2, 0, 0, 1500, 970, null);
                g.drawImage(imagePlateau, 580, 10, 700, 900, null);
                g.drawImage(imageElephantRouge, 1190, 220, 80, 80, null);
                g.drawImage(imageElephantBleu, 590, 620, 80, 80, null);
                g.drawImage(imageTigreRouge, 1190, 20, 80, 80, null);
                g.drawImage(imageTigreBleu, 590, 820, 80, 80, null);
                g.drawImage(imageLionRouge, 590, 20, 80, 80, null);
                g.drawImage(imageLionBleu, 1190, 820, 80, 80, null);
                g.drawImage(imageLeopardRouge, 790, 220, 80, 80, null);
                g.drawImage(imageLeopardBleu, 990, 620, 80, 80, null);
                g.drawImage(imageLoupRouge, 990, 220, 80, 80, null);
                g.drawImage(imageLoupBleu, 790, 620, 80, 80, null);
                g.drawImage(imageChienRouge, 690, 120, 80, 80, null);
                g.drawImage(imageChienBleu, 1090, 720, 80, 80, null);
                g.drawImage(imageChatRouge, 1090, 120, 80, 80, null);
                g.drawImage(imageChatBleu, 690, 720, 80, 80, null);
                g.drawImage(imageRatRouge, 590, 220, 80, 80, null);
                g.drawImage(imageRatBleu, 1190, 620, 80, 80, null);

            }
        };
        jButtonRejouer = new javax.swing.JButton();
        jButtonSauvegarde = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();
        jLabelNomJoueur2 = new javax.swing.JLabel();
        jLabelNomJoueur1 = new javax.swing.JLabel();
        jLabelCommentaire = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jButtonRejouer.setBackground(new java.awt.Color(132, 201, 132));
        jButtonRejouer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonRejouer.setForeground(new java.awt.Color(0, 102, 51));
        jButtonRejouer.setText("Rejouer");
        jButtonRejouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRejouerActionPerformed(evt);
            }
        });

        jButtonSauvegarde.setBackground(new java.awt.Color(131, 198, 131));
        jButtonSauvegarde.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSauvegarde.setForeground(new java.awt.Color(0, 102, 51));
        jButtonSauvegarde.setText("Sauvegarde");
        jButtonSauvegarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSauvegardeActionPerformed(evt);
            }
        });

        jButtonQuitter.setBackground(new java.awt.Color(132, 201, 132));
        jButtonQuitter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonQuitter.setForeground(new java.awt.Color(0, 102, 51));
        jButtonQuitter.setText("Quitter");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });

        jLabelNomJoueur2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNomJoueur2.setForeground(new java.awt.Color(255, 0, 0));

        jLabelNomJoueur1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelNomJoueur1.setForeground(new java.awt.Color(51, 51, 255));

        jLabelCommentaire.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRejouer)
                    .addComponent(jButtonQuitter))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNomJoueur1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNomJoueur2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSauvegarde))
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabelCommentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSauvegarde)
                .addGap(20, 20, 20)
                .addComponent(jButtonRejouer)
                .addGap(18, 18, 18)
                .addComponent(jButtonQuitter)
                .addGap(52, 52, 52)
                .addComponent(jLabelCommentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(jLabelNomJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        String ImageCible;
        Animal animal = new Animal();
        afficherPlateau();
        tableauDesPieces.AfficherTableauPieces(pieces);

        System.out.println("jPanel1MouseClicked => JoueurBleu = " + JoueurBleu);
        if (Objects.equals(ElementSelectionne, FALSE)) {
            System.out.println("jPanel1MouseClicked => Element sélectionne FALSE");
            int x1 = evt.getX();
            int y1 = evt.getY();
            // Vérifie qu'il a cliqué dans le plateau
            if ((inPlateau(x1, y1))) {
                c1 = ((x1 - 590) / 100);
                coordonnee_c1 = colonne[c1];
                l1 = (y1 / 100);
                coordonnee_l1 = ligne[l1];
                System.out.println("jPanel1MouseClicked => Contenu de la case sélectionnée : " + pieces[l1][c1]);
                if (JoueurBleu == TRUE) {
                    if (animal.IsAnimalJoueurBleu(pieces[l1][c1])) {
                        // Tant que la case sélectionnée ne contient pas un pion de la bonne couleur
                        // => continuer à cliquer, on recommence
                        imageCible = "image" + pieces[l1][c1];
                        ElementSelectionne = TRUE;
                        System.out.println("jPanel1MouseClicked => Element sélectionne BLEU OK");
                        jLabelCommentaire.setText("<HTML>" + "Le joueur bleu a sélectionné le " + " " + pieces[l1][c1] + "</HTML>");
                    } else {
                        jLabelCommentaire.setText("<HTML> Veuillez sélectionner un animal bleu </HTML>");

                    }
                }
                if (JoueurRouge == TRUE) {
                    if (animal.IsAnimalJoueurRouge(pieces[l1][c1])) {
                        imageCible = "image" + pieces[l1][c1];
                        ElementSelectionne = TRUE;
                        System.out.println("=> Element sélectionne ROUGE OK");
                        jLabelCommentaire.setText("<HTML>" + "Le joueur rouge a sélectionné le " + " " + pieces[l1][c1] + "</HTML>");
                    } else {
                        jLabelCommentaire.setText("<HTML> Veuillez sélectionner un animal rouge </HTML>");
                    }
                }
            }
        } else {
            int x2 = evt.getX();
            int y2 = evt.getY();
            if ((inPlateau(x2, y2))) {
                /* Formule a revoir */
                c2 = ((x2 - 590) / 100);
                coordonnee_c2 = colonne[c2];
                l2 = (y2 / 100);
                coordonnee_l2 = ligne[l2];
                if (animal.IsLegalMouvement(pieces, l1, c1, l2, c2)) {
                    if (animal.win(pieces[l2][c2], this.NomJoueurBleu, this.NomJoueurRouge)) {
                        ihmMessageVictoire.recupPlateau(this, animal.gagnant);
                    }
                    // Utiliser lors du chargement d'une partie pour convertir le "null" en null
                    System.out.println("jPanel1MouseClicked => pieces l2 c2 = " + pieces[l2][c2]);
                    if ((pieces[l2][c2] instanceof String) && pieces[l2][c2].equals("null")) {
                        System.out.println("jPanel1MouseClicked => pieces l2 c2 est nulle");
                        pieces[l2][c2] = null;
                    }
//                    tableauDesPieces.AfficherTableauPieces(pieces);

                    if (pieces[l2][c2] != null) {
//                    if (!pieces[l2][c2].equals("null")) {
                        if (animal.combat(pieces, l1, c1, l2, c2) == pieces[l1][c1]) {
                            try {
                                afficherPrise(pieces[l2][c2]);
                            } catch (IOException ex) {
                                Logger.getLogger(IHMPlateau.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            jLabelCommentaire.setText("<HTML>" + pieces[l1][c1] + " a gagné le combat" + "</HTML>");
                            tableauDesPieces.majTableauPiece(pieces, c1, l1, c2, l2);

                            // Afficher piece prise "pieces[l2][c2]" à gauche du plateau
                        } else {
//                            tableauDesPieces.AfficherTableauPieces(pieces);
                            try {
                                // Afficher piece prise "pieces[l1][c1]" à gauche du plateau
                                afficherPrise(pieces[l1][c1]);
//                                afficherPrise(pieces[l1][c1], "bleu");
                            } catch (IOException ex) {
                                Logger.getLogger(IHMPlateau.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            jLabelCommentaire.setText("<HTML>" + pieces[l2][c2] + " a gagné le combat" + "</HTML>");
                            pieces[l1][c1] = null;
                        }
                    } else {
                        // si case 2 = null
                        System.out.println("jPanel1MouseClicked => pieces l2 c2 = 2 " + pieces[l2][c2]);
                        tableauDesPieces.majTableauPiece(pieces, c1, l1, c2, l2);
                    }
                    afficherPlateau();
                    // Passer la main à l'autre joueur
                    ElementSelectionne = FALSE;
                    changerDeJoueur();
                } else {
                    jLabelCommentaire.setText("<HTML> Le mouvement est impossible </HTML>");
                }
            }
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonQuitterActionPerformed

    private void jButtonSauvegardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSauvegardeActionPerformed
        sauvegarderPartie();
    }//GEN-LAST:event_jButtonSauvegardeActionPerformed

    private void jButtonRejouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRejouerActionPerformed
        this.setVisible(false); // quitter la partie en cours
//        this.setVisible(true); // Afficher un nouveau plateau
        IHMNom_Joueur ihmNom_Joueur = new IHMNom_Joueur();
        ihmNom_Joueur.setVisible(true);
    }//GEN-LAST:event_jButtonRejouerActionPerformed
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
            java.util.logging.Logger.getLogger(IHMPlateau.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IHMPlateau.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IHMPlateau.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IHMPlateau.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IHMPlateau().setVisible(true);
            }
        });
    }

    public void afficherPlateau() {
        Graphics g = this.getGraphics();
        BufferedImage image;
        g.clearRect(590, 55, 700, 900);
        g.drawImage(imagePlateau, 590, 55, 700, 900, null);
//        System.out.println("afficherPlateau: ");
//        tableauDesPieces.AfficherTableauPieces(pieces);
        for (int NumLigne = 0; NumLigne < 9; NumLigne++) {
            for (int NumCol = 0; NumCol < 7; NumCol++) {
                image = imageAnimal(pieces[NumLigne][NumCol]);
//                System.out.println("afficherPlateau pieces= "+ pieces[NumLigne][NumCol]);
//                System.out.println("afficherPlateau image= "+ image);
                g.drawImage(image, colonne[NumCol], ligne[NumLigne], 80, 80, null);
            }
        }
    }

    public void changerDeJoueur() {
        if (JoueurBleu == TRUE) {
            JoueurBleu = FALSE;
            JoueurRouge = TRUE;
            jLabelCommentaire.setText("Au tour du joueur rouge");
        } else {
            JoueurBleu = TRUE;
            JoueurRouge = FALSE;
            jLabelCommentaire.setText("Au tour du joueur bleu");
        }
    }

    public boolean inPlateau(int x, int y) {
        if ((x < 590) || (x > 1290)) {
            System.out.println("inPlateau => Hors du cadre x");
            jLabelCommentaire.setText("<HTML> Veuillez sélectionner une case du plateau </HTML>");
            return false;
        } else if ((y < 20) || (y > 955)) {
            System.out.println("inPlateau => Hors du cadre y");
            jLabelCommentaire.setText("<HTML> Veuillez sélectionner une case du plateau </HTML>");
            return false;
        } else {
            return true;
        }
    }

    public void afficherNomJoueur(String jB, String jR) {
        NomJoueurBleu = jB;
        NomJoueurRouge = jR;
        jLabelNomJoueur1.setText("Joueur Bleu : " + jB);
        jLabelNomJoueur2.setText("Joueur Rouge : " + jR);
    }

    public char CouleurPièces(String piece) {
        if (piece.contains("Bleu")) {
            return 'b';
        } else {
            return 'r';
        }
    }

    public void afficherPrise(String piece) throws IOException {
        Graphics g = this.getGraphics();
        BufferedImage image = imageAnimal(piece);
        if (CouleurPièces(piece) == 'b') {
            NbrePiecesBleu += 1;
            g.drawImage(image, PositionPriseXB, PositionPriseYB, 80, 80, null);
            if (NbrePiecesBleu == 8) {
                ihmMessageVictoire.recupPlateau(this, NomJoueurBleu);
            }
            // affiche les pions mangés en dehors du plateau
            if (PositionPriseXB < 400) {
                PositionPriseXB += 100;
            } else {
                PositionPriseXB = 50;
                PositionPriseYB += 100;
            }
        } else {
            NbrePiecesRouge += 1;
            g.drawImage(image, PositionPriseXR, PositionPriseYR, 80, 80, null);
            if (NbrePiecesRouge == 8) {
                ihmMessageVictoire.recupPlateau(this, NomJoueurRouge);
            }
            // affiche les pions mangés en dehors du plateau
            if (PositionPriseXR < 400) {
                PositionPriseXR += 100;
            } else {
                PositionPriseXR = 50;
                PositionPriseYR -= 100;
            }
        }
    }

    public void sauvegarderPartie() {
//        Date actuelle = new Date();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");

        try {
//            File fichier = new File("Sauvegarde_" + dateFormat.format(actuelle) + ".txt");
            File fichier = new File("C:\\Users\\lucas\\OneDrive\\Documents\\NetBeansProjects\\Jeu_Jungle\\Parties_Sauvegardees\\Sauvegarde.txt");
            // créer le fichier s'il n'existe pas
            if (!fichier.exists()) {
                fichier.createNewFile();
            }
            FileWriter fw = new FileWriter(fichier.getAbsoluteFile());
            for (int NumLigne = 0; NumLigne < 9; NumLigne++) {

                for (int NumCol = 0; NumCol < 7; NumCol++) {
                    fw.write(pieces[NumLigne][NumCol] + " ");
                }
                fw.write("\n");
            }
            fw.write(NomJoueurBleu + "\n");
            fw.write(NomJoueurRouge + "\n");
            fw.close();

            jLabelCommentaire.setText("<HTML> Votre partie a bien été sauvegardée </HTML>");

        } catch (IOException e) {
        }
    }

    public void enregistrerDeplacement() {
        Date actuelle = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        try {
            File fichier = new File("Déplacement_" + dateFormat.format(actuelle) + ".txt");
            // créer le fichier s'il n'existe pas
            if (!fichier.exists()) {
                fichier.createNewFile();
            }
            FileWriter fw = new FileWriter(fichier.getAbsoluteFile());
            fw.write("Déplacement n°" + "");
            fw.write("\n");
            for (int NumLigne = 0; NumLigne < 9; NumLigne++) {
                fw.write("\n");
                for (int NumCol = 0; NumCol < 7; NumCol++) {
                    fw.write(pieces[NumLigne][NumCol] + " ");
                }
            }
            fw.close();
        } catch (IOException e) {
        }
    }

    // Transforme la String contenant l'animal en une BufferedImage
    public BufferedImage imageAnimal(String animal) {
        if (null != animal) {
            switch (animal) {
                case "LionRouge":
                    return imageLionRouge;
                case "TigreRouge":
                    return imageTigreRouge;
                case "ChienRouge":
                    return imageChienRouge;
                case "ChatRouge":
                    return imageChatRouge;
                case "RatRouge":
                    return imageRatRouge;
                case "LeopardRouge":
                    return imageLeopardRouge;
                case "LoupRouge":
                    return imageLoupRouge;
                case "ElephantRouge":
                    return imageElephantRouge;
                case "LionBleu":
                    return imageLionBleu;
                case "TigreBleu":
                    return imageTigreBleu;
                case "ChienBleu":
                    return imageChienBleu;
                case "ChatBleu":
                    return imageChatBleu;
                case "RatBleu":
                    return imageRatBleu;
                case "LeopardBleu":
                    return imageLeopardBleu;
                case "LoupBleu":
                    return imageLoupBleu;
                case "ElephantBleu":
                    return imageElephantBleu;
                default:
                    return null;
            }
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JButton jButtonRejouer;
    private javax.swing.JButton jButtonSauvegarde;
    private javax.swing.JLabel jLabelCommentaire;
    private javax.swing.JLabel jLabelNomJoueur1;
    private javax.swing.JLabel jLabelNomJoueur2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
