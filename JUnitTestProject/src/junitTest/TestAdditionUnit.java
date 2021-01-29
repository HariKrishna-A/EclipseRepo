package junitTest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestAdditionUnit {
	AdditionTest t = new AdditionTest();
	@Test
	public void testADD() {
		assertEquals(30,t.additionTest());
	}
	
	@Ignore
	@Test(timeout = 2000)
	public void testSub() throws Exception {
		Thread.sleep(3000);
		assertEquals(10,t.subTest());
	}

}
