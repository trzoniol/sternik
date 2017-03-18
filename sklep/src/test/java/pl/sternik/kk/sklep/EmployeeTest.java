package pl.sternik.kk.sklep;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EmployeeTest {

    @Test
    public void thatAuthorizationFalse() throws Exception {

        // given:
        Employee sut = new Employee();

        // when:
        Boolean czyTrue = sut.getAuthorization();
        // then:
        assertThat(czyTrue).isEqualTo(false);
    }
    @Test
    public void thatAuthorizationTrue() throws Exception {

        // given:
        Employee sut = new Employee();
        sut.setName("Zdzisiek");
        // when:
        Boolean czyTrue = sut.getAuthorization();
        // then:
        assertThat(czyTrue).isEqualTo(true);
    }

    @Test
    public void thatPoprawnyId() throws Exception {

        // given:
        int licznik = Person.counter;
        Employee sut;
        // when:
        sut = new Employee();
        sut = new Employee();
        sut = new Employee();
        // then:
        int newId = sut.getId();
        // counter zdefiniowany w abstrakcyjnej klasie Person działa poprawnie dla Employee
        assertThat(newId).isEqualTo(licznik + 3);
    }
}
