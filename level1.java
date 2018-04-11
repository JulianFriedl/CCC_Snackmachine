
public class level1 {

	public static void main(String[] args) {

		int Betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int[anzahlMuenzen];
		
		
		for (int i = 0; i < anzahlMuenzen; i++) {
			int offset = 2;
			muenzen[i] = Integer.parseInt(args[offset+i]);
		}	
		
		
	}

}
