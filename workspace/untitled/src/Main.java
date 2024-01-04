import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Insira 2 números para somar!");

        Scanner sc = new Scanner(System.in);

        int x, y, resultado;
        x = sc.nextInt();
        y = sc.nextInt();
        resultado = x + y;

        sc.close();

        System.out.printf("O resultado é: %d", resultado);
    }
}