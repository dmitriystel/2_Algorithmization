package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/*
2. Algorithmization

   Задачи. Массивы массивов

8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного 
   столбца поставить на соответствующие им позиции другого, а его элементы второго переместить 
   в первый. Номера столбцов вводит пользователь с клавиатуры.
 */
public class Solution37 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines >>");		
		int m = Integer.parseInt(reader.readLine());

		System.out.println("number of columns >>");		
		int n = Integer.parseInt(reader.readLine());
		
		int temp = 0;
		
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
	    System.out.println();
	    
        System.out.print("enter the first column a >>: "); 
		int a = Integer.parseInt(reader.readLine());    
        System.out.print("enter the second column b >>: "); 
		int b = Integer.parseInt(reader.readLine()); 
		
		for (int q = 0; q < matrix.length; q++){ 
		    
		    temp = matrix[q][a];
		    matrix[q][a] = matrix[q][b];
		    matrix[q][b] = temp;   
		}
	    System.out.println();      
        System.out.print("new matrix is:     "); 		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " "); 
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

