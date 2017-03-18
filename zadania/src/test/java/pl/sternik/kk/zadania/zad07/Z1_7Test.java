package pl.sternik.kk.zadania.zad07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Z1_7Test {

	int[] tablica = { 5, 4, 3, 4, 6, 6, 9, 1, 9 };

	Z1_7 sut;

	@Before
	public void before() {
		sut = new Z1_7();
	}

	@Test
	public void testPodzielnosciPrzez5() {
		int dzielnik = 5;

		int actual = sut.znajdzPodzielna(tablica, dzielnik);

		assertThat(actual).isEqualTo(0);
	}

	@Test(expected = ArithmeticException.class)
	public void testDzielPrzezZero() {
		int dzielnik = 0;

		sut.znajdzPodzielna(tablica, dzielnik);
	}

}