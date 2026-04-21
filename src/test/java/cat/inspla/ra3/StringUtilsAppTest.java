package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsAppTest {

    private final StringUtilsApp utils = new StringUtilsApp();

    @ParameterizedTest
    @CsvSource({
            "'hola   món', 'hola món'",
            "'a    b     c', 'a b c'",
            "'   espais   al   principi', 'espais al principi'",
            "'final   d''espais   ', 'final d''espais'"
    })
    void normalizeSpacesRedueixEspaisMultiples(String input, String expected) {
        assertEquals(expected, utils.normalizeSpaces(input));
    }
}
