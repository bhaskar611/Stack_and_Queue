package com.stack.stack_and_queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class QueueTest 
{
	Queue queue;
	
	@Before
	public void init() {
		queue = new Queue();
		queue.push(56);
		queue.push(30);
		queue.push(70);	
	}
   
    @Test
    public void pushInQueueTest_Correct(){
        assertEquals(queue.getFirst().getData() , queue.getQueue().returnFirst());
    }
    
    @Test
    public void pushOnQueueTest_Correct(){
        assertEquals(56 , queue.getQueue().returnFirst());
    }
    @Test
    public void pushOnQueueTest_InCorrect(){
        assertNotEquals(70 , queue.getQueue().returnFirst());
    }
    
}