package pl.sternik.kk.zadania.zad07;

import java.util.Scanner;

public class Z07 {
	public static void main(String[] args) {
		int[] tablica = { 5, 4, 3, 4, 6, 6, 9, 1, 9 };
		// int[] tablica = { 2, 2, 2, 4, 5, 5, 8, 1, 8 };
		Scanner input = new Scanner(System.in);

		System.out.print("Podaj liczbę X: ");
		int x = input.nextInt();
		x = (int) x;

		Z07 z = new Z07();
		int tmp = z.znajdzPodzielna(tablica, x);

		if (tmp > -1) {
			System.out.println(
					"Liczba " + tablica[tmp] + " jest podzielna przez " + x + " i znajduje się na pozycji " + tmp);
		} else {
			System.out.println("Brak liczby podzielnej");
		}
		input.close();
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
