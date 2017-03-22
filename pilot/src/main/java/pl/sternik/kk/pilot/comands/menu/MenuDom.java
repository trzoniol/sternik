package pl.sternik.kk.pilot.comands.menu;

import java.util.Map;

import pl.sternik.kk.pilot.comands.Command;
import pl.sternik.kk.pilot.comands.CommandPrzelaczMenu;
import pl.sternik.kk.pilot.comands.CommandPusty;
import pl.sternik.kk.pilot.comands.CommandZakoncz;
import pl.sternik.kk.pilot.comands.swiatlo.CommandSwiatloWlacz;
import pl.sternik.kk.pilot.comands.swiatlo.CommandSwiatloWylacz;
import pl.sternik.kk.pilot.comands.wentylator.CommandWentylatorObroty1;
import pl.sternik.kk.pilot.comands.wentylator.CommandWentylatorObroty2;
import pl.sternik.kk.pilot.comands.wentylator.CommandWentylatorObroty3;
import pl.sternik.kk.pilot.comands.wentylator.CommandWentylatorWlacz;
import pl.sternik.kk.pilot.comands.wentylator.CommandWentylatorWylacz;

public class MenuDom implements MenuPilota {

	private Map<String, Command> przyciski;
	private CommandPrzelaczMenu przelaczMenu;

	public MenuDom(Map<String, Command> przyciski, CommandPrzelaczMenu pm) {
		this.przyciski = przyciski;
		przelaczMenu = pm;
	}

	public void ustawMenu() {
		przyciski.clear();
		przyciski.put("1", new CommandSwiatloWlacz());
		przyciski.put("2", new CommandSwiatloWylacz());
		przyciski.put("3", new CommandPusty());
		// przyciski.put("3", new CommandGarazOtworzDrzwi());
		przyciski.put("4", new CommandPusty());
		// przyciski.put("4", new CommandGarazZamknijDrzwi());
		przyciski.put("5", new CommandWentylatorWlacz());
		przyciski.put("6", new CommandWentylatorObroty1());
		przyciski.put("7", new CommandWentylatorObroty2());
		przyciski.put("8", new CommandWentylatorObroty3());
		przyciski.put("9", new CommandWentylatorWylacz());
		przyciski.put("0", przelaczMenu);
		przyciski.put("Z", new CommandZakoncz());
		System.out.println("------>Menu Dom<------");
	}

	public String getOpis() {
		return "Menu Dom";
	}
}