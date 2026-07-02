import java.util.*;

class BankAccount {
    private int BankBalance = 20000;

    public int getBalance() {
        return BankBalance;
    }

    public int withdraw(int amt) {
        if (amt > 0 && amt <= BankBalance) {
            BankBalance -= amt;
            return amt;
        } else {
            return -1;
        }
    }

    public int deposit(int amt) {
        if (amt > 0) {
            BankBalance += amt;
            return amt;
        } else {
            return -1;
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Withdraw Amount: ");
        int withdraw_amt = sc.nextInt();

        System.out.print("Enter Deposit Amount: ");
        int deposit_amt = sc.nextInt();

        BankAccount b = new BankAccount();

        System.out.println("Amount Withdrawn: " + b.withdraw(withdraw_amt));
        System.out.println("Total Bank Balance: " + b.getBalance());

        System.out.println("Amount Deposited: " + b.deposit(deposit_amt));
        System.out.println("Total Bank Balance: " + b.getBalance());

        
    }
}