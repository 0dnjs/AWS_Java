package ch05_조건;

import java.util.Scanner;

public class IfScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.println("점수입력: ");
		score = scanner.nextInt();
		String result = "";
		
		/*if(score > 89) {
			System.out.println("A");
		}else if(score > 79){
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		//!(score < 0 && score > 100)*/
		
		if(score < 0 || score > 100) {
			result = "X";
			
		}else if(score > 89) {
			result = "A";
			
		}else if(score > 79){
			result = "B";
			
		}else if(score > 69) {
			result = "C";
			
		}else if(score > 59) {
			result = "D";
			
		}else {
			result = "F";
			
		}
		System.out.println(result);
		
	}

}
