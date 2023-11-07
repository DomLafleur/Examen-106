package com.cfpr.enrichissement;

public class Probleme4 {
	public static int NOTE_ELEVE = 60;
	public final static String MSG_ECHEC = "Vous avez échoué!";
	public final static String MSG_REUSSI = "Vous avez réussi!";
	
	public static void main(String[] args) {		
		
		if(NOTE_ELEVE >= 60 ) {
			 
			afficherMessage(MSG_REUSSI);
		}
		else {
			afficherMessage(MSG_ECHEC);
		}
		

	}

	private static void afficherMessage(String message) {
		
		System.out.println(message);
	}
}
