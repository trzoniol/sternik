package pl.sternik.kk.zadania.zad12;

import static org.assertj.core.api.Assertions.fail;

import org.junit.Test;

public class PorownaniaTypowTest {
    byte byteDay = 24;
    short shortDay = byteDay;
    int intDay = byteDay;
    long longDay = byteDay;
    short shortRok = 2015;
    int intRok = shortRok;
    long longRok = shortRok;
    int intTemp = 18;
    long longTemp = intTemp;
    Byte byteDayObj = byteDay;
    Byte byteDayObj1 = 24;
    Byte byteDayObj2 = 24;
    Short shortDayObj = shortDay;
    Short shortRokObj = shortRok;
    Short shortRokObj1_2015 = 2015;
    Short shortRokObj2_2015 = 2015;
    Short shortRokObj1_15 = 15;
    Short shortRokObj2_15 = 15;
    Integer intDayObj = intDay;
    Integer intRokObj = intRok;
    Integer intTempObj = intTemp;
    Integer intTempObj1_18 = 18;
    Integer intTempObj2_18 = 18;
    Integer intTempObj1_180 = 180;
    Integer intTempObj2_180 = 180;
    Long longDayObj = longDay;
    Long longRokObj = longRok;
    Long longTempObj = longTemp;
    Long longTempObj1 = 18L;
    Long longTempObj2 = 18L;
    String stringDay = "24";
    Byte byteDayZstring = new Byte(stringDay);
    String stringRok = "2015";
    Short shortRokZstring = new Short(stringRok);
    String stringTemp = "18";
    Integer intTempZstring = new Integer(stringTemp);

    @Test
    public void thatByteOrazShortRowne() {
        if (byteDay != shortDay) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazIntRowne() {
        if (byteDay != intDay) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazLongRowne() {
        if (byteDay != longDay) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazIntRowne() {
        if (shortRok != intRok) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazLongRowne() {
        if (shortRok != longRok) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatIntOrazLongRowne() {
        if (intTemp != longTemp) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektByteRowne() {
        if (byteDay != byteDayObj) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektByteEquals() {
        if (!byteDayObj.equals(byteDay)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazObiektByteRowne() {
        if (byteDayObj1 != byteDayObj2) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazObiektByteEquals() {
        if (!byteDayObj1.equals(byteDayObj2)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazShortRowne() {
        if (byteDayObj != shortDay) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazShortNotEquals() {
        if (byteDayObj.equals(shortDay)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektShortRowne() {
        if (shortDayObj != byteDay) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazByteNotEquals() {
        if (shortDayObj.equals(byteDay)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazObiektShortNotEquals() {
        if (byteDayObj.equals(shortDayObj)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazObiektShortNotRowne() {
        if ((Object) byteDayObj == (Object) shortDayObj) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazObiektShortRowne() {
        if (shortRok != shortRokObj) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazObiektShortEquals() {
        if (!shortRokObj.equals(shortRok)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazObiektShortRowneDla15() {
        if (shortRokObj1_15 != shortRokObj2_15) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazObiektShortEqualsDla15() {
        if (!shortRokObj1_15.equals(shortRokObj2_15)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazObiektShortNotRowneDla2015() {
        if (shortRokObj1_2015 == shortRokObj2_2015) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazObiektShortEqualsDla2015() {
        if (!shortRokObj1_2015.equals(shortRokObj2_2015)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazIntRowne() {
        if (byteDayObj != intDay) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazIntNotEquals() {
        if (byteDayObj.equals(intDay)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazLongRowne() {
        if (byteDayObj != longDay) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazLongNotEquals() {
        if (byteDayObj.equals(longDay)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazIntRowne() {
        if (shortRokObj != intRok) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazIntNotEquals() {
        if (shortRokObj.equals(intRok)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazLongRowne() {
        if (shortRokObj != longRok) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektShortOrazLongNotEquals() {
        if (shortRokObj.equals(longRok)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazIntRowne() {
        if (intTempObj != intTemp) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazIntEquals() {
        if (!intTempObj.equals(intTemp)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazLongRowne() {
        if (intTempObj != longTemp) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazLongNotEquals() {
        if (intTempObj.equals(longTemp)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektLongOrazLongRowne() {
        if (longTempObj != longTemp) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektLongOrazLongEquals() {
        if (!longTempObj.equals(longTemp)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazObiektIntRowneDla18() {
        if (intTempObj1_18 != intTempObj2_18) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazObiektIntEqualsDla18() {
        if (!intTempObj1_18.equals(intTempObj2_18)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazObiektIntRowneDla180() {
        if (intTempObj1_180 == intTempObj2_180) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazObiektIntEqualsDla180() {
        if (!intTempObj1_180.equals(intTempObj2_180)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektLongOrazObiektLongRowne() {
        if (longTempObj1 != longTempObj2) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektLongOrazObiektLongEquals() {
        if (!longTempObj1.equals(longTempObj2)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazObiektIntRowne() {
        if (shortRok != intRokObj) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazObiektIntEquals() {
        if (intRokObj.equals(shortRok)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazObiektLongRowne() {
        if (shortRok != longRokObj) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazObiektLongEquals() {
        if (longRokObj.equals(shortRok)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatIntOrazObiektLongRowne() {
        if (intTemp != longTempObj) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatIntOrazObiektLongEquals() {
        if (longTempObj.equals(intTemp)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektIntRowne() {
        if (byteDay != intDayObj) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektIntEquals() {
        if (intDayObj.equals(byteDay)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektLongRowne() {
        if (byteDay != longDayObj) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektLongEquals() {
        if (longDayObj.equals(byteDay)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektByteOrazObiektIntNotEquals() {
        if (byteDayObj.equals(intDayObj)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatObiektIntOrazObiektByteNotEquals() {
        if (intDayObj.equals(byteDayObj)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektByteZstringRowne() {
        if (byteDayZstring != byteDay) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatByteOrazObiektByteZstringEquals() {
        if (!byteDayZstring.equals(byteDay)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazObiektShortZstringRowne() {
        if (shortRokZstring != shortRok) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatShortOrazObiektShortZstringEquals() {
        if (!shortRokZstring.equals(shortRok)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatIntOrazObiektIntZstringRowne() {
        if (intTempZstring != intTemp) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatIntOrazObiektIntZstringEquals() {
        if (!intTempZstring.equals(intTemp)) {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatStringOraz18Rowne() {
        if (stringTemp != "18") {
            fail("Niepoprawny wynik porównania");
        }
    }

    @Test
    public void thatStringOraz18Equals() {
        if (!stringTemp.equals("18")) {
            fail("Niepoprawny wynik porównania");
        }
    }
}
