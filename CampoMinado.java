import java.util.Random;
import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] campo = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
        };

        boolean perdeu = false;
        int linha;
        char coluna;

        int[][] randomBomb;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                randomBomb[i][j] = random.nextInt(10);
            }
        }

        do {
            System.out.printf("Digite a linha: ");
            linha = scanner.nextInt();
    
            System.out.printf("Digite a coluna: ");
            coluna = scanner.next().charAt(0);

            
        } while (perdeu);

        scanner.close();
    }
}
