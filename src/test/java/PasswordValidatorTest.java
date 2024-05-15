import org.example.PasswordValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {


    PasswordValidator passwordValidator = new PasswordValidator();
    //Tests for  hasGoodLength()

    @Test
     void lengthTooShort() {
        String password = "Haslo";
        Assertions.assertFalse(passwordValidator.hasGoodLength(password));
    }

    // Tests for hasNoWhiteSpaces()

    @Test
    void passwordWithWhiteSpace() {
        String password = "Haslo ze spacja";
        Assertions.assertFalse(passwordValidator.hasNoWhiteSpaces(password));
    }

    @Test
    void passwordWithNoWhiteSpaces() {
        String password = "Password";
        Assertions.assertTrue(passwordValidator.hasNoWhiteSpaces(password));
    }

    // Tests for hasNoRepetitions()

    @Test
    void passwordHasRepetitions() {
        String password = "Password";
        Assertions.assertFalse(passwordValidator.hasNoRepetitions(password));
    }

    @Test
    void passwordHasNoRepetitions() {
        String password = "Haslo";
        Assertions.assertTrue(passwordValidator.hasNoRepetitions(password));
    }

    // Tests for hasNumbers()

    @Test
    void passwordWithNumber() {
        String p = "Haslo123";
        Assertions.assertTrue(passwordValidator.hasNumbers(p));
    }

    @Test
    void passwordWithNoNumber() {
        String p = "Haslo";
        Assertions.assertFalse(passwordValidator.hasNumbers(p));
    }

    // Tests for hasSpecialCharacter()

    @Test
    void passwordWithSpecial() {
        String p = "Haslo!@#";
        Assertions.assertTrue(passwordValidator.hasSpecialCharacter(p));
    }

    @Test
    void passwordWithNoSpecial() {
        String p = "Haslo";
        Assertions.assertFalse(passwordValidator.hasSpecialCharacter(p));
    }
}
