package Encapsulation;

public class BankAccount {
    private String Holdername;
    private double  balance;
    private  int pwd;
    public BankAccount(String Holdername , double balance, int pwd ){
        this.balance=balance;
        this.Holdername=Holdername;
        this.pwd=pwd;

    }
    public double getBalance(){
        return balance;

    }
    public  void setBalance(double balance){
       this.balance=balance;
    }
    public void setPwd(int pwd ){
        this.pwd=pwd ;
    }
    class A{
        public static void main(String[] args) {
            BankAccount a=new BankAccount("Pulak",678909.70,4534);
            System.out.println(a.balance);

        }
    }

}
