package ch03_연산자;

public class Operator03 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		int max = 0;
		
//		String result1 = a > b && a > c ? "a" : "b";
//		String result2 = b > a && b > c ? "b" : "b";
//		String result3 = c > a && c > b ? "c" : "b";
	   
		
		max = a < b ? b : a;
		max = max < c ? c : max;
		
		System.out.println(max);
		
		System.out.println(a < b ? b : a < c ? c : a);

	}

}
