
import java.util.Arrays;

public class NiLangile {

    public static void main(String[] args) {
        Langilea markel = new Langilea(1, "Markel", "Uribe", 600);

        Langilea lankideak[] = {
            new Langilea(2, "Pepe", "Alberto", 1200),
            new Langilea(3, "Hodei", "Alberto", 1200),
            new Langilea(4, "Iker", "Alberto", 1200),
            new Langilea(5, "Jon", "Alberto", 1200),
            new Langilea(6, "Asier", "Alberto", 1200),
            new Langilea(7, "Maitane", "Alberto", 1200),
            new Langilea(8, "Laura", "Alberto", 1200),
            new Langilea(9, "Alex", "Alberto", 1200),
            new Langilea(10, "Idoia", "Alberto", 1200)
        };

        System.out.println(markel);
        System.out.println("Urteko soldata:" + markel.getUrtekoSoldata());

        markel.soldataIgo(50);

        System.out.println(markel);

        System.out.println(Arrays.toString(Langilea.nireHamarLagunLangile()));

        System.out.println(Langilea.bilatu("Asier", lankideak));

        System.out.println(Langilea.bilatu("Jon", "izena", lankideak));
    }
}
