package pl.sternik.kk.sklep.parser;

public class ArticleFormatRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ArticleFormatRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public ArticleFormatRuntimeException(String message) {
		super(message);
	}

}
