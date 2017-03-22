package pl.sternik.kk.pilot.wentylator;

public class WentylatorObroty3 implements WentylatorStan {

    private Wentylator wentylator;

	public WentylatorObroty3(Wentylator wentylator) {
    	this.wentylator = wentylator;
    }

	public WentylatorStan wlacz() {
        System.out.println("Nic nie robię");
        return this;
    }

    public WentylatorStan wylacz() {
        System.out.println("Nic nie robię");
        return this;
    }

    public WentylatorStan obroty1() {
        System.out.println("Nic nie robię");
        return this;
    }

    public WentylatorStan obroty2() {
        System.out.println("Zmniejszam obroty na 2");
        return wentylator.OBROTY2;
    }

    public WentylatorStan obroty3() {
        System.out.println("Nic nie robię");
        return this;
    }
}
