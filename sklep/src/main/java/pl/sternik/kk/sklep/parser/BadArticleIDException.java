package pl.sternik.kk.sklep.parser;

public class BadArticleIDException extends Exception{
	private static final long serialVersionUID = 1L;

	public BadArticleIDException() {
		super();
	}

	public BadArticleIDException(String message) {
		super(message);
	}
}
