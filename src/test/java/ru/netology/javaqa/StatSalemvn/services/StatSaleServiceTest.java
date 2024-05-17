package ru.netology.javaqa.StatSalemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatSaleServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatSaleService service = new StatSaleService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.calcSumSale(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAvarageSale() {
        StatSaleService service = new StatSaleService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageSale(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxSalesMonth(){
        StatSaleService service = new StatSaleService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.FindMaxMonth(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatSaleService service = new StatSaleService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.FindMinMonth(sales);
        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldFindSalesBelowAvarege() {
        StatSaleService service = new StatSaleService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;
        int actualBelowSalesMonth = service.FindBelowAvarage(sales);
        Assertions.assertEquals(expectedBelowAverage, actualBelowSalesMonth);
    }

    @Test
    public void shouldFindSalesAboveAverage(){
        StatSaleService service = new StatSaleService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 5;
        int actualAboveSalesMonth = service.FindAboveAvarage(sales);
        Assertions.assertEquals(expectedAboveAverage, actualAboveSalesMonth);
    }
}

