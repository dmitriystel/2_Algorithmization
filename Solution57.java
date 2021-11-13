package by.introduction.first.leaner1.main;

import java.util.Random;
/*
2. Algorithmization

   Декомпозиция с использованием методов (подпрограммы)

4. На плоскости заданы своими координатами n точек. Написать метод(методы), 
   определяющие, между какими из пар точек самое большое расстояние. Указание. 
   Координаты точек занести в массив.
*/
public class Solution57 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int n = rand.nextInt(10);
		System.out.println("the number of points: " + n );

		int[][] matrix = new int[n][2];;

		initMatrix(matrix);
		
        System.out.println(); 		
        System.out.print("point coordinates:     ");  		
		for (int c = 0; c < matrix.length; c++){ 
		    System.out.println();
			for (int l = 0; l < matrix[0].length; l++) {
			    System.out.print( matrix[c][l] + "    ");	
			}
		}
		
		System.out.println();
		int [] arr = theLongestDistance(matrix);
				
		System.out.println();
		System.out.println("the largest distance between these coordinates of two points:");
		
		for (int elem : arr ) 
		
		System.out.print(elem + " ");		
	}

	private static void initMatrix(int[][] matrix) {
		if (matrix == null) {
			return;
		}		
		Random rand = new Random();
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = rand.nextInt(10) - 5;
			}						
		}				
	}

	private static int[] theLongestDistance(int[][] matrix) {
		
		double ab;
		int a1 = 0;
		int a2 = 0;
		int b1 = 0;
		int b2 = 0;
		
		double max = 0; 
		for (int i = 0; i < matrix.length - 1; i++) {
			ab = Math.sqrt(Math.pow( (matrix[i + 1][0] - matrix[i][0]), 2) + Math.pow((matrix[i + 1][1] - matrix[i][1]), 2) );
			
			if (ab > max ) {
				max = ab;
				a1 = matrix[i][0];
				a2 = matrix[i + 1][0];
				b1 = matrix[i][1];
				b2 = matrix[i + 1][1];
			}
		}
		 return new int[] {a1, b1, a2, b2};	
	}
}
