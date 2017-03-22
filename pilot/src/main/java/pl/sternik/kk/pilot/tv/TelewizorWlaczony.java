package pl.sternik.kk.pilot.tv;

class TelewizorWlaczony implements TelewizorStan {

	private final int MAX_VOLUME = 10;
	private final int MAX_KANAL = 10;

	private Telewizor telewizor;
	private int currentKanal = 1;
	private int currentVolume = 5;

	public TelewizorWlaczony(Telewizor telewizor) {
		this.telewizor = telewizor;
	}

	public TelewizorStan wlacz() {
		System.out.println("Nic nie robię");
		return this;
	}

	public TelewizorStan wylacz() {
		System.out.println("Wyłączam Telewizor");
		currentKanal = 1;
		currentVolume = 5;
		return telewizor.WYLACZONY;
	}

	@Override
	public TelewizorStan glosniej() {
		if (currentVolume < MAX_VOLUME) {
			currentVolume++;
		}
		System.out.println("Głośność:" + currentVolume);
		return this;
	}

	@Override
	public TelewizorStan ciszej() {
		if (currentVolume > 1) {
			currentVolume--;
		}
		System.out.println("Głośność:" + currentVolume);
		return this;
	}

	@Override
	public TelewizorStan nextKanal() {
		if (currentKanal < MAX_KANAL) {
			currentKanal++;
		} else {
			currentKanal = 1;
		}
		System.out.println("Aktualny kanał:" + currentKanal);
		return this;
	}

	@Override
	public TelewizorStan prevKanal() {
		if (currentKanal > 1) {
			currentKanal--;
		} else {
			currentKanal = MAX_KANAL;
		}
		System.out.println("Aktualny kanał:" + currentKanal);
		return this;
	}
}
