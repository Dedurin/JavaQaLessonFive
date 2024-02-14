package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double calculateAverage(long[] sales) {
        return (double) calculateSum(sales) / sales.length;
    }

    public int findMaxMonth(long[] sales) {
        long maxSale = sales[0];
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                month = i;
            }
        }
        return month + 1;
    }

    public int findMinMonth(long[] sales) {
        long minSale = sales[0];
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                month = i;
            }
        }
        return month + 1;
    }

    public int findMonthsBelowAverage(long[] sales) {
        double average = calculateAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int findMonthsAboveAverage(long[] sales) {
        double average = calculateAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}


