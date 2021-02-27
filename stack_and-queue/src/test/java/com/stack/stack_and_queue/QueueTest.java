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
		queue.push(70);
		queue.push(30);
		queue.push(56);
	}
   
    @Test
    public void pushInQueueTest_Correct(){
        assertEquals(queue.getFirst().getData() , queue.getQueue().returnFirst());
    }
    
    @Test
    public void pushOnQueueTest_InCorrect(){
        assertNotEquals(5 , queue.getQueue().returnFirst());
    }

    
    @Test
    public void dequeueFromQueueTest_Correct(){
    	queue.deque();
        assertEquals(30 , queue.getQueue().returnFirst());
    }
    
    @Test
    public void dequeueFromQueueTest_InCorrect(){
    	queue.deque();
        assertNotEquals(10 , queue.getQueue().returnFirst());
    }
   
    @Test
    public void sizeOfQueueAfterDequeTest_Correct(){
    	queue.deque();
        assertEquals(2 , queue.getQueue().getSize());
    }
    
    @Test
    public void sizeOfQueueAfterDequeTest_InCorrect(){
    	queue.deque();
        assertNotEquals(3 , queue.getQueue().getSize());
    }
}