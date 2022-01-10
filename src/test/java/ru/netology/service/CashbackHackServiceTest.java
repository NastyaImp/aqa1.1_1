package ru.netology.service;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldCalculateSumLessThan1000() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateSumEqualThan1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldCalculateSumMoreThan1000() {
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}