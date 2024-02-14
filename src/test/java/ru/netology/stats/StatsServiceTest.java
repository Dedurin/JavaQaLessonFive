package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = (int) service.calculateAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMonthsAboveAverage(sales);
        assertEquals(expected, actual);
    }

}
