import java.util.Scanner;

public class ex006 {
    public static void main (String[] args){
        double a, b, c, atriangulo, acirculo, atrapezio, aquadrado, aretangulo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a medida A:");
        a = sc.nextDouble();
        System.out.println("Insira a medida B:");
        b = sc.nextDouble();
        System.out.println("Insira a medida C:");
        c = sc.nextDouble();
        sc.close();

        atriangulo = a*c/2;
        acirculo = 3.14*(Math.pow(c, 2));
        atrapezio = (a+b)*c/2;
        aquadrado = Math.pow(b, 2);
        aretangulo = a*b;

        System.out.printf("A área do triângulo é: %.3f", atriangulo);
        System.out.println();
        System.out.printf("A área do circulo é: %.3f", acirculo);
        System.out.println();
        System.out.printf("A área do trapezio é: %.3f", atrapezio);
        System.out.println();
        System.out.printf("A área do quadrado é: %.3f", aquadrado);
        System.out.println();
        System.out.printf("A área do retangulo é: %.3f", aretangulo);
    }
}
