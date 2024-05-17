package ru.netology.javaqa.StatSalemvn.services;

public class StatSaleService {
    public long calcSumSale(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long averageSale(long[] sales) {
        return calcSumSale(sales) / sales.length;
    }

    public long findMaxMonth(long[] sales) {
        long maxMonth = sales[0];
        long month = 0;
        for (long sale : sales) {
            if (sale >= sales[(int) maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long findMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long belowAverage(long[] sales) {
        long below = 0;
        long i = averageSale(sales);
        for (long sale : sales) {
            if (sale < i) {
                below++;
            }
        }
        return below;
    }

    public long aboveAverage(long[] sales) {
        long above = 0;
        long i = averageSale(sales);
        for (long sale : sales) {
            if (sale > i) {
                above++;
            }
        }
        return above;
    }
}