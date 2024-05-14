package stack;
 
import java.util.LinkedList;
import java.util.regex.Pattern;
 
public class Aufgabe2 {
 
	/*
	 * - Entwickle eine Anwendung, die �berpr�ft, ob Klammern in einem gegebenen Ausdruck
	 *   korrekt geschachtelt sind. Verwende dazu einen Stack, um die �ffnenden und schlie�enden
	 *   Klammern zu verfolgen.
	 * - Die Anwendung sollte "Korrekte Klammerung!" ausgeben, wenn die
	 *   Klammern korrekt geschachtelt sind, und "Fehlerhafte Klammerung!" sonst.
	 */
	
	
	
	public static boolean checkBrackets(String input) {
		LinkedList<Character> stack = new LinkedList<>();
		for(char c : input.toCharArray()) {
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if(c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				char lastOpen = stack.peek();
				if((c == ')' && lastOpen != '(') ||
				   (c == '}' && lastOpen != '{') ||
				   (c == ']' && lastOpen != '[')) {
				  return false;
				}
				stack.pop();
				
			}

		} 
		return stack.isEmpty();
				
		
	}
	
	
	
	public static void main(String[] args) {
		
		String str = "(()))";
		System.out.println(checkBrackets(str));
		
 
	}
	
	
	
}