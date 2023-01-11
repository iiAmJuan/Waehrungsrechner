import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Betrag in Euro:");
        Double money = scanner.nextDouble();
        convertToDollars(money);
        convertToYen(money);
        convertToKuna(money);
        convertToPeso(money);
    }

    public static void convertToDollars(Double eur) {
        System.out.println("Der Betrag in Dollar ist: " + eur * 1.04);
    }

    public static void convertToYen(Double eur) {
        System.out.println("Der Betrag in Yen ist: " + eur * 143.23);
    }
    public static void convertToKuna(Double eur) {
        System.out.println("Der Betrag in Kuna ist " + eur * 7.55);
    }
    public static void convertToPeso(Double eur) {
        System.out.println("Der Betrag in Peso ist " + eur * 19.81);
    }
}