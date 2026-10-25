package jogoDaVelha;

public class Game {

    String[][] tabuleiro = new String[3][3];

    public Game(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = " ";
            }
        }
    }

    public void executar(){
        tela();
    }

    public void tela(){
        System.out.println("   0   1   2");
        System.out.println("0: " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
        System.out.println("1: " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println("2: " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
    }
    
}
