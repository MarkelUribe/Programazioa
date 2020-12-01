
public class ZatikiaTester {
    public static void main(String[] args) {
        Zatikia zat1 = new Zatikia(15, 10);
        Zatikia zat2 = new Zatikia(2, 4);
        
        System.out.println(zat1.getZenbakitzailea());
        System.out.println("Biderketa: " + Zatikia.biderkatu(zat1, zat2));
        System.out.println("Batuketa: " + Zatikia.batu(zat1, zat2));
        System.out.println(zat1);
        System.out.println("Sinplifikatuta: "+ zat1.sinplifikatu());
        zat1.batu(zat2);
        System.out.println("Batu: " + zat1);
        System.out.println("Hamartarra: "+ Zatikia.hamartarBaliokidea(zat1));
        if(Zatikia.isBiggerThan(zat1, zat2)==true){
            System.out.println(zat1+" is bigger than "+zat2);
        }else{
            System.out.println(zat1+" is not bigger than "+zat2);
        }
    }
}
