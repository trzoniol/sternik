package pl.sternik.kk.sklep;

import org.apache.log4j.Logger;

import pl.sternik.kk.sklep.parser.ArticleIdAlreadyUsedException;
import pl.sternik.kk.sklep.parser.BadArticleIDException;

public class Article {

	private int id;
	private String name;
	private String description;
	private double price;

	static int counter;

	private static final Logger log = Logger.getLogger("Article");

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		printChange();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	public Article(int id, String name, String description, double price) throws BadArticleIDException {
		super();
		if(id < 0){
			throw new BadArticleIDException("Id nie moze być ujemne!");
		}
		if(id < counter){
			throw new ArticleIdAlreadyUsedException(id);
		}
		counter = id;
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public Article() {
		super();
		counter++;
		this.id = counter;
		this.name = "Brak nazwy";
		this.description = "Brak opisu";
		this.price = 0.0d;
	}

	protected void printChange() {
		 log.debug("Zmieniono wartość pola");
	}

}