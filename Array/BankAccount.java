public class BankAccount {
    int accountNumber ;
    String holderName ;
    double balance;
    static String bankName;
    BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;

    }
     public void  deposit( double amount){
        balance=balance+amount;
         System.out.println("Deposit :" + amount + "New Balance"+balance);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw "+ amount + "new balance "+ balance);
        }
        else {
            System.out.println("Insufficient blance ");
        }
    }
    public void checkBalance(){
        System.out.println("Account :"+ accountNumber + "Holder Name "+holderName+"Balance"+balance);
    }
    public static void setBankName(String name ){
        bankName=name;
    }

    public static void main(String[] args) {
        BankAccount.setBankName("SBI Bank");
        BankAccount account1 = new BankAccount(10,"Pulak",5000);
    account1.checkBalance();
    account1.deposit(2000);
    account1.withdraw(1000);

    }


}
