package basic;

/*
 * 
 * ������ȯ
 * 
 * */
public class NumberConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1000;
		int n = 3;
		//10���� -> n����
		System.out.println(Integer.toString(num,n));
		
		
		String num1 = "1111";
		// n���� -> 10����
		System.out.println(Integer.parseInt(num1,n));
		
	}

}
