/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_jungle;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class FichiersParties {

    IHMPlateau ihmPlateau = new IHMPlateau();

    public void LireFichier(String nom) {
        int i = 0;
        System.out.print("LireFichier debut");

        try {
//            File fichier = new File("Sauvegarde_" + dateFormat.format(actuelle) + ".txt");
            File fichier = new File(nom);

            FileReader fr = new FileReader(fichier.getAbsoluteFile());
            BufferedReader br = new BufferedReader(fr);
            try {
                String ligne;
                while (i <= 8) {
//                    System.out.println("LireFichier : " + ligne);
                    ligne = br.readLine();
                    remplirLigne(ligne, i, ihmPlateau.pieces);
                    i++;
                }

                br.close();
                fr.close();
            } catch (IOException e) {
                System.out.println("Erreur lors de la lecture : " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'a pas été trouvé");
        }
        System.out.print("LireFichier fin\n");
        ihmPlateau.setVisible(true);
    }

    public void remplirLigne(String l, int i, String[][] p) {
        final String Separateur = " ";
        String element[] = l.split(Separateur);
        for (int j = 0; j < element.length; j++) {
//            if (element[j]== "null") {
//            p[i][j] = null;
//            } else {
            p[i][j] = element[j];
        }
//      System.out.println("remplirLigne => " + p[i][j]);

    }

}
