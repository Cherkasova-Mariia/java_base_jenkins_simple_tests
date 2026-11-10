package tests.simple;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveTests {

    @Test
    @DisplayName("Проверка сложения двух положительных чисел")
    void testSimpleAddition() {

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedSum = 15;

        int actualSum = firstNumber + secondNumber;

        assertEquals(expectedSum, actualSum, "Сумма 10 и 5 должна быть равна 15");
    }

    @Test
    @DisplayName("Проверка перевода строки в верхний регистр")
    void testStringToUpperCase() {

        String originalText = "qa guru";
        String expectedText = "QA GURU";

        String actualText = originalText.toUpperCase();

        assertEquals(expectedText, actualText, "Строка должна полностью состоять из заглавных букв");
    }
}
