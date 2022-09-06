package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        Assert.assertEquals(service.remain(2300), 700);

    }

    @Test
    public void shouldAmountZero() {
        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldBuyExtraIfTheAmount1000() {
        Assert.assertEquals(service.remain(1000), 0);
    }

}
