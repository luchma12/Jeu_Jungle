/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_jungle;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author albou
 */
public class Presentation extends JFrame {

    public Presentation() throws HeadlessException {

        setTitle("Présentation");
        setBounds(650, 250, 700, 570);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        IHMNom_Joueur ihmNom_joueur = new IHMNom_Joueur();

        JButton boutonJouer = new JButton("Jouer");

        JLabel labelTitre = new JLabel("Bienvenue dans la jungle !");
        labelTitre.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon image = new ImageIcon("src/Image/fond_jungle.jpg");
        JLabel JLabelImage = new JLabel(image);

        labelTitre.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36));

        boutonJouer.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ihmNom_joueur.setVisible(true);
            }
        });

        this.add(JLabelImage);

        JPanel btns_panel = new JPanel();
        btns_panel.setLayout(new BorderLayout());
        btns_panel.add(labelTitre, BorderLayout.CENTER);
        btns_panel.add(boutonJouer, BorderLayout.SOUTH);
        
        this.add(btns_panel, BorderLayout.CENTER);

    }
}
