package pl.sternik.kk.zadania.zad24;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

public class Z24Test {

    @Test(expected = ArithmeticException.class)
    public void testDzieleniePrzez0() throws Exception {
       Z24 sut = new Z24();
       
       sut.podziel(1, 0);
    }

	@Test
	public void testDajElement() throws Exception {
		Z24 sut = new Z24();
		
		int actual = sut.dajElement(11);
		
		assertThat(actual).isEqualTo(0);
	}

}
