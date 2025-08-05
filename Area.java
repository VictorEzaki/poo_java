import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Área de um quadrado: ");

            System.out.println("Digite o primeiro lado: ");
            double ladoA = scanner.nextDouble();
            System.out.println("Digite o segundo lado: ");
            double ladoB = scanner.nextDouble();

            double area = ladoA * ladoB;

            System.out.printf("A área do quadrado é: %.2f", area);
        } catch (Exception e) {
            System.out.println("Digite apenas valores numéricos!");
        } finally {
            scanner.close();
        }
    }
}
