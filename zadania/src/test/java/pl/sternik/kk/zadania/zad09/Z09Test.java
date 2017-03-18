package pl.sternik.kk.zadania.zad09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Z09Test {

	int[][] tablica = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 1, 2 }, { 3, 4, 5 } };

	Z09 sut;

	@Before
	public void before() {
		sut = new Z09();
	}

	@Test
	public void testZamiany() {
		int[][] expected = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 }, { 1, 1, 2 }, { 3, 4, 5 } };
		int w1 = 1;
		int w2 = 2;
		int[][] actual = Z09.zamien(w1, w2, tablica);

		assertThat(actual).isEqualTo(expected);

	}
	@Test
	public void testZamiany2() {
		int[][] expected = { { 1, 2, 3 }, { 7, 8, 9 }, { 4, 5, 6 }, { 1, 1, 2 }, { 3, 4, 5 } };
		int w1 = 1;
		int w2 = 2;
		int[][] actual = Z09.zamien2(w1, w2, tablica);

		assertThat(actual).isEqualTo(expected);

	}

}