package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

   Задачи. Массивы массивов

2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
*/
public class Solution31 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int b = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines and columns >>");		
		int m = Integer.parseInt(reader.readLine());
		
		int[][] matrix = new int[m][m];;
		
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
	    
        System.out.print("result 1 is: "); 
        
        for (int a = 0; a < matrix.length; a++, b++) {        	     
        	System.out.print(matrix[a][b] + " ");
        }
        
	    System.out.println();        
        System.out.print("result 2 is: "); 
		int c = matrix[0].length - 1;
        for (int a = 0; a < matrix.length; a++, c--) {        	     
        	System.out.print(matrix[a][c] + " ");
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

