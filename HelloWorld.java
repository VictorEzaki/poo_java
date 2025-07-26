import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};
        int valor, qtde;
        double input;

        input = scanner.nextDouble();

        valor = (int) Math.round(input * 100);
        
        System.out.println("NOTAS:");
        for (int nota : notas) {
            qtde = valor / nota;
            System.out.printf("%d Nota(s) de R$ %.2f\n", qtde, nota / 100.0);
            valor %= nota;
        }
        
        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            qtde = valor / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", qtde, moeda / 100.0);
            valor %= moeda;
        }

        scanner.close();
    }
}
