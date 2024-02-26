package arrays;

public class Aufgabe2 {
	
	public boolean isProbablyApproaching(String[] signs) {
		int count = 1;
		for(int i = 1; i < signs.length; i++) {
			if( signs[i-1].equals(signs[i])) {
				count ++;
				if( count >=4) {
					return true;
				}
				
			}
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		
		
		
	}
	
}
