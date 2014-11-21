package dodatniZadaci;

public class BezNula {
	public static void main(String[] args) {
		System.out.println("Upisite broj: ");
		int broj = TextIO.getInt();
		int cifra = 0;
		int k = 1;
		while (broj != 0) {
			if (broj % 10 != 0) {
				cifra = cifra + broj % 10 * k;
				k *= 10;
			}

			broj /= 10;

		}
		System.out.println(cifra);
	}

}
