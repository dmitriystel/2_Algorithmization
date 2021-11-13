package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Algorithmization

   Задачи. Массивы массивов

5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1	1	1	...	1	1	1
2	2	2	... 2	2	0
3	3	3	...	3	0	0
.	.	.	.	.	.	.
.	.	.	  . .	.	.
.	.	.	   ..	.	.
n-1	n-1	0	...	0	0	0
n	0	0	...	0	0	0	

*/
public class Solution34 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines and columns >>");		
		int m = Integer.parseInt(reader.readLine());
		
		int[][] matrix = new int[m][m];;

		
			for (int i = 0; i < matrix.length; i++) {

				for(int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
		}
	
			for (int i = 0, n = 0; i < matrix.length; i++, n++) {
				for(int j = 0; j < matrix[0].length - n; j++) {
						matrix[i][j] = n + 1;
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
