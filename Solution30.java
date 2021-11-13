package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

   Задачи. Массивы массивов

1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
*/
public class Solution30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines >>");		
		int m = Integer.parseInt(reader.readLine());

		System.out.println("number of columns >>");		
		int n = Integer.parseInt(reader.readLine());
		
		int[][] matrix = new int[m][n];;
		
		initMatrix(matrix);
		
        System.out.print("matrix is:     ");  		
		for (int k = 0; k < matrix.length; k++){ 
		    System.out.println();
			for (int l = 0; l < matrix[0].length; l++) {
			    System.out.print( matrix[k][l] + " ");	
			}
		}
		
		System.out.println();
	    System.out.println();
	    
        System.out.print("result is:"); 	
        for (int a = 0; a < matrix.length; a++) { 
			System.out.println();       	
        	for (int b = 0; b < matrix[a].length; b++) {        	
        		if (b % 2 != 0 && (matrix[0][b] > (matrix[matrix.length - 1][b]))) {
        			System.out.print(matrix[a][b] + " ");
        		}
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
