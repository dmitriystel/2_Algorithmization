package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
2. Algorithmization

   Задачи. Массивы массивов

14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.
*/
public class Solution43 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("number of lines and columns >>");		
		int n = Integer.parseInt(reader.readLine());
				
		int[][] matrix = new int[n][n];;
		
		int count = 0;
		
		for (int y = 0; y < matrix[0].length; y++) { 
				 while(count != y) {
				 	count = 0; 
					for (int x = 0; x < matrix.length; x++) {					
						matrix[x][y] = (int) (Math.random() * 2);
						if (matrix[x][y] == 1) {
							count++;
							if (count == y) {
								break;
							}
					}
				}																
			}
		}
		
        System.out.print("matrix is:     ");  		
		for (int c = 0; c < matrix.length; c++){ 
		    System.out.println();
			for (int l = 0; l < matrix[0].length; l++) {
			    System.out.print( matrix[c][l] + " ");	
			}
		}																
	}	
}

