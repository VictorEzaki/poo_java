import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        System.out.println("Calcule a média");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a primeira nota:");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite a segunda nota:");
            double nota2 = scanner.nextDouble();
            System.out.println("Digite a terceira nota:");
            double nota3 = scanner.nextDouble();
            double media = (nota1 + nota2 + nota3) / 3;

            System.out.printf("A média das notas é: %.2f", media);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
