/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_jungle;

/**
 *
 * @author lucas
 */
public class Animal {

    String gagnant = null;

    @SuppressWarnings("empty-statement")
    // renvoie True si la pièce sélectionnée est un animal bleu
    public boolean IsAnimalJoueurBleu(String a) {
        System.out.println("Le joueur bleu a sélectionné le  " + a);
        if ((a == "ElephantBleu") || (a == "LoupBleu") || (a == "LeopardBleu") || (a == "RatBleu") || (a == "ChatBleu")
                || (a == "ChienBleu") || (a == "TigreBleu") || (a == "LionBleu")) {
            return true;
        }
        return false;
    }

    public boolean IsAnimalJoueurRouge(String a) {
        System.out.println("Le joueur rouge a sélectionné le  " + a);
        if ((a == "ElephantRouge") || (a == "LoupRouge") || (a == "LeopardRouge") || (a == "RatRouge") || (a == "ChatRouge")
                || (a == "ChienRouge") || (a == "TigreRouge") || (a == "LionRouge")) {
            return true;
        }
        return false;
    }

    public boolean IsLegalMouvement(int c1, int l1, int l2, int c2) {
        if ((l2 == l1 - 1) && (c2 == c1)) {
            System.out.println("Le mouvement est legal part1");
            return true;
        } else if ((l2 == l1 + 1) && (c2 == c1)) {
            System.out.println("Le mouvement est legal part2");
            return true;
        } else if ((l2 == l1) && (c2 == c1 - 1)) {
            System.out.println("Le mouvement est legal part3");
            return true;
        } else if ((l2 == l1) && (c2 == c1 + 1)) {
            System.out.println("Le mouvement est legal part4");
            return true;
        }
        System.out.println("Le mouvement est illegal");
        return false;
    }

    public boolean win(String a, String jB, String jR) {
        System.out.println("isAnimal  " + a);
        if (a == "TaniereRouge") {
            System.out.println("Les bleus ont gagné");
            this.gagnant = jB;
            return true;
        } else if (a == "TaniereBleu") {
            System.out.println("Les rouges ont gagné");
            this.gagnant = jR;
            return true;
        } else {
            return false;
        }
    }

    public void capture() {

    }
}
