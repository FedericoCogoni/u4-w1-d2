package es1;

public class Main {
    public static void main(String[] args) {
        System.out.println(PariDispari("due"));
        System.out.println("é bisestile? : " + annoBis(1200));
    }

    public static boolean PariDispari(String string) {
        return string.length() % 2 == 0;
    }

    public static boolean annoBis(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
