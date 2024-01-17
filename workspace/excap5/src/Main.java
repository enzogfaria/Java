import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira quantos minutos foram usados:");

        int min = sc.nextInt();k

        double conta = 50.00;
        if (min>100) {
            conta += (min-100)*2;
        }
        sc.close();

        System.out.printf("O valor da conta é de: R$%.2f", conta);
    }
}
