package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Класс с тестами, которые должны скипнуться")
public class SkippedTests {

    @Test
    @Disabled("Функция находится в разработке")
    void testFutureFeature() {

        assertTrue(false);
    }

    @Test
    @Disabled("Тест отключен до исправления бага #12345")
    void testMathSkipped() {
        int a = 2;
        int b = 2;

        assertEquals(4, a + b);
    }
}