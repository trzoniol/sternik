package pl.sternik.kk.pilot.tv;

public interface TelewizorStan {
	TelewizorStan wlacz();

	TelewizorStan wylacz();

	TelewizorStan glosniej();

	TelewizorStan ciszej();

	TelewizorStan nextKanal();

	TelewizorStan prevKanal();
}
