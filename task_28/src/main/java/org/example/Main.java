package org.example;

public class Main {
    public static void main(String[] args) {
        double roubles = 5000d; // сумма на счету
        float yearRate = 4f; // годовая процентная ставка
        int numOfMonth = 36; // количество месяцев, на который открыт вклад
        double monthRefill = 1000; // ежемесячное пополнение

        ... monthRate = ... // вычислите месячную процентную ставку

        for (...) { // дополните условие цикла
        ... depositInterest = ... // вычислите доход от процентов
        ... // добавьте доход от процентов
        ... // учтите ежемесячное пополнение
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if () { // определите, удалось ли достичь цели
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}