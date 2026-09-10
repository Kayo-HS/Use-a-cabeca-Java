import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numeros = new ArrayList<>();
    
    

    while (true){
        System.out.println("========================");
        System.out.println("1 - Adicionar número inteiro: ");
        System.out.println("2 - Mostrar quantidade de números pares: ");
        System.out.println("3 - Sair: ");
        System.out.println("========================");

        int option = scanner.nextInt();

        if (option == 1){
            System.out.println("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        else if (option == 2){
            
            int somaPar = 0;
            for (int numerosLista: numeros){
                if (numerosLista % 2 == 0){
                somaPar++;
            }
            };

            System.out.println("Seus núemros pares são: " + somaPar);


        }
        else if (option == 3){
            System.out.println("Adeus!!!!");
            break;
        }
        else{
            System.out.println("Opção errada! ");
        }
    };
    scanner.close();
    }

    
}
