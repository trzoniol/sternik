package pl.sternik.kk.zadania.zad11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ZamowienieStanTest {

    @Test
    public void thatStanNoweOpisNowe() throws Exception {
        assertThat(StanLepszy.NOWE.getStan()).isEqualTo("NOWE");
    }

    @Test
    public void thatStanOczekujaceOpisOczekujace() throws Exception {
        assertThat(StanLepszy.OCZEKUJACE.getStan()).isEqualTo("OCZEKUJACE");
    }

    @Test
    public void thatStanRealizowaneOpisPilne() throws Exception {
        assertThat(StanLepszy.REALIZOWANE.getStan()).isEqualTo("Pilne");
    }

    @Test
    public void thatStanWyslaneOpisWyslane() throws Exception {
        assertThat(StanLepszy.WYSLANE.getStan()).isEqualTo("WYSLANE");
    }

    @Test
    public void thatStanZwrotOpisKontakt() throws Exception {
        assertThat(StanLepszy.ZWROT.getStan()).isEqualTo("Kontakt!");
    }
}
