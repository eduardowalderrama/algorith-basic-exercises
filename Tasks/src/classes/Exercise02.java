package classes;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int numberOne = scanner.nextInt();

        System.out.print("Informe o segundo numero: ");
        int numberTwo = scanner.nextInt();

        int sum = numberOne + numberTwo;
        System.out.println("SOMA: " + sum);

        scanner.close();
    }
}
