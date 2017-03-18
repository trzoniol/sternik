package pl.sternik.kk.sklep.book;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import pl.sternik.kk.sklep.Article;
import pl.sternik.kk.sklep.book.Book;

public class BookTest {

    @Test
    public void thatDomyslnyKonstruktorBook() throws Exception {
        // given:
        // when:
        Book sut = new Book();
        // then:
        // nie ma jeszcze zdefiniowanego konstruktora, wiec wstawiane są wartosci
        // domyślne w javie
        assertThat(sut.getAutor()).isEqualTo("Brak autora");
        assertThat(sut.getYear()).isEqualTo(0);
        // dane z klasy nadrzędnej, z konstruktora domyslnego
        assertThat(sut.getId()).isEqualTo(0);
        assertThat(sut.getName()).isEqualTo("Brak nazwy");
        assertThat(sut.getPrice()).isEqualTo(0);
        assertThat(sut.getDescription()).isEqualTo("Brak opisu");
    }
}