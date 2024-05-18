package ru.netology.javaqa.StatSalemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatSaleServiceTest {

    @Test
    public void findSumSales() {
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.calcSumSale(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findAverageSale() {
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage = 15;
        long actualAverage = service.averageSale(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void findMaxSalesMonth(){
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxMonth(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void findMinMonth() {
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMonth = 9;
        long actualMinMonth = service.minMonth(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void findMonthBelowAverage() {
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelowAverage = 5;
        long actualMonthBelowAverage = service.belowAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, actualMonthBelowAverage);
    }

    @Test
    public void findMonthAboveAverage(){
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAboveAverage = 5;
        long actualMonthAboveAverage = service.aboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverage, actualMonthAboveAverage);
    }
}

