package ru.netology;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public float averageSales(long[] sales) {
        float result = sumSales(sales) / sales.length;
        return result;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int countMonths = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                countMonths = countMonths + 1;
            }
        }
        return countMonths;
    }

    public int aboveAverage(long[] sales) {
        int countMonths = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                countMonths = countMonths + 1;
            }
        }
        return countMonths;
    }
}



