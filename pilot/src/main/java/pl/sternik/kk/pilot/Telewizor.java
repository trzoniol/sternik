package pl.sternik.kk.pilot;

public final class Telewizor {
    private static Telewizor instance = new Telewizor();

    private Telewizor() {
        System.out.println("Tworzę sprzęt Telewizor");
    };

    public static Telewizor instance() {
        return instance;
    }

    public void wlacz() {
        System.out.println("Telewizor włączony");
    }

    public void wylacz() {
        System.out.println("Telewizor wyłączony");
    }

    public void kanalPlus() {
        System.out.println("TV Kanał ++");
    }

    public void kanalMinus() {
        System.out.println("TV Kanał --");
    }

    public void glosnoscPlus() {
        System.out.println("TV Głośność ++");
    }

    public void glosnoscMinus() {
        System.out.println("TV Głośność --");
    }
}
