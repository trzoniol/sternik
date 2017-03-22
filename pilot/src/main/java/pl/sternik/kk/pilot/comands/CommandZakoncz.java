package pl.sternik.kk.pilot.comands;

public class CommandZakoncz implements Command {

    public void execute() {
        System.out.println("Zakończenie pracy pilota");
    }

    public String getOpis() {
        return "Zakończenie pracy pilota";
    }
}
