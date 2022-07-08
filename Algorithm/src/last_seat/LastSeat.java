package last_seat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * ������ ���� �ڸ� <����ȸ��>
 * N���� ģ���� �ѷ� �ɾ� �ִ� �ֿ��� ���ڸ�ŭ �̵��ؼ� �Ѹ� Ż���ϸ�, ���������� ���� ����� �����ΰ�?
 * ����1) �ο� �� , �̵� ĭ ��
 * > 5 
 * > 2
 * ���: 3
 */
public class LastSeat {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int move = Integer.parseInt(br.readLine());
		
		int numArr[] = new int[num];
		for(int i=0; i<num; i++) {
			numArr[i] = i+1;
		}
		while(true) {
			num = numArr.length;
			
			if(num == 1) {
				System.out.println(numArr[0]);
				break;
			}
			numArr = deleteNum(numArr,move);
		}
		
		
	}
	
	public static int[] deleteNum(int[] arr, int arrNum) {
		//�̵��Ÿ�
		if(arr.length < arrNum ) {
			arrNum = arrNum%arr.length;
		}
		arrNum--;
		int newArr[] = new int[arr.length-1];

		for(int i=0; i<arr.length-arrNum-1; i++) {
			newArr[i]=arr[i+arrNum+1];
		}
		for(int i=arr.length-arrNum-1; i<arr.length-1; i++) {
			newArr[i]=arr[i-(arr.length-arrNum-1)];
		}
		return newArr;
	}
	
	

}
