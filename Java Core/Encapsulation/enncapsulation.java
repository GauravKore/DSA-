public class enncapsulation{
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.deposite(500);
        ba.withdraw(600);


        System.out.println(ba.getbalance());
    }

}

class BankAccount {
   private  double balance ;

   public void deposite(int amount){
        balance += amount;
   }

   public void withdraw(int amount){
    if(amount > 0 && amount <= balance){
    balance -= amount;
    }
    else{
        System.out.println("insufficient balance");
    }
   }

   // getter 
   public double getbalance(){
    return balance;
   }

}