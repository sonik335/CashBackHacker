package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {



    @Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 1000;
        int actual = service.remain(amount);

        Assert.assertEquals(actual,expected);



    }
}