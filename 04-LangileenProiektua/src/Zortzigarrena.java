
public class Zortzigarrena {

    public static void main(String[] args) {
        Langilea a[] = Langilea.nireHamarLagunLangile();
        Zatikia erdi = new Zatikia(1, 2);

        a[0].setLanaldia(erdi);
        a[a.length - 1].setLanaldia(erdi);
        
        
    }
}
