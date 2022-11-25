package basic;

import java.util.HashMap;
import java.util.Map;

/*
 * Map
 * Key값 중복 X, 같은 Key로 PUT 할 경우 덮어써짐
 * 
 * */
public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, String> hashmap = new HashMap<>();
		
		hashmap.put("1", "1111");hashmap.put("2", "2222");hashmap.put("3", "3333");hashmap.put("1", "3333");hashmap.put("44", "12345");
		System.out.println(hashmap);
		
		String getValue = hashmap.get("1");
		System.out.println(getValue); //key값으로 value 찾기
		
		for( String getKey : hashmap.keySet() ) {
			System.out.print(getKey);
			getValue = hashmap.get(getKey);
		}
		System.out.println();
		
		boolean containsKey = hashmap.containsKey("4");
		System.out.println(containsKey);
		
		boolean containsValue = hashmap.containsValue("33");
		System.out.println(containsValue);
		
		int size = hashmap.size();
		System.out.println(size);
		
		hashmap.remove("1"); // key 값으로 제거
		
		for( Map.Entry<String,String> entry : hashmap.entrySet()) {
			String getKey2 = entry.getKey();
			String getValue2 =entry.getValue();
			System.out.println("key: " + getKey2 + ", value: " + getValue2);
		}
		
		
	}

}
