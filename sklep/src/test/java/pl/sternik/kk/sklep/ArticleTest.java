package pl.sternik.kk.sklep;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ArticleTest {

    @Test
    public void thatCounterDomyslnyKonstruktor() throws Exception {

        // given:
        // pobieram aktualną wartość countera
        int licznik = Article.counter;
        // when:
        // Article sut = new Article();
        new Article();
        // then:
        assertThat(Article.counter).isEqualTo(licznik + 1);
    }

    @Test
    public void thatCounter3DomyslneKonstruktory() throws Exception {

        // given:
        // pobieram aktualną wartość countera
        int licznik = Article.counter;
        // when:
        // jak dodam 3 artykuly wg domyslnego konstruktora to counter ma się zwiększyć o 3
        new Article();
        new Article();
        new Article();
        // then:
        assertThat(Article.counter).isEqualTo(licznik + 3);
    }

    @Test
    public void thatCounterKonstruktorZargs() throws Exception {

        // given:
        int licznik = Article.counter;
        // when:
        new Article(25, "Kefir", "Kefir 0%", 0.99);
        // then:
        assertThat(Article.counter).isEqualTo(++licznik);
    }

    @Test
    public void thatCounterKonstrDomKonstrZargs() throws Exception {

        // given:
        int licznik = Article.counter;
        // when:
        new Article();
        licznik++;
        new Article(29, "Masło", "Masło Extra", 3.79);
        licznik++;
        // then:
        assertThat(Article.counter).isEqualTo(licznik);
    }

    @Test
    public void thatKonstrDomPoprawnePola() throws Exception {

        // given:
        // when:
        Article sut = new Article();
        // then:
        assertThat(sut.getId()).isEqualTo(0);
        assertThat(sut.getName()).isEqualTo("Brak nazwy");
        assertThat(sut.getPrice()).isEqualTo(0);
        assertThat(sut.getDescription()).isEqualTo("Brak opisu");
    }

    @Test
    public void thatKonstrZargsPoprawnePola() throws Exception {

        // given:
        // when:
        Article sut = new Article(72, "Chleb", "Chleb oliwski", 2.34);
        // then:
        assertThat(sut.getId()).isEqualTo(72);
        assertThat(sut.getName()).isEqualTo("Chleb");
        assertThat(sut.getPrice()).isEqualTo(2.34);
        assertThat(sut.getDescription()).isEqualTo("Chleb oliwski");
    }
}
