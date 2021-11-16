package by.overone.lesson25.hometask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EngineTest {

    @Test
    void TestgetTurbo() {
        assertEquals(110,new Engine(100).getTurbo());

    }
}