package unitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator c = new Calculator(10,15);
		assertEquals(25, c.add());
	}

	@Test
	public void testSubtract() {
		Calculator c = new Calculator(10,15);
		assertEquals(-5, c.subtract());
	}

	@Test
	public void testMultiply() {
		Calculator c = new Calculator(10,15);
		assertEquals(150, c.multiply());
	}

	@Test
	public void testDivide() {
		Calculator c = new Calculator(10,2);
		assertEquals(5, c.divide());
	}

}
