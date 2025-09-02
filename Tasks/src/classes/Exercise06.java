package classes;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Informe o segundo numero: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;

        System.out.println("SOMA: " + sum);
        System.out.println("SUBTRACAO: " + subtraction);
        System.out.println("MULTIPLICACAO: " + multiplication);

        scanner.close();
    }
}
