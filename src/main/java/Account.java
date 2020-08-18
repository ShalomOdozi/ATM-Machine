import java.util.Scanner;

public class Account {

    private double checkingBalance = 0;
   private double savingBalance = 0;
   private  int accountNumber;
    private int pinNumber;
    double amount;
    Scanner input = new Scanner(System.in);

    public int setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
        return accountNumber;

    }

    public int getAccountNumber(){
        return accountNumber;
    }


    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;

    }

    public int getPinNumber(){
        return pinNumber;
    }

    public double calculateCheckingWithdraw(double amount){
      checkingBalance = (checkingBalance - amount);
      return checkingBalance;

    }

    public double calculateSavingWithdraw(double amount){
        savingBalance = (savingBalance- amount);
        return savingBalance;

    }

    public double calculateCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;

    }
    public double calculateSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;

    }



    public double  getCheckingBalance(){
        System.out.println(" Your Checking Account Balance is: " + checkingBalance);
        return checkingBalance;
}
   public double getSavingBalance(){
       System.out.println("Your saving account balance is: " + savingBalance);
        return savingBalance;
    }


   public void getCheckingWithdrawInput(){
       System.out.println("You have " + checkingBalance + " in your Checking Account");
       System.out.println("Enter the amount you would like to withdraw: ");
       amount = input.nextDouble();
           calculateCheckingWithdraw(amount);
           System.out.println(" Your new Checking account balance is:" + checkingBalance);
       }



   public void getCheckingDepositInput(){

       System.out.println("You have " + checkingBalance + " in your Checking Account");
       System.out.println("Enter the amount you would like to deposit: ");
       amount = input.nextDouble();
       calculateCheckingDeposit(amount);
       System.out.println(" Your new Checking account balance is:" + checkingBalance);

   }


   public void getSavingWithdrawInput(){
       System.out.println("You have " + savingBalance + " in your Saving Account");
       System.out.println("Enter the amount you would like to withdraw: ");
       amount = input.nextDouble();
      calculateSavingWithdraw(amount);
       System.out.println(" Your new Checking account balance is:" + savingBalance);

   };


   public void  getSavingDepositInput(){
       System.out.println("You have " + savingBalance + " in your Saving Account");
       System.out.println("Enter the amount you would like to deposit: ");
       amount = input.nextDouble();
       calculateSavingDeposit(amount);
       System.out.println(" Your new Saving account balance is:" + savingBalance);


   }


}
