package ru.netology.services.hw_cycles.CalcService;

public class CalcService {
    public int calcService(int income, int expenses, int threshold) {
        int holiday = 0;
        int balance = 0;
        int x = 1;
        while (x <= 12) {
            x++;
            if (balance >= threshold) {
                balance = (balance - expenses) / 3;
                holiday++;
            } else {
                balance = (balance + income) - expenses;
            }

        }
        return holiday;
    }
}
