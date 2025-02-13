import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    @Test
    public void addTest() {
        BuildSimpleCalculator calculator = new BuildSimpleCalculator();
        int result = calculator.add(5, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void subtractTest() {
        BuildSimpleCalculator calculator = new BuildSimpleCalculator();
        int result = calculator.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }
}
