package classes;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a cotacao do dolar (R$): ");
        BigDecimal price = scanner.nextBigDecimal();

        System.out.print("Informe o valor em dolares (US$): ");
        BigDecimal dolar = scanner.nextBigDecimal();

        BigDecimal real = dolar.multiply(price);

        System.out.println("US$ " + dolar + " equivale a R$ " + real);

        scanner.close();
    }
}
