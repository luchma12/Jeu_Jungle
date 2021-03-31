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
public class Animal extends IHMPlateau {

    public String gagnant = null;
    public String animal1[];
    public String animal2[];

    public Animal() {
        this.animal1 = new String[]{" ", " ", " "};
        this.animal2 = new String[]{" ", " ", " "};
    }

    @SuppressWarnings("empty-statement")
    // renvoie True si la pièce sélectionnée est un animal bleu
    public boolean IsAnimalJoueurBleu(String a) {
        System.out.println("Le joueur bleu a sélectionné le  " + a);
//        JlabelCommentaire.setText("<HTML> Veuillez sélectionner un animal bleu </HTML>");
        if ((a == "ElephantBleu") || (a == "LoupBleu") || (a == "LeopardBleu") || (a == "RatBleu") || (a == "ChatBleu")
                || (a == "ChienBleu") || (a == "TigreBleu") || (a == "LionBleu")) {
            return true;
        }
        return false;
    }

    public boolean IsAnimalJoueurRouge(String a) {
        System.out.println("Le joueur rouge a sélectionné le  " + a);
//        JlabelCommentaire.setText("<HTML> Veuillez sélectionner un animal rouge </HTML>");
        if ((a == "ElephantRouge") || (a == "LoupRouge") || (a == "LeopardRouge") || (a == "RatRouge") || (a == "ChatRouge")
                || (a == "ChienRouge") || (a == "TigreRouge") || (a == "LionRouge")) {
            return true;
        }
        return false;
    }

    // Vérifie que le déplacement est legal (colonne +/- 1 && ligne +/- 1)
    // Vérifie que la case sélectionnée ne contient pas un animal de la même couleur
    public boolean IsLegalMouvement(String[][] p, int l1, int c1, int l2, int c2) {
        if (!isRiver(l2, c2) || p[l1][c1].equals("RatRouge") || p[l1][c1].equals("RatBleu")) {
            if (p[l2][c2] != null) {
                orderAnimal(p[l1][c1], p[l2][c2], animal1, animal2);
                if (animal1[1] == animal2[1]) {
                    return false;
                } else {
                    return true;
                }
            } else {
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
            }
        }
//        jLabelCommentaire.setText("<HTML> " + "pieces[l1][c1]" + " ne peut pas aller dans la rivière" + "</HTML>");
        System.out.println("Le mouvement est illegal");
        return false;
    }

    public boolean win(String a, String jB, String jR) {
//        System.out.println("isAnimal  " + a);
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
//        if (IsLegalMouvement(p, l1, c1, l2, c2)) {
//        System.out.println("Animal courant " + animalCourant);
//        System.out.println("AnimalTarget " + animalTarget);
        if (animalTarget != null) {
            orderAnimal(animalCourant, animalTarget, animal1, animal2);
            if (!isPiege(animal2[1], l2, c2)) {
                // Si la case sélectionnée contient un animal => combat
                System.out.println(animal1[0] + animal1[1] + animal1[2]);
                System.out.println(animal2[0] + animal2[1] + animal2[2]);
                return plusPuissant(animalCourant, animalTarget, animal1, animal2);
//            } else if (animal1[1] == "RAT" && animal2[1] == "ELEPHANT") {
//                return animalCourant;
//            } else if (animal1[1] == "ELEPHANT" && animal2[1] == "RAT") {
//                return animalTarget;
            } else {
                // couleur  animal2 != couleur du piège
                // animal1 qui gagne
                return animalCourant;
            }
        }
        return null;
//        }
//        return null;
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

    public String plusPuissant(String animalCourant, String animalTarget, String animal1[], String animal2[]) {
        if (Integer.parseInt(animal1[2]) >= Integer.parseInt(animal2[2])) {
            return animalCourant;
        } else {
            return animalTarget;
        }
    }

    public Boolean isPiege(String couleur, int l, int c) {
        if (l == 0 && c == 2) {
            return true;
        } else if (l == 0 && c == 4) {
            return true;
        } else if (l == 1 && c == 3) {
            return true;
        } else if (l == 7 && c == 3) {
            return true;
        } else if (l == 8 && c == 2) {
            return true;
        } else if (l == 8 && c == 4) {
            return true;
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
}
