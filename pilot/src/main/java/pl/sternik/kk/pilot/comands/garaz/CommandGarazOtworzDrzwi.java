package pl.sternik.kk.pilot.comands.garaz;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.garaz.Garaz;

public class CommandGarazOtworzDrzwi implements Command {
    public void execute() {
        Garaz.instance().drzwiGora();
    }

    public String getOpis() {
        return "Garaż otwarty";
    }
}
