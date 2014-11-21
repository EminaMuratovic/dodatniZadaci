package dodatniZadaci;

public class PjescaniSat {
	public static void main(String[] args) {
		int m, n, p, j;
		do {
			System.out.println("Unesite prvi broj: ");
			m = TextIO.getInt();
			System.out.println("Unesite drugi broj: ");
			n = TextIO.getInt();
		} while (m < n || n % 2 == 0 || m > 20);
		int sredina = n / 2;
		p = sredina * 2 - 6;
		for (int i = 0; i < m; i++)
			System.out.print("*");
		System.out.println();
		System.out.print(" ");
		System.out.print("*");
		for (int i = 1; i < m - 3; i++)
			System.out.print(" ");
		System.out.print("*");
		System.out.println();
		for (int i = 1; i < sredina; i++) 
		{
			for (j = 0; j <= i; j++)
				System.out.print(" ");
			System.out.print("*");
			for (int g = m / 5 * 3-2 + p; g > 0; g--)
				System.out.print(" ");
			p -= 2;
			System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i < sredina; i++) {
			for (j = sredina - i - 1; j >= 0; j--)
				System.out.print(" ");
			System.out.print("*");
			for (int s = 0; s < m / 5 * 3 + p + 2; s++)
				System.out.print(" ");
			p += 2;
			System.out.print("*");
			System.out.println();
		}
		for (int i = 0; i < m; i++)
			System.out.print("*");
		
	
	}
}
