package com.cfpr.enrichissement;

public class J3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] joueurButs = new int[5][2];
		
		joueurButs[0][0] = 99;
		joueurButs[1][0] = 88;
		joueurButs[2][0] = 77;
		joueurButs[3][0] = 66;
		
		joueurButs[0][1] = 101;
		joueurButs[1][1] = 91;
		joueurButs[2][1] = 90;
		joueurButs[3][1] = 151;
		
		for (int i=0; i < joueurButs.length; i++) {
			System.out.println(joueurButs[i][0]);
		}
		
		for (int i=0; i < joueurButs.length; i++) {
			System.out.println(joueurButs[i][1]);
		}
	}

}
