package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        Assert.assertEquals(700, service.remain(2300));

    }

    @Test
    public void shouldAmountZero() {
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldBuyExtraIfTheAmount1000() {
        Assert.assertEquals(0, service.remain(1000));
    }

}
