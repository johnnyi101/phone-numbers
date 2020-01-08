package phone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class numberCheckerTest {
    @Test
    public void fail_if_no_plus1()
    {
    //arrange
    String input = "100000000000";
    String expectedResult = "Invalid Number";
    //act
    numberChecker cut = new numberChecker(input);
    cut.setPhoneNumber(input);
    String actualResult = cut.getPhoneNumber();

    //assert
    assertEquals(expectedResult, actualResult);
    }
}
