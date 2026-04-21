package cat.inspla.ra3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void TODO_addAmbPositiusRetornaSumaCorrecta() {
        assertEquals(4,calculator.add(4,0));
        assertEquals(8,calculator.add(6,2));
        assertEquals(6,calculator.add(8,-2));
        assertEquals(15,calculator.add(20,-5));
        assertEquals(5,calculator.add(1,4));
    }

    @Test
    void TODO_addAmbNegatiusRetornaRestaCorrecta() {
        assertEquals(-44, calculator.subtract(-24,20));
        assertEquals(10, calculator.subtract(30,20));
        assertEquals(-101, calculator.subtract(-2,99));
    }

    @Test
    void TODO_addAmbPositiusRetornaMultiplicacioCorrecta() {
        assertEquals(56, calculator.multiply(8,7));
        assertEquals(-21, calculator.multiply(7,-3));
        assertEquals(110, calculator.multiply(11,10));
    }

    @Test
    void TODO_divideByZeroLlançaExcepció() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals(25, calculator.divide(50,2));

    }
}
