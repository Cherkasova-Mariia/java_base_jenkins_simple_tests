package tests.simple;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NegativeTests {

    @Test
    @DisplayName("Упадет: неверная математическая сумма")
    void testWrongMath() {
        int a = 5;
        int b = 3;

        assertEquals(10, a + b, "Ожидалось 10, но получилось 8");
    }

    @Test
    @DisplayName("Упадет: строки не совпадают из-за регистра")
    void testWrongString() {
        String expected = "HELLO";
        String actual = "hello";

        assertTrue(expected.equals(actual), "Строки не равны, так как регистр разный");
    }

    @Test
    @DisplayName("Упадет: объект не является пустым (null)")
    void testNotNullFails() {
        String text = "Привет";

        assertNull(text, "Ожидалось null, но объект содержит текст");
    }
}