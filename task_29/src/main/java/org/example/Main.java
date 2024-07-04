package org.example;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько самокатов доступно для аренды?");
        int availableScooters = ...; // Считайте количество доступных самокатов с клавиатуры

        System.out.println("Сколько самокатов арендовано?");
        int scootersInUse = ...; // Считайте число арендованных самокатов с клавиатуры

        Scooter scooter = ...; // Создайте новый объект класса Scooter

        System.out.println("Что вы хотите сделать?");
        System.out.println("1 -- Узнать текущую стоимость проката");
        System.out.println("2 -- Выдать самокат");
        System.out.println("3 -- Принять самокат");
        System.out.println("4 -- Завершить работу");

        ... { // реализуйте непрерывный ввод команд
            System.out.println("Введите команду:");
            int command = ... // Считайте команду с клавиатуры

            if (command == 1) {
                ... // Вызовите нужный метод класса Scooter
            } else if (command == 2) {
                ... // Вызовите нужный метод класса Scooter
            } else if (command == 3) {
                ... // Вызовите нужный метод класса Scooter
            } else if (command == 4) {
                System.out.println("Сеанс работы завершён!");
                ... // Завершите ввод команд и работу программы
            } else {
                System.out.println("Введён неверный код команды.");
            }
        }
    }
}