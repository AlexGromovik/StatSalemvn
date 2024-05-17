package ru.netology.javaqa.StatSalemvn.services;

public class StatSaleService {
    public int calcSumSale(int[] sales) {
        int sumSale = 0;
        for (int sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public int averageSale(int[] sales) {
        return calcSumSale(sales) / sales.length;
    }

    public int FindMaxMonth(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int FindMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int FindBelowAvarage(int[] sales) {
        int below = 0;
        for (int sale : sales) {
            if (sale < averageSale(sales)) {
                below++;
            }
        }
        return below;
    }

    public int FindAboveAvarage(int[] sales) {
        int above = 0;
        for (int sale : sales) {
            if (sale > averageSale(sales)) {
                above++;
            }
        }
        return above;
    }
}