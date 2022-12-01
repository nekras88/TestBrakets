import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BracketsTest {
Brackets test = new Brackets();

    @ParameterizedTest
    @CsvSource({
        "'(()', '2 - \"()\"'",
        "')()())', '4 - \"()()\"'",
        "')(()())', '6 - \"(()())\"'",
        "')(', '0'",
    })
    
    void Test(String input, String expected){
    
        String s = test.calculateBrackets(input);
        assertEquals(expected, s);
    }
}