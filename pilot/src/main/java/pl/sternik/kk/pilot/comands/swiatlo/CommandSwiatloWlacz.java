package pl.sternik.kk.pilot.comands.swiatlo;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.swiatlo.Swiatlo;

public class CommandSwiatloWlacz implements Command {
    public void execute() {
        Swiatlo.instance().wlacz();
    }

    public String getOpis() {
        return "Światło włącz";
    }
}
