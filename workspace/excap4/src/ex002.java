import java.util.Scanner;

public class ex002 {
    public static void main (String[] args) {
        System.out.println("Insira o raio do circulo:");

        Scanner sc = new Scanner(System.in);

        double raio, area, pi;
        raio = sc.nextDouble();6
        raio = Math.pow(raio, 2);
        pi = 3.14159;
        area = pi*raio;

        sc.close();

        System.out.printf("A area do circulo é: %.4f", area);
    }
}
