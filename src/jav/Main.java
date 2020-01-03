package jav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mounth;
        System.out.println("Введите первую букву месяца на английском");
        Scanner scanner = new Scanner(System.in);
        mounth = scanner.nextLine();
        switch (mounth) {
            case "J":
                System.out.println("January");
                break;
            case "F":
                System.out.println("February");
                break;
            case "M":
                System.out.println("Mart");
                break;
        }
    }
}
