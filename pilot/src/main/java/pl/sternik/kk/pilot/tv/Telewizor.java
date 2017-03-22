package pl.sternik.kk.pilot.tv;

public final class Telewizor {
	private static Telewizor instance = new Telewizor();

	final TelewizorStan WYLACZONY = new TelewizorWylaczony(this);
	final TelewizorStan WLACZONY = new TelewizorWlaczony(this);
	private TelewizorStan stan;

	private Telewizor() {
		System.out.println("Tworzę sprzęt Telewizor");
		stan = WYLACZONY;
	};

	public static Telewizor instance() {
		return instance;
	}

	public void wlacz() {
		stan = stan.wlacz();
	}

	public void wylacz() {
		stan = stan.wylacz();
	}

	public void kanalPlus() {
		stan = stan.nextKanal();
	}

	public void kanalMinus() {
		stan = stan.prevKanal();
	}

	public void glosnoscPlus() {
		stan = stan.glosniej();
	}

	public void glosnoscMinus() {
		stan = stan.ciszej();
	}
}
