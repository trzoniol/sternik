package pl.sternik.kk.klaser;

public class ProstaBazaDanych {

	private Moneta[] baza;

	public ProstaBazaDanych(int rozmiarBazy) {
		baza = new Moneta[rozmiarBazy];
	}

	public void addMoneta(Moneta moneta) {
		for (int i = 0; i < baza.length; i++) {
			if (baza[i] == null) {
				baza[i] = moneta;
				moneta.setNumerKatalogowy(i);
				return;
			}
		}
	}

	public boolean deleteMoneta(int numerKatalogowy) {
		if(!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)){
			return false;
		}
		baza[numerKatalogowy] = null;
		return true;
	}

	public boolean updateMoneta(Moneta moneta) {
		int numerKatalogowy = (int) moneta.getNumerKatalogowy();
		if(!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)){
			return false;
		}
		
		Moneta m = baza[(int) moneta.getNumerKatalogowy()];
		if (m == null) {
			System.out.println("Nie ma monety o tym numerze! nic nie robie");
			return false;
		} else {
			System.out.println("Jest taka moneta zamieniam");
			baza[(int) moneta.getNumerKatalogowy()] = moneta;
		}
		return true;
	}

	public Moneta getMoneta(int numerKatalogowy) throws NoSuchMonetaException{
		if(!sprawdzPoprawnoscNumeruKatalogowego(numerKatalogowy)){
			throw new NoSuchMonetaException();
		}
		return baza[numerKatalogowy];
	}
	
	private boolean sprawdzPoprawnoscNumeruKatalogowego(int numerKatalogowy) {
		if (numerKatalogowy < 0 || numerKatalogowy >= baza.length) {
			System.out.println("Zły numer katalogowy");
			return false;
		}
		return true;
	}

	public void wyswietlBaze() {
		for (int i = 0; i < baza.length; i++) {
			System.out.println("" + i + ":" + baza[i]);
		}
	}
}
