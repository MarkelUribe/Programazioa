
public class Langilea {

    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    private Zatikia lanaldia = new Zatikia(1, 1);

    public Langilea(int id, String izena, String abizena, double soldata) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }
    public String getAbizena() {
        return abizena;
    }
    public String getIzenOsoa() {
        return izena + " " + abizena;
    }

    public double getSoldata() {
        return soldata;
    }

    public double getUrtekoSoldata() {
        return soldata * 12;
    }
    public int getZenbakitzailea(){
        return lanaldia.getZenbakitzailea();
    }
    public int getIzendatzailea(){
        return lanaldia.getIzendatzailea();
    }
    public void setSoldata(double dirua) {
        soldata = dirua;
    }

    public double soldataIgo(int portzentaia) {

        soldata = soldata * (portzentaia / 100.0 + 1);

        return soldata;
    }

    @Override
    public java.lang.String toString() {
        return getClass().getName() + " " + id + ", " + izena + " " + abizena + ", " + soldata + "€, " + lanaldia + "\n";
    }

    public static Langilea[] nireHamarLagunLangile() {
        Langilea lan2 = new Langilea(2, "Pepe", "Alberto", 1200);
        Langilea lan3 = new Langilea(3, "Hodei", "Alberto", 1500);
        Langilea lan4 = new Langilea(4, "Iker", "Alberto", 1600);
        Langilea lan5 = new Langilea(5, "Jon", "Alberto", 1200);
        Langilea lan6 = new Langilea(6, "Asier", "Alberto", 1700);
        Langilea lan7 = new Langilea(7, "Maitane", "Alberto", 1100);
        Langilea lan8 = new Langilea(8, "Laura", "Alberto", 900);
        Langilea lan9 = new Langilea(9, "Alex", "Alberto", 2200);
        Langilea lan10 = new Langilea(10, "Idoia", "Alberto", 1570);

        Langilea lankideak[] = {lan2, lan3, lan4, lan5, lan6,
                                lan7, lan8, lan9, lan10};

        return lankideak;
    }

    public static Langilea bilatu(String izen, Langilea a[]) {
        int j = -1;
        for (int i = 0; i < a.length; i++) {

            if (izen.toUpperCase().equals(a[i].izena.toUpperCase())) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return null;
        } else {
            return a[j];
        }
    }

    public static Langilea bilatu(String entry, String eremu, Langilea a[]) {
        int j = -1;

        if (eremu.equals("id")) {
            for (int i = 0; i < a.length; i++) {
                if (Integer.parseInt(entry) == a[i].id) {
                    j = i;
                    break;
                }
            }
        }
        if (eremu.equals("izena")) {
            for (int i = 0; i < a.length; i++) {
                if (entry.equals(a[i].izena)) {
                    j = i;
                    break;
                }
            }
        }
        if (eremu.equals("abizena")) {
            for (int i = 0; i < a.length; i++) {
                if (entry.equals(a[i].abizena)) {
                    j = i;
                    break;
                }
            }
        }
        if (eremu.equals("soldata")) {
            for (int i = 0; i < a.length; i++) {
                if (Integer.parseInt(entry) == a[i].soldata) {
                    j = i;
                    break;
                }
            }
        }

        if (j == -1) {
            return null;
        } else {
            return a[j];
        }

    }

    public void setLanaldia(Zatikia lanaldia) {
        this.lanaldia = lanaldia;
    }

    public Zatikia getLanaldia() {
        return lanaldia;
    }

}
