/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_jungle;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author lucas
 */
public class TableauDesPieces {

    /* Attributs */
//    String[][] pieces;
    public String[][] InitialisationTableauDesPieces() {
        String[][] pieces = {{"LionRouge", null, null, null, null, null, "TigreRouge"},
        {null, "ChienRouge", null, null, null, "ChatRouge", null},
        {"RatRouge", null, "LeopardRouge", null, "LoupRouge", null, "ElephantRouge"},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null},
        {"ElephantBleu", null, "LoupBleu", null, "LeopardBleu", null, "RatBleu"},
        {null, "ChatBleu", null, null, null, "ChienBleu", null},
        {"TigreBleu", null, null, null, null, null, "LionBleu"},};
        return (pieces);
    }

    public void AfficherTableauPieces(String[][] p) {
        System.out.println("Affichage du tableau pieces : ");
        for (int NumLigne = 0; NumLigne < 9; NumLigne++) {
            for (int NumCol = 0; NumCol < 7; NumCol++) {
                System.out.print(p[NumLigne][NumCol] + " ");
            }
            System.out.println();
        }
    }

    public void movePiece(Graphics g, Image i, int froml, int fromc, int tol, int toc) {
//            System.out.println("Move pieces : " + froml + " " + fromc + " " + tol + " " + toc);
        g.drawImage(i, toc + 10, tol + 45, 80, 80, null);
        g.clearRect(fromc + 10, froml + 45, 82, 82);
//            System.out.println("apres de drawImage");
    }

    public void majTableauPiece(String[][] p, int c1, int l1, int c2, int l2) {
        /* Mise à jour du tableau pieces */
//                this.AfficherTableauPieces(p);
        //            System.out.println("Pieces de départ :  " +p[c1][l1]);
        //            System.out.println("Nelle ligne l1 : " + l1 + "Nouvelle colonne c1: " + c1 + "Pieces : " + p[l1][c1]);
        p[l2][c2] = p[l1][c1];
        p[l1][c1] = null;
//            System.out.println("Nelle ligne : " + l2 + "Nouvelle colonne : " + c2 + "Pieces : " + p[l2][c2]);
//                 this.AfficherTableauPieces(p);
    }

}
