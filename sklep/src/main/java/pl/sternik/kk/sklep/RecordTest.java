package pl.sternik.kk.sklep;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RecordTest {

	@Test
	public void thatFormatPliku() throws Exception {

		// given:
		Record sut;
		// when:
		sut = new Record(123, "doc");
		// then:
		assertThat(sut.fileType()).isEqualTo("doc");
	}

	@Test
	public void thatRozmiarPliku() throws Exception {

		// given:
		Record sut;
		// when:
		sut = new Record(2500, "txt");
		// then:
		assertThat(sut.filesize()).isEqualTo(2500);
	}

	@Test
	public void thatPoprawnyId() throws Exception {

		// given:
		int licznik = Article.counter;
		Record sut;
		// when:
		sut = new Record(2000,"xml");
		// then:
		int newId = sut.getId();// getId zdefiniowane w Article, Record
								// dziedziczy to
		// counter zdefiniowany w klasie Article działa poprawnie dla Record
		assertThat(newId).isEqualTo(licznik + 1);
	}
}
