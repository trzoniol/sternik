package pl.sternik.kk.pilot.comands.wentylator;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.wentylator.Wentylator;

public class CommandWentylatorWlacz implements Command {
    public void execute() {
        Wentylator.instance().wlacz();
    }

    public String getOpis() {
        return "Wentylator włączony";
    }
}
