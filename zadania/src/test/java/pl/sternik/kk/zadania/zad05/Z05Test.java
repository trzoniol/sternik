package pl.sternik.kk.zadania.zad05;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Z05Test {

	@Test
	public void testDummmy() throws Exception {
		assertThat(1).isEqualTo(1);
	}

	@Test
	public void testPetliFor() throws Exception {
		String[] tablica = { "Raz", "Dwa", "Trzy", "Cztery" };
		String expected = "Petla FOR\nRaz\nDwa\nTrzy\nCztery";

		String actual = Z05.zrobPetleFor(tablica);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testPetliWhile() throws Exception {
		String[] tablica = { "Raz", "Dwa", "Trzy", "Cztery" };
		String expected = "Petla While\nRaz\nDwa\nTrzy\nCztery";

		String actual = Z05.zrobPetleWhile(tablica);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testPetliForEach() throws Exception {
		String[] tablica = { "Raz", "Dwa", "Trzy", "Cztery" };
		String expected = "Petla FOREach\nRaz\nDwa\nTrzy\nCztery";

		String actual = Z05.zrobPetleForEach(tablica);

		assertThat(actual).isEqualTo(expected);
	}
}
