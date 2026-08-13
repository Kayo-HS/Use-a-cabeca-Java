public class PoolPuzzleOne {
    public static void main (String [] args){
        int x = 0;
        while(x < 1){
            System.out.println("A");
            if (x < 1){
                System.out.println(" ");
            }
            x = x + 2;
            if (x > 1){
                System.out.println("noise");
                x = x - 1;
            }
            if (x == 1){
                System.out.println("annoys");
            }
            if (x > 0){
                System.out.println("An");
            }
            System.out.println();
            System.out.println("Oyster");
        }
    }
    
}
