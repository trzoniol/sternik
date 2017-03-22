package pl.sternik.kk.pilot.comands.menu;

import pl.sternik.kk.pilot.comands.Command;

public interface MenuPilota {
	String getOpis();
	public void wyswietlMenu();
	Command getCommandForKey(String upperCase);
}
