package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

    Задачи. Массивы массивов

10. Найти положительные элементы главной диагонали квадратной матрицы.
*/
public class Solution39 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines and columns >>");		
		int m = Integer.parseInt(reader.readLine());
		
		int[][] matrix = new int[m][m];;
		
		initMatrix(matrix);
		
        System.out.print("matrix is:     ");  		
		for (int c = 0; c < matrix.length; c++){ 
		    System.out.println();
			for (int l = 0; l < matrix[0].length; l++) {
			    System.out.print( matrix[c][l] + "        ");	
			}
		}
		
		System.out.println();
		System.out.println("positive elements of the main diagonal of a square matrix: ");
		
		for (int x = 0, y = 0; x < matrix[0].length; x++, y++){ 
			if (matrix[x][y] > 0) {
				System.out.print(matrix[x][y] + " ");
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
					matrix[i][j] = rand.nextInt(10) - 5;
			}						
		}				
	}	
}


