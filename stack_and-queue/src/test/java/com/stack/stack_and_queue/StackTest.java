package com.stack.stack_and_queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class StackTest 
{
	Stack stack;
	@Before
	public void init() {
		stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
	}
    
    @Test
    public void pushOnStackTest_Correct(){
        assertEquals(stack.getTop().getData() , stack.getStack().returnFirst());
    }
   
    @Test
    public void pushOnStackTest_InCorrect(){
        assertNotEquals(10 , stack.getStack().returnFirst());
    }
}