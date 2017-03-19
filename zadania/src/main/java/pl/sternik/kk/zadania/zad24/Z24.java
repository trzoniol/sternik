package pl.sternik.kk.zadania.zad24;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Z24 {
	private int[] tabelka = { 1, 2, 3 };

	public static void main(String[] args) {
		Z24 z24 = new Z24();
		int a, b;
		a = 10;
		b = 0;
		try {
			System.out.println(z24.podziel(a, b));
		} catch (Exception e) {
			System.out.println("Nie dziel przez zero");
			System.out.println(e);
		}

		System.out.println(z24.dajElement(3));

		System.out.println(wczytaj());

	}

	double podziel(int a, int b) {
		double w = 0;
		w = a / b;
		return w;
	}

	int dajElement(int i) {
		try {
			System.out.println(tabelka[i]);
			return tabelka[i];
		} catch (Exception e) {
			System.out.println("Brak indeksu");
			System.out.println(e);
			return 0; // ????
		}
	}

	public static Date wczytaj() {
		Scanner input = new Scanner(System.in);
		System.out.print("Podaj datę w formacie dd.mm.yyyy: ");
		String tekst = input.nextLine();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date d;
		try {
			d = df.parse(tekst);
			return d;
		} catch (ParseException e) {
			System.out.println("Błędny format daty");
			e.printStackTrace();
			return null;
		}finally {
			input.close();
		}
	}
}
