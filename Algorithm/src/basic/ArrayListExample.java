package basic;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr를 ArrayList로 변환하는 3가지 방법
		int[] intArr1 = {1,4,4,2};
		List<int[]> intArrayList1 = Arrays.asList(intArr1);
		
		System.out.println(intArrayList1.get(0)); //int배열을 ArrayList로 변환한 것은 get으로 원하는 값을 못가져옴
		//int arr -> Integer Arr
		Integer[] integerArr1 = new Integer[intArr1.length];
		integerArr1 = Arrays.stream(intArr1).boxed().toArray(Integer[]::new);
		
		//Integer Arr -> int Arr
		int[] intArr2 = Arrays.stream(integerArr1).mapToInt(i->i).toArray();
		
		//int 배열 오름차순, int배열은 내림차순 불가능 ( Integer로 변환 후 sort해야함)
		Arrays.sort(intArr1);
		Arrays.sort(integerArr1,Comparator.reverseOrder());
		
		List<Integer> intArrayList2 = Arrays.asList(integerArr1);
		
		intArrayList2.sort(Comparator.naturalOrder());
        System.out.println("오름차순 : " + intArrayList2);  // [A, B, C, a]
 
        // 내림차순으로 정렬
        intArrayList2.sort(Comparator.reverseOrder());
        System.out.println("내림차순 : " + intArrayList2);

        for(int i : intArrayList2) {
        	System.out.print(i);
        }
        System.out.println();
        
        for(int i =0 ; i<intArrayList2.size(); i++) {
        	System.out.print(intArrayList2.get(i));
        }
        System.out.println();
		
		ArrayList<Integer> intArrayList3 = new ArrayList<>();
		for(int temp : intArr1){
			intArrayList3.add(temp);
		}
		
		
		//String array를 ArrayList로
		String[] strs = {"alpha", "beta", "charlie"};
		System.out.println(Arrays.toString(strs));   // [alpha, beta, charlie]
 
		List<String> lst = new ArrayList<String>(Arrays.asList(strs)); 
		System.out.println(lst);  // [alpha, beta, charlie]
		
		lst.add("ssss");
		
		lst.get(0);
		
		lst.size();
		

	}
}
