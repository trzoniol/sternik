package pl.sternik.kk.pilot.comands.menu;

import java.util.Map;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.comands.CommandPrzelaczMenu;
import pl.sternik.kk.pilot.comands.CommandPusty;
import pl.sternik.kk.pilot.comands.CommandZakoncz;
import pl.sternik.kk.pilot.comands.tv.CommandTelewizorGlosnoscMinus;
import pl.sternik.kk.pilot.comands.tv.CommandTelewizorGlosnoscPlus;
import pl.sternik.kk.pilot.comands.tv.CommandTelewizorKanalMinus;
import pl.sternik.kk.pilot.comands.tv.CommandTelewizorKanalPlus;
import pl.sternik.kk.pilot.comands.tv.CommandTelewizorWlacz;
import pl.sternik.kk.pilot.comands.tv.CommandTelewizorWylacz;

public class MenuTv implements MenuPilota {

	private Map<String, Command> przyciski;
	private CommandPrzelaczMenu przelaczMenu ;
	
	public MenuTv(Map<String, Command> przyciski,CommandPrzelaczMenu pm) {
		this.przyciski = przyciski;
		przelaczMenu = pm;
	}
	
    public void ustawMenu() {
        przyciski.clear();
        przyciski.put("1", new CommandTelewizorWlacz());
        przyciski.put("2", new CommandTelewizorWylacz());
        przyciski.put("3", new CommandTelewizorGlosnoscPlus());
        przyciski.put("4", new CommandTelewizorGlosnoscMinus());
        przyciski.put("5", new CommandTelewizorKanalPlus());
        przyciski.put("6", new CommandTelewizorKanalMinus());
        przyciski.put("7", new CommandPusty());
        przyciski.put("8", new CommandPusty());
//        przyciski.put("8", new CommandTrybKanapowy());
        przyciski.put("9", new CommandPusty());
//        przyciski.put("9", new CommandWylaczWszystko());
        przyciski.put("0", przelaczMenu);
        przyciski.put("Z", new CommandZakoncz());
        System.out.println("------>Menu TV<------");
    }

    public String getOpis() {
        return "Menu TV";
    }
}
