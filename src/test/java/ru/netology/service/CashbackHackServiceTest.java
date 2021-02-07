package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldSumLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;

        int expected = 900;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }

    @Test
    public void shouldSumOver1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int expected = 500;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(actual, expected);


    }

    @Test

    public void shouldSumEqual1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        service.remain(amount);
        int actual = service.remain(amount);

        assertEquals(actual, expected);

    }
    
}
