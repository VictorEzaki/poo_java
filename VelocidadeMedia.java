import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String[] args) {
        System.out.println("Calcule a velocidade média de uma viagem");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite a distância em KM: ");
            double distancia = scanner.nextDouble();
            System.out.println("Digite o tempo da viagem em horas: ");
            double tempo = scanner.nextDouble();

            if (tempo <= 0 || distancia <= 0) {
                throw new ArithmeticException();
            }

            double velocidadeMedia = distancia / tempo;

            System.out.printf("A velocidade méida da viagem foi de: %.2f km/h", velocidadeMedia);
        } catch (ArithmeticException e) {
            System.out.println("Digite um valor de tempo ou distancia válido!");
        } catch (Exception e) {
            System.out.println("Digite apenas valores numéricos: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
