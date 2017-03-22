package pl.sternik.kk.pilot.comands.tv;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.tv.Telewizor;

public class CommandTelewizorKanalMinus implements Command {
    public void execute() {
        Telewizor.instance().kanalMinus();
    }

    public String getOpis() {
        return "Telewizor kanał --";
    }
}
