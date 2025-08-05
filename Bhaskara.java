import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        System.out.println("Calcule a velocidade média de uma viagem");
        Scanner scanner = new Scanner(System.in);

        try {
           System.out.println("Digite o valor de a:");
           double a = scanner.nextDouble();
           System.out.println("Digite o valor de b:");
           double b = scanner.nextDouble();
           System.out.println("Digite o valor de c:");
           double c = scanner.nextDouble();

           double delta = Math.pow(b, 2) - 4 * a * c;

           if (delta < 0) {
                throw new ArithmeticException();
           }

           double x1 = (- b + Math.sqrt(delta)) / (2 * a);
           double x2 = (- b - Math.sqrt(delta)) / (2 * a);

           System.out.printf("x¹ = %.2f  x² = %.2f", x1, x2);
        } catch (ArithmeticException e) {
            System.out.println("Valor de delta não pode ser negativo!");
        } catch (Exception e) {
            System.out.println("Digite apenas valores numéricos: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}