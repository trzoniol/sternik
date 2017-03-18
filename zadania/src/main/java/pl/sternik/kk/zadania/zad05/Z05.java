package pl.sternik.kk.zadania.zad05;

public class Z05 {

    public static void main(String[] args) {
        String[] tablica = { "Raz", "Dwa", "Trzy", "Cztery" };

        String tmp = zrobPetleFor(tablica);
        System.out.println(tmp);

        tmp = zrobPetleForEach(tablica);
        System.out.println(tmp);

        tmp = zrobPetleWhile(tablica);
        System.out.println(tmp);
        
    }

	static String zrobPetleFor(String[] tablica) {
		int i;
		StringBuilder sb = new StringBuilder();
		sb.append("Petla FOR");
        for (i = 0; i <= tablica.length - 1; i++) {
            sb.append("\n"); 
            sb.append(tablica[i]);
        }
        return sb.toString();
	}
	static String zrobPetleWhile(String[] tablica) {
		int i;
		StringBuilder sb = new StringBuilder();
		sb.append("Petla While");
        i = 0;
        while (i <= tablica.length - 1) {
            sb.append("\n");
            sb.append(tablica[i]);
            i++;
        }     
        return sb.toString();
	}	
	static String zrobPetleForEach(String[] tablica) {
		String tmp ="";
		tmp = tmp + "Petla FOREach";
		for (String string : tablica) {
            tmp = tmp +"\n" + string;
        }
        return tmp;
	}
}
