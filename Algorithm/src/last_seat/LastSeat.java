package last_seat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * 마지막 남는 자리 <원형회전>
 * N명의 친구가 둘러 앉아 있다 주워진 숫자만큼 이동해서 한명씩 탈락하면, 마지막으로 남는 사람은 누구인가?
 * 예시1) 인원 수 , 이동 칸 수
 * > 5 
 * > 2
 * 출력: 3
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
		//이동거리
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
