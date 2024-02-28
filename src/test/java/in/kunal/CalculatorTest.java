package in.kunal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.kunal.bindigs.Caculator;

public class CalculatorTest {
	
	@Test
	public void test() {
		Caculator caculator = new Caculator();
	int actualresult =	caculator.add(10, 40);
		assertEquals(50, actualresult);
	}
	
	@Test
	public void multi() {
		Caculator c = new Caculator();
		int actualresult = c.multiply(2, 5);
		assertEquals(10, actualresult);
	}

}
