package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import ch20_컬렉션.TestUser;


public class MapList {
	
	public static void main(String[] args) {
		List <Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
			Map<String, Object> 홍길동 = null;
			customers.add(홍길동);
			Map<String, Object> vip = null;
			customers.add(vip);
			customers.add(30, vip);
			Map<String, Object> 김기영 = null;
			customers.add(김기영);
			Map<String, Object> gold = null;
			customers.add(gold);
			customers.add(35, gold);
			
		
		for (Entry<String, Object> entry : ((Map<String, Object>) customers).entrySet()) {
					
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		
		}	
		
 	}
}



