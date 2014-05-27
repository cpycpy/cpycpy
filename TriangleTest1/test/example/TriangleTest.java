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
		assertFalse(new Triangle2(2,4,5,13).isValid());
		assertTrue(new Triangle2(2,4,5,6).isValid());
		assertFalse(new Triangle2(2,4,15,8).isValid());
		assertTrue(new Triangle2(2,4,6,9).isValid());

		assertFalse(new Triangle2(2,5,4,13).isValid());
		assertTrue(new Triangle2(2,5,4,6).isValid());
		assertFalse(new Triangle2(2,15,4,8).isValid());
		assertTrue(new Triangle2(2,6,4,9).isValid());

		assertFalse(new Triangle2(2,5,13,4).isValid());
		assertTrue(new Triangle2(2,5,6,4).isValid());
		assertFalse(new Triangle2(2,15,8,4).isValid());
		assertTrue(new Triangle2(2,6,9,4).isValid());
		
		assertFalse(new Triangle2(2,4,13,5).isValid());
		assertTrue(new Triangle2(2,4,6,5).isValid());
		assertFalse(new Triangle2(2,4,8,15).isValid());
		assertTrue(new Triangle2(2,4,9,6).isValid());

		assertFalse(new Triangle2(2,13,5,4).isValid());
		assertTrue(new Triangle2(2,6,5,4).isValid());
		assertFalse(new Triangle2(2,8,15,4).isValid());
		assertTrue(new Triangle2(2,9,6,4).isValid());

		assertFalse(new Triangle2(2,13,4,5).isValid());
		assertTrue(new Triangle2(2,6,4,5).isValid());
		assertFalse(new Triangle2(2,8,4,15).isValid());
		assertTrue(new Triangle2(2,9,4,6).isValid());
		//----------------------------
		assertFalse(new Triangle2(4,2,5,13).isValid());
		assertTrue(new Triangle2(4,2,5,6).isValid());
		assertFalse(new Triangle2(4,2,15,8).isValid());
		assertTrue(new Triangle2(4,2,6,9).isValid());

		assertFalse(new Triangle2(4,2,13,5).isValid());
		assertTrue(new Triangle2(4,2,6,5).isValid());
		assertFalse(new Triangle2(4,2,8,15).isValid());
		assertTrue(new Triangle2(4,2,9,6).isValid());

		assertFalse(new Triangle2(4,5,2,13).isValid());
		assertTrue(new Triangle2(4,5,2,6).isValid());
		assertFalse(new Triangle2(4,15,2,8).isValid());
		assertTrue(new Triangle2(4,6,2,9).isValid());

		assertFalse(new Triangle2(4,5,13,2).isValid());
		assertTrue(new Triangle2(4,5,6,2).isValid());
		assertFalse(new Triangle2(4,15,8,2).isValid());
		assertTrue(new Triangle2(4,6,9,2).isValid());

		assertFalse(new Triangle2(4,13,5,2).isValid());
		assertTrue(new Triangle2(4,6,5,2).isValid());
		assertFalse(new Triangle2(4,8,15,2).isValid());
		assertTrue(new Triangle2(4,9,6,2).isValid());

		assertFalse(new Triangle2(4,13,2,5).isValid());
		assertTrue(new Triangle2(4,6,2,5).isValid());
		assertFalse(new Triangle2(4,8,2,15).isValid());
		assertTrue(new Triangle2(4,9,2,6).isValid());
		//-----------------------------
		assertFalse(new Triangle2(5,4,2,13).isValid());
		assertTrue(new Triangle2(5,4,2,6).isValid());
		assertFalse(new Triangle2(15,4,2,8).isValid());
		assertTrue(new Triangle2(6,4,2,9).isValid());

		assertFalse(new Triangle2(5,4,13,2).isValid());
		assertTrue(new Triangle2(5,4,6,2).isValid());
		assertFalse(new Triangle2(15,4,8,2).isValid());
		assertTrue(new Triangle2(6,4,9,2).isValid());

		assertFalse(new Triangle2(5,13,4,2).isValid());
		assertTrue(new Triangle2(5,6,4,2).isValid());
		assertFalse(new Triangle2(15,8,4,2).isValid());
		assertTrue(new Triangle2(6,9,4,2).isValid());

		assertFalse(new Triangle2(5,13,2,4).isValid());
		assertTrue(new Triangle2(5,6,2,4).isValid());
		assertFalse(new Triangle2(15,8,2,4).isValid());
		assertTrue(new Triangle2(6,9,2,4).isValid());

		assertFalse(new Triangle2(5,2,13,4).isValid());
		assertTrue(new Triangle2(5,2,6,4).isValid());
		assertFalse(new Triangle2(15,2,8,4).isValid());
		assertTrue(new Triangle2(6,2,9,4).isValid());

		assertFalse(new Triangle2(5,2,4,13).isValid());
		assertTrue(new Triangle2(5,2,4,6).isValid());
		assertFalse(new Triangle2(15,2,4,8).isValid());
		assertTrue(new Triangle2(6,2,4,9).isValid());
		//---------------------------
		assertFalse(new Triangle2(13,5,4,2).isValid());
		assertTrue(new Triangle2(6,5,4,2).isValid());
		assertFalse(new Triangle2(8,15,4,2).isValid());
		assertTrue(new Triangle2(9,6,4,2).isValid());

		assertFalse(new Triangle2(13,5,2,4).isValid());
		assertTrue(new Triangle2(6,5,2,4).isValid());
		assertFalse(new Triangle2(8,15,2,4).isValid());
		assertTrue(new Triangle2(9,6,2,4).isValid());

		assertFalse(new Triangle2(13,4,5,2).isValid());
		assertTrue(new Triangle2(6,4,5,2).isValid());
		assertFalse(new Triangle2(8,4,15,2).isValid());
		assertTrue(new Triangle2(9,4,6,2).isValid());

		assertFalse(new Triangle2(13,4,2,5).isValid());
		assertTrue(new Triangle2(6,4,2,5).isValid());
		assertFalse(new Triangle2(8,4,2,15).isValid());
		assertTrue(new Triangle2(9,4,2,6).isValid());

		assertFalse(new Triangle2(13,2,4,5).isValid());
		assertTrue(new Triangle2(6,2,4,5).isValid());
		assertFalse(new Triangle2(8,2,4,15).isValid());
		assertTrue(new Triangle2(9,2,4,6).isValid());

		assertFalse(new Triangle2(13,2,5,4).isValid());
		assertTrue(new Triangle2(6,2,5,4).isValid());
		assertFalse(new Triangle2(8,2,15,4).isValid());
		assertTrue(new Triangle2(9,2,6,4).isValid());
	}
		
	
}
