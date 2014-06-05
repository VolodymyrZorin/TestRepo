package stack;

import static org.junit.Assert.*;
import java.util.EmptyStackException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMyStack {
	
	static void pln(String s) {
		System.out.println(s);
		}
	
	static MyStack TestArray;
		
	@Before
	public void setUp() throws Exception {
		TestArray = new MyStack();
	}
	
	@After
	public void tearDown() throws Exception {
		TestArray = null;
	}

	@Test
	public void testStackEmpty() {
		TestArray = new MyStack(0);
		assertTrue(TestArray.empty());
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testPushExeption() {
		int index = 20;
		TestArray = new MyStack(index);
		for (int i = 0;; i++){
			TestArray.push(i);
		}
	}
	@Test
	public void testPush() {
		TestArray.push(10);
		int lastElement = TestArray.peek();
		assertEquals(10, lastElement);
	}
	
	@Test
	public void testPeek() {
		for (int i = 0; i<=5; i++){
			TestArray.push(i);
		}
		int arrEnd = TestArray.peek();
		assertEquals(5,arrEnd);
	}
	
	@Test
	public void testPop() {
		for (int i = 0; i <= 5; i++){
			TestArray.push(i);
		}
		
		int lastElementPeek = TestArray.peek();
		int LastelementPop = TestArray.pop();
		assertEquals(lastElementPeek, LastelementPop);
		assertFalse(lastElementPeek==TestArray.peek());
	}
	
	@Test (expected=EmptyStackException.class)
	public void testPopExeption() {
		for (int i = 0;; i++){
			TestArray.pop();
		}
	}
	
}
