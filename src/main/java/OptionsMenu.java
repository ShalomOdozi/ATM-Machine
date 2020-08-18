import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionsMenu extends Account {

   Scanner choice = new Scanner(System.in);

   int selection;

   public static void main(String[] args) {

   }

   public void getLogin() {

      System.out.println("Enter your account Number: ");
      setAccountNumber(choice.nextInt());

      System.out.println("Enter your pin number: ");
      setPinNumber(choice.nextInt());


   }





   public void getAccountType() {
      System.out.println("Select the Account you want to access:   ");
      System.out.println("Type 1: Checking account ");
      System.out.println("Type 2: Saving Account");
      System.out.println("Type 3: Exist");
      System.out.println("Choice:");

    selection = choice.nextInt();
      switch (selection){
         case 1:
            getChecking();
            break;

         case 2:
            getSaving();
            break;

         case 3:
            System.out.println("Thank you for using the ATM, Goodbye");
            break;

         default:
            System.out.println("Invalid choice");
            getAccountType();
      }

   }

   public void getChecking() {
      System.out.println("You have selected Checking account:");
      System.out.println("Type 1: View balance ");
      System.out.println("Type 2: Withdraw ");
      System.out.println("Type 3: Deposit funds");
      System.out.println("Type 4: Exist");
      System.out.println("Choice: ");
      selection = choice.nextInt();
      switch(selection){
         case 1:
            getCheckingBalance();
            getChecking();
            break;

         case 2:
            getCheckingWithdrawInput();
            getAccountType();
            break;


         case 3:
            getCheckingDepositInput();

            break;


         case 4:
            System.out.println("Thank you for using the ATM, Goodbye");
            break;


         default:
            System.out.println("Invalid choice");
            getChecking();
      }



   }

   public void getSaving(){

      System.out.println("You have selected Saving account:");
      System.out.println("Type 1: View balance ");
      System.out.println("Type 2: Withdraw ");
      System.out.println("Type 3: Deposit funds");
      System.out.println("Type 4: Exist");
      System.out.println("Choice: ");
      selection = choice.nextInt();

      switch(selection){
         case 1:
            getSavingBalance();
            getSaving();
            break;

         case 2:
            getSavingWithdrawInput();
            getAccountType();
            break;


         case 3:
            getSavingDepositInput();
            getAccountType();
            break;


         case 4:
            System.out.println("Thank you for using the ATM, Goodbye");
            break;


         default:
            System.out.println("Invalid choice");
            getSaving();
      }


   }





}