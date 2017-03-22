package pl.sternik.kk.pilot;

public final class Wentylator {
    private static Wentylator instance = new Wentylator();

//    private static WentylatorStan wylaczony = new WentylatorWylaczony();
//    private static WentylatorStan obroty1 = new WentylatorObroty1();
//    private static WentylatorStan obroty2 = new WentylatorObroty2();
//    private static WentylatorStan obroty3 = new WentylatorObroty3();

//    private WentylatorStan aktualnyStan = wylaczony;

    private Wentylator() {
        System.out.println("Tworzę sprzęt Wentylator");
    };

    public static Wentylator instance() {
        return instance;
    }

    public void wlacz() {
    	System.out.println("Wyłączam wentylator");
//        aktualnyStan = aktualnyStan.wlacz();
    }

    public void wylacz() {
    	System.out.println("Włączam wentylator");
//        aktualnyStan = aktualnyStan.wylacz();
    }

    public void obroty1() {
    	System.out.println("Uswatiam obroty na 1");
//        aktualnyStan = aktualnyStan.obroty1();
    }

    public void obroty2() {
    	System.out.println("Ustawiam obroty na 2");
//        aktualnyStan = aktualnyStan.obroty2();
    }

    public void obroty3() {
    	System.out.println("Ustawiam obroty na 3");
//        aktualnyStan = aktualnyStan.obroty3();
    }

//    public static WentylatorStan getWylaczony() {
//        return wylaczony;
//    }

//    public static WentylatorStan getObroty1() {
//        return obroty1;
//    }

//    public static WentylatorStan getObroty2() {
//        return obroty2;
//    }

//    public static WentylatorStan getObroty3() {
//        return obroty3;
//    }

//    public WentylatorStan getAktualnyStan() {
//        return aktualnyStan;
//    }
}
