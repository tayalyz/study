package org.example;


class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year = 2020;
    boolean isRainyMonth;

    public WeatherCalendar(String month, int numberOfDays) {
        this.month = month;
        this.numberOfDays = numberOfDays;
        this.isRainyMonth = false;
        this.rainyDays = 0;
    }
    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;
    }
}