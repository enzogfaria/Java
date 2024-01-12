import java.util.Scanner;

public class ex004 {
    public static void main (String[] args) {
        float ht, sh, salario;
        int nf;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número do funciónario:");
        nf = sc.nextInt();
        System.out.println("Insira o número de horas trabalhadas:");
        ht = sc.nextFloat();
        System.out.println("Insira o salário por hora:");
        sh = sc.nextFloat();

        salario = ht*sh;
        sc.close();

        System.out.printf("O salário do funcionário %d é de: U$%.2f",nf, salario);
    }
}
