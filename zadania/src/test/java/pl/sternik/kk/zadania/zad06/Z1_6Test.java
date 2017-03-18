package pl.sternik.kk.zadania.zad06;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class Z1_6Test {

	@Test
	public void testMinimum() throws Exception {
		int[][] values = { { 3, 8, 16 }, { 1, 22, 28, 24 }, { 3 }, { 41, 42 } };
		int expected = 1;

		int actual = Z1_6.findMin(values);

		assertThat(actual).isEqualTo(expected);
	}
	@Test
	public void testMaximum() throws Exception {
		int[][] values = { { 3, 8, 16 }, { 1, 22, 28, 24 }, { 3 }, { 41, 42 } };
		int expected = 42;

		int actual = Z1_6.findMax(values);

		assertThat(actual).isEqualTo(expected);
	}
}
