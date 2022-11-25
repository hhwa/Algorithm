package basic;

/*
 * 
 * 진수변환
 * 
 * */
public class NumberConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1000;
		int n = 3;
		//10진수 -> n진수
		System.out.println(Integer.toString(num,n));
		
		
		String num1 = "1111";
		// n진수 -> 10진수
		System.out.println(Integer.parseInt(num1,n));
		
	}

}
