package com.cfpr.enrichissement;

import java.util.Scanner;

public class Jour2 {

	public static void main(String[] args) {
		String x = new String ("X");
		String y = new String ("Y");
		String client;
		int zz = 0;
		
		String w = "W";
		String z = "Z";
		
		Scanner lectureClavier = new Scanner(System.in);
		zz = lectureClavier.nextInt();
		
		afficherMessage(zz);
		
	}

	public static void afficherMessage(String message) {
		
		System.out.println(message);
		System.out.println("-----------");
		
	}
	
	public static void afficherMessage(int message) {
		
		System.out.println(message);
		System.out.println("-----------");
		
	}
}
