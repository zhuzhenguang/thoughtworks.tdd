package com.thoughtworks.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Guss number
 * Created by dev on 7/22/16.
 */
public class CompareNumberTest {
    @Test
    public void should_return_4A0B_when_system_and_customer_inputs_are_1234() {
        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234", "1234");

        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A0B_when_system_input_is_1234_and_customer_input_is_5678() {
        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234", "5678");

        assertEquals("0A0B", result);
    }

    @Test
    public void should_return_1A0B_when_system_input_is_1234_and_customer_input_is_1567() {
        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234", "1567");

        assertEquals("1A0B", result);
    }

    @Test
    public void should_return_0A1B_when_system_input_is_1234_and_customer_input_is_5671() {
        CompareNumber compareNumber = new CompareNumber();

        String result = compareNumber.compare("1234", "5671");

        assertEquals("0A1B", result);
    }
}
