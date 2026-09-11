import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maiorNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List <Integer> numeros = new ArrayList<>();

        int x = 0;

        while(x < 6){
        System.out.println("==================");
        System.out.println("Digite 5 números inteiros: ");
        System.out.println("==================");
        int numero = input.nextInt();
        numeros.add(numero);
        
        int maior = numeros.get(0);

        for (int numeroFor : numeros){
        if (numero > maior ){
            maior = numero;
        }
    }

    
    System.out.println("Maior número é " + maior );
    };
    input.close();
    
    }

    
    
}

    
