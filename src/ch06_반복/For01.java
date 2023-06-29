package ch06_반복;

public class For01 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		
//		for(int i = 0, j = 0; i < 6; i++, j++) 이렇게도 가능
//      무조건 0으로 초기화, 반복횟수 		
		for(int i = 0; i < 6; i++) {
			System.out.println(numbers[i]);
			System.out.println("i: " + i);
		}
	}

}
