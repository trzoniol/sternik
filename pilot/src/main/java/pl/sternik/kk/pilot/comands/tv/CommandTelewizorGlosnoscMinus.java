package pl.sternik.kk.pilot.comands.tv;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.tv.Telewizor;

public class CommandTelewizorGlosnoscMinus implements Command {

    public void execute() {
        Telewizor.instance().glosnoscMinus();
    }

    public String getOpis() {
        return "Telewizor głośność --";
    }
}
