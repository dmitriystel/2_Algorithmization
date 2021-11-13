package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Algorithmization

   Задачи. Массивы массивов

4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	1	2	3	.	n
	n	n-1	n-2	.	1
	1	2	3	.	n
	n	n-1	n-2	.	1
	.	.	.	 .	.
	.	.	.	  .	.
	.	.	.	   ..
	n	n-1	n-2	.	1 
*/
public class Solution33 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines and columns >>");		
		int m = Integer.parseInt(reader.readLine());
		
		int[][] matrix = new int[m][m];;
		
			for (int i = 0; i < matrix.length; i++) {
				System.out.println();
				
				if (i % 2 == 0) { 
					for (int j = 0; j < matrix[0].length; j++) {
						System.out.print((matrix[i][j] = j + 1) + " ");						
					}
				}  else if (i % 2 != 0) {
					for (int k = 0; k < matrix[i].length; k++) {
						System.out.print((matrix[i][k] = matrix.length - k) + " ");	
					}					
			}	
		}							
	} 
} 		
			
	
	
		
				       	



