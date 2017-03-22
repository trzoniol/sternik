package pl.sternik.kk.pilot;

public final class Garaz {
    private static Garaz instance = new Garaz();

    private Garaz() {
        System.out.println("Tworzę sprzęt Garaz");
    };

    public static Garaz instance() {
        return instance;
    }

    public void drzwiDol() {
        System.out.println("Garaż drzwi w dół");
    }

    public void drzwiGora() {
        System.out.println("Garaż drzwi w górę");
    }
}
