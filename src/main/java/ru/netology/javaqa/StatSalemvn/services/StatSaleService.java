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

    public int maxMonth(long[] sales) {
        int maxMonth = (int) sales[0];
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonth(long[] sales) {
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {
        int monthSalesBelow = 0;
        long i = averageSale(sales);
        for (long sale : sales) {
            if (sale < i) {
                monthSalesBelow++;
            }
        }
        return monthSalesBelow;
    }

    public int aboveAverage(long[] sales) {
        int monthSalesAbove = 0;
        long i = averageSale(sales);
        for (long sale : sales) {
            if (sale > i) {
                monthSalesAbove++;
            }
        }
        return monthSalesAbove;
    }
}