package array_rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * <�迭ȸ��>
 * �迭�� �Է¹޾�, �Էµ� �������� ȸ���� �ϰ� �׿� ���� �迭 �� ���
 * L : ���� ȸ�� / R : ������ ȸ�� / T : ������
 * ����1) �迭�� ����ũ��, �迭�� ����ũŰ, ����, ȸ�����, ����� ��ġ
 * > 3
 * > 3
 * > 1,2,3,4,5,6,7,8,9
 * > RRT
 * > 1,3
 * ���: 1
 */


public class ArrayLotation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		String data = br.readLine();
		String rotation = br.readLine();
		String position = br.readLine();
		
		int arr[][] = new int[x][y];
		String dataArr[] = data.split(",");
		int dataArrCnt = 0;
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) {
				arr[i][j] = Integer.parseInt(dataArr[dataArrCnt++]);
			}
		}
		
		String rotationArr[] = rotation.split("");
		
		for( String direction : rotationArr ) {
			if(direction.equals("R")) {
				arr = right_rotate(arr);
			}else if(direction.equals("L")) {
				arr = left_rotate(arr);
			}else if(direction.equals("T")) {
				arr = turn(arr);
			}
		}
		
		String positionXY[] = position.split(",");
		int positionX = Integer.parseInt(positionXY[0])-1;
		int positionY = Integer.parseInt(positionXY[1])-1;
		
		System.out.println(arr[positionY][positionX]);
		

	}
	
	public static int[][] right_rotate(int[][] arr) {
	    int x = arr.length;
	    int y = arr[0].length;
	    int[][] r_rotate = new int[x][y];

	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	        	r_rotate[i][j] = arr[x-1-j][i];
	        }
	    }

	    return r_rotate;
	}
	
	public static int[][] left_rotate(int[][] arr) {
	    int x = arr.length;
	    int y = arr[0].length;
	    int[][] l_rotate = new int[x][y];

	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	        	l_rotate[i][j] = arr[j][y-1-i];
	        }
	    }

	    return l_rotate;
	}
	
	public static int[][] turn(int[][] arr) {
		int x = arr.length;
	    int y = arr[0].length;
	    int[][] turn = new int[x][y];

	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	        	turn[i][j] = arr[i][x-1-j];
	        }
	    }

	    return turn;
	}

}

