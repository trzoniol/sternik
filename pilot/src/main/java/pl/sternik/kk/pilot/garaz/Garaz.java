package pl.sternik.kk.pilot.garaz;

public final class Garaz {
	private static Garaz instance = new Garaz();

	final GarazStan OTWARTY = new GarazOtwarty();
	final GarazStan ZAMKNIETY = new GarazZamkniety();

	private GarazStan stan;

	private Garaz() {
		System.out.println("Tworzę sprzęt Garaz");
		stan = ZAMKNIETY;
	};

	public static Garaz instance() {
		return instance;
	}

	public void drzwiDol() {
		stan.close();
		stan = ZAMKNIETY;
	}

	public void drzwiGora() {
		stan.open();
		stan = OTWARTY;
	}
}
