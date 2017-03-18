package pl.sternik.kk.zadania.zad08;

import java.util.Scanner;

public class Z08 {

	public static void main(String[] args) {
		int[] tablica = pobierztabliceFajniej(args);
		int[][] out = new int[tablica.length][];
		for (int i = 0; i <= tablica.length - 1; i++) {
			out[i] = new int[tablica[i]];
			for (int j = 0; j <= tablica[i] - 1; j++) {
				out[i][j] = j;
			}
		}
		wyswietl(out);
	}

	private static int[] pobierztabliceFajniej(String[] args) {
		int[] tablica;
		String[] tmp;
		if (args.length == 0) {
			Scanner input = new Scanner(System.in);
			System.out.print("Podaj wymiary: ");
			String wymiary = input.nextLine();
			tmp = wymiary.split(" ");
			input.close();
		} else {
			tmp = args;
		}
		tablica = new int[tmp.length];
		for (int i = 0; i < tmp.length; i++) {
			tablica[i] = Integer.valueOf(tmp[i]);
		}
		return tablica;
	}

	private static void wyswietl(int[][] tablica) {

		for (int i = 0; i <= tablica.length - 1; i++) {
			for (int j = 0; j <= tablica[i].length - 1; j++) {
				System.out.print("[" + i + " , " + tablica[i][j] + "] ");
			}
			System.out.print("\n");
		}

	}

	private static int[] pobierztablice(String[] args) {
		int[] tablica;
		if (args.length == 0) {
			Scanner input = new Scanner(System.in);
			System.out.print("Podaj pierwszy wymiar: ");
			int w1 = input.nextInt();
			System.out.print("Podaj drugi wymiar: ");
			int w2 = input.nextInt();
			System.out.print("Podaj trzeci wymiar: ");
			int w3 = input.nextInt();
			System.out.print("Podaj czwarty wymiar: ");
			int w4 = input.nextInt();

			int[] tmp = { w1, w2, w3, w4 };
			tablica = tmp;
			input.close();
		} else {
			tablica = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				tablica[i] = Integer.valueOf(args[i]);
			}
		}
		return tablica;
	}

}
