public class Encapsulation3 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(12345);
        b1.deposit(1000);
        b1.withdraw(500);

        System.out.println(b1.getbalance());
        System.out.println(b1.getaccountNumber());


        
    }
    
}

class BankAccount{
    private int accountNumber;
    private int balance;

    BankAccount(int accountNumber){
    this.accountNumber = accountNumber;
}

    public void  deposit(int amount ){
        if(amount > 0 ){
            balance += amount;
        }
        else{
            System.out.println("money cannot be deposited");
        }

    }

    public void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("insufficient balance");
        }
    }

    public int   getbalance(){
        return balance;
    }

    public int getaccountNumber(){
        return accountNumber;
    }

    
}
