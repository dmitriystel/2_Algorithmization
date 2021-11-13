package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Algorithmization

   Задачи. Массивы массивов

7. Сформировать квадратную матрицу порядка N по правилу:
   A[I,J] = sin ((I² - J²) / N)
   и подсчитать количество положительных элементов в ней
*/
public class Solution36 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("number of lines and columns >>");		
		int n = Integer.parseInt(reader.readLine());
		int count = 0;
		
		double [][] matrix = new double [n][n];;
		
			for (int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = Math.sin((Math.pow( i,  2) - Math.pow(j, 2) / n));
					if (matrix[i][j] > 0 ) {
						count++;
					}
				}
		}
			System.out.println("number of positive elements: " +  count);
	} 
}
