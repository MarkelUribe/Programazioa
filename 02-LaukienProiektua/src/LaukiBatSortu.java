import java.util.Scanner;

/**
 *
 * @author uribe.markel
 */
public class LaukiBatSortu {

    /**
     *
     * @param args lauki bat sortuko da, bere datuak ikusi eta marraztu beteta eta hutsik
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Sartu laukiaren zabalera: ");
        int zab = in.nextInt();
        System.out.print("Sartu laukiaren altuera: ");
        int alt = in.nextInt();
        Laukia l4 = new Laukia(zab, alt);
        System.out.println("Lauki " + l4.getMota().toLowerCase() + " sortu duzu: " + l4.toString());
        System.out.println("Hona marrazkia beteta:");
        l4.marraztuBeteta();
        System.out.println("Hona marrazkia hutsik:");
        l4.marraztuHutsik();
    }

}
