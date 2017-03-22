package pl.sternik.kk.pilot.comands;

import pl.sternik.kk.pilot.comands.menu.MenuPilota;

public class CommandPrzelaczMenu implements Command {

	public MenuPilota menu=null;

	public CommandPrzelaczMenu() {
	}

	public CommandPrzelaczMenu(MenuPilota menu) {
		this.menu = menu;
	}

	public void execute() {
		menu.ustawMenu();
	}

	public String getOpis() {
		return menu.getOpis();
	}
}