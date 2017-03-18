package pl.sternik.kk.zadania.zad10;

public class Z10 {
	public static void main(String[] args) {
		int[][] liczby = { { 1, 1, 1, 2, 4 }, { 2, 1, 2, 2, 2 } };
		char[] znaki = { '+', 'x', '-', '*', '/' };
		int[] out = new int[znaki.length];

		for (int j = 0; j < znaki.length; j++) {
			out[j] = compute(liczby[0][j], liczby[1][j], znaki[j]);
		}
		for (int i : out) {
			System.out.print("[" + i + "] ");
		}

	}

	static int compute(int liczba1, int liczba2, char znak) {
		switch (znak) {
		case '-': {
			return liczba1 - liczba2;
		}
		case '*': {
			return liczba1 * liczba2;
		}
		case '/': {
			return (int) (liczba1 / liczba2);
		}
		default: {// +
			return liczba1 + liczba2;
		}
		}
	}
}
