package pl.sternik.kk.sklep;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ArticleBasicTest {

	@Test
	public void articleTest(){

		// given:
		Article sut = new Article();
		// when:
		sut.setId(1);
		sut.setName("Książka");
		sut.setDescription("Jakaś ciekawa książka dla rekinów javy.");
		sut.setPrice(100.33);
		// then:
		assertThat(sut.getPrice()).isEqualTo(100.33);
		assertThat(sut.getDescription()).isEqualTo("Jakaś ciekawa książka dla rekinów javy.");
		assertThat(sut.getName()).isEqualTo("Książka");
		assertThat(sut.getId()).isEqualTo(1);

		String actual = sut.toString();
		String expected = "Article [id=1, name=Książka, description=Jakaś ciekawa książka dla rekinów javy., price=100.33]";
		assertThat(actual).isEqualTo(expected);

	}
}
