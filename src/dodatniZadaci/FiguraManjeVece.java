package dodatniZadaci;

public class FiguraManjeVece {
	public static void main(String[] args) {
		int m, n, j, p = 0;
		do {
			System.out.println("Unesite prvi broj: ");
			m = TextIO.getInt();
			System.out.println("Unesite drugi broj: ");
			n = TextIO.getInt();
		} while (m < n || n % 2 == 0);
		int sredina = n / 2;
		p = sredina * 2 - 4;
		System.out.print("*");
		for (int i = 1; i < m - 1; i++)
			System.out.print(" ");
		System.out.print("*");
		System.out.println();
		for (int i = 1; i < sredina; i++) {
			for (j = 0; j < i; j++)
				System.out.print(" ");
			System.out.print("*");
			for (int g = m / 5 * 3 + p; g > 0; g--)
				System.out.print(" ");
			p -= 2;
			System.out.print("*");
			System.out.println();
		}
		for (int f = 0; f < sredina; f++)
			System.out.print(" ");
		for (int r = 0; r < m / 5 * 3; r++)
			System.out.print("*");
		System.out.println();

		for (int i = 1; i <= sredina; i++) {
			for (j = sredina - i - 1; j >= 0; j--)
				System.out.print(" ");
			System.out.print("*");
			for (int s = 0; s < m / 5 * 3 + p + 2; s++)
				System.out.print(" ");
			p += 2;
			System.out.print("*");
			System.out.println();

		}

	}
}
