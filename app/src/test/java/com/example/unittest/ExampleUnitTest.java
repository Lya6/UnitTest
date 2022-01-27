package com.example.unittest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(7, 2 + 2);
    }

    @Test
    public void addition_isCorrect2() {
        assertEquals("My message", 4, 2 + 2);
    }


    @Test
    public void testIsEmailValid() {
        String testEmail = "anupamchugh@mail.ru";
        Assert.assertThat(String.format("Email невалидный %s ", testEmail),
                Utilits.checkEmailForValidity(testEmail), is(true));
    }
}