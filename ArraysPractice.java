import java.util.Arrays;
import java.util.Random;
public class ArraysPractice {

	public static void main(String[] args) {
		int n = 6;
		int[][] matrix = new int[n][n];
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = rnd.nextInt(n*2) - 3;
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		System.out.println();
		//C2
		for (int i = 0; i < n; i++) {
			int temp = matrix[i][matrix[i].length - 1]; 
			for (int j = 1; j < n; j++) {
				matrix[i][matrix[i].length - j] = matrix[i][matrix[i].length - j - 1];
			}
			matrix[i][0] = temp;
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println();
		
		//C3
		int[] ascending = new int[n*n]; 
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				matrix[i][matrix[i].length - j] = matrix[i][matrix[i].length - j - 1];
			}
		}
 
	}

}
