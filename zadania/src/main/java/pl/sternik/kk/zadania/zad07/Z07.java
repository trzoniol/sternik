package pl.sternik.kk.zadania.zad07;

public class Z07 {
	
	MyScanner input;
	
	public Z07(MyScanner input) {
		super();
		this.input = input;
	}

	public static void main(String[] args) {
		int[] tablica = { 5, 4, 3, 4, 6, 6, 9, 1, 9 };
		// int[] tablica = { 2, 2, 2, 4, 5, 5, 8, 1, 8 };
		MyScanner input = new MyScanner(System.in);

		Z07 z07 = new Z07(input);
		
		z07.findWithScanner(tablica, input);
		
		input.close();
	}
	int findWithScanner(int[] tablica, MyScanner input) {
		System.out.print("Podaj liczbę X: ");
		int x = input.nextInt();
		x = (int) x;

		int tmp = znajdzPodzielna(tablica, x);

		if (tmp > -1) {
			System.out.println(
					"Liczba " + tablica[tmp] + " jest podzielna przez " + x + " i znajduje się na pozycji " + tmp);
		} else {
			System.out.println("Brak liczby podzielnej");
		}
		return tmp;
	}

	public int znajdzPodzielna(int[] tablica, int dzielnik) {
		for (int i = 0; i < tablica.length; i++) {
			if (tablica[i] % dzielnik == 0) {
				return i;
			}
		}
		return -1;
	}

}
