package pl.sternik.kk.pilot.tv;

class TelewizorWylaczony implements TelewizorStan {

	private Telewizor telewizor;

	public TelewizorWylaczony(Telewizor telewizor) {
		this.telewizor = telewizor;
	}

	public TelewizorStan wlacz() {
		System.out.println("Włączam TV i ustawiam kanal 1");
		return telewizor.WLACZONY;
	}

	public TelewizorStan wylacz() {
		System.out.println("Nic nie robię");
		return this;
	}

	@Override
	public TelewizorStan glosniej() {
		return this;
	}

	@Override
	public TelewizorStan ciszej() {
		return this;
	}

	@Override
	public TelewizorStan nextKanal() {
		return this;
	}

	@Override
	public TelewizorStan prevKanal() {
		return this;
	}
}
