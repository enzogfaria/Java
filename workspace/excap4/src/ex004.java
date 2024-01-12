import java.util.Scanner;

public class ex004 {
    public static void main (String[] args) {
        float ht, sh, salario;
        int nf;
        Scanner sc = new Scanner(System.in);

        nf = sc.nextInt();
        ht = sc.nextFloat();
        sh = sc.nextFloat();

        salario = ht*sh;
        sc.close();

        System.out.printf("O salário do funcionário %d é de: %.2f",nf, salario);
    }
}
