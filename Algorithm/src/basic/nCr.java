package basic;

/*
 * 
 * а╤гу 
 * 
 * */
public class nCr {
	

    public static void main(String[] args) {
        int[] array = {-2, 3, 0, 2, -5};
        boolean[] visited = new boolean[array.length];
        combination(array, visited, 0, array.length, 3);
    }

	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                	System.out.print(arr[i] + " ");
                }
            }
            System.out.println("");
            return;
        }
        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }

    }
}
