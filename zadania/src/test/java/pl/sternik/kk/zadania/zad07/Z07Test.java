package pl.sternik.kk.zadania.zad07;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
public class Z07Test {

	int[] tablica = { 5, 4, 3, 4, 6, 6, 9, 1, 9 };
	MyScanner input;
	Z07 sut;

	@Before
	public void before() {
		input = mock(MyScanner.class);
		sut = new Z07(input);
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

	@Test
	public void testWitMockito(){
		when(input.nextInt()).thenReturn(5);

		int actual = sut.findWithScanner(tablica, input);
		
		assertThat(actual).isEqualTo(0);
		verify(input).nextInt();
	}

}