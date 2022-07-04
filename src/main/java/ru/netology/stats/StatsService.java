package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int belowAvgAmount(long[] sales) {
        StatsService service = new StatsService();

        int amount = 0;
        for (long sale : sales) {
            if (sale < service.avgSales(sales)) {
                amount++;
            }
        }
        return amount;
    }

    public int aboveAvgAmount(long[] sales) {
        StatsService service = new StatsService();

        int amount = 0;
        for (long sale : sales) {
            if (sale > service.avgSales(sales)) {
                amount++;
            }
        }
        return amount;
    }
}
