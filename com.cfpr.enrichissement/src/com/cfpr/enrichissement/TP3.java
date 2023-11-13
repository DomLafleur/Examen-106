package com.cfpr.enrichissement;
 
import java.util.Scanner;
 
public class TP3 {
	
	static Scanner scan = new Scanner(System.in);
	
	static int[][] Stats = new int[4][5];
	
	static String equipeVisiteuse;
	static String equipeLocale;
 
	static int butsVisiteuse;
	static int butsLocale;
 
	public static void main(String[] args) {
		
		saisirStats();
		mettreajourStats(Stats, equipeVisiteuse, equipeLocale, butsVisiteuse, butsLocale);
		afficherClassement(Stats);
	}
		
		public static String saisirStats() {
		    do {
		        System.out.print("Équipe visiteuse (1-4 ou MON, QUE, LAV, TER): ");
		        equipeVisiteuse = scan.next().toUpperCase();

		        System.out.print("Buts marqués par l'équipe visiteuse: ");
		        butsVisiteuse = scan.nextInt();

		        System.out.print("Équipe locale (1-4 ou MON, QUE, LAV, TER): ");
		        equipeLocale = scan.next().toUpperCase();

		        // Comparer les noms d'équipe
		        if (equipeLocale.equals(equipeVisiteuse)) {
		            System.out.println("Vous ne pouvez pas entrer la même équipe");
		            continue;  // Revenir au début de la boucle
		        }

		        // Comparer les numéros d'équipe
		        try {
		            int equipeLocaleNum = Integer.parseInt(equipeLocale);
		            int equipeVisiteuseNum = Integer.parseInt(equipeVisiteuse);
		            if (equipeLocaleNum == equipeVisiteuseNum) {
		                System.out.println("Vous ne pouvez pas entrer la même équipe");		                
		                saisirStats();  // Revenir au début de la boucle
		            }
		        } catch (NumberFormatException e) {
		            // Ignorer l'exception, car l'entrée n'est pas un nombre
		        }

		        System.out.print("Buts marqués par l'équipe locale: ");
		        butsLocale = scan.nextInt();

		        mettreajourStats(Stats, equipeLocale, equipeLocale, butsLocale, butsLocale);

		        System.out.print("Voulez-vous entrer un autre résultat? (O/N): ");
		    } while (scan.next().equalsIgnoreCase("O"));

		    return equipeVisiteuse + butsVisiteuse + equipeLocale + butsLocale;
		}
	
	public static void mettreajourStats(int[][] Stats, String equipeVisiteuse, String equipeLocale, int butsVisiteuse, int butsLocale) {
		
		int equipeVisiteuseIndex = getIndexEquipe(equipeVisiteuse);
		int equipeLocaleIndex = getIndexEquipe(equipeLocale);
		
        if (butsVisiteuse > butsLocale) {
            Stats[equipeVisiteuseIndex][1]++;
            Stats[equipeLocaleIndex][2]++; 
           
            Stats[equipeVisiteuseIndex][0]++;
    		Stats[equipeLocaleIndex][0]++;
        } else if (butsVisiteuse < butsLocale) {
            Stats[equipeVisiteuseIndex][2]++;
            Stats[equipeLocaleIndex][1]++; 
           
            Stats[equipeVisiteuseIndex][0]++;
    		Stats[equipeLocaleIndex][0]++;
        } else if(butsVisiteuse == butsLocale) {
            Stats[equipeVisiteuseIndex][3]++;
            Stats[equipeLocaleIndex][3]++;
           
            Stats[equipeVisiteuseIndex][0]++;
    		Stats[equipeLocaleIndex][0]++;
        }
        Stats[equipeVisiteuseIndex][4] = (Stats[equipeVisiteuseIndex][1] * 3) + Stats[equipeVisiteuseIndex][3];
        Stats[equipeLocaleIndex][4] = (Stats[equipeLocaleIndex][1] * 3) + Stats[equipeLocaleIndex][3];
		}
	
	public static int getIndexEquipe(String equipe) {
		switch (equipe) {
        case "MON", "1":
            return 0;
        case "QUE", "2":
            return 1;
        case "TER", "3":
            return 2;
        case "LAV", "4":
            return 3;
        default:
        	return -1;
 
		}
	}
	
	public static void afficherClassement(int[][] Stats) {
        System.out.print("TRAVAIL PRATIQUE #3 - Dominique Lafleur\n------------------------------\n\nResultat\n---------\nEquipe visiteuse: "
	+ equipeVisiteuse + "\nNombre de buts : "
    + butsVisiteuse + "\nEquipe locale : "
	+ equipeLocale + "\nNombre de buts : "
    + butsLocale + "\n\n\nClassement"
    + "\n\nEquipe                 PJ  V  D  N  PTS\n-------------------------------------------"
    +"\nJunior Montreal         "
    + Stats[0][0] + "  " + Stats[0][1] + "  " + Stats[0][2] + "  " + Stats[0][3] + "  " + Stats[0][4]
    +"\nRemparts Quebec         "
    + Stats[1][0] + "  " + Stats[1][1] + "  " + Stats[1][2] + "  " + Stats[1][3] + "  " + Stats[1][4]
    +"\nEperviers Terrebonne    "
    + Stats[2][0] + "  " + Stats[2][1] + "  " + Stats[2][2] + "  " + Stats[2][3] + "  " + Stats[2][4]
    +"\nAigles Laval            "
    + Stats[3][0] + "  " + Stats[3][1] + "  " + Stats[3][2] + "  " + Stats[3][3] + "  " + Stats[3][4]);
 
	}
	
	public static void calculCube(int []tab1,int []tab2) {
		for(int resultat = 0; resultat < 10; resultat++) {
			tab1[resultat] = (int) (Math.pow(tab2[resultat], 3));
		}

	}
 
   }
