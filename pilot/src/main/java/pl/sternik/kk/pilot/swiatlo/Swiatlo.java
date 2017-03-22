package pl.sternik.kk.pilot.swiatlo;

public final class Swiatlo {
    private static Swiatlo instance = new Swiatlo();
    private final SwiatloStan wlaczone = new SwiatloWlaczone();
    private final SwiatloStan wylaczone = new SwiatloWylaczone();
    private SwiatloStan stanAktualny = wylaczone;

    private Swiatlo() {
        System.out.println("Tworzę sprzęt Swiatlo");
    };

    public static Swiatlo instance() {
        return instance;
    }

    public void wlacz() {
        stanAktualny.wlacz();
        stanAktualny = wlaczone;
    }

    public void wylacz() {
        stanAktualny.wylacz();
        stanAktualny = wylaczone;
    }
}
