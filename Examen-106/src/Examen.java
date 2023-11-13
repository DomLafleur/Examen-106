import java.util.Random;

public class Examen {

	static int[] tabSource = new int[10];
	static int[] tabDestination = new int[10];
	
	public static void main(String[] args) {
		
		afficherTableau(tabDestination,tabSource);
		calculTableau(tabSource, tabDestination);
	}
	
	
	public static void calculTableau(int[] tabSource , int[] tabDestination) {
		Random hasard = new Random();
		int Maximum = 100;
		int i;
		
		for(i = 0; i < tabSource.length; i++) {
			
			tabSource[i] = hasard.nextInt(Maximum);
			System.out.print("tabSource[" + i + "] = " + tabSource[i] + "  ");
			
			if(tabSource[i] <= 50) {
				
				tabDestination[i] = tabSource[i] * (tabSource[i] % 3);
			}
			else {
				tabDestination[i] = tabSource[i] * (tabSource[i] % 5);
			}
			
			System.out.println("tabDestination[" + i + "] = " + tabDestination[i]);
			
		}
		
	}
	
	public static void afficherTableau(int[] tabDestination,int[] tabSource) {
        System.out.print("\n\n\nTableau Source      Tableau destination" + "\n-------------------------------------------"     		
        		
        		
        		
        		);
	}
}
