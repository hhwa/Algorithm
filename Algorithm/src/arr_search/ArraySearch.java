package arr_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * <�迭Ž��>
 * �迭�� ���� ������� Ž��
 * ���֦��צ��֦�
 * ���צ��֦��צ�
 * ���֦��צ��֦�
 * ����1) �迭�� ����ũ��, �迭�� ����ũ��, ����
 * > 3
 * > 3
 * > 1,2,3,4,5,6,7,8,9
 * ���: 1,2,4,7,5,3,6,8,9
 */
public class ArraySearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		String data = br.readLine();
		
		String numArr[] = data.split(",");
		
		int arr[][] = new int[x][y];
		int numArrCnt = 0;
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				arr[j][i] = Integer.parseInt(numArr[numArrCnt++]); 
			}
		}
				
		int cnt = 0;
		String answer = "";
		int beforeX = 0;
		int beforeY = 1; 
		
		int afterX = 1;
		int afterY = 0;
		for(int i=0; i<x*y; i++) {
			if(cnt%2==0) {
				afterX = beforeX+1;
				afterY = beforeY-1;
				
				answer += arr[beforeX][afterY];
			}else {
				afterX = beforeX-1;
				afterY = beforeY+1;
				
				answer += arr[afterX][beforeY];
			}
			
			if(i != x*y-1) answer += ","; 
			beforeX = afterX;
			beforeY = afterY;
			
			if(afterX == 0 || beforeY == y) {
				if(beforeY == y) {
					beforeX += 1;
				}else {
					beforeY += 1;
				}
				
				cnt++;
			}else if(afterY == 0 || beforeX == x) {
				if(beforeX == x) {
					beforeY += 1;
				}else {
					beforeX += 1;
				}
				
				cnt++;
			}
		}
		System.out.println(answer);
	}

}
