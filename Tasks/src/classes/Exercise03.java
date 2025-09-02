package classes;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de a (base superior): ");
        double a = scanner.nextDouble();

        System.out.print("Informe o valor de b (base inferior): ");
        double b = scanner.nextDouble();

        System.out.print("Informe o valor de d (altura): ");
        double d = scanner.nextDouble();

        double A1 = a * d;
        double A2 = b * d;
        double AT = A1 + A2;

        System.out.println("Area do retangulo superior (A1): " + A1);
        System.out.println("Area do retangulo inferior (A2): " + A2);
        System.out.println("Area total (AT): " + AT);

        scanner.close();
    }
}
