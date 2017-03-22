package pl.sternik.kk.pilot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.comands.menu.MenuDom;
import pl.sternik.kk.pilot.comands.menu.MenuPilota;
import pl.sternik.kk.pilot.comands.menu.MenuTv;
import pl.sternik.kk.pilot.comands.swiatlo.CommandSwiatloWlacz;
import pl.sternik.kk.pilot.comands.swiatlo.CommandSwiatloWylacz;


public class Pilot {

    private Map<String, Command> przyciski = new TreeMap<String, Command>();

    private final MenuPilota menuDomowe = new MenuDom(przyciski);
    private final MenuPilota menuTv = new MenuTv(przyciski);

    public Pilot() {
        System.out.println("-----> Rozpoczęcie pracy pilota");
        menuDomowe.ustawMenu();
    }

    public void kliknijPrzyciskNr(String numer) {
        Command command = przyciski.get(numer.toUpperCase());
        System.out.println("Kliknięto: " + numer);
        command.execute();
    }

    public void wyswietlMenu() {
        for (Map.Entry<String, Command> entry : przyciski.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue().getOpis());
        }
    }

    private static boolean czyWcisnietoZnakWyjscia(String znak) {
        return !(znak.toUpperCase().equals("Z"));
    }

    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        boolean czyDalej = true;
        String wybranyNr = null;

        do {
            System.out.println("");

            pilot.wyswietlMenu();
            System.out.print("Wybierz opcję: ");
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                wybranyNr = br.readLine();
                System.out.println("");
                pilot.kliknijPrzyciskNr(wybranyNr);
                czyDalej = czyWcisnietoZnakWyjscia(wybranyNr);
            } catch (Exception e) {
                System.out.println("");
                System.out.println("Błędny wybór, spróbuj ponownie");
            }

        } while (czyDalej);
    }
}
