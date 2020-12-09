
public class GastatuTaGastatu {
    public static void main(String[] args) {
        
    
    Account kont1 = new Account("1", "markel", 1000);
            
       int y = 0;
        while (kont1.getBalance() >= 150) {
            kont1.debit(150);
            y++;
        }
        System.out.println("Triste nago, 150 euro atera ditut " + y + " aldiz eta orain " + kont1.getBalance() + " euro besterik ez zaizkit gelditzen kontuan.:-(");
    }
}
