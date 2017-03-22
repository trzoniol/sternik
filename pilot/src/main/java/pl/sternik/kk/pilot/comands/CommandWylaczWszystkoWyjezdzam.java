package pl.sternik.kk.pilot.comands;

import pl.sternik.kk.pilot.SprzetyFasade;

public class CommandWylaczWszystkoWyjezdzam implements Command {

    public void execute() {
        SprzetyFasade.wylaczWszystkoWyjezdzam();
    }

    public String getOpis() {
        return "Wylacz wszystko otwóż garaż";
    }
}
