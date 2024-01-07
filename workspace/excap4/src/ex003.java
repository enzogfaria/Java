import java.util.Scanner;

public class ex003 {
    public static void main (String[] args) {
    System.out.println("Insira 4 numeros inteiros:");

        Scanner sc = new Scanner(System.in);

        int a, b , c , d, dif;

        a = sc.nextInt();f
        b = sc.nextInt();a
        c = sc.nextInt();
        d = sc.nextInt();
        dif = a*b - c*d;

        sc.close();

        System.out.printf("A diferença é: %d", dif);
    }
}
