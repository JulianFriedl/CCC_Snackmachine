
public class level2 {

	public static void main(String[] args) {
		int Betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int[anzahlMuenzen];
		int m = 0;
		
		
		for (int i = 0; i < anzahlMuenzen; i++) {
			int offset = 2;
			muenzen[i] = Integer.parseInt(args[offset+i]);
		}	
		
		for(int i = 0;i<muenzen.length;i++) {
			m += muenzen[i];
		}
		if(m<Betrag) {
			System.out.println("MISSING " + (Betrag-m));
		}else if(m>Betrag) {
			System.out.println("CHANGE " + (m-Betrag));
		}

	}

}
