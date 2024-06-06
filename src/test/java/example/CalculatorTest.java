package example;

import org.example.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/add.csv", numLinesToSkip = 1)
    void add(int a, int b, int result) {
        Calculator calculator = new Calculator();
        assertEquals(calculator.add(a, b), result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/minus.csv", numLinesToSkip = 1)
    void minus(int a, int b, int result) {
        Calculator calculator = new Calculator();
        assertEquals(calculator.minus(a, b), result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/multiple.csv", numLinesToSkip = 1)
    void multiple(int a, int b, int result) {
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiple(a, b), result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/divide.csv", numLinesToSkip = 1)
    void divide(int a, int b, String result) {
        Calculator calculator = new Calculator();
        if (result.equals("Divide by zero")){
            assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
        } else {
            assertEquals(calculator.divide(a, b), Double.parseDouble(result));
        }
    }
}