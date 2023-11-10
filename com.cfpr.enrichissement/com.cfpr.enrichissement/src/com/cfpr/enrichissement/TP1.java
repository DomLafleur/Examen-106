package com.cfpr.enrichissement;

import java.util.Scanner;

public class TP1 {
	
	public static Scanner scanner = new Scanner(System.in);
	public static int choix;	
	public static void main(String[] args) {
		afficherMenu();       
        choix = choixJeu(scanner, choix);
    }

	private static void afficherMenu() {
		
		 System.out.println("TRAVAIL PRATIQUE #1 - Dominique Lafleur");
	        System.out.println("1. Calculateur de billets et pièces");
	        System.out.println("2. Jeu de devinette d'un nombre mystère");
	        System.out.println("0. Quitter");
	        System.out.println("Entrez 1, 2 ou 0 pour sélectionner l'option : ");			
		
	}
	
	public static int choixJeu(Scanner scanner, int choix) {
    	// Choix du jeu
		 choix = scanner.nextInt();

        switch (choix) {
	        case 1:
	            calculateurBilletsPieces(scanner);
	            break;
	        case 2:
	            jeuDevinette(scanner);
	            break;
	        case 0:
	            System.out.println("Vous avez quitté le programme.");
	            break;
	       
	        default:
	            System.out.println("Option invalide. Veuillez entrer 1 pour le calculateur, 2 pour le jeu, ou 0 pour quitter.");

	     }
        scanner.close();
		return choix;
    }
	
    public static void calculateurBilletsPieces(Scanner scanner) {
    	// Calculateur de billets et pièces
        System.out.println("\nMaintenant, passons au calculateur de billets et pièces.");

        System.out.print("Entrez la somme d'argent en dollars : ");
        double montant = scanner.nextDouble();
        int montantEnCents = (int) (montant * 100);

        int[] valeurs = {10000, 5000, 2000, 1000, 500, 200, 100, 25, 10, 5, 1};
        String[] noms = {"billets de 100$", "billets de 50$", "billets de 20$", "billets de 10$", "billets de 5$", "billets de 2$", "billets de 1$", "pièces de 0,25$", "pièces de 0,10$", "pièces de 0,05$", "pièces de 0,01$"};

        System.out.println("Le nombre minimum de billets et pièces pour " + montant + "$ est :");

        for (int i = 0; i < valeurs.length; i++) {
            int quantite = montantEnCents / valeurs[i];
            montantEnCents %= valeurs[i];
            
            if (quantite > 0) {
                System.out.println(quantite + " " + noms[i]);
            }
        }

        scanner.close();
    }

    public static void jeuDevinette(Scanner scanner) {
        int nombreMystere = (int) (Math.random() * 20) + 1;
        int tentatives = 7;

        System.out.println("Bienvenue dans le jeu de devinette du nombre mystère !");
        System.out.println("Vous devez deviner un nombre entre 1 et 20.");
        System.out.println("Vous avez 7 chances pour le trouver.");

        while (tentatives > 0) {
            System.out.println("Il vous reste " + tentatives + " tentatives.");
            System.out.print("Entrez un nombre entre 1 et 20 (ou entrez 0 pour quitter) : ");
            int devinette = scanner.nextInt();

            if (devinette == 0) {
                System.out.println("Vous avez quitté le jeu.");
                break;
            }

            if (devinette < 1 || devinette > 20) {
                System.out.println("Le nombre doit être entre 1 et 20.");
            } else if (devinette < nombreMystere) {
                System.out.println("Le nombre mystère est plus grand.");
            } else if (devinette > nombreMystere) {
                System.out.println("Le nombre mystère est plus petit.");
            } else {
                System.out.println("Félicitations ! Vous avez trouvé le nombre mystère : " + nombreMystere);
                break;
            }

            tentatives--;
        }

        if (tentatives == 0) {
            System.out.println("Désolé, vous avez épuisé toutes vos tentatives. Le nombre mystère était " + nombreMystere + ".");
        }
    }
}
