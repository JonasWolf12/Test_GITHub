package recursion;

public class BionimalCoefficient {
	
	public static int sumA(int n, int k) {
		if(k==0 | n==k) {
			return 1;
		}else {
			return sumA(n-1,k-1)+sumA(n-1,k);
		}
	}

	public static void main(String[] args) {

		System.out.println(sumA(4,2));
		
	}

}
