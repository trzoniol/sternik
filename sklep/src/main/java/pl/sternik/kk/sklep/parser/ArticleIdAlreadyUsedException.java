package pl.sternik.kk.sklep.parser;

public class ArticleIdAlreadyUsedException extends BadArticleIDException {
	private static final long serialVersionUID = 1L;

	public ArticleIdAlreadyUsedException(int id) {
		super("Dany numer Id:" + id + " jest już zajęty");
	}

}
