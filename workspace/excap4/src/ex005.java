import java.util.Scanner;
public class ex005 {
    public static void main (String[] args) {
        float vunit1, vunit2, total, totalp1, totalp2;
        int cod1, np1, cod2, np2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código da peça 1:");
        cod1 = sc.nextInt();
        System.out.println("Insira o número de peças 1:");
        np1 = sc.nextInt();
        System.out.println("Insira o valor unitário de cada peça 1:");
        vunit1= sc.nextFloat();
        totalp1 = np1 * vunit1;
        System.out.printf("O total das peças de código %d é de:U$%.2f",cod1, totalp1);
        System.out.println("");

        System.out.println("Insira o código da peça 2:");
        cod2 = sc.nextInt();
        System.out.println("Insira o número de peças 2:");
        np2 = sc.nextInt();
        System.out.println("Insira o valor unitário de cada peça 2:");
        vunit2= sc.nextFloat();
        sc.close();
        totalp2 = np2 * vunit2;
        System.out.printf("O total das peças de código %d é de:U$%.2f",cod2, totalp2);

        total = totalp1 + totalp2;
        System.out.printf("O valor total é de:U$%2f", total);

    }
}

