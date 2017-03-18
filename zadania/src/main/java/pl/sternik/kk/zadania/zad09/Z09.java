package pl.sternik.kk.zadania.zad09;

import java.util.Scanner;

public class Z09 {
    public static void main(String[] args) {
        int[][] tablica = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 1, 2 }, { 3, 4, 5 } };
        wyswietl(tablica);
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj 1 wiersz do zamiany: ");
        int w1 = input.nextInt();
        System.out.print("Podaj 2 wiersz do zamiany: ");
        int w2 = input.nextInt();
        zamien2(w1, w2, tablica);
        wyswietl(tablica);
    }
    public static int[][] zamien2(int w1, int w2, int[][] tablica) {
        int[] tmp1, tmp2;
        tmp1 = tablica[w1];
        tmp2 = tablica[w2];
        tablica[w1] = tmp2;
        tablica[w2] = tmp1;
        return tablica;
    }
    protected static int[][] zamien(int w1, int w2, int[][] tablica) {
        int[][] out = new int[2][];
        out[0] = new int[tablica[w1].length];
        out[1] = new int[tablica[w2].length];
        out[0] = tablica[w1];
        out[1] = tablica[w2];
        tablica[w1] = out[1];
        tablica[w2] = out[0];
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
}
