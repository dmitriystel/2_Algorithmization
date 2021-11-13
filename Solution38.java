package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

   Задачи. Массивы массивов

9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
   Определить, какойстолбец содержит максимальную сумму.
*/
public class Solution38 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines >>");		
		int m = Integer.parseInt(reader.readLine());

		System.out.println("number of columns >>");		
		int n = Integer.parseInt(reader.readLine());
		
		int maxSumTemp;
		int maxSum = 0;
		int res = 0;
		
		int[][] matrix = new int[m][n];;
		
		initMatrix(matrix);
		
        System.out.print("matrix is:     ");  		
		for (int i = 0; i < matrix.length; i++){ 
		    System.out.println();
			for (int j = 0; j < matrix[0].length; j++) {
			    System.out.print( matrix[i][j] + " ");	
			}
		}
		
	    System.out.println();      		
		for (int i = 0; i < matrix[0].length; i++) {
			maxSumTemp = 0;
			for(int j = 0; j < matrix.length; j++) {
				maxSumTemp += matrix[j][i] ;
				if (maxSumTemp > maxSum) {
					maxSum = maxSumTemp;
					res = i;
				}
			}
		}
		System.out.println();		
		System.out.println("the maximum amount is contained in column N " + res);       
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
