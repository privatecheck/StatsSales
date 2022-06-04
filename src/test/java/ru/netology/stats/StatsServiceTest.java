package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService service = new StatsService();

        long[] sales = { 166, 155, 138, 158, 179, 250, 199, 206, 455, 544, 434, 356 };

        long actual = service.sum(sales);
        long expected = 166 + 155 + 138 + 158 + 179 + 250 + 199 + 206 + 455 + 544 + 434 + 356;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcAvg() {
        StatsService service = new StatsService();

        long[] sales = { 166, 155, 138, 158, 179, 250, 199, 206, 455, 544, 434, 356 };

        long actual = service.avg(sales);
        long expected = 270;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldCalcAboveAvg() {
        StatsService service = new StatsService();

        long[] sales = { 166, 155, 138, 158, 179, 250, 199, 206, 455, 544, 434, 356 };

        long actual = service.aboveAvg(sales);
        long expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBelowAvg() {
        StatsService service = new StatsService();

        long[] sales = { 166, 155, 138, 158, 179, 250, 199, 206, 455, 544, 434, 356 };

        long actual = service.belowAvg(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = { 166, 155, 138, 158, 179, 250, 199, 206, 455, 544, 434, 356 };

        long actual = service.minSales(sales);
        long expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = { 166, 155, 138, 158, 179, 250, 199, 206, 455, 544, 434, 356 };

        long actual = service.maxSales(sales);
        long expected = 10;

        Assertions.assertEquals(expected, actual);
    }
}


