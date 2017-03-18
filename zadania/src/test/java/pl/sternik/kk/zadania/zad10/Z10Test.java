package pl.sternik.kk.zadania.zad10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Z10Test {

	int[][] tablica = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 1, 1, 2 }, { 3, 4, 5 } };

	Z10 sut;

	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void before() {
		sut = new Z10();
	}

	@Test
	public void testDodawania() {
		int liczba1 = 1;
		int liczba2 = 2;
		char znak = '+';
		int expected = 3;

		int actual = Z10.compute(liczba1, liczba2, znak);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testMnozenia() {
		int liczba1 = 3;
		int liczba2 = 2;
		char znak = '*';
		int expected = 6;

		int actual = Z10.compute(liczba1, liczba2, znak);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testOdejmowania() {
		int liczba1 = 1;
		int liczba2 = 2;
		char znak = '-';
		int expected = -1;

		int actual = Z10.compute(liczba1, liczba2, znak);

		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testDzelenia() {
		int liczba1 = 6;
		int liczba2 = 2;
		char znak = '/';
		int expected = 3;

		int actual = Z10.compute(liczba1, liczba2, znak);

		assertThat(actual).isEqualTo(expected);
	}
	@Test
	public void testDzeleniaUlamki() {
		int liczba1 = 5;
		int liczba2 = 2;
		char znak = '/';
		int expected = 2;

		int actual = Z10.compute(liczba1, liczba2, znak);

		assertThat(actual).isEqualTo(expected);
	}
	@Test
	public void testDzeleniaZero() {
		int liczba1 = 6;
		int liczba2 = 0;
		char znak = '/';
		
		exception.expect(ArithmeticException.class);
		exception.expectMessage("/ by zero");
		
		Z10.compute(liczba1, liczba2, znak);
	}
	@Test
	public void testInnyZnak() {
		int liczba1 = 6;
		int liczba2 = 2;
		char znak = 'z';
		int expected = 8;

		int actual = Z10.compute(liczba1, liczba2, znak);

		assertThat(actual).isEqualTo(expected);
	}
}