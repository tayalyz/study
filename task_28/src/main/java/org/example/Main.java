package org.example;

public class Main {
    public static void main(String[] args) {
        double roubles = 5000d; // сумма на счету
        double yearRate = 4f; // годовая процентная ставка
        int numOfMonth = 36; // количество месяцев, на который открыт вклад
        double monthRefill = 1000; // ежемесячное пополнение
        double monthRate; // вычислите месячную процентную ставку

        for (int i = 1; i <= 3; i++) { // дополните условие цикла
            for (int j = 12; j > 0; j--) {
                monthRate = yearRate/j/100;
                double depositInterest = roubles * monthRate; // вычислите доход от процентов
                roubles += depositInterest; // добавьте доход от процентов
                roubles += monthRefill; // учтите ежемесячное пополнение
            }
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + Math.floor(roubles * 100) / 100 + " рублей");

        if (roubles >= 41000) { // определите, удалось ли достичь цели
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}