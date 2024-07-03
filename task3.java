//ATMmachine class
  import java.util.*;

class ATMmachine{
    private static BankAccount Account = new BankAccount(2500);

    public static void machine(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Welcome to ABC Bank");
        System.out.println("Please select any one of the following");
        System.out.println("1. WITHDRAW");
        System.out.println("2. DEPOSIT");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
        System.out.println("Please enter your choice - ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thanks for using our services , stay safe and have a great day ahead .");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice\nTRANSACTION FAILED.");
        }
    }
    public static void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn - ");
        double w_amt = sc.nextDouble();
        Account.withdraw(w_amt);
    }
    public static void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be deposited - ");
        double d_amt =sc.nextDouble();
        Account.deposit(d_amt);
    }
    public static void checkBalance(){
        System.out.println("Your current balance is ₹"+Account.totalbalance());
    }
    public static void main(String [] args){
        machine();
    }
}

//BankAccount class

public class BankAccount{
    private double amt;
    public BankAccount(double initialBalance) {
        this.amt = initialBalance;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= amt) {
            amt -= amount;
            System.out.println("A sum of ₹"+amount+" was withdrawn successfully\nYour new current balance is ₹"+totalbalance()+"\nThankyou for visiting us\nHave a great day :)");
        }
        else {
            System.out.println("You are either trying to withdraw more than you have in your account or zero. \nTRANSACTION FAILED");
        }
    }
    public void deposit(double newamount) {
        if (newamount > 0) {
            amt += newamount;
            System.out.println("A sum of ₹"+newamount+" was deposited successfully\nYour new current balance is ₹"+totalbalance()+"\nThankyou for visiting us\nHave a great day :)");
        } else {
            System.out.println("You must deposit some real amount , not zero .\nTRANSACTION FAILED");
        }
    }
    public double totalbalance() {
        return amt;
    }
}
