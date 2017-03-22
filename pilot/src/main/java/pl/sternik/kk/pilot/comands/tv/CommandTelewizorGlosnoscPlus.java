package pl.sternik.kk.pilot.comands.tv;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.tv.Telewizor;

public class CommandTelewizorGlosnoscPlus implements Command {

    public void execute() {
        Telewizor.instance().glosnoscPlus();
    }

    public String getOpis() {
        return "Telewizor głośność ++";
    }
}
