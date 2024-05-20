import org.example.Problem1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem1Test {

    private Problem1 problem1Test = new Problem1();

    @Test
    public void checkSumOfArray() {
        int[] array = {1, 3, 5};
        Assertions.assertEquals(9, problem1Test.sumArray(array));
    }

    @Test
    public void checkNegatives() {
        int[] array = {-3, -5, -27, 1};
        Assertions.assertEquals(-34, problem1Test.sumArray(array));
    }

    @Test
    public void checkMaxIntger() {
        int[] array = {Integer.MAX_VALUE, 1};
        Assertions.assertEquals(Integer.MAX_VALUE+1, problem1Test.sumArray(array));
    }
}
