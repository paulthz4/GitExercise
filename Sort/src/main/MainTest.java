package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main a = new Main();
		String b = a.stringSort();
		assertEquals("Sorted array: [a, b, c]", b);
	}
	@Test
	void intSortTest() {
		Main a = new Main();
		String b = a.intSort(3);
		assertEquals("Sorted array: [1, 2, 3]", b);
		
	}
	
	

}
