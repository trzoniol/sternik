package pl.sternik.kk.sklep;

import java.util.Date;

public class Shop {

	// zad23
	private Downloadable downloadable;
	// Dalej dla zadania 23 patrz na koniec klasy.

	private static Object[][] magazyn;

	// 1 kolumna String - nazwa produktu
	// 2 kolumna Integer - licznosc

	// Order nie ma info jakie towary są zamówione
	// rozwiązanie:
	// tablica magazyn jest static i zawiera 10 produktów i ich stan w
	// magazynie,
	// a zamówienie wie jaki produkt jest na której pozycji w magazynie i tylko
	// podaje ilość zamówionych towarów jako tablicę

	// klasa wewnętrzna
	class Order {
		private int[] quantities;
		private Date dataZamowienia;

		void accept() {
			for (int i = 0; i < magazyn.length; i++) {
				Integer jest = (Integer) magazyn[i][1];
				Integer nowe = quantities[i];
				Integer razem = jest + nowe;
				magazyn[i][1] = razem;
			}
		}

		public int[] getQuantities() {
			return quantities;
		}

		public void setQuantities(int[] quantities) {
			this.quantities = quantities;
		}

		public Date getDataZamowienia() {
			return dataZamowienia;
		}

		public void setDataZamowienia(Date dataZamowienia) {
			this.dataZamowienia = dataZamowienia;
		}
	}

	public static void main(String[] args) {
		ustawStanPoczatkowy();
		Shop sklep = new Shop();
		System.out.println("----- Stan początkowy");
		sklep.pokazStan();

		Shop.Order ord1 = sklep.new Order();
		ord1.dataZamowienia = new Date();
		int[] zam1 = { 10, 10, 10, 10, 10, 5, 0, 5, 0, 5 };
		ord1.quantities = zam1;
		ord1.accept();
		System.out.println("----- Stan po 1 zamówieniu");
		sklep.pokazStan();

		Shop.Order ord2 = sklep.new Order();
		ord2.dataZamowienia = new Date();
		int[] zam2 = { 40, 30, 20, 4, 3, 2, 0, 1, 33, 15 };
		ord2.quantities = zam2;
		ord2.accept();
		System.out.println("----- Stan po 2 zamówieniu");
		sklep.pokazStan();

		// zad23
		// klasa anonimowa implementująca interfejs Downloadable
		// bezpośrednio w wywołaniu settera pola
		sklep.setDownloadable(new Downloadable() {
			@Override
			public long filesize() {
				return 32456;
			}

			@Override
			public String fileType() {
				return "mp3";
			}
		});
		System.out.println("---------->"+sklep.getDownloadable().filesize());

	}

	public String pokazStan() {
		String poz, wyn = "";

		for (int i = 0; i < magazyn.length; i++) {
			poz = "poz " + i + ") ";
			for (int j = 0; j < magazyn[i].length; j++) {
				poz = poz + magazyn[i][j] + " ";
			}
			System.out.println(poz);
			wyn = wyn + " [" + i + "]" + magazyn[i][0] + "-" + magazyn[i][1];
		}
		return wyn;
	}

	static void ustawStanPoczatkowy() {
		magazyn = new Object[10][2];
		magazyn[0][0] = "Mleko";
		magazyn[1][0] = "Jogurt";
		magazyn[2][0] = "Chleb";
		magazyn[3][0] = "Cukier";
		magazyn[4][0] = "Śmietana";
		magazyn[5][0] = "Bułki";
		magazyn[6][0] = "Rogale";
		magazyn[7][0] = "Kawa";
		magazyn[8][0] = "Herbata";
		magazyn[9][0] = "Lody";
		for (int i = 0; i < magazyn.length; i++) {
			magazyn[i][1] = 0;
		}
	}
	// zad 23

	public Downloadable getDownloadable() {
		return downloadable;
	}

	public void setDownloadable(Downloadable downloadable) {
		this.downloadable = downloadable;
	}

}