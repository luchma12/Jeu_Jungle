/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_jungle;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author albou
 */
public class Presentation extends JFrame {
    public Presentation() throws HeadlessException {
        setTitle("Présentation");
        setSize(700,570);
        JButton boutonJouer = new JButton("Jouer");
        JLabel labelTitre = new JLabel("Bienvenue dans la jungle !");
        
        labelTitre.setFont(new java.awt.Font("Bradley Hand ITC",0,36));
        
        boutonJouer.setBounds(50,50,100,100);
        
        ImageIcon fond_jungle = new ImageIcon(getClass().getResource("fond_jungle.jpg"));
        JLabel LabelFond = new JLabel(fond_jungle);
    }
}
