package Structure;

public class Recursion {
//재귀 호출 
	public static int fact(int n) {
		if(n <= 1) 
			return n;
		else 
			return fact(n-1) * n;
	}
	public static void main(String[] args) {
		int what = 4;
		System.out.println(fact(what));
	}
}
