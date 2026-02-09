 public class Account {
    int balance=1000;


     void checkbalance(){
        System.out.println("current balance : "+balance);
    }
    void deposit(int  amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited : "+amount);
        }else {
            System.out.println("invalid amount");
        }

    }
    void withdraw(int amount){
        if(amount>0 &&amount<=balance){
            balance-=amount;
            System.out.println("withdraw : "+amount);
        }else{
            System.out.println("insufficient balance");
        }

    }
}
