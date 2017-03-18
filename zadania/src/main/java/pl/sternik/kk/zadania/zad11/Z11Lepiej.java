package pl.sternik.kk.zadania.zad11;

enum StanLepszy {
	NOWE(), OCZEKUJACE(), REALIZOWANE("Pilne"), WYSLANE(), ZWROT("Kontakt!");
	private String stan = "";

	private StanLepszy(String stan) {
		this.stan = stan;
	}

	private StanLepszy() {
	}

	public String getStan() {
		if ("".equals(stan))
			return this.toString();
		else
			return stan;
	}
};

public class Z11Lepiej {
	public static void main(String[] args) {
		for (StanLepszy s : StanLepszy.values()) {
			System.out.println("----- Wywołanie dla: " + s.name());
			System.out.println(s.getStan());
		}
	}
}
