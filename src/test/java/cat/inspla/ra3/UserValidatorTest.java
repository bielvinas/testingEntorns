package cat.inspla.ra3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private final UserValidator validator = new UserValidator();

    @Test
    void TODO_usernameCorrecteÉsVàlid() {
        // TODO
        assertTrue(validator.isValidUsername("abc"));
    }

    @Test
    void TODO_usernameMassaCurtNoÉsVàlid() {
        assertFalse(validator.isValidUsername("ab"));
    }

    @Test
    void usernameNullNoEsValid() {
        assertFalse(validator.isValidUsername(null));
    }

    @Test
    void edat17NoEsAdult() {
        assertFalse(validator.isAdult(17));
    }

    @Test
    void edat18EsAdult() {
        assertTrue(validator.isAdult(18));
    }

    @Test
    void edat19EsAdult() {
        assertTrue(validator.isAdult(19));
    }


    @Test
    void TODO_validateRequiredTextAmbCadenaBuidaLlançaExcepció() {
        assertThrows(IllegalArgumentException.class,
                () -> validator.validateRequiredText("   "));
    }

    @Test
    void validateRequiredTextAmbNullLlançaExcepcio() {
        assertThrows(IllegalArgumentException.class,
                () -> validator.validateRequiredText(null));
    }
}
