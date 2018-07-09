package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {
int open = 0;
int closed = 0;
Stack<String> strgs = new Stack <String>();
	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		for (int i = 0; i < b.length(); i++) {
		char letter = b.charAt(i);
		String letter1 = Character.toString(letter);
			if(letter1.equals("{")) { 
				strgs.add(letter1);
			}else {
				strgs.add(letter1);
			}
		}
		
		for (int i = 0; i < strgs.size(); i++) {
			String letter12 = strgs.pop();
			
			if (letter12.equals("{")) {
				open++;
			}else {
				closed++;
			}
		
		}
		if(open == closed) {
			return true;
		}else {
			return false;
		}
		
		
		
	}

}