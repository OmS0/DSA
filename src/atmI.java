import java.util.Scanner;
class BankAccount
{
    private double Balance;
    public BankAccount(double InitialBalance)
    {
        Balance = InitialBalance;
    }
    public double GetBalance()
    {
        return Balance;
    }
    public void Deposit(double Amount)
    {
        if (Amount > 0)
        {
            Balance = Balance + Amount;
            System.out.println("Deposited ₹" + Amount + " Successfully");
        }
        else
        {
            System.out.println("Invalid Deposit Amount");
        }
    }
    public void Withdraw(double Amount)
    {
        if (Amount > 0 && Amount <= Balance)
        {
            Balance = Balance - Amount;
            System.out.println("Withdrawn ₹" + Amount + " Successfully");
        }
        else
        {
            System.out.println("Insufficient Balance OR Invalid Withdrawal Amount");
        }
    }
}
class ATM
{
    private BankAccount BankAccount;
    private Scanner sc;
    public ATM(BankAccount Account)
    {
        BankAccount = Account;
        sc = new Scanner(System.in);
    }
    public void ShowMenu()
    {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void PerformTransaction()
    {
        int Choice;
        do
        {
            ShowMenu();
            System.out.print("Enter Your Choice: ");
            Choice = sc.nextInt();

            switch (Choice)
            {
                case 1:
                    CheckBalance();
                    break;
                case 2:
                    Deposit();
                    break;
                case 3:
                    Withdraw();
                    break;
                case 4:
                    System.out.println("Thank You For Using The ATM!");
                    break;
                default:
                    System.out.println("Invalid Choice. Please Try Again");
                    break;
            }
        }
        while (Choice != 4);
    }
    public void CheckBalance()
    {
        System.out.println("Your Account Balance is ₹" + BankAccount.GetBalance());
    }
    public void Deposit()
    {
        System.out.print("Enter The Deposit Amount: ");
        double Amount = sc.nextDouble();
        BankAccount.Deposit(Amount);
    }
    public void Withdraw()
    {
        System.out.print("Enter the Withdrawal Amount: ");
        double Amount = sc.nextDouble();
        BankAccount.Withdraw(Amount);
    }
}
public class atmI
{
    public static void main(String[] args)
    {
        BankAccount Account = new BankAccount(10101);
        ATM atm = new ATM(Account);
        atm.PerformTransaction();
    }
}

