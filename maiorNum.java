import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maiorNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List <Integer> numeros = new ArrayList<>();

        int x = 1;

        while(x < 6){
        System.out.println("==================");
        System.out.println("Digite 5 números inteiros: ");
        System.out.println("==================");
        int numero = input.nextInt();
        numeros.add(numero);
        x += 1;
        
        
        
    
        
    };
    int maior = Integer.MIN_VALUE;
        
    for(int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) > maior ){
                maior = numeros.get(i);
        }
        }
    System.out.println("Sua lista é " + numeros);
    System.out.println("Maior número é " + maior);
    input.close();
    
    }

    
    
}

    
