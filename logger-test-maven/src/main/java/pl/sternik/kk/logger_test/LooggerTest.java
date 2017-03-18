package pl.sternik.kk.logger_test;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LooggerTest {

	private static final Logger log = Logger.getLogger("LooggerTest");

	public static void main(String[] args) {

		//BasicConfigurator.configure();
		log.setLevel(Level.INFO);
		log.fatal("porazka na calego");
		log.error("EEE");
		log.warn("warning!!!");
		log.info("ssss");
		String dd = "ppp";
		if (log.isDebugEnabled()) {
			log.debug("debug" + dd.length());
		}
		log.trace("sss");

	}
}
