package ch03_연산자;

public class Operator04 {

	public static void main(String[] args) {
		
		int score = 80;
	 
//		System.out.println(90 <= score ? a : 80 <= 89 ? b    );
//		System.out.println(80 <= score && score <= 89 ? b : );  
//		System.out.println(70 <= score && score <= 79 ? c : );
//		System.out.println(60 <= score && score <= 69 ? d :);

		String result = score < 0 || score > 100 ? "X"
				: score > 89 ? "A" 
				: score > 79 ? "B"
				: score > 69 ? "C"
				: score > 59 ? "D"
				: "F";
										
				//연산자를 앞으로 붙여서 줄바꿈
				
		System.out.println(result);
		
	}

}
