package pl.sternik.kk.sklep.zamowienia;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import pl.sternik.kk.sklep.Article;

public class OrderTest {

	@Test
	public void thatOrderIsNotClassArticle() throws Exception {

		// given:
		Article art = new Article();
		Order sut = new Order();
		// when:

		// then:
		assertThat(sut).doesNotHaveSameClassAs(art);
	}

	@Test
	public void thatOrderIsClassOrder() throws Exception {

		// given:
		Object test = new Order();
		Order sut = new Order();
		// when:

		// then:
		assertThat(sut).hasSameClassAs(test);
	}

	@Test
	public void thatOrderIsNotClassObject() throws Exception {

		// given:
		Object test = new Object();
		Object sut = new Order();
		// when:

		// then:
		assertThat(sut).doesNotHaveSameClassAs(test);
	}
}
