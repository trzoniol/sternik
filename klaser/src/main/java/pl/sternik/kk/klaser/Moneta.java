package pl.sternik.kk.klaser;

import java.math.BigDecimal;
import java.util.Date;

public class Moneta {

	private String Opis;
	private long numerKatalogowy;
	private long nominal;
	private String waluta;
	private BigDecimal cenaNabycia;
	private Date dataNabycia;
	private String krajPochodzenia;
	
	public String getOpis() {
		return Opis;
	}
	public void setOpis(String opis) {
		Opis = opis;
	}
	public long getNumerKatalogowy() {
		return numerKatalogowy;
	}
	public void setNumerKatalogowy(long numerKatalogowy) {
		this.numerKatalogowy = numerKatalogowy;
	}
	public long getNominal() {
		return nominal;
	}
	public void setNominal(long nominal) {
		this.nominal = nominal;
	}
	public String getWaluta() {
		return waluta;
	}
	public void setWaluta(String waluta) {
		this.waluta = waluta;
	}
	public BigDecimal getCenaNabycia() {
		return cenaNabycia;
	}
	public void setCenaNabycia(BigDecimal cenaNabycia) {
		this.cenaNabycia = cenaNabycia;
	}
	public Date getDataNabycia() {
		return dataNabycia;
	}
	public void setDataNabycia(Date dataNabycia) {
		this.dataNabycia = dataNabycia;
	}
	public String getKrajPochodzenia() {
		return krajPochodzenia;
	}
	public void setKrajPochodzenia(String krajPochodzenia) {
		this.krajPochodzenia = krajPochodzenia;
	}
	@Override
	public String toString() {
		return "Moneta [numerKatalogowy=" + numerKatalogowy + ", krajPochodzenia=" + krajPochodzenia + ", nominal="
				+ nominal + ", waluta=" + waluta + ", Opis=" + Opis + ", cenaNabycia=" + cenaNabycia + ", dataNabycia="
				+ dataNabycia + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (numerKatalogowy ^ (numerKatalogowy >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moneta other = (Moneta) obj;
		if (numerKatalogowy != other.numerKatalogowy)
			return false;
		return true;
	}
	
	
}
