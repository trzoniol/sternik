package pl.sternik.kk.pilot.comands.tv;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.tv.Telewizor;

public class CommandTelewizorWlacz implements Command {
    public void execute() {
        Telewizor.instance().wlacz();
    }

    public String getOpis() {
        return "Włączam telewizor";
    }
}
