package by.overone.lesson25.hometask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    @Test
    void testputDarker() {
        assertEquals("Darkerred",new Color("red").putDarker());
    }
}