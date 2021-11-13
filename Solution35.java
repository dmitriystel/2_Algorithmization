package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Algorithmization

   Задачи. Массивы массивов
	 
6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

1	1	1	...	1	1	1
0	1	1	...	1	1	0
0	0	1	...	1	0	0
.	.	.  .	.	.	.
.	.	.	.	.	.	.
.	.	.	  .	.	.	.
0	1	1	...	1	1	0
1	1	1	...	1	1	1	
 */
public class Solution35 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("number of lines and columns >>");		
		int n = Integer.parseInt(reader.readLine());
		
		int[][] matrix = new int[n][n];;
		
			for (int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
		}	

			int k = -1; 			            
			int l = -1; 			           
			int x = 0;
			int w = 0;
			
			for (int i = 0; i < matrix.length; i++) {				
				if (k < (matrix.length / 2 - 1)) {
					k++;
					l++;
		        	x = k + 1;
		        	w = l + 1;
					for(int j = 0 + k; j < matrix[0].length - l; j++) {
						matrix[i][j] = 1;

			    	}
		        } else if (k >= (matrix.length / 2 - 1)) {			        	
		        	x--;
		        	w--;
					for(int j = 0 + x; j < matrix[0].length - w; j++) {
						matrix[i][j] = 1;
		        
					}
		        }
			
			} 		        	
		        			        	
				for (int i = 0; i < matrix.length; i++) {
					System.out.println();
					for(int j = 0; j < matrix[0].length; j++) {
						System.out.print(matrix[i][j] + " "); 
					}
				}
	} 
}

















