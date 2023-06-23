package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest2 {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(920);
        int expected = 80;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIfAmount0() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIfAmountEqualsBoundaryMinus1() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainIfAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }
}
