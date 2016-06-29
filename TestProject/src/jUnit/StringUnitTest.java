package jUnit;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUnitTest {

	@Test
	public void testReverse(){
		assertEquals( "" , toLowerCase("")  );
		assertEquals("cba", toLowerCase("CAB"));
	}
	
	public String toLowerCase(String s){
		return s.toLowerCase();
	}
}
