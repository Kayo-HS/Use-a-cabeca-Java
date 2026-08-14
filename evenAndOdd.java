import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class evenAndOdd {
    public static void main(String[] args){
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        List <Integer> Par = new ArrayList<>();
        List <Integer> Impar = new ArrayList<>();
        List <Integer> Somar = new ArrayList<>();

        while (x < 6) {
            System.out.println("Digite um número inteiro: ");
            int num = scanner.nextInt();

            if(num % 2 == 0){
                Par.add(num);
                Somar.add(num);
            }
            else{
                Impar.add(num);
                Somar.add(num);
            }
            x = x + 1;

            
        }
        int soma = 0;
        for (int numero : Somar) {
            soma += numero;
        }

        System.out.println("Pares: " + Par.size());
        System.out.println("Impares: " + Impar.size());
        System.out.println("Soma total: " + soma);

        scanner.close();
    }

    
}
