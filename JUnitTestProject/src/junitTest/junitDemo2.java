package junitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitDemo2 {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BEFORECLASS");
	}
	@Before
	public void before() {
		System.out.println("BEFORE");
	}

	@Test
	public void test() {
		System.out.println("this is test");
	}

	@Test
	public void test1() {
		System.out.println("this is test1");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
}
