package classes;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um numero real: ");
        double number = scanner.nextDouble();

        double triple = number * 3;
        System.out.println("O triplo do numero " + number + " eh " + triple);

        scanner.close();
    }
}
