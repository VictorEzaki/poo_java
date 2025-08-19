import java.util.Scanner;

public class JogoDaVelhaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] jogo = {
            { ' ', ' ', ' '},
            { ' ', ' ', ' '},
            { ' ', ' ', ' '}
        };
        char vitoria = ' ';

        for (int count = 1; count <= 9; count++) {
            System.out.println("Jogada " + count);
            System.out.println(count % 2 == 0 ? "Jogue 'O'" : "Jogue 'X'");
            System.out.println(jogo[0][0] + "|" + jogo[0][1] + "|" + jogo[0][2]);
            System.out.println("-+-+-");
            System.out.println(jogo[1][0] + "|" + jogo[1][1] + "|" + jogo[1][2]);
            System.out.println("-+-+-");
            System.out.println(jogo[2][0] + "|" + jogo[2][1] + "|" + jogo[2][2]);
            boolean valorOk = false;
            do {
                System.out.println("Informe a linha: ");
                int linha = scanner.nextInt();
                System.out.println("Informe a coluna");
                int coluna = scanner.nextInt();

                if (linha > 2 || coluna > 2 || linha < 0 || coluna < 0) {
                    System.out.println("Linha ou coluna inválida, por favor informe novamente.");
                    continue;
                } else if (jogo[linha][coluna] != ' ') {
                    System.out.println("Informação já preenchida, escolha outra.");
                    continue;
                }

                valorOk = true;

                jogo[linha][coluna] = count % 2 == 0 ? 'O' : 'X';
            } while (!valorOk);
            
            // Verificar a vitoria ou não vitória
            /*
             * int[][] combinacoes = new int[8][6];
             * combinacoes[0] = new { 0, 0, 0, 1, 0, 2 };
             * [...]
             * combinacoes[0][0] = 0;
             * combinacoes[0][1] = 0;
             * [...]
             */
            int[][] combinacoes = {
                { 0, 0, 0, 1, 0, 2 }, // [0,0], [0,1], [0,2]
                { 1, 0, 1, 1, 1, 2 },
                { 2, 0, 2, 1, 2, 2 },
                { 0, 0, 1, 0, 2, 0 },
                { 0, 1, 1, 1, 2, 1 },
                { 0, 2, 1, 2, 2, 2 },
                { 0, 0, 1, 1, 2, 2 },
                { 0, 2, 1, 1, 2, 0 } 
            };

            // for (int i = 0; i < combinacoes.length; i++) {
            //     int[] combinacao = combinacoes[i];
            //     int linha1 = combinacao[0];
            //     int coluna1 = combinacao[1];
            //     int linha2 = combinacao[2];
            //     int coluna2 = combinacao[3];
            //     int linha3 = combinacao[4];
            //     int coluna3 = combinacao[5];

            //     if (
            //         jogo[linha1][coluna1] != ' '
            //         && jogo[linha2][coluna2] != ' '
            //         && jogo[linha3][coluna3] != ' '
            //         && jogo[linha1][coluna1] == jogo[linha2][coluna2]
            //         && jogo[linha2][coluna2] == jogo[linha3][coluna3]
            //     ) {
            //         vitoria = jogo[linha1][coluna1];
            //         break;
            //     }
            // }
            for(int[] combinacao:combinacoes) {
                int linha1 = combinacao[0];
                int coluna1 = combinacao[1];
                int linha2 = combinacao[2];
                int coluna2 = combinacao[3];
                int linha3 = combinacao[4];
                int coluna3 = combinacao[5];

                if (
                    jogo[linha1][coluna1] != ' '
                    && jogo[linha2][coluna2] != ' '
                    && jogo[linha3][coluna3] != ' '
                    && jogo[linha1][coluna1] == jogo[linha2][coluna2]
                    && jogo[linha2][coluna2] == jogo[linha3][coluna3]
                ) {
                    vitoria = jogo[linha1][coluna1];
                    break;
                }
            }

            if (vitoria != ' ') {
                break;
            }
        }

        System.out.println(jogo[0][0] + "|" + jogo[0][1] + "|" + jogo[0][2]);
        System.out.println("-+-+-");
        System.out.println(jogo[1][0] + "|" + jogo[1][1] + "|" + jogo[1][2]);
        System.out.println("-+-+-");
        System.out.println(jogo[2][0] + "|" + jogo[2][1] + "|" + jogo[2][2]);
        

        if (vitoria != ' ') {
            System.out.println("Ganharam as '" + vitoria + "'!");
        } else {
            System.out.println("Deu velha!");
        }

        scanner.close();
    }
}