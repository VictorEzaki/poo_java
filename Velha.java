import java.util.Scanner;

public class Velha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] position = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
            };
        int linha = 0;
        int coluna = 0;
        char win = ' ';

        for (int i = 0; i < 9; i++) {
            System.out.println("Jogada" + (i + 1));
            System.out.println(i % 2 == 0 ? "Jogue O" : "Jogue X");

            System.out.println(position[0][0] + "|" + position[0][1] + "|" + position[0][2]);
            System.out.println("-+-+-");
            System.out.println(position[1][0] + "|" + position[1][1] + "|" + position[1][2]);
            System.out.println("-+-+-");
            System.out.println(position[2][0] + "|" + position[2][1] + "|" + position[2][2]);

            System.out.println("Insira a linha: ");
            linha = scanner.nextInt();
            System.out.println("Insira a coluna: ");
            coluna = scanner.nextInt();

            int[][] combinacoes = {
                { 0, 0, 0, 1, 0, 2 },
                { 1, 0, 1, 1, 1, 2 },
                { 2, 0, 2, 1, 2, 2 },
                { 0, 0, 1, 0, 2, 0 },
                { 0, 1, 1, 1, 2, 1 },
                { 0, 2, 1, 2, 2, 2 },
                { 0, 0, 1, 1, 2, 2 },
                { 0, 2, 1, 1, 2, 0 } 
            };

            for (int[] combinacao : combinacoes) {
                int linha1 = combinacao[0];
                int coluna1 = combinacao[1];
                int linha2 = combinacao[2];
                int coluna2 = combinacao[3];
                int linha3 = combinacao[4];
                int coluna3 = combinacao[5];

                if (
                    position[linha1][coluna1] != ' '
                    && position[linha2][coluna2] != ' '
                    && position[linha3][coluna3] != ' '
                    && position[linha1][coluna1] == position[linha2][coluna2]
                    && position[linha2][coluna2] == position[linha3][coluna3]
                ) {
                    win = position[linha1][coluna1];
                    break;
                }
            }
        }

        scanner.close();
    }
}
