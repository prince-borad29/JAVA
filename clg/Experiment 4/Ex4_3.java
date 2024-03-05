// Design a class to represent a bank account. Which contains account number, name of the depositor, type of the account, balance amount in the account. Use constructors to assign initial values, to Deposit an amount, to Withdraw amount after checking balance, to display name and balance.
class bankAC{
    int acNo,balance;
    String name,acType;

    bankAC(int acNo,String name, String acType,int balance){
        this.acNo = acNo;
        this.name = name;
        this.acType = acType;
        this.balance = balance;
    }

    //Deposite amount 
    void deposite(int balance){
        this.balance += balance;
        System.out.println("\nAfter deposite : "+balance);
        System.out.println("Customer Name : "+this.name);
        System.out.println("Balance : "+this.balance+'\n');
    }

    //withdraw
    void withdraw(int balance,int acNo){
         
        if (this.balance>=balance) {
            this.balance -= balance;
                //display name and balance
                System.out.println("\nAfter withdraw : "+balance);
                System.out.println("Customer Name : "+this.name);
                System.out.println("Balance : "+this.balance+'\n');
        }

    }

    void acInfo(){
        System.out.println("Customer Name : "+this.name);
        System.out.println("Balance : "+this.balance);
    }
    
}
public class Ex4_3 {
    public static void main(String[] args) {

        bankAC b1 = new bankAC(123,"Prince","Saving",2000);

        b1.acInfo();

        b1.deposite(100);

        b1.withdraw(265, 123);
        
    }
}
