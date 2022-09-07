package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        assertEquals(700, service.remain(2300));

    }

    @Test
    public void shouldAmountZero() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldBuyExtraIfTheAmount1000() {
        assertEquals(0, service.remain(1000));
    }

}
