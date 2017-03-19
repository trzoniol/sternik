package pl.sternik.kk.klaser;

import java.math.BigDecimal;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		ProstaBazaDanych baza = new ProstaBazaDanych(3);

		Moneta m = new Moneta();
		m.setNumerKatalogowy(5);
		m.setKrajPochodzenia("Polska");
		m.setNominal(1);
		m.setWaluta("zł");
		m.setOpis("Ładna nowiutka złotóweczka");
		m.setDataNabycia(new Date());
		m.setCenaNabycia(new BigDecimal("1.2"));
		
		baza.addMoneta(m);
		baza.wyswietlBaze();
		baza.deleteMoneta(1);
		baza.wyswietlBaze();
		
		m.setNumerKatalogowy(1);
		m.setNominal(2);
		baza.updateMoneta(m);
		baza.wyswietlBaze();
		
		Moneta moneta;
		try {
			moneta = baza.getMoneta(11);
			System.out.println(moneta.getKrajPochodzenia());
		} catch (NoSuchMonetaException e) {
			System.out.println("No zły numer!");
		}
		
		
	}
}
