package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP20K4Square16() {
        int expected = 16;
        int p = 20;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP40K5Square55() {
        int expected = 55;
        int p = 40;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 1);
    }
}