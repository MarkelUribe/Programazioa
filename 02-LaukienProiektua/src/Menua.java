
import java.util.Scanner;

/**
 
  @author uribe.markel
 */
public class Menua {//klaseak letra handietan idatzi

    private static final int LAUKI_KOP = 10;//final aldagaiak letra handietan idatzi
    private static int sortutakoak;//aldagaiak minuskulas idatzi
    private static Laukia[] laukiak;

    /**
     *
     * @param args hemen Menu bat agertuko da erabiltzailerari hainbat
     * posibilitate ematen laukiekin egiteko
     */
    public static void main(String[] args) {
        int aukera;
        laukiak = new Laukia[LAUKI_KOP];
        Scanner in = new Scanner(System.in);
        /**
          Menu bat erakusten du eta erabiltzaileari hainbat aukera ematen
          dizkio laukiekin egiteko, balio ezegokia, lauki maximora edo menutik
          irtetzen denera arte
         */
        do {
            System.out.println("LAUKIAK");
            System.out.println("====================================");
            System.out.println("1.- Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.- 10 lauki bete ausazko neurriekin");
            System.out.println("6.- Ordenatu laukiak");
            System.out.println("7.- Irten");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    if (sortutakoak == LAUKI_KOP) {
                        System.out.println("Ezin dituzu lauki gehiago sortu.");
                    } else {
                        sortu();
                    }
                    break;

                case 2:
                    inprimatu();
                    break;

                case 3:
                    marraztu();
                    break;

                case 4:
                    handiena();
                    break;

                case 5:
                    arrayBete();
                    break;

                case 6:
                    Laukia.ordenatu(laukiak);
                    System.out.println("Laukiak ordenatu dira.");
                    break;

                case 7:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;

                case 8:
                    System.out.println("Zenbaki honek ez du balio.");
                    break;
            }
        } while (aukera != 7);

    }

    /**
     * Lauki berri bat sortu eta arrayan gordetzen du
     */
    public static void sortu() {
        Scanner in = new Scanner(System.in);
        System.out.println("LAUKI BERRIA SORTZEN...");
        System.out.print("Sartu zabalera: ");
        int zabalera = in.nextInt();
        System.out.print("Sartu altuera: ");
        int altuera = in.nextInt();
        laukiak[sortutakoak] = new Laukia(zabalera, altuera);
        sortutakoak++;
    }

    /**
     * Sortutako laukien parametroak erakusten ditu
     */
    public static void inprimatu() {

        System.out.printf("Laukia   Zabalera  Altuera  Azalera  Perimetroa   Mota\n");
        System.out.println("==============================================================");
        for (int n = 0; n < LAUKI_KOP && laukiak[n] != null; n++) {

            System.out.printf("%8d%8d%8d%8d%8d%18s\n", n + 1, laukiak[n].getZabalera(), laukiak[n].getAltuera(), laukiak[n].getAzalera(), laukiak[n].getPerimetroa(), laukiak[n].getMota());

        }
    }

    /**
     * Sortutako lauki bat aukeratu eta beteta edo hutsik marrazten du
     */
    public static void marraztu() {
        Scanner in = new Scanner(System.in);
        int zenbaki;
        char nola;
        System.out.print("Zenbatgarren laukia marraztu nahi duzu? ");
        zenbaki = in.nextInt();
        System.out.print("Beteta ala hutsik (B/H)? ");
        nola = in.next().charAt(0);

        if (nola == 'B' || nola == 'b') {
            laukiak[zenbaki - 1].marraztuBeteta();
        } else if (nola == 'H' || nola == 'h') {
            laukiak[zenbaki - 1].marraztuHutsik();
        }
    }

    /**
     * Sortutako Laukien artean handiena bilatzen du
     */
    public static void handiena() {
        System.out.println("Lauki handiena : " + Laukia.getTheBiggest(laukiak).toString());
    }

    /**
     * Laukien arraya ausazko zabalera eta altuerekin betetzen du
     */
    public static void arrayBete() {
        for (int n = 0; n < LAUKI_KOP; n++) {
            laukiak[n] = new Laukia((int) (Math.random() * 8 + 1), (int) (Math.random() * 8 + 1));
        }
    }

}
