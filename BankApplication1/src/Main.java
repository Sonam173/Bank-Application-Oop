import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name, password and initial balance");
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount SonamAcc = new SBIAccount(name, balance, password);
        System.out.println("Your account has been created with account number: "+SonamAcc.getAccountNo());

        // getBalance
        System.out.println("Your current balance is: "+SonamAcc.getBalance());

        // deposit
        System.out.println(SonamAcc.depositMoney(500));
        System.out.println("New balance is: "+SonamAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdrawn: ");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword = sc.next();

        System.out.println(SonamAcc.withdraw(amount,enteredPassword));
        System.out.println("Current balance is "+SonamAcc.getBalance());

        // ineterst
        System.out.println("Interest for 4 years on current balance "+SonamAcc.getBalance()+" is "+SonamAcc.calculateInterest(4));
    }
    }
