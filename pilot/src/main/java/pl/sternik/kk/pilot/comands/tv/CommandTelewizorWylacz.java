package pl.sternik.kk.pilot.comands.tv;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.tv.Telewizor;

public class CommandTelewizorWylacz implements Command {
    public void execute() {
        Telewizor.instance().wylacz();
    }

    public String getOpis() {
        return "Wyłączam telewizor";
    }
}
