
public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String newname){
        this.name=newname;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        balance+=amount;
        System.out.println((balance));
        return balance;
    }
    public int debit(int amount){
        if(amount <= balance){
            balance-=amount;
        }else{
            System.out.println("amount exceded");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount <= this.balance){
            this.balance -= amount;
            another.balance += amount;
        }else{
        System.out.println("amount exceded");
        } 
        return this.balance; 
    }
    @Override
    public java.lang.String toString() {
        return getClass().getName()+id+", "+name+", "+balance+"\n";
    }
}
