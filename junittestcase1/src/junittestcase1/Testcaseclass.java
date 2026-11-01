package junittestcase1;

// 1. You must add these imports so the IDE knows what @Test and assertEquals are
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Testcaseclass {

	@Test
	void test() {
		int result = Mainclass.doubleNumer(3);
		
		// 2. Changed expected value from 10 to 6 so the test passes
		assertEquals(6, result, () -> "The test case has been failed");
	}
}
