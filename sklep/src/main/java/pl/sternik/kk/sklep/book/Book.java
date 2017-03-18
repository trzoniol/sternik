package pl.sternik.kk.sklep.book;

import pl.sternik.kk.sklep.Article;

public class Book extends Article {
    private String autor;
    private int year;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //zwykly zad 17
//    @Override
	public String toStringOld() {
		return "Book [autor=" + autor + ", year=" + year + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDescription()=" + getDescription() + ", getPrice()=" + getPrice() + "]";
	}
    //zad 18
    @Override
	public String toString() {
		return "Book [autor=" + autor + ", year=" + year + ", "+super.toString() + "]";
	}    

    public Book() {
        this.setYear(2015);
        this.setAutor("Brak autora");
        printChange();

    }

    public Book(int id, String name, String description, double price, String autor, int year) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setAutor(autor);
        this.setYear(year);
        printChange();

    }

}
