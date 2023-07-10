package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = null;
		List<String> names = new ArrayList<>();
		for(int i = 0; i < 2; i++) {
			System.out.println("이름을 입력하세요: ");
			names.add(scanner.nextLine());
		}
		System.out.println(names);
		
		
	}
}

