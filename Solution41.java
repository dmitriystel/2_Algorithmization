package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

   Задачи. Массивы массивов

12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
*/
public class Solution41 {

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
		for (int x = 0; x < matrix.length; x++){ 
			for (int y = 0; y < matrix[0].length - 1; y++) {				
				for (int z = y + 1; z < matrix[0].length; z++) {
					if (matrix[x][y] > matrix[x][z]) {
						temp = matrix[x][z];
						matrix[x][z] = matrix[x][y];
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
			for (int x = 0; x < matrix.length; x++){ 
				for (int y = 0; y < matrix[0].length - 1; y++) {				
					for (int z = y + 1; z < matrix[0].length; z++) {
						if (matrix[x][y] < matrix[x][z]) {
							temp = matrix[x][z];
							matrix[x][z] = matrix[x][y];
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



