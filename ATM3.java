import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM3 {
    public static void main(String[] args){
        int balance = 1000;
        Scanner scanner = new Scanner(System.in);
        List <Integer> withdrawExtract = new ArrayList<>();
        List <Integer> depositExtract = new ArrayList<>();

        while (true){
            System.out.println("===============================");
            System.out.println("ATM");
            System.out.println("===============================");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Extract");
            System.out.println("5 - Exit");
            int option = scanner.nextInt();

            if (option == 1){
                System.out.println("Your balance is " + balance);
            }

            else if (option == 2){
                System.out.println("How much you do wish to deposit: ");
                int deposit = scanner.nextInt();
                if (deposit < 0){
                    System.out.println("Invalid option!");
                }
                else{
                balance = balance + deposit;
                depositExtract.add(deposit);

                }

            }

            else if (option == 3){
                System.out.println("When you want to withdraw: ");
                int withdraw = scanner.nextInt();
                if (withdraw > balance || withdraw < 0){
                    System.out.println("You do not have a sufficient balance to withdraw this amount.");
                }
                else{                
                    balance = balance - withdraw;
                    withdrawExtract.add(withdraw);
                }
            }

            else if (option == 4){
                int withdrawConsole = 0;
                for (int with : withdrawExtract){
                    withdrawConsole += with;
                }
                int depositConsole = 0;
                for (int dep : depositExtract){
                    depositConsole += dep;
                }
                System.out.println("Your deposit: " + depositConsole);
                System.out.println("Your withdraw: " + withdrawConsole);

            }

            else if (option == 5){
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