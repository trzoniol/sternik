package pl.sternik.kk.pilot.comands.swiatlo;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.swiatlo.Swiatlo;

public class CommandSwiatloWylacz implements Command {
	public void execute() {
		Swiatlo.instance().wylacz();
	}

	public String getOpis() {
		return "Światło wyłączone";
	}
}
