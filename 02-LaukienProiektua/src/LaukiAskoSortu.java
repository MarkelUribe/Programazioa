
import java.util.Scanner;

/**
 *
 * @author uribe.markel
 */
public class LaukiAskoSortu {

    /**
     *
     * @param args erabiltzaileak nahi dituen laukiak sortuko dira
     */
    public static void main(String[] args) {
        int zabalera;
        int altuera;
        Laukia[] laukiak;
        int zenbaki;
        Scanner in = new Scanner(System.in);

        System.out.print("Zenbat lauki sortu nahi dituzu? ");
        zenbaki = in.nextInt();

        laukiak=new Laukia[zenbaki];
        for (int n = 0; n < zenbaki; n++) {
            System.out.println((n + 1) + ". LAUKIAREN DATUAK:");
            System.out.printf("\tZabalera: ");
            zabalera = in.nextInt();
            System.out.printf("\tAltuera: ");
            altuera = in.nextInt();
            laukiak[n]=new Laukia(zabalera,altuera);
        }

        System.out.printf("Laukia   Zabalera Altuera Azalera Perimetroa  Mota\n");
        System.out.println("==============================================================");
        for (int n = 0; n < zenbaki; n++) {
            System.out.printf("%8d%8d%8d%8d%8d%18s\n", n + 1, laukiak[n].getZabalera(), laukiak[n].getAltuera(), laukiak[n].getAzalera(), laukiak[n].getPerimetroa(), laukiak[n].getMota());
        }

    }

}
