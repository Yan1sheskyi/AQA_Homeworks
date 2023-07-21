package calctest;

import org.homework.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Subtract test [2-5]")
    public void multiplyTest(){
        int expected = -3;
        int actual = calculator.subtract(2, 5);
        Assertions.assertEquals(expected, actual, "Wrong actual result");

    }

    @Test
    @DisplayName("Divide test [8/4]")
    public void divideTest(){
        int expected = 2;
        int actual = calculator.divide(8, 4);
        Assertions.assertEquals(expected, actual, "Wrong actual result");
    }

    @ParameterizedTest
    @DisplayName("Add test [5+7=12; 2+3=5; 6+3=9]")
    @MethodSource("streamOfIntForAdd")
    public void addTest(int a, int b, int res) {
        Assertions.assertTrue(calculator.add(a, b) == res, "Wrong actual result");
        Assertions.assertTrue(calculator.add(a, b) == res, "Wrong actual result");
        Assertions.assertTrue(calculator.add(a, b) == res, "Wrong actual result");
    }

    public static Stream<Arguments> streamOfIntForAdd() {
        return Stream.of(
                Arguments.arguments(5,7,12),
                Arguments.arguments(2,3,5),
                Arguments.arguments(6,3,9)
        );
    }

    @ParameterizedTest
    @DisplayName("Multiply test [5*5=25; 7*7=49; 6*0=0]")
    @MethodSource("streamOfIntForMultiply")
    public void multiplyTest(int a, int b, int res) {
        Assertions.assertEquals(calculator.multiply(a, b), res, "Wrong actual result");
        Assertions.assertEquals(calculator.multiply(a, b), res, "Wrong actual result");
        Assertions.assertEquals(calculator.multiply(a, b), res, "Wrong actual result");

    }

    public static Stream<Arguments> streamOfIntForMultiply() {
        return Stream.of(
                Arguments.arguments(5,5,25),
                Arguments.arguments(7,7,49),
                Arguments.arguments(6,0,0)
        );
    }
}
