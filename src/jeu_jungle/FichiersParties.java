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
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author lucas
 */
public class FichiersParties {

    IHMPlateau ihmPlateau = new IHMPlateau();
    
    @SuppressWarnings("empty-statement")
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
                ihmPlateau.NomJoueurBleu = br.readLine();
                ihmPlateau.NomJoueurRouge = br.readLine();
                ihmPlateau.afficherNomJoueur(ihmPlateau.NomJoueurBleu, ihmPlateau.NomJoueurRouge);
                remplirPrises(br.readLine());
//                Graphics g = ihmPlateau.getGraphics();
//                ihmPlateau.afficherLesPrises(g);
                ihmPlateau.NbPrises = Integer.parseInt(br.readLine());
                if ("true".equals(br.readLine())) { 
                    ihmPlateau.JoueurBleu = TRUE;
                } else
                {
                    ihmPlateau.JoueurBleu = FALSE;
                };
                if ("true".equals(br.readLine())) { 
                    ihmPlateau.JoueurRouge = TRUE;
                } else
                {
                    ihmPlateau.JoueurRouge = FALSE;
                };
                System.out.println("LireFichier: JoueurBleu = " + ihmPlateau.JoueurBleu);
                System.out.println("LireFichier: JoueurRouge = " + ihmPlateau.JoueurRouge);
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
//            p[i][j] = null; System.out.println("\n remplirLigne => element = " + element);
//            } else {
//            System.out.println("\n remplirLigne => element[j] = " + element[j] + " j = " + j);
            p[i][j] = element[j];
        }
//      System.out.println("remplirLigne => " + p[i][j]);

    }

    
     public void remplirPrises(String l) throws IOException {
        final String Separateur = " ";
//        System.out.println("\n remplirPrises => l = " + l);
        String element[] = l.split(Separateur);
//        System.out.println("\n remplirPrises => element = " + element);
        for (int j = 0; j < element.length; j++) {
//            if (element[j]== "null") {
//            p[i][j] = null;
//            } else {
//            System.out.println("remplirPrises => " + element[j]);
            ihmPlateau.prises[j] = element[j];
//            System.out.println("\n remplirPrise => ihmPlateau[j] = " + ihmPlateau.prises[j] + " j = " + j);
//            System.out.println("\n remplirPrises => " + ihmPlateau.prises);
//            Graphics g = ihmPlateau.getGraphics();
//            ihmPlateau.afficherLesPrises(g);
        }
//      System.out.println("remplirLigne => " + p[i][j]);

    }
}
