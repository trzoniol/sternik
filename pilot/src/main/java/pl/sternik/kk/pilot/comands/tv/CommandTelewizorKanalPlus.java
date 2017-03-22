package pl.sternik.kk.pilot.comands.tv;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.tv.Telewizor;

public class CommandTelewizorKanalPlus implements Command {
    public void execute() {
        Telewizor.instance().kanalPlus();;
    }

    public String getOpis() {
        return "Telewizor kanał ++";
    }
}
