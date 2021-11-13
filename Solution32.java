package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
2. Algorithmization

   Задачи. Массивы массивов

3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.  
*/
public class Solution32 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines >>");		
		int m = Integer.parseInt(reader.readLine());

		System.out.println("number of columns >>");		
		int n = Integer.parseInt(reader.readLine());
		
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
	    System.out.println();
	    
        System.out.print("print line >>: "); 
		int k = Integer.parseInt(reader.readLine());    
		
        for (int a = 0; a < matrix[0].length; a++) {        	     
        	System.out.print(matrix[k][a] + " ");
        }
        
		System.out.println();
	    System.out.println();
	    
        System.out.print("print column >>: "); 
		int p = Integer.parseInt(reader.readLine());    
		
        for (int a = 0; a < matrix.length; a++) {        	     
        	System.out.print(matrix[a][p] + " ");
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


