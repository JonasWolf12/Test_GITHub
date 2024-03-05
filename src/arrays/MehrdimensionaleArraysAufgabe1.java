package arrays;

public class MehrdimensionaleArraysAufgabe1 {

	
	
	
	
	public int[][]magnify(int[][] array, int factor) {
		int z = 0;
		int s = 0;

		for(int i = 0; i < array.length; i++) {
			z++;
			for(int j = 0; j < array[0].length; j++) {
				s++;
			
			}
		}
		int [][] photo = new int [z][s];
		return photo;
	}
	
	
public static void main(String[] args) {
	
	
	int [][] test1 = new int [4][7];
	System.out.println(magnify(test1,3));
		
		
	}
}
