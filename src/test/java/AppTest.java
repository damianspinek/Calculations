package Calculations.Calculations;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
	@Test
	public void plus_test(){
		assertEquals(4, App.plus(2,2));
	}
	
	@Test
	public void minus_test(){
		assertEquals(0, App.minus(2,2));
	}
	
	@Test
	public void divide_test(){
		assertEquals(1, App.divide(2,2));
	}
	
	@Test
	public void multiple_test(){
		assertEquals(4, App.multiple(2,2));
	}
}
