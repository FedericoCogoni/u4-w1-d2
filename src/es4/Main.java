package es4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 4");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero :");
        int startNum = scanner.nextInt();
        countdown(startNum);
        scanner.close();
    }
    public static void countdown(int startNum) {
        int i = startNum;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
    }
