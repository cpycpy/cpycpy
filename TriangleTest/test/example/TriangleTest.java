package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void volidTriangleShouldHavePoistiveSide() {
		assertTrue(new Triangle(2,4,5).isValid());
		assertFalse(new Triangle(-2,4,5).isValid());
		assertFalse(new Triangle(-2,-2,-1).isValid());
		assertFalse(new Triangle(-2,-2,0).isValid());
		assertFalse(new Triangle(0,0,0).isValid());
	}

	@Test
	public void  volidTriangleShouldHaveSTGTDS() {
		assertFalse(new Triangle2(2,4,7).isValid());
		assertFalse(new Triangle2(2,4,6).isValid());
		assertTrue(new Triangle2(2,4,5).isValid());
		assertFalse(new Triangle2(7,2,4).isValid());
		assertFalse(new Triangle2(6,2,4).isValid());
		assertTrue(new Triangle2(5,2,4).isValid());
		assertFalse(new Triangle2(4,7,2).isValid());
		assertFalse(new Triangle2(4,6,2).isValid());
		assertTrue(new Triangle2(4,5,2).isValid());
		
	}
		
	
}
