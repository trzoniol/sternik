package pl.sternik.kk.pilot.comands.wentylator;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.wentylator.Wentylator;

public class CommandWentylatorObroty2 implements Command {
    public void execute() {
        Wentylator.instance().obroty2();
    }

    public String getOpis() {
        return "Wentylator ustawiony na obroty2";
    }
}
