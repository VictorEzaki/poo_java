import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = {
                100,
                50,
                20,
                10,
                5,
                2
        };

        double[] moedas = {
                1,
                0.50,
                0.25,
                0.10,
                0.05,
                0.01
        };

        String inputValor = "", resto = "";
        Double valor, aux, result;

        System.out.println("Digite o valor: ");
        inputValor = scanner.next();

        valor = Double.parseDouble(inputValor);

        System.out.println("\nNotas:");
        for (int i = 0; i < 6; i++) {
            resto = "0";
            if (valor >= 2) {
                aux = valor / notas[i];
                
                if (aux > 1) {
                    resto = (Double.toString(aux)).substring(0, 1);
                    result = Double.parseDouble(resto) * notas[i];
                    valor -= result;
                }
            }
            System.out.println(resto + " notas de R$" + notas[i]);
        }
        
        System.out.println("\nMoedas:");
        for (int i = 0; i < 6; i++) {
            resto = "0";
            aux = valor / moedas[i];

            if (aux >= 1) {
                resto = (Double.toString(aux)).substring(0, 1);
                result = Double.parseDouble(resto) * moedas[i];
                valor -= result;
            }

            System.out.println(resto + " moedas de R$" + moedas[i]);
        }

        scanner.close();
    }
}
