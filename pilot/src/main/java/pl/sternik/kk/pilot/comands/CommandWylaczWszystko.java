package pl.sternik.kk.pilot.comands;

import pl.sternik.kk.pilot.SprzetyFasade;

public class CommandWylaczWszystko implements Command {

    public void execute() {
        SprzetyFasade.wylaczWszystko();
    }

    public String getOpis() {
        return "Wylacz wszystko";
    }
}
