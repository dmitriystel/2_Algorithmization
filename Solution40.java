package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

    Задачи. Массивы массивов

  11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и 
      номера строк, в которых число 5 встречается три и более раз.
*/
public class Solution40 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines >>");		
		int m = Integer.parseInt(reader.readLine());
		
		System.out.println("number of columns >>");		
		int n = Integer.parseInt(reader.readLine());
		
		int frequency;
		int column = 0;
		
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
		System.out.println("line numbers where 5 occurs three or more times: ");
		for (int x = 0; x < matrix.length; x++){ 

			frequency = 0;
			for (int y = 0; y < matrix[0].length; y++) {
			   if (matrix[x][y] == 5) {
				   frequency++;	
				   column = x;
			   } 			   
			}
		   	if (frequency > 2 ) {
		   		System.out.println(column);
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
					matrix[i][j] = rand.nextInt(15);
			}						
		}				
	}
	
}


