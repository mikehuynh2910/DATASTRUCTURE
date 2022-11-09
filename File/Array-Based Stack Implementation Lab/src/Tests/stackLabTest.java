package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import StackLab.*;

class stackLabTest {

	@Test
	void testCreateStack() {
		// ARRANGE
		stack myStack = new stack(1);
		boolean actual;
		// ACT
		actual = myStack.isEmpty();
		// ASSERT
		assertTrue(actual);
	}

	@Test
	void testIsEmptyTrue() {
		// ARRANGE
		stack myStack = new stack(1);
		boolean actual, expected;
		// ACT
		actual = myStack.isEmpty();
		expected = true;
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testIsEmptyFalse() throws StackFullException {
		// ARRANGE
		stack myStack = new stack(1);
		String item = "Java is Fun!";
		boolean actual, expected;
		// ACT
		myStack.push(item);
		actual = myStack.isEmpty();
		expected = false;
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testIsFullTrue() throws StackFullException {
		// ARRANGE
		stack myStack = new stack(1);
		String item = "Java is Fun!";
		boolean actual, expected;
		// ACT
		myStack.push(item);
		actual = myStack.isFull();
		expected = true;
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testIsFullFalse() throws StackFullException {
		// ARRANGE
		stack myStack = new stack(2);
		String item = "StackItem";
		boolean actual, expected;
		// ACT
		myStack.push(item + "1");
		actual = myStack.isFull();
		expected = false;
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testPushStack() throws StackFullException, StackEmptyException {
		// ARRANGE
		stack myStack = new stack(2);
		String item = "StackItem";
		String expected, actual;
		expected = "StackItem2";
		// ACT
		myStack.push(item + "1");
		myStack.push(item + "2");
		actual = myStack.peek(); 
		// ASSERT
		assertEquals(expected, actual);
		assertFalse(myStack.isEmpty());
	}

	@Test
	void testPushFullStack() throws StackFullException {
		// ARRANGE
		stack myStack = new stack(1);
		String item = "StackItem";
		myStack.push(item + "1");
		// ACT
		// ASSERT
		assertThrows(StackFullException.class, () -> myStack.push(item));
	}

	@Test
	void testPopStack() throws StackFullException, StackEmptyException {
		// ARRANGE
		stack myStack = new stack(2);
		String item = "StackItem";
		String actual1, actual2, expected1, expected2;
		expected1 = "StackItem2";
		expected2 = "StackItem1"; 
		myStack.push(item + "1");
		myStack.push(item + "2");
		// ACT
		actual1 = myStack.pop();
		actual2 = myStack.pop();
		// ASSERT
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertTrue(myStack.isEmpty());
	}

	@Test
	void testStackSizeZero() {
		// ARRANGE
		stack myStack = new stack(2);
		int actual, expected;
		expected = 0;
		// ACT
		actual = myStack.size();
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testStackSizeNonZero() throws StackFullException {
		// ARRANGE
		stack myStack = new stack(2);
		String item = "StackItem";
		int actual, expected;
		expected = 1;
		// ACT
		myStack.push(item + "1");
		actual = myStack.size();
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testPopEmptyStack() {
		// ARRANGE
		stack myStack = new stack(1);
		// ACT
		// ASSERT
		assertThrows(StackEmptyException.class, () -> myStack.pop());
	}

	@Test
	void testPeekStack() throws StackLab.StackEmptyException, StackFullException {
		// ARRANGE
		stack myStack = new stack(1);
		String item = "StackItem";
		String actual, expected;
		// ACT
		myStack.push(item);
		expected = item;
		actual = myStack.peek();
		// ASSERT
		assertEquals(expected, actual);
	}

	@Test
	void testPeekEmptyStack() {
		// ARRANGE
		stack myStack = new stack(1);
		// ACT
		// ASSERT
		assertThrows(StackEmptyException.class, () -> myStack.peek());
	}

	@Test
	void testPrintStackUp() throws StackEmptyException, StackFullException {
		// ARRANGE
		stack myStack = new stack(2);
		String item = "StackItem";
		String actual, expected;
		expected = "StackItem1\nStackItem2\n";
		// ACT
		myStack.push(item + "1");
		myStack.push(item + "2");
		actual = myStack.printStackUp();
		// ASSERT
		assertEquals(expected, actual);
		assertFalse(myStack.isEmpty());
	}

	@Test
	void testPrintStackUpEmptyStack() {
		// ARRANGE
		stack myStack = new stack(1);
		// ACT
		// ASSERT
		assertThrows(StackEmptyException.class, () -> myStack.printStackUp());
	}
}