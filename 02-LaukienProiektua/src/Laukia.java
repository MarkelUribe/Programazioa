
/**
 *
 * Laukia klasea luzera eta zabalera jakin bat daukaten laukiak modelatzeko erabiliko ditugu
 */
public class Laukia {

    private int zabalera;
    private int altuera;

    //Konstruktoreak
    /**
     * Lehenengo konstruktorea parametrorik gabekoa
     */
    public Laukia() {
        zabalera = 5;
        altuera = 5;
    }

    /**
     * Bigarren konstruktorea parametroekin
     *
     * @param zab Laukiaren zabalera
     * @param alt Laukiaren altuera
     */
    public Laukia(int zab, int alt) {
        zabalera = zab;
        altuera = alt;
    }

    //Getters
    /**
     * @return Laukiaren zabalera bueltatzen du
     */
    public int getZabalera() {
        return zabalera;
    }

    /**
     * @return Laukiaren altuera bueltatzen du
     */
    public int getAltuera() {
        return altuera;
    }

    /**
     * Laukiaren Azalera lortu
     *
     * @return Laukiaren azalera
     */
    public int getAzalera() {
        return altuera * zabalera;
    }

    /**
     * Laukiaren Perimetroa lortu
     *
     * @return Laukiaren perimetroa
     */
    public int getPerimetroa() {
        return (altuera * 2) + (zabalera * 2);
    }

    //Setters
    /**
     * Zabalera bat ezarriko dio laukiari
     *
     * @param zabaleraBerria emandako zabalera aldatzen du zabalera
     */
    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;
    }

    /**
     * Altuera bat ezarriko dio laukiari
     *
     * @param altueraBerria emandako altuera berrira aldatzen du altuera
     */
    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;
    }

    /**
     *
     * @return laukiaren neurriak
     */
    @Override
    public String toString() {
        return getClass().getName() + "[" + zabalera + "x" + altuera + "]";
    }

    /**
     * Laukia mota baten arabera sailkatzen du
     *
     * @return Laukiaren mota
     */
    public String getMota() {
        String Mota = "";
        if (zabalera == altuera) {
            Mota = "karratua";
        } else if (zabalera > altuera) {
            Mota = "horizontala";
        } else if (zabalera < altuera) {
            Mota = "bertikala";
        }
        return Mota;
    }

    /**
     * Laukia marrazten du barrutik beteta
     */
    public void marraztuBeteta() {

        for (int col = 1; col <= altuera; col++) {
            for (int row = 1; row <= zabalera; row++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * Laukia marrazten du barrutik hutsik
     */
    public void marraztuHutsik() {

        for (int col = 1; col <= altuera; col++) {
            for (int row = 1; row <= zabalera; row++) {
                if (row == 1 || row == zabalera || col == 1 || col == altuera) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Lauki bat beste bat baino handiagoa den bueltatzen du
     *
     * @param l conparatu nahi den laukia
     * @return true handiagoa bada
     */
    public boolean isBiggerThan(Laukia l) {
        if (getAzalera() > l.getAzalera()) {
            return true;
        }
        return false;
    }

    /**
     * Laukien array baten gorde ditugun lauki guztien artean handiena dena
     * hartuko du
     *
     * @param lk = lauki handiena bilatu nahi dugun Lauki arraya
     * @return lauki handiena
     */
    public static Laukia getTheBiggest(Laukia[] lk) {
        Laukia l = new Laukia(0, 0);
        for (Laukia lk1 : lk) {
            if (lk1 != null && (lk1.getAzalera() > l.getAzalera())) {
                l = lk1;
            }
        }
        return l;
    }

    /**
     * Metodo honek array baten dauden laukiak ordenatzen ditu txikitik handira
     *
     * @param lk laukien arraya da
     * @return laukiak ordenatuta
     */
    public static Laukia[] ordenatu(Laukia[] lk) {

        for (int n = 0; n < lk.length - 1; n++) {
            for (int i = n + 1; i < lk.length; i++) {
                if (lk[n] != null && lk[i] != null && lk[n].getAzalera() > lk[i].getAzalera()) {
                    Laukia temp = lk[n];
                    lk[n] = lk[i];
                    lk[i] = temp;
                }
            }
        }
        return lk;
    }
}
