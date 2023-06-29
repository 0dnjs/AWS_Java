package ch03_연산자;

/*
 * 논리연산자
 * 1. && -> and(그리고) - 곱
 * true && false => false
 * 2. || -> or (또는)   - 합
 * true || false => true 
 * 3. !  -> not(부정)   - 반전
 * !(true || false) => false
 * !true => false
 */
public class Operator02 {

	public static void main(String[] args) {
	int year = 2000;
//	System.out.println(year == 4 % 4);
	System.out.println(year % 4 == 0);
//	System.out.println(!year % 100 == 0);
	System.out.println(year % 100 != 0);
	System.out.println(year % 400 == 0);
//	System.out.println(year % 4 == 0 && year % 400 == 0 && year % 100 != 0);
	System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
//	System.out.println(!(year % 4 == 0 && year % 100 != 0 || year % 400 == 0));
						// 부정하고싶으면 !()
	
	if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
		System.out.println(1);
	}else {
		System.out.println(0);
	}
	
	System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0);
	                                 //<-  앞에 조건이 맞아 ? 맞으면 왼쪽 결과 아니면 오른쪽 결과
	
	
	int result = 10 + 1;
	System.out.println(result);
	
	boolean result2 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	System.out.println(result2);
	
	int result3 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
	System.out.println(result3);
	
	
//	int result3 = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : "0";
//	System.out.println(result3);
//	삼항연산자의 결과값의 자료형은 같아야한다
	}

}
