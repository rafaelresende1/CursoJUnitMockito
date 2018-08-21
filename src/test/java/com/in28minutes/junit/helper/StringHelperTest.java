package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		
		
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	
		
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	//ABCD => false, ABAB => true, AB=> true, A=> false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	
}
