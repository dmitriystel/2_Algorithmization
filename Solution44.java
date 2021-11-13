package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

   Задачи. Массивы массивов
	
15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Solution44 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines >>");		
		int m = Integer.parseInt(reader.readLine());
		
		System.out.println("number of columns >>");		
		int n = Integer.parseInt(reader.readLine());
		
		int max = 0;
		
		int[][] matrix = new int[m][n];;
		
		initMatrix(matrix);
		
        System.out.print("matrix is:     ");  		
		for (int i = 0; i < matrix.length; i++){ 
		    System.out.println();
			for (int j = 0; j < matrix[0].length; j++) {
			    System.out.print( matrix[i][j] + " ");	
			}
		}
		
		for (int x = 0; x < matrix.length; x++){ 
			for (int y = 0; y < matrix[0].length; y++) {				
				if(matrix[x][y] > max) {
					max = matrix[x][y];
				}
			}
		}
		
		for (int x = 0; x < matrix.length; x++){ 
			for (int y = 0; y < matrix[0].length; y++) {				
				if(matrix[x][y] % 2 != 0) {
					 matrix[x][y] = max;
				}
			}
		}
		
		System.out.println();
        System.out.print("result is:     ");  		
		for (int i = 0; i < matrix.length; i++){ 
		    System.out.println();
			for (int j = 0; j < matrix[0].length; j++) {
			    System.out.print( matrix[i][j] + " ");	
			}
		}																							
	}
	
	private static void initMatrix(int[][] matrix) {
		if (matrix == null) {
			return;
		}
		
		Random rand = new Random();
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = rand.nextInt(10);
			}						
		}				
	}	
}

