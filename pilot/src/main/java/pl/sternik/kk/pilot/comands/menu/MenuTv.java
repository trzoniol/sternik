package pl.sternik.kk.pilot.comands.menu;

import java.util.Map;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.comands.CommandPusty;
import pl.sternik.kk.pilot.comands.CommandZakoncz;

public class MenuTv implements MenuPilota {

	private Map<String, Command> przyciski;

	public MenuTv(Map<String, Command> przyciski) {
		this.przyciski = przyciski;
	}
	
    public void ustawMenu() {
        przyciski.clear();
        przyciski.put("1", new CommandPusty());
//        przyciski.put("1", new CommandTelewizorWlacz());
        przyciski.put("2", new CommandPusty());
//        przyciski.put("2", new CommandTelewizorWylacz());
        przyciski.put("3", new CommandPusty());
//        przyciski.put("3", new CommandTelewizorGlosnoscPlus());
        przyciski.put("4", new CommandPusty());
//        przyciski.put("4", new CommandTelewizorGlosnoscMinus());
        przyciski.put("5", new CommandPusty());
//        przyciski.put("5", new CommandTelewizorKanalPlus());
        przyciski.put("6", new CommandPusty());
//        przyciski.put("6", new CommandTelewizorKanalMinus());
        przyciski.put("7", new CommandPusty());
        przyciski.put("8", new CommandPusty());
//        przyciski.put("8", new CommandTrybKanapowy());
        przyciski.put("9", new CommandPusty());
//        przyciski.put("9", new CommandWylaczWszystko());
        przyciski.put("0", new CommandPusty());
//        przyciski.put("0", new CommandPrzelaczMenu(inneMenu));
        przyciski.put("Z", new CommandZakoncz());
        System.out.println("------>Menu TV<------");
    }

    public String getOpis() {
        return "Menu TV";
    }
}
