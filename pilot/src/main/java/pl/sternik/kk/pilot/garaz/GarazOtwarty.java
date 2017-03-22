package pl.sternik.kk.pilot.garaz;

public class GarazOtwarty implements GarazStan {

	@Override
	public void open() {
		System.out.println("Nic nie robię");
	}

	@Override
	public void close() {
		System.out.println("Zamykam Garaż");
	}
}
