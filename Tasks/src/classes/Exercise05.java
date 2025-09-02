package classes;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o hora (0 a 23): ");
        int hour = scanner.nextInt();

        System.out.print("Informe os minutos (0 a 59): ");
        int minutes = scanner.nextInt();

        int totalMinutes = (hour * 60) + minutes;

        System.out.println("Ja se passaram " + totalMinutes + " minutos desde o inicio do dia.");

        scanner.close();
    }
}
