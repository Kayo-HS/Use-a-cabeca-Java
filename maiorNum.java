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
        x ++;
        
        
        
        
    
        
    }
    int maior = numeros.getFirst();
    int menor = numeros.getFirst();
    int soma = 0;
    int qtdPar = 0;
    int qtdImpar = 0;


    // for(int numerosLista : numeros){
    //     if (numerosLista % 2 == 0){
    //         qtdPar++;
    //     }
    //     else{
    //         qtdImpar++;
    //     }
    // }
        
    for(int i = 0; i < numeros.size(); i++){
            

            if (numeros.get(i) % 2 == 0){
                qtdPar++;
            } else {
                qtdImpar++;
            }

            if (numeros.get(i) > maior ){
                maior = numeros.get(i);
        }



            if (numeros.get(i) < menor ){
                menor = numeros.get(i);
        }
        soma += numeros.get(i);
        }
        
        float somaFloat = soma;

        float media = somaFloat / numeros.size();

    System.out.println("Sua lista é " + numeros);
    System.out.println("Maior número é " + maior);
    System.out.println("Menor número é " + menor);
    System.out.println("A soma dos números são " + soma);
    System.out.println("A média é " + media);
    System.out.println("Numeros pares são: " + qtdPar);
    System.out.println("Numeros impares são: " + qtdImpar);
    input.close();
    
    }

    
    
}

    
