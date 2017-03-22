package pl.sternik.kk.pilot.comands;

import pl.sternik.kk.pilot.SprzetyFasade;

public class CommandTrybKanapowy implements Command {

    public void execute() {
        SprzetyFasade.wlaczTrybKanapowy();
    }

    public String getOpis() {
        return "Włącz tryb kanapowy";
    }
}
