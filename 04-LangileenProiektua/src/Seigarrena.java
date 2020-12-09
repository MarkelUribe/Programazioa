
import java.util.Arrays;
import java.util.Scanner;

public class Seigarrena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Langilea a[] = Langilea.nireHamarLagunLangile();

        System.out.println(Arrays.toString(a));

        System.out.println("Izena idatzi: ");
        String izena = sc.nextLine();

        System.out.println(Langilea.bilatu(izena, a));
        int igo=0;
      
            try{
                System.out.println("Zenbat nahi diozu soldata igo?");
                igo = sc.nextInt();
                
            }catch(Exception ex){
                System.out.println("Balio okerra sartu duzu, igoera gabe geldituko zara");
            }
        
        
        Langilea.bilatu(izena, a).soldataIgo(igo);

        System.out.println(Langilea.bilatu(izena, a));

        int urtekoa = 0;
        for (int i = 0; i < a.length; i++) {
            urtekoa += a[i].getSoldata();
        }
        urtekoa *= 12;

        System.out.println("Urteko nomina guztiak: " + urtekoa + "€");

        Langilea handi = new Langilea(0, null, null, 0);

        for (int i = 0; i < a.length; i++) {
            if (handi.getSoldata() < a[i].getSoldata()) {
                handi = a[i];
            }
        }

        System.out.println("Soldata handiena: " + handi);
    }

}
