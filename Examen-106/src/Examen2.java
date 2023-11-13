
 
import java.text.DecimalFormat;
 
public class Examen2 {
	
    private static final DecimalFormat df = new DecimalFormat("0.00");
 
	public static void main(String[] args) {
		
		String[] tab_ville = {"Le Caire", "New York", "Paris", "Calcutta", "Barcelone", "Manille", "Montreal", "Hong Kong"};
		double[] tab_superficie = {210, 1214, 105.4, 185, 100.4, 38.55, 363.52, 1104};
		int[] tab_population = {8452409, 8391881, 2211297, 4580544, 1621537, 1660714, 1667700, 7018636};
		double[] tab_densite = new double[8];
		
		calculerDensite(tab_superficie, tab_population, tab_densite);
		afficherDensite(tab_ville, tab_superficie, tab_population, tab_densite);
 
	}
	
	public static void calculerDensite(double[] tab_superficie, int[] tab_population, double[] tab_densite) {
		
		for(int i = 0; i < tab_densite.length; i++) {
			tab_densite[i] = tab_population[i] / tab_superficie[i];
		}
	}
	
	public static void afficherDensite(String[] tab_ville, double[] tab_superficie, int[] tab_population, double[] tab_densite) {
		
		System.out.println("Ville           Superficie         Population               Densite\n===================================================================================");
		
		for(int j = 0; j < tab_ville.length; j++) {
			System.out.println(tab_ville[j] + "        " + tab_superficie[j] + " km2         " + tab_population[j] + " habitants         " + df.format(tab_densite[j]) + " habitant / km2");
		}
	}
}
 
