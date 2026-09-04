import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM4 {
    public static void main(String[] args){
        int balance = 1000;
        Scanner scanner = new Scanner(System.in);
        List <String> extract = new ArrayList<>();

        List <Integer> staticsDeposit = new ArrayList<>();
        List <Integer> staticsWithdraw = new ArrayList<>();

            
        

        while (true){
            System.out.println("<===============================>");

            System.out.println("ATM");
            System.out.println("<===============================>");
            System.out.println("1 - Check Balance: ");
            System.out.println("2 - Deposit: ");
            System.out.println("3 - Withdraw: ");
            System.out.println("4 - Extract: ");
            System.out.println("5 - Statics: ");
            System.out.println("6 - Exit: ");
            
            int option = scanner.nextInt();
            
            
            if (option == 1){
                System.out.println("Your balance is " + balance);
            }


            else if (option == 2){
                System.out.println("How much you do wish to deposit: ");
                int deposit = scanner.nextInt();
                if (deposit <= 0){
                    System.out.println("Invalid option!");
                }
                else{
                balance += deposit;
                System.out.println("Deposit successful!");
                System.out.println("New balance: " + balance);
                extract.add("Deposit: " + deposit);
                staticsDeposit.add(+1);

                }

            }

            else if (option == 3){
                System.out.println("When you want to withdraw: ");
                int withdraw = scanner.nextInt();
                if (withdraw > balance ){
                    System.out.println("You do not have a sufficient balance to withdraw this amount.");
                }
                else if (withdraw == 0 || withdraw < 0){
                    System.out.println("Invalid option!");
                }
                else{                
                    balance -= withdraw;
                    System.out.println("Withdraw successful!");
                    System.out.println("New balance: " + balance);
                    extract.add("Withdraw: " +  withdraw);
                    staticsWithdraw.add(+1);
                }
            }

            else if (option == 4){
                for (String ext : extract){
                    System.out.println(ext);
                }
            }


            if (option == 5){
                int somaDeposit = 0;
                for (int n : staticsDeposit){
                somaDeposit += n;
            }


                int somaWithdraw = 0;
                for (int n : staticsWithdraw){
                somaWithdraw += n;
            }
                System.out.println("You made " + somaDeposit + " Deposit");
                System.out.println("You made " + somaWithdraw + " Withdraw");

            }

            else if (option == 6){
                System.out.println("Thank you for using our ATM");
                break;
            }

            else{
                System.out.println("Invalid option!");
                
            }

        }; 

        scanner.close();
        
        
    }
    
} 
    

