package ru.netology.services.hw_cycles.CalcService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest {
    @Test
    public void testLargeMoney() {
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        CalcService service = new CalcService();
        int actual = service.calcService(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSmallMoney() {
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        CalcService service = new CalcService();
        int actual = service.calcService(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroMoney() {
        int income = 0;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 0;
        CalcService service = new CalcService();
        int actual = service.calcService(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLargeExpenses() {
        int income = 10_000;
        int expenses = 9_000;
        int threshold = 20_000;
        int expected = 0;
        CalcService service = new CalcService();
        int actual = service.calcService(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinusIncome() {
        int income = -100;
        int expenses = 1_000;
        int threshold = 20_000;
        int expected = 0;
        CalcService service = new CalcService();
        int actual = service.calcService(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
