package pl.sternik.kk.pilot.comands.garaz;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.garaz.Garaz;

public class CommandGarazZamknijDrzwi implements Command {
    public void execute() {
        Garaz.instance().drzwiDol();
    }

    public String getOpis() {
        return "Garaż zamknięty";
    }
}
