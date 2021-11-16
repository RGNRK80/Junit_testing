package by.overone.lesson25.hometask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypesTest {

    @Test
    void testValueOf() {
        assertEquals("CUPE",Types.valueOf("CUPE").toString());
    }
}