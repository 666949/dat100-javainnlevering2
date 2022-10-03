package no.hvl.dat100.lab5.tabeller;

public class Tabeller {		
	// a) 
	public static void skrivUt(int[] tabell) {

		int[] tab = {1,2,3,4,5};
		
		System.out.print("[ ");
		for(int i = 0; i<tab.length;i++){
			System.out.print(tab[i] + ", ");
		}
		System.out.print("]");

		}
	// b)
	public static String tilStreng(int[] tabell) {
		
		String skilletegn;
		String tabellStreng = "["; 
		
		for(int i = 0; i < tabell.length; i++) {
			if (i == (tabell.length - 1)) {
				skilletegn = "";
			} else {
				skilletegn = ",";
			}
			
		tabellStreng += tabell[i];
		tabellStreng += skilletegn; 
		}
		
		tabellStreng += "]";
		
		return tabellStreng;
			
		
	}
	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		
		for(int i : tabell)
			sum += i;
		
//		for(int i = 0; i<tabell.length; i++) {
//			sum += tabell[i]; 
//		}
		
//		int i = 0; 
//		while (i<tabell.length) {
//			sum += tabell[i];
//			i++;
			
//		}
		
		return sum;
	}
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
				
		int i = 0; 
		boolean finnes = false; 
		
		while (i < tabell.length && !finnes) {
			if (tabell[i] == tall) {
				finnes = true;
			} else {
				i++;
			}
		}
		
		return finnes; 
	}
	// e)
	public static int posisjonTall(int[] tabell, int tall) {		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i; 
				}
			}
		return -1; 
	}
	// f)
	public static int[] reverser(int[] tabell) {
		
        for (int i = 0; i < tabell.length / 2; i++) {
            
        }
        return tabell;
	}
	// g)
	public static boolean erSortert(int[] tabell) {

		for (int i = 0; i < tabell.length-1; i++) {
	        if (tabell[i] > tabell[i + 1]) {
	            return false;
	        }
	    }
	    return true;
	}
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tabell3 = new int[tabell1.length+tabell2.length];
		int c = 0; 
		
		for(int i = 0; i < tabell1.length; i++) {
			tabell3[i] = tabell1[i];
			c++;
		}
		for(int j = 0; j < tabell2.length; j++) {
			tabell3[c++] = tabell2[j];
		}
		for(int i=0; i<tabell3.length;i++) {
			System.out.println(tabell3[i]+" ");
		}
		
		return tabell3; 
	}
}