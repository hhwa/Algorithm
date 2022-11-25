package basic;

import java.util.HashSet;

/*
 * 
 * HashSet
 * Æ¯Â¡ : Áßº¹X 
 * 
 * */
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		for(int i : set) {
			System.out.println(i);
		}
		
		int size = set.size();
		
		System.out.println(size);
		
		
	}

}
