package test.java;

import static org.junit.Assert.assertEquals;
import main.StaticCalculation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StaticCalculationTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void addSubTest(){
		// assertEquals(String message, long expected, long actual)
		assertEquals("Error in add()!", 3, StaticCalculation.add(1, 2));
		assertEquals("Error in sub()!", 1, StaticCalculation.sub(2, 1));
	}
	
	@Test
	public void mulDivTest(){
		assertEquals("Error in mul()!", 2, StaticCalculation.mul(2, 1));
		 // assertEquals(String message, double expected, double actual, double delta)
		assertEquals("Error in div()!", 0.5, StaticCalculation.div(1, 2),1e-12);
	}
}
