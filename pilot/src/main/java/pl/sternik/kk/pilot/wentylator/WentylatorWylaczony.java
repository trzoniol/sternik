package pl.sternik.kk.pilot.wentylator;

class WentylatorWylaczony implements WentylatorStan {

	private Wentylator wentylator;

	public WentylatorWylaczony(Wentylator wentylator) {
		this.wentylator = wentylator;
	}

	public WentylatorStan wlacz() {
		System.out.println("Włączam i ustawiam obroty1");
		return wentylator.OBROTY1;
	}

	public WentylatorStan wylacz() {
		System.out.println("Nic nie robię");
		return this;
	}

	public WentylatorStan obroty1() {
		System.out.println("Włączam i ustawiam obroty1");
		return wentylator.OBROTY1;
	}

	public WentylatorStan obroty2() {
		System.out.println("Nic nie robię");
		return this;
	}

	public WentylatorStan obroty3() {
		System.out.println("Nic nie robię");
		return this;
	}
}
