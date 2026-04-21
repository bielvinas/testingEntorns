package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @ParameterizedTest
    @CsvSource({
        "0 , 32",
        "100, 212",
        "-40, -40"
    })
    void TODO_convertCelsiusToFahrenheitRetornaValorCorrecte(double c, double expected) {
        assertEquals(expected, converter.convertCelsiusToFahrenheit(c), 0.0001);
    }

    @ParameterizedTest
    @CsvSource({
            "32, 0",
            "212, 100",
            "-40, -40"
    })
    void convertFahrenheitToCelsiusRetornaValorCorrecte(double f, double expected) {
        assertEquals(expected, converter.convertFahrenheitToCelsius(f), 0.0001);
    }



}
