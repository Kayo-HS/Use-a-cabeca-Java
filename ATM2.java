import java.util.Scanner;

public class ATM2 {
        public static void main(String[] args){
        int balance = 1000;
        int loginADM = 123;
        int passwordADM = 123;
        int loginNew = ;
        int passwordNew = ;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("===============================");
            System.out.println("ATM");
            System.out.println("===============================");
            System.out.println("1 - If you are a customer, log in.");
            System.out.println("2 - If you are new, sign up.");
            System.out.println("3 - Exit ");
            int optionlogin = scanner.nextInt();

            if(optionlogin == 1){
                System.out.println("Login:");
                System.out.println("Password: ");
                int loginTentativa = scanner.nextInt();
                int senhaTentativa = scanner.nextInt();
                if (loginADM == loginTentativa | passwordADM == senhaTentativa){
                    ATM.ATMOptions();
                }
                else{
                    System.out.println("Your password or login is incorrect");
                }
            else if(optionlogin == 2){
                System.out.println("New Login: ");
                System.out.println("New Password: ");
                int loginNew = scanner.nextInt();
                int passwordNew = scanner.nextInt();

            }
                
            }
        }
        scanner.close();
    }
}



    

    

