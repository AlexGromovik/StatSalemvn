package ru.netology.javaqa.StatSalemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatSaleServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.calcSumSale(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAvarageSale() {
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage = 15;
        long actualAverage = service.averageSale(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSalesMonth(){
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxMonth = 8;
        long actualMaxMonth = service.FindMaxMonth(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinMonth = 9;
        long actualMinMonth = service.FindMinMonth(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindSalesBelowAvarege() {
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelowAverage = 5;
        long actualBelowSalesMonth = service.FindBelowAvarage(sales);
        Assertions.assertEquals(expectedBelowAverage, actualBelowSalesMonth);
    }

    @Test
    public void shouldFindSalesAboveAverage(){
        StatSaleService service = new StatSaleService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAboveAverage = 5;
        long actualAboveSalesMonth = service.FindAboveAvarage(sales);
        Assertions.assertEquals(expectedAboveAverage, actualAboveSalesMonth);
    }
}

