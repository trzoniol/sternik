package pl.sternik.kk.pilot.comands.wentylator;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.wentylator.Wentylator;

public class CommandWentylatorWylacz implements Command {
    public void execute() {
        Wentylator.instance().wylacz();
    }

    public String getOpis() {
        return "Wentylator wyłączony";
    }
}
