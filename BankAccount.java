import java.util.Scanner;

public class BankAccount {
    private string accountname;
    private int accountnumber;
    private double Amount;
    public BankAccount(String accountname, int accountnumber, double amount){
        this.accountname = name ;
        this.accountnumber = number;
    }
    public string getAccountname() {return accountname; }
    public int getAccountnumber() {return accountnumber; }
    public  double deposit(double amount){
        Amount = Amount + amount;
        System.out.println("New Amount" +getAmount());
        return Amount;
    }
    public double withdraw(double amount){
        if (amount <= Amount){
            Amount = Amount - amount;
            System.out.println("wITHDRAWAL SUCCESSFUL");
            System.out.println("New Amount" +getAmount());
        }else{
            System.out.println("INSUFFICIENT FUNDS");
        }
        return Amount;
        }
        void display(){
    System.out.println("Details for account number: " +getAccountnumber());
    System.out.println("Account name: " +getAccountname());
    System.out.println("Amount: " +getAmount());
    }
}