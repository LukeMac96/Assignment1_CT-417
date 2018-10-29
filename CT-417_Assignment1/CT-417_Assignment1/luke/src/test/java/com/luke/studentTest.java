package com.luke;

import junit.framework.TestCase;

public class studentTest extends TestCase { 
 
	public void testGetUsername() {
		
		student dave = new student("Dave", 22, "04/11/1996"/*, 15463611*/);
		
		assertEquals(dave.getUsername(), "Dave22");
		
		
		//fail("Not yet implemented");
	}

}
