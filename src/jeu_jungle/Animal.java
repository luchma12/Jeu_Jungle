/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu_jungle;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class Animal {

    public String gagnant = null;
    public String animal1[];
    public String animal2[];
    // Cases situées au bord de la rivère
    String riviere[];

    public Animal() {
        this.riviere = new String[]{
            "2,1,6,1", "6,1,2,1",
            "2,2,6,2", "6,2,2,2",
            "2,4,6,4", "6,4,2,4",
            "2,5,6,5", "6,5,2,5",
            "3,0,3,3", "3,3,3,0",
            "4,0,4,3", "4,3,4,0",
            "5,0,5,3", "5,3,5,0",
            "3,3,3,6", "3,6,3,3",
            "4,3,4,6", "4,6,4,3",
            "5,3,5,6", "5,6,5,3"
        };
        this.animal1 = new String[]{" ", " ", " "};
        this.animal2 = new String[]{" ", " ", " "};
    }

    @SuppressWarnings("empty-statement")
    // renvoie True si la pièce sélectionnée est un animal bleu
    public boolean IsAnimalJoueurBleu(String a) {
        System.out.println("IsAnimalJoueurBleu 1 => Le joueur bleu a sélectionné le " + a);
        if ((a.equals("ElephantBleu")) || (a.equals("LoupBleu")) || (a.equals("LeopardBleu")) || (a.equals("RatBleu")) || (a.equals("ChatBleu"))
                || (a.equals("ChienBleu")) || (a.equals("TigreBleu")) || (a.equals("LionBleu"))) {
            return true;
        }
        return false;
    }

    public boolean IsAnimalJoueurRouge(String a) {
        System.out.println("IsAnimalJoueurRouge => Le joueur rouge a sélectionné le  " + a);
        if ((a.equals("ElephantRouge")) || (a.equals("LoupRouge")) || (a.equals("LeopardRouge")) || (a.equals("RatRouge")) || (a.equals("ChatRouge"))
                || (a.equals("ChienRouge")) || (a.equals("TigreRouge")) || (a.equals("LionRouge"))) {
            return true;
        }
        return false;
    }

    // Vérifie que le déplacement est legal (colonne +/- 1 && ligne +/- 1)
    // Vérifie que la case sélectionnée ne contient pas un animal de la même couleur
    public boolean IsLegalMouvement(String[][] p, int l1, int c1, int l2, int c2) {
        Boolean mvtLegal = false;
        if (p[l1][c1] == null) {
            return false;
        } else {
            if ((p[l1][c1].equals("TigreRouge") || p[l1][c1].equals("TigreBleu") || p[l1][c1].equals("LionRouge") || p[l1][c1].equals("LionBleu")) && sauterRiviere(p, l1, c1, l2, c2)) {
                System.out.println("IsLegalMouvement: Tigre ou Lion");
                return true;
            } else if (!isRiver(l2, c2) || p[l1][c1].equals("RatRouge") || p[l1][c1].equals("RatBleu")) {
                if ((l2 == l1 - 1) && (c2 == c1)) {
                    System.out.println("Le mouvement est legal part1");
                    mvtLegal = true;
                } else if ((l2 == l1 + 1) && (c2 == c1)) {
                    System.out.println("Le mouvement est legal part2");
                    mvtLegal = true;
                } else if ((l2 == l1) && (c2 == c1 - 1)) {
                    System.out.println("Le mouvement est legal part3");
                    mvtLegal = true;
                } else if ((l2 == l1) && (c2 == c1 + 1)) {
                    System.out.println("Le mouvement est legal part4");
                    mvtLegal = true;
                }
                if (mvtLegal == true) {
                    if (p[l2][c2] != null) {
                        orderAnimal(p[l1][c1], p[l2][c2], animal1, animal2);
                        if (animal1[1] == animal2[1]) {
                            return false;
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
            System.out.println("Le mouvement est illegal");
            return false;
        }
    }

    public boolean win(String a, String jB, String jR) {
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

    public String combat(String[][] p, int l1, int c1, int l2, int c2) {
        String animalCourant = p[l1][c1];
        String animalTarget = p[l2][c2];
        // lignes à revoir
        if (animalTarget != null && animalTarget != "TaniereRouge" && animalTarget != "TaniereBleu") {
            orderAnimal(animalCourant, animalTarget, animal1, animal2);
            if (!isPiege(animal2[1], l2, c2)) {
                // Si la case sélectionnée contient un animal => combat
                System.out.println(animal1[0] + animal1[1] + animal1[2]);
                System.out.println(animal2[0] + animal2[1] + animal2[2]);
                return plusPuissant(animalCourant, animalTarget, animal1, animal2);
            } else {
                // couleur  animal2 != couleur du piège
                // animal1 qui gagne
                return animalCourant;
            }
        }
        return null;
    }

    public String plusPuissant(String animalCourant, String animalTarget, String animal1[], String animal2[]) {
        if (animal1[0] == "RAT" && animal2[0] == "ELEPHANT") {
            return animalCourant;
        } else if (animal1[0] == "ELEPHANT" && animal2[0] == "RAT") {
            return animalTarget;
        } else if (Integer.parseInt(animal1[2]) >= Integer.parseInt(animal2[2])) {
            return animalCourant;
        } else {
            return animalTarget;
        }
    }

    public Boolean isPiege(String couleur, int l, int c) {
        if (couleur == "BLEU") {
            if (l == 0 && c == 2) {
                return true;
            } else if (l == 0 && c == 4) {
                return true;
            } else if (l == 1 && c == 3) {
                return true;
            }
        } else if (couleur == "ROUGE") {
            if (l == 7 && c == 3) {
                return true;
            } else if (l == 8 && c == 2) {
                return true;
            } else if (l == 8 && c == 4) {
                return true;
            }
        }
        return false;
    }

    public Boolean isRiver(int l, int c) {
        System.out.println("isRiver => l : " + l + " c: " + c);
        for (int i = 3; i <= 5; i++) {
            if (l == i) {
                if (c == 1 || c == 2 || c == 4 || c == 5) {
                    System.out.println("isRiver => case rivière");
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean sauterRiviere(String[][] p, int l1, int c1, int l2, int c2) {
        String val = l1 + "," + c1 + "," + l2 + "," + c2;
        System.out.println("Sauter Riviere : val = " + val);
        if (Arrays.toString(riviere).contains(val)) {
            System.out.println("Sauter Riviere : bord de la riviere OK");
            return true;
        } else {
            System.out.println("Sauter Riviere : bord de la riviere KO");
            return false;
        }
    }

    @SuppressWarnings("empty-statement")
    public void orderAnimal(String a1, String a2,
            String animal1[], String animal2[]
    ) {
        if (null != a1) {
            switch (a1) {
                case "ElephantRouge":
                    animal1[0] = "ELEPHANT";
                    animal1[1] = "ROUGE";
                    animal1[2] = "8";
                    break;
                case "LionRouge":
                    animal1[0] = "LION";
                    animal1[1] = "ROUGE";
                    animal1[2] = "7";
                    break;
                case "TigreRouge":
                    animal1[0] = "TIGRE";
                    animal1[1] = "ROUGE";
                    animal1[2] = "6";
                    break;
                case "LeopardRouge":
                    animal1[0] = "LEOPARD";
                    animal1[1] = "ROUGE";
                    animal1[2] = "5";
                    break;
                case "LoupRouge":
                    animal1[0] = "LOUP";
                    animal1[1] = "ROUGE";
                    animal1[2] = "4";
                    break;
                case "ChienRouge":
                    animal1[0] = "CHIEN";
                    animal1[1] = "ROUGE";
                    animal1[2] = "3";
                    break;
                case "ChatRouge":
                    animal1[0] = "CHAT";
                    animal1[1] = "ROUGE";
                    animal1[2] = "2";
                    break;
                case "RatRouge":
                    animal1[0] = "RAT";
                    animal1[1] = "ROUGE";
                    animal1[2] = "1";
                    break;
                case "ElephantBleu":
                    animal1[0] = "ELEPHANT";
                    animal1[1] = "BLEU";
                    animal1[2] = "8";
                    break;
                case "LionBleu":
                    animal1[0] = "LION";
                    animal1[1] = "BLEU";
                    animal1[2] = "7";
                    break;
                case "TigreBleu":
                    animal1[0] = "TIGRE";
                    animal1[1] = "BLEU";
                    animal1[2] = "6";
                    break;
                case "LeopardBleu":
                    animal1[0] = "LEOPARD";
                    animal1[1] = "BLEU";
                    animal1[2] = "5";
                    break;
                case "LoupBleu":
                    animal1[0] = "LOUP";
                    animal1[1] = "BLEU";
                    animal1[2] = "4";
                    break;
                case "ChienBleu":
                    animal1[0] = "CHIEN";
                    animal1[1] = "BLEU";
                    animal1[2] = "3";
                    break;
                case "ChatBleu":
                    animal1[0] = "CHAT";
                    animal1[1] = "BLEU";
                    animal1[2] = "2";
                    break;
                case "RatBleu":
                    animal1[0] = "RAT";
                    animal1[1] = "BLEU";
                    animal1[2] = "1";
                    break;
                default:
                    animal1[0] = " ";
                    animal1[1] = " ";
                    animal1[2] = " ";
                    break;
            }
        }
        ;
        if (null != a2) {
            switch (a2) {
                case "ElephantRouge":
                    animal2[0] = "ELEPHANT";
                    animal2[1] = "ROUGE";
                    animal2[2] = "8";
                    break;
                case "LionRouge":
                    animal2[0] = "LION";
                    animal2[1] = "ROUGE";
                    animal2[2] = "7";
                    break;
                case "TigreRouge":
                    animal2[0] = "TIGRE";
                    animal2[1] = "ROUGE";
                    animal2[2] = "6";
                    break;
                case "LeopardRouge":
                    animal2[0] = "LEOPARD";
                    animal2[1] = "ROUGE";
                    animal2[2] = "5";
                    break;
                case "LoupRouge":
                    animal2[0] = "LOUP";
                    animal2[1] = "ROUGE";
                    animal2[2] = "4";
                    break;
                case "ChienRouge":
                    animal2[0] = "CHIEN";
                    animal2[1] = "ROUGE";
                    animal2[2] = "3";
                    break;
                case "ChatRouge":
                    animal2[0] = "CHAT";
                    animal2[1] = "ROUGE";
                    animal2[2] = "2";
                    break;
                case "RatRouge":
                    animal2[0] = "RAT";
                    animal2[1] = "ROUGE";
                    animal2[2] = "1";
                    break;
                case "ElephantBleu":
                    animal2[0] = "ELEPHANT";
                    animal2[1] = "BLEU";
                    animal2[2] = "8";
                    break;
                case "LionBleu":
                    animal2[0] = "LION";
                    animal2[1] = "BLEU";
                    animal2[2] = "7";
                    break;
                case "TigreBleu":
                    animal2[0] = "TIGRE";
                    animal2[1] = "BLEU";
                    animal2[2] = "6";
                    break;
                case "LeopardBleu":
                    animal2[0] = "LEOPARD";
                    animal2[1] = "BLEU";
                    animal2[2] = "5";
                    break;
                case "LoupBleu":
                    animal2[0] = "LOUP";
                    animal2[1] = "BLEU";
                    animal2[2] = "4";
                    break;
                case "ChienBleu":
                    animal2[0] = "CHIEN";
                    animal2[1] = "BLEU";
                    animal2[2] = "3";
                    break;
                case "ChatBleu":
                    animal2[0] = "CHAT";
                    animal2[1] = "BLEU";
                    animal2[2] = "2";
                    break;
                case "RatBleu":
                    animal2[0] = "RAT";
                    animal2[1] = "BLEU";
                    animal2[2] = "1";
                    break;
                default:
                    animal2[0] = " ";
                    animal2[1] = " ";
                    animal2[2] = " ";
                    break;
            }
        }
    }

}
