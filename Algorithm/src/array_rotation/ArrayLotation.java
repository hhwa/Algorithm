package array_rotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * <배열회전>
 * 배열을 입력받아, 입력된 방향으로 회전을 하고 그에 따른 배열 값 출력
 * L : 왼쪽 회전 / R : 오른쪽 회전 / T : 뒤집기
 * 예시1) 배열의 가로크기, 배열의 세로크키, 원소, 회전명령, 출력할 위치
 * > 3
 * > 3
 * > 1,2,3,4,5,6,7,8,9
 * > RRT
 * > 1,3
 * 출력: 1
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

