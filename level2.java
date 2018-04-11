
public class level2 {

	public static void main(String[] args) {
		int Betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int[anzahlMuenzen];
		int[] Change = new int[8];

		int m = 0;
		int mChange = 0;

		for (int i = 0; i < anzahlMuenzen; i++) {
			int offset = 2;
			muenzen[i] = Integer.parseInt(args[offset + i]);
		}

		for (int i = 0; i < muenzen.length; i++) {
			m += muenzen[i];
		}

		if (m > Betrag) {
			mChange = m - Betrag;
			if (mChange >= 200) {
				while (true) {
					Change[7] += 1;
					mChange -= 200;
					if (mChange < 200) {
						break;
					}
				}
			}
			if (mChange >= 100 && mChange < 200) {
				while (true) {
					Change[6] += 1;
					mChange -= 100;
					if (mChange < 100) {
						break;
					}
				}
			}
			if (mChange >= 50 && mChange < 100) {
				while (true) {
					Change[5] += 1;
					mChange -= 50;
					if (mChange < 50) {
						break;
					}
				}
			}
			if (mChange >= 20 && mChange < 50) {
				while (true) {
					Change[4] += 1;
					mChange -= 20;
					if (mChange < 20) {
						break;
					}
				}
			}
			if (mChange >= 10 && mChange < 20) {
				while (true) {
					Change[3] += 1;
					mChange -= 10;
					if (mChange < 10) {
						break;
					}
				}
			}
			if (mChange >= 5 && mChange < 10) {
				while (true) {
					Change[2] += 1;
					mChange -= 5;
					if (mChange < 5) {
						break;
					}
				}
			}
			if (mChange >= 2 && mChange < 5) {
				while (true) {
					Change[1] += 1;
					mChange -= 2;
					if (mChange < 2) {
						break;
					}
				}
			}
			if (mChange == 1) {
				while (true) {
					Change[0] += 1;
					mChange -= 1;
					if (mChange < 10) {
						break;
					}
				}
			}
			System.out.print("CHANGE ");
			for (int i = 0; i < Change.length; i++) {
				System.out.print(Change[i] + " ");
			}
		} else if (m < Betrag) {
			System.out.println("MISSING " + (Betrag - m));
		}

	}

}
