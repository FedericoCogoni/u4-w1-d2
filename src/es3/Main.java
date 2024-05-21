package es3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" - Inserisci una parola!!      toExit ->->->':q'");
            String newString = scanner.nextLine();

            if (newString.equals(":q")) {
                System.out.println("Stopped");
                scanner.close();
                break;
            } else {
                convertToString(newString);
            }
        }
    }

    public static void convertToString(String newString) {
        int i = 0;
        while (i < newString.length()) {
            System.out.print(newString.charAt(i));
            if (i < newString.length() - 1) {
                System.out.print(",");
            } else {
                System.out.println(" ");
            }
            i++;
        }
    }
}
