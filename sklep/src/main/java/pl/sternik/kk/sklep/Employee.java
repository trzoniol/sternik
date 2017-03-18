package pl.sternik.kk.sklep;

public class Employee extends Person {

    @Override
    public boolean getAuthorization() {
        if (getName() != null) {
            return true;
        }
        return false;
    }

}
