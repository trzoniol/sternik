package pl.sternik.kk.pilot.wentylator;

public final class Wentylator {
    private static Wentylator instance = new Wentylator();

    final WentylatorStan WYLACZONY = new WentylatorWylaczony(this);
    final WentylatorStan OBROTY1 = new WentylatorObroty1(this);
    final WentylatorStan OBROTY2 = new WentylatorObroty2(this);
    final WentylatorStan OBROTY3 = new WentylatorObroty3(this);

    private WentylatorStan aktualnyStan = WYLACZONY;

    private Wentylator() {
        System.out.println("Tworzę sprzęt Wentylator");
    };

    public static Wentylator instance() {
        return instance;
    }

    public void wlacz() {
        aktualnyStan = aktualnyStan.wlacz();
    }

    public void wylacz() {
        aktualnyStan = aktualnyStan.wylacz();
    }

    public void obroty1() {
        aktualnyStan = aktualnyStan.obroty1();
    }

    public void obroty2() {
        aktualnyStan = aktualnyStan.obroty2();
    }

    public void obroty3() {
        aktualnyStan = aktualnyStan.obroty3();
    }
}
