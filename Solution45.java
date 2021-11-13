package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
2. Algorithmization

   Задачи. Массивы массивов
	
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из 
    чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух 
    больших диагоналей равны между собой. Построить такой квадрат.	
*/
public class Solution45 {

	public static void main(String[] args) throws NumberFormatException, IOException {
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("number of lines and columns >>");		
		int n = Integer.parseInt(reader.readLine());
				
		int[][] matrix = new int[n][n];;
						
		int x = 0; 
		int y = 0; 
		
		if (n % 2 != 0) {
        
			for (int k = 0; k < Math.pow(n, 2); k++) {
				if (k == 0) {
					y = (matrix[0].length - 1) / 2;
					matrix[x][y] = k + 1;	
				} else if (k > 0) {
					if ((x - 1) < 0 && y < matrix[0].length - 1 ) { 
						x = matrix.length - 1;
						y++;
						matrix[x][y] = k + 1;	 
					} else if (x == 0 && y == matrix[0].length - 1 ) {
						x++;
						matrix[x][y] = k + 1;		
					} else if ((x - 1) >= 0 && (y + 1) > matrix[0].length - 1) {
						x--;
						y = 0;
						matrix[x][y] = k + 1;															
					} else if ((x - 1) >= 0 && (y + 1) <= matrix[0].length - 1  && (matrix[x - 1][y + 1] != 0 ) ) {
						x++;
						matrix[x][y] = k + 1;	
					} else if ((x - 1) >= 0 && (y + 1) <= matrix[0].length - 1  && (matrix[x - 1][y + 1] == 0 )) {
						x--;
						y++;
						matrix[x][y] = k + 1;	
						}												
					}				
				}				       					
			} 
		
		System.out.println();
        System.out.print("result is:     ");  		
		for (int i = 0; i < matrix.length; i++){ 
		    System.out.println();
			for (int j = 0; j < matrix[0].length; j++) {
			    System.out.print( matrix[i][j] + "    ");	
			}
		}																								
	}	
}

