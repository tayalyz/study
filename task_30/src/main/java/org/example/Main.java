package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber;

        while (true) {
            System.out.println("Когда планируется путешествие? Введите номер месяца от 1 до 12.");
            monthNumber = scanner.nextInt();

            if (monthNumber > 12 || monthNumber < 1) { // Инвертируйте условие
                System.out.println("Некорректный номер месяца. Введите ещё раз.");
                break;
            }
            break;
        }
        String season = getSeasonByNumber(monthNumber);

        if (season.equals("Лето")) {
            System.out.println("Летом лучше остаться в Москве."); // Перенесите проверку на "Лето" в ветвление выше
            System.exit(0);
        }

         /* Допишите ветвление, которое будет печатать строку:
            System.out.println("Летом лучше остаться в Москве.");
              и завершать выполнение программы */


        System.out.println("Укажите стоимость прямых билетов из Москвы в Париж:");
        int ticketMoscowParis = scanner.nextInt();
        System.out.println("Укажите стоимость билетов из Москвы в Париж с пересадкой в Лондоне:");
        int ticketMoscowLondonParis = scanner.nextInt();
        System.out.println("У вас есть британская виза?");
        System.out.println("1 - да, виза есть");
        System.out.println("0 - визы нет");
        int britainVisa = scanner.nextInt();
        scanner.close();

        // В этом ветвлении что-то напутано с условиями - исправьте это

        if (ticketMoscowLondonParis <= ticketMoscowParis) {
            if (britainVisa == 1) { // Упростите это условие
                System.out.println("Летим через Лондон!");
            } else {
                System.out.println("Летим напрямую в Париж!");
            }
        } else {
            System.out.println("Летим напрямую в Париж!");
        }
    }

    private static String getSeasonByNumber(int monthNumber) {
        // Допишите условия ветвления в виде утверждений
        if (monthNumber <= 2 || monthNumber == 12) {
            return "Зима";
        } else if (monthNumber <= 5) {
            return "Весна";
        } else if (monthNumber <= 8) {
            return "Лето";
        } else if (monthNumber <= 11) {
            return "Осень";
        } else {
            return "Зима";
        }
    }
}