package no.hvl.dat100.lab5.tabeller;

public class Tabeller {		

public static void main(String[] args) {
	
	int[] tabell = {1,2,3,42,67,89,3,2,1};
	
	skrivUt(tabell);
	
	tilStreng(tabell); 

}
	// a) 
	public static void skrivUt(int[] tabell) {


		System.out.print("[");
		for(int i = 0; i<tabell.length;i++){
			System.out.print(tabell[i] + ", ");
		}
		System.out.print("]");

		}


	// b)
	public static String tilStreng(int[] tabell) {
		
		String tab = "[42, 67, 89]";
		System.out.println();
		System.out.println(tab);
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}