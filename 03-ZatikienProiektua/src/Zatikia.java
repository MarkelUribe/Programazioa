
public class Zatikia {
    private int zenbakitzailea;
    private int izendatzailea;

        
    public Zatikia(int zenbakitzailea, int izendatzailea) {
        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;
    }
    
    
    public int getZenbakitzailea(){
    return zenbakitzailea;
    }
    
    public int getIzendatzailea(){
        return izendatzailea;
    }
    
    public void setZenbakitzailea(int zenba){
        zenbakitzailea = zenba;
    }
    public void setIzendatzailea(int izenda){
        izendatzailea = izenda;
    }
    
    @Override
    public java.lang.String toString(){
        return getClass().getName() + " "+zenbakitzailea +"/"+ izendatzailea;
    }
    
    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2){
        Zatikia biderketa = new Zatikia(1, 1);
        
        biderketa.zenbakitzailea = zat1.zenbakitzailea * zat2.zenbakitzailea;
        biderketa.izendatzailea = zat1.izendatzailea * zat2.izendatzailea;
       
        return biderketa;
    }
    public static Zatikia batu(Zatikia zat1, Zatikia zat2){
        Zatikia batuketa = new Zatikia(1, 1);
        
        batuketa.izendatzailea = zat1.izendatzailea * zat2.izendatzailea;
        batuketa.zenbakitzailea = (zat1.zenbakitzailea*zat2.izendatzailea)+(zat2.zenbakitzailea*zat1.izendatzailea);
        
        return batuketa;
    }
    public void batu(Zatikia zat){
        this.izendatzailea = this.izendatzailea * zat.izendatzailea;
        this.zenbakitzailea = (this.zenbakitzailea*zat.izendatzailea)+(zat.zenbakitzailea*this.izendatzailea);
    }
    public static double hamartarBaliokidea(Zatikia zat){
        double erantzuna;
        
        erantzuna = zat.zenbakitzailea / (double)zat.izendatzailea;
        
        return erantzuna;
    }
    public static boolean isBiggerThan(Zatikia zat1, Zatikia zat2){
        boolean bigger = false;
        
        if((zat1.zenbakitzailea / (double)zat1.izendatzailea)>(zat2.zenbakitzailea / (double)zat2.izendatzailea)){
            bigger = true;
        }
        return bigger;
    }
    public static boolean isSameaAs(Zatikia zat1, Zatikia zat2){
        boolean berdin = false;
        
        if(zat1 == zat2){
            berdin = true;
        }
        
        return berdin;
    }
    public Zatikia sinplifikatu(){
        Zatikia sinple = new Zatikia(1, 1);
        int handi;
        
        if(this.zenbakitzailea>this.izendatzailea){
            handi = this.zenbakitzailea;
        }else{
             handi = this.izendatzailea;
        }
        
        for(int i = 1; i<=handi ;i++){
            for(int j=1; j<=10; j++){
                if(this.zenbakitzailea % j == 0 && this.izendatzailea % j == 0){
                    this.zenbakitzailea/=j;
                    this.izendatzailea/=j;
                    
                    sinple.zenbakitzailea= this.zenbakitzailea;
                    sinple.izendatzailea= this.izendatzailea;
                }
            }
        }
        
        return sinple;
    }
}