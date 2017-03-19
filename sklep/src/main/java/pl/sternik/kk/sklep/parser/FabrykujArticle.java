package pl.sternik.kk.sklep.parser;

import java.util.Scanner;

import pl.sternik.kk.sklep.Article;

public class FabrykujArticle {
	public static void main(String[] args) throws ArticleFormatRuntimeException {
		System.out.print("Podaj tekst w formacie: \"1:Milk:An box of milk:2.50\": ");
		try (Scanner input = new Scanner(System.in)) {
			String tekst = input.nextLine();
			String[] tablica = tekst.split(":");
			int id = 0;
			double price = 0;
			try {
				id = Integer.parseInt(tablica[0]);
				price = Double.parseDouble(tablica[3]);
			} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
				throw new ArticleFormatRuntimeException("Stosuj się do formatu \"1:Milk:An box of milk:2.50\"");
			}
			Article artykul;
			try {
				// po to by dla id=0 dalo sie wygenerowac wyjatek
				new Article();
				artykul = new Article(id, tablica[1], tablica[2], price);
				if (artykul != null) {
					System.out.println("OK");
				}
			} catch (ArticleIdAlreadyUsedException e) {
				e.printStackTrace();
			} catch (BadArticleIDException e) {
				e.printStackTrace();
			}
		}
	}
}
