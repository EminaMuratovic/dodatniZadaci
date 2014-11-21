package dodatniZadaci;

public class NtiPrimeNumber {
	public static void main(String[] args) {
		int brojac = 0, i, j = 1, brojacDva = 0;
		System.out.println("Unesite broj: ");
		int broj = TextIO.getInt();
		for (i = 2; i < broj * broj; i++) {
			brojacDva = 0;
			for (j = 2; j < i; j++) 
			{
				if (i % j == 0)
					brojacDva++;
			}
			if (brojacDva == 0) {
				brojac++;
				if (brojac == broj)
					System.out.println(i);
			}

		}

	}

}
