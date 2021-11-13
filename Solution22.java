package by.introduction.first.leaner1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
2. Algorithmization
    
   Одномерные массивы
    
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
   положительных и нулевых элементов.
 */
public class Solution22 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int negative = 0;
		int positive = 0;
		int zero = 0;
				
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter the number of cells in the array >>");
		int n = Integer.parseInt(reader.readLine());
				
		int[] intArray = new int[n];
 
		System.out.println("please fill the array with numbers >>");
		 
		for (int i = 0; i < n; i++) {
			System.out.println(">>");
			intArray[i] = Integer.parseInt(reader.readLine());
		}
		System.out.print("intArray is: ");		

		for (int element : intArray){            
		    System.out.print( element + " ");
		}
        System.out.println();
		
		for (int j = 0; j < intArray.length; j++) {
			if (intArray[j] > 0) {
				positive++;
			} else if (intArray[j] < 0) {
				negative++;
			} else if (intArray[j] == 0) {
				zero++;
			}						
		}	
							
		System.out.println("positive: " + positive);			
		System.out.println("negative: " + negative);	
		System.out.println("zero: " + zero);	
	}
}
