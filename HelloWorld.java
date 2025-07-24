import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = {
                100.00,
                50.00,
                20.00,
                10.00,
                5.00,
                2.00
        };

        double[] moedas = {
                1,
                0.50,
                0.25,
                0.10,
                0.05,
                0.01
        };

        String inputValor = "";
        Double valor, aux = 0.00;

        inputValor = scanner.next();

        valor = Double.parseDouble(inputValor);

        System.out.println("\nNotas:");
        for (int i = 0; i < 6; i++) {
            if (valor >= 2) {
                aux = valor / notas[i];
                
                if (aux >= 1) {
                    aux = Math.round(aux) * notas[i];
                    valor -= aux;
                }
            }
            System.out.println(aux + " notas de R$" + String.format("%.2f", notas[i]));
        }
        
        System.out.println("\nMoedas:");
        for (int i = 0; i < 6; i++) {
            aux = valor / moedas[i];

            if (aux >= 1) {
                    aux = Math.round(aux) * moedas[i];
                    valor -= aux;
                }

            System.out.println(aux + " moedas de R$" + String.format("%.2f", moedas[i]));
        }

        scanner.close();
    }
}
