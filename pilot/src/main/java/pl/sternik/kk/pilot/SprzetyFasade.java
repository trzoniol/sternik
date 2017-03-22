package pl.sternik.kk.pilot;

import pl.sternik.kk.pilot.garaz.Garaz;
import pl.sternik.kk.pilot.swiatlo.Swiatlo;
import pl.sternik.kk.pilot.tv.Telewizor;
import pl.sternik.kk.pilot.wentylator.Wentylator;

public abstract class SprzetyFasade {

	public static void wylaczWszystko() {
        Swiatlo.instance().wylacz();
        Telewizor.instance().wylacz();
        Wentylator.instance().wylacz();
    }
	
	public static void wylaczWszystkoWyjezdzam() {
        Swiatlo.instance().wylacz();
        Telewizor.instance().wylacz();
        Wentylator.instance().obroty2();
        Wentylator.instance().obroty1();
        Wentylator.instance().wylacz();
        Garaz.instance().drzwiGora();
    }

    public static void wlaczTrybKanapowy() {
        Swiatlo.instance().wlacz();
        Telewizor.instance().wlacz();
        Wentylator.instance().wlacz();
    }
}
