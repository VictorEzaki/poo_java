public class HellowWorld {
    public static void main(String[] args) {
        int valor = 42;
        System.out.println("Hello, world! The value is: " + (valor += valor++));
        // System.out.println("Hello, world! The value is: " + (valor += ++valor));
    }
}
