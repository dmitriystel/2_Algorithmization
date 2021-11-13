package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

   Задачи. Массивы массивов

13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
*/
public class Solution42 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines >>");		
		int m = Integer.parseInt(reader.readLine());
		
		System.out.println("number of columns >>");		
		int n = Integer.parseInt(reader.readLine());
		
		int temp = 0; 
		
		int[][] matrix = new int[m][n];;
		
		initMatrix(matrix);
		
        System.out.print("matrix is:     ");  		
		for (int c = 0; c < matrix.length; c++){ 
		    System.out.println();
			for (int l = 0; l < matrix[0].length; l++) {
			    System.out.print( matrix[c][l] + " ");	
			}
		}
				
		System.out.println();
		for (int y = 0; y < matrix[0].length; y++){ 
			for (int x = 0; x < matrix.length - 1; x++) { 				
				for (int z = x + 1; z < matrix.length; z++) { 	
					if (matrix[x][y] > matrix[z][y]) {
						temp = matrix[z][y];
						matrix[z][y] = matrix[x][y];
						matrix[x][y] = temp;						
					}
				}
			}
		}
		
System.out.print("new matrix lines of the matrix in ascending order is:     ");  		
			for (int c = 0; c < matrix.length; c++){ 
			    System.out.println();
				for (int l = 0; l < matrix[0].length; l++) {
				    System.out.print( matrix[c][l] + " ");	
				}
			}
		
			System.out.println();
			for (int y = 0; y < matrix[0].length; y++){ 
				for (int x = 0; x < matrix.length - 1; x++) { 				
					for (int z = x + 1; z < matrix.length; z++) {
						if (matrix[x][y] < matrix[z][y]) {
							temp = matrix[z][y];
							matrix[z][y] = matrix[x][y];
							matrix[x][y] = temp;						
						}
					}
				}
			}
			
	System.out.print("new matrix lines of the matrix in descending order is:     ");  		
				for (int c = 0; c < matrix.length; c++){ 
				    System.out.println();
					for (int l = 0; l < matrix[0].length; l++) {
					    System.out.print( matrix[c][l] + " ");	
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

