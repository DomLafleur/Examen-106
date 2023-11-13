package com.cfpr.enrichissement;

public class trace1 {

	public static void main(String[] args) {
				int tab[] = {7, 15, -10, 19, -35, 21, 49, 25, -54};
		          int Somme1= 0, Somme2= 0, Somme3 = 0;
				for (int i = 0; i < tab.length; i++) {			
					System.out.print(" NumTableau:" + tab[i] + " ");
					
					if (tab[i] % 3 == 0) {
						Somme1 = Somme1 + tab[i];
						
					}
					else {
						Somme2 = Somme2 + tab[i];
					
					System.out.print(" 1- " + Somme1 + " " +  " 2- " + Somme2 + " "  + " 3- " + Somme3 + " ");
					System.out.println();
					
				}
				}
	}}

