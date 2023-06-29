package ch04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력: ");
		String input1 = scanner.next();
		System.out.println("출력1: " + input1);
		
		System.out.print("입력: ");
		String input2 = scanner.next();
		System.out.println("출력2: " + input2);
		
		System.out.println("입력완료.");
		// next()만 쓰면 띄워쓰기 포함이 안돼서 출력됨 space,enter 무시
		// nextLine()을 쓰면 띄워쓰기 포함해서 출력됨 space 일시중지, enter 끝마침
		// nextLine()을 제외하면 next()랑 동일함

		
	}

}
