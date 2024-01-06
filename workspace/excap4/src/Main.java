import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        System.out.println("Insira 2 números para somar:");
        Scanner sc = new Scanner(System.in);

        double x, y, res;
        x = sc.nextDouble();
        y = sc.nextDouble();
        res = x + y;

        sc.close();

        System.out.printf("O resultado é %.2f!", res);
    }
}