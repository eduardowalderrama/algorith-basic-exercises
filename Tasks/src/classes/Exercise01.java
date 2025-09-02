package classes;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String name = scanner.next();

        System.out.print("Informe a quantidade de dependentes: ");
        int quantity = scanner.nextInt();

        System.out.print("Informe o cargo: ");
        String position = scanner.next();

        System.out.println("O funcionario " + name + " que exerce o cargo de "
                + position + " tem " + quantity + " dependentes.");

        scanner.close();
    }
}
