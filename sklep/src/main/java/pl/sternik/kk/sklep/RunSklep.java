package pl.sternik.kk.sklep;

import org.apache.log4j.Logger;

import pl.sternik.kk.sklep.book.Book;
import pl.sternik.kk.zamowienia.Order;

public class RunSklep {

	private static final Logger log = Logger.getLogger("RunSklep");

	public static void main(String[] args) {

		Article ksiazka = new Article();
		ksiazka.setId(1);
		ksiazka.setName("Władca PIerścieni");
		ksiazka.setDescription("Opis książki");
		ksiazka.setPrice(34.99);
		System.out.println(ksiazka);

		Article dvd = new Article(2, "Shameless S01", "Serial paradoksalny", 29.99);
		System.out.println(dvd);
		Article dvd2 = new Article(3, "Aterix", "Serial Panoramixsalny", 19.99);
		System.out.println(dvd2);

		System.out.println(Article.counter);

		dvd2.setPrice(1.11);
		// dvd2.printChange();

		Order zamowienie = new Order();

		Book komiks = new Book();
		System.out.println(komiks);

		Book bajka = new Book(1, "koziolek matolek", "bajka", 9.99, "John Doe", 1980);
		System.out.println(bajka.toString());
		// Rzutowanie Book na Article
		Article koziolek = bajka;
		bajka.setAutor("JA");
		System.out.println(koziolek.toString());

		// nie da sie bo abstrakcyjna
		// Person osobaA = new Person();

		Person osoba1 = new Employee();
		log.debug("Osoba autoryzowana: " + osoba1.getAuthorization());
		Person osoba2 = new Employee();
		osoba2.setName("Kacper");
		log.debug("Osoba autoryzowana: " + osoba2.getAuthorization());

		Record plik = new Record(1,"Ramstain","The Best of",1.11,120,"mp3");
	}
}
