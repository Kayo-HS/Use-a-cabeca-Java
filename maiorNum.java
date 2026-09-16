import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maiorNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List <Integer> numeros = new ArrayList<>();

        System.out.println("Escolha o tamanho da sua lista para ser analisada: ");
        int x = 0;
        int tamanhoLista = input.nextInt();
        

        while(x < tamanhoLista){
        System.out.println("==================");
        System.out.println("Digite " + (x + 1) + "° número: ");
        System.out.println("==================");
        int numero = input.nextInt();
        numeros.add(numero);
        x += 1;
        
        
        
        
    
        
    };
    int maior = numeros.getFirst();
    int menor = numeros.getFirst();
        
    for(int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) > maior ){
                maior = numeros.get(i);
        }
        }

        for(int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) < menor ){
                menor = numeros.get(i);
        }
        }
    System.out.println("Sua lista é " + numeros);
    System.out.println("Maior número é " + maior);
    System.out.println("Menor número é " + menor);
    input.close();
    
    }

    
    
}

    
